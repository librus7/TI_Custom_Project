package com.misys.tiplus2.customisation.extension;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.lang.datatype.*;
import com.misys.tiplus2.enigma.lang.pane.EnigmaExtensionPane;
import com.misys.tiplus2.enigma.customisation.pane.ExtensionWebPane;
import com.misys.tiplus2.customisation.extensions.AbstractEventExtension;
import com.misys.tiplus2.enigma.customisation.*;
import com.misys.tiplus2.enigma.customisation.control.*;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import com.misys.tiplus2.customisation.DriverWrapperHelper;
import com.misys.tiplus2.customisation.CommonModule;
import com.misys.tiplus2.foundations.lang.logging.Loggers;

import com.misys.tiplus2.enigma.customisation.validation.ValidationDetails;
import com.misys.tiplus2.enigma.customisation.validation.ValidationDetails.WarningType;
import java.lang.reflect.Method;
import com.misys.tiplus2.apps.ti.kernel.extpm.entity.*;
import com.misys.tiplus2.customisation.pane.*;
import com.misys.tiplus2.apps.ti.kernel.extpm.pane.*;

/**
 * Customisation class for ExtEvent
 *
 */
public class EventExtension extends AbstractEventExtension {

    private static final Logger LOG = LoggerFactory.getLogger(EventExtension.class);

    private ExtMasterWrapper masterWrapper;

    private ExtMasterSnapshotWrapper masterSSWrapper;

    private ExtEventExtensionDriverP eventExtensionPane;

    @Override
    protected final ExtEventWrapper getWrapper() {
        return (ExtEventWrapper) super.getWrapper();
    }

    public final EventPane getPane() {
        return (EventPane) super.getCustomisedPane();
    }

    @Override
    protected final ExtEventExtensionDriverPWrapper getDriverWrapper() {
     return (ExtEventExtensionDriverPWrapper) super.getDriverWrapper();
    }

    public final boolean isForSnapshot() {
        return (eventExtensionPane != null && eventExtensionPane.IsForSnapshot() != 0);
    }

    /**
     * Initialises all Customisation properties required to facilitate
     * call-backs into the TI application.
     *
     * @param extensionPane
     *            EnigmaExtensionPane driver pane.
     */
    @Override
    public final void initialise(EnigmaExtensionPane extensionPane) {
        Loggers.method().enter(LOG, extensionPane);

        super.initialise(extensionPane);

        eventExtensionPane = (ExtEventExtensionDriverP) extensionPane;

        //set reference to the wrapper in the superclass
        setWrapper(new ExtEventWrapper(eventExtensionPane.getExtEvent()));

        //set reference to the driver wrapper in the superclass
        setDriverWrapper(new ExtEventExtensionDriverPWrapper(eventExtensionPane));

        //set the local driver wrapper reference in the pane
        getPane().setDriverWrapper(getDriverWrapper());

        //  set the extension handler reference in the pane
        ((ExtensionWebPane)getPane()).setExtensionHandler(this);

        this.masterWrapper = new ExtMasterWrapper(eventExtensionPane.getExtMaster());

        // Initialise parameters
        setParameters(eventExtensionPane.getParameters());

        Loggers.method().exit(LOG);
    }

    /**
     * Invoked method fired during initialisation chain.
     */
    public final void initialise() {
        Loggers.method().enter(LOG);

        CommonModule.initialiseEvent(getWrapper());

        Loggers.method().exit(LOG);
    }

	/**
     * Method invoked after Initialisation. Updates the customised pane's
     * members with the extra data from extended entity.
     */
    @SuppressWarnings("unchecked")
    @Override
    public final void postInitialise() {
        Loggers.method().enter(LOG);

        getParameters().getBSuccess().assignEn(false);
        try {
            /* AgentWithholdingAmount */
            getPane().setAgentWithholdingAmount(getWrapper().getAgentWithholdingAmount());
            /* AgentAmount */
            getPane().setAgentAmount(getWrapper().getAgentAmount());
 
            // repeatingField initialisers
            //
            if (onPostInitialise()) {
                getParameters().getBSuccess().assignEn(true);
            } else {
                getParameters().getBSuccess().assignEn(false);
            }
        } catch (Exception e) {
            LOG.error("Exception in post initialisation: " + e.getMessage(), e);
            getParameters().getErrorMessage().assignEn(e.getMessage());
        }

        Loggers.method().exit(LOG);
    }

    /**
     * Method invoked when data is captured on the main pane.
     * Override this method to implement code to react to data
     * changes on the main pane.
     */
    @Override
    public void dataCaptured() {
        Loggers.method().enter(LOG);

        Loggers.method().exit(LOG);
    }

    /**
     * Initialises the master fields
     */
    @Override
    public final void initialiseMaster() {
        Loggers.method().enter(LOG);

        if (isForSnapshot()) {
            CommonModule.initialiseMasterSnapshot(getMasterSSWrapper());
        } else {
            CommonModule.initialiseMaster(getMasterWrapper());
        }

        Loggers.method();
    }

    /**
     * Initialises the event data from the master
     */
    @Override
    public final void setDefaults() {
        Loggers.method().enter(LOG);

        try {
            getParameters().getBSuccess().assignEn(false);
            for (String controlName : getRelatedControlNames()) {
                Attributes masterAttr = getRelatedMasterAttributes(controlName);
                if (masterAttr == null) continue;

                updateMember(getMasterWrapper(), getWrapper(), masterAttr.getName(), controlName);
                Attributes eventAttr = getRelatedAttributes(controlName);
                if (eventAttr.getCurrencyName() != null) {
                    updateMember(getMasterWrapper(), getWrapper(), masterAttr.getCurrencyName(), eventAttr.getCurrencyName());
                }
            }
            for (String rfName : getRelatedRepeatingFields()) {
                updateRepeatingFieldFromMasterToEvent(getMasterWrapper(), getWrapper(), rfName);
            }
            
            getParameters().getBSuccess().assignEn(true);
        } catch (Exception e) {
            getDriverWrapper().logError("Failed to set extended defaults on event. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during setDefaults");
        }

        Loggers.method().exit(LOG);
    }

    /**
     * Copies data from the event to the master
     */
    @Override
    public void updateMaster() {
        Loggers.method().enter(LOG);

        updateMasterInternal();

        Loggers.method().exit(LOG);
    }

    /**
     * Method invoked prior to an event being released to update the master
     * fields from the event.
     */
    @Override
    public void updateMasterOnRelease() {
        Loggers.method().enter(LOG);

        updateMasterInternal();

        Loggers.method().exit(LOG);
    }

    /**
     * Copies data from one column for the event to the master.
     *
     * @param String
     *          the field code
     */
    @Override
    public final void updateIndividualMaster(String fieldCode) {
        Loggers.method().enter(LOG, fieldCode);

        try {
            getParameters().getBSuccess().assignEn(false);
            if (fieldCode == null || fieldCode.equals("")) return;

            Attributes eventAttr = getRelatedAttributesWithFieldCode(fieldCode);
            if (eventAttr == null) return;

            Attributes masterAttr = getRelatedMasterAttributes(eventAttr.getName());
            if (masterAttr == null) return;

            updateMember(getWrapper(), getMasterWrapper(), eventAttr.getName(), masterAttr.getName());
            if (eventAttr.getCurrencyName() != null) {
                updateMember(getWrapper(), getMasterWrapper(), eventAttr.getCurrencyName(), masterAttr.getCurrencyName());
            }
            getParameters().getBSuccess().assignEn(true);
        } catch (Exception e) {
            getDriverWrapper().logError("Failed to update column of extended master. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during updateIndividualMaster");
        }

        Loggers.method().exit(LOG);
    }


   /** 
   *    Create a row in table 
   *
   *    @param rfCode  
   *             the repeating field ID this should be prefixed with 'c'
   *
   **/
   @Override
    public final void createTableRow(String rfID) {
        Loggers.method().enter(LOG, rfID);
 
  
        Loggers.method().exit(LOG);
  }
  
  
  /**
   * Returns the number of rows of data for the given table field code.
   */
  @Override
  public int getTableRowCount(String tableFieldCode) {
       Loggers.method().enter(LOG, tableFieldCode);
       
       int result = 0;
       getParameters().getBSuccess().assignEn(false);
        
       getParameters().getBSuccess().assignEn(true);
       getParameters().getCount().assignEn(result);
        
       Loggers.method().exit(LOG, result);
       return result;
  }

  
  

    /**
     * Returns the Amount value referenced by the supplied field code
     * via the Parameters object.
     * 
     * @param fieldCode
     */
    @Override
    public final void getFieldCodeAmount(String fieldCode) {
        Loggers.method().enter(LOG, fieldCode);

        getParameters().getBSuccess().assignEn(false);
        if (fieldCode == null || fieldCode.equals("")) return;

        try {
            /* support for user defined calculated fields */
            String calcFieldVal = getUserFieldCodeAmount(fieldCode);
            if (calcFieldVal != null) {
                String ccyVal = CustomisationHelper.getTIMoneyCCY(calcFieldVal);
                String amountVal = CustomisationHelper.getTIMoneyAmount(calcFieldVal);
                if (CustomisationHelper.isAmountReallyEmpty(amountVal, ccyVal)) {
                    getParameters().getReturnAmountString().assignEn("");
                } else {
                    getParameters().getReturnAmountString().assignEn(
                        getNullSafeString(getDriverWrapper().convertFromToDBFormat(
                            amountVal, ccyVal, "F")));
                }
                getParameters().getReturnAmountCcy().assignEn(getNullSafeString(ccyVal));
                getParameters().getBSuccess().assignEn(true);
            }
        } catch (Exception e) {
            getDriverWrapper().logError("GetFieldCodeAmount failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during getFieldCodeAmount");
        } finally {
            Loggers.method().exit(LOG); // here only because of multiple returns
        }
    }
    /**
     * Called by TI to put extra data values into customised entities, one by one from incoming messages
     * via the Parameters object.
     * 
     * @param fieldCode
     */
    @Override
    public final void putFieldCodeAmount(String fieldCode) {
        Loggers.method().enter(LOG, fieldCode);

        getParameters().getBSuccess().assignEn(false);       
        if (fieldCode == null || fieldCode.equals("")) return;

        try {
            /* support for user defined calculated fields */
            putUserFieldCodeAmount(fieldCode);
            getParameters().getBSuccess().assignEn(true);
            return;
        } catch (Exception e) {
            getDriverWrapper().logError("PutFieldCodeAmount failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during putFieldCodeAmount");
        } finally {
            Loggers.method().exit(LOG); // here only because of multiple returns
        }
    }
   
    /**
     * Returns the Amount value referenced by the supplied repeating field
     * via the Parameters object.
     * 
     * @param table code
     * @param row
     * @param field code 
     */
    @Override
    public final void getTablePartAmount(String tableCode, int row, String fieldCode) {
        Loggers.method().enter(LOG, tableCode, fieldCode);

        getParameters().getBSuccess().assignEn(false);

       
        if (tableCode == null || tableCode.isEmpty() || fieldCode == null || fieldCode.isEmpty()){ 
        	return;
        }
		
	    try{
 		} catch (Exception e) {
            getDriverWrapper().logError("getTablePartAmount failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during getTablePartAmount");
        } 
        
        Loggers.method().exit(LOG); 
        
     }
    
 /**
     * To put extra repeating field data values into customised entities
     * 
     * @param table code 
     * @param row
     * @param field code 
     */
    @Override
    public final void putTablePartAmount(String tCode, int row, String fieldCode) {
        Loggers.method().enter(LOG, tCode, row, fieldCode);

        getParameters().getBSuccess().assignEn(false);
          
        if (tCode == null || tCode.isEmpty() || fieldCode == null ||
		      fieldCode.isEmpty() || row< 0 ) { 
        	return;
		}
		
	    try{
 		
        } catch (Exception e) {
            getDriverWrapper().logError("PutTablePartAmount failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during putTablePartAmount");
        } 
        
        
        Loggers.method().exit(LOG); 
    }
    /**
     * Returns the Boolean value referenced by the supplied field code
     * via the Parameters object.
     * 
     * @param fieldCode
     */
    @Override
    public final void getFieldCodeBoolean(String fieldCode) {
        Loggers.method().enter(LOG, fieldCode);

        getParameters().getBSuccess().assignEn(false);
        if (fieldCode == null || fieldCode.equals("")) return;

        try {
            /* support for user defined calculated fields */
            Boolean calcFieldVal = getUserFieldCodeBoolean(fieldCode);
            if (calcFieldVal != null) {
                getParameters().getReturnBoolean().assignEn(getNullSafeBoolean(calcFieldVal));
                getParameters().getBSuccess().assignEn(true);
            }
        } catch (Exception e) {
            getDriverWrapper().logError("GetFieldCodeBoolean failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during getFieldCodeBoolean");
        } finally {
            Loggers.method().exit(LOG); // here only because of multiple returns
        }
    }
    /**
     * Called by TI to put extra data values into customised entities, one by one from incoming messages
     * via the Parameters object.
     * 
     * @param fieldCode
     */
    @Override
    public final void putFieldCodeBoolean(String fieldCode) {
        Loggers.method().enter(LOG, fieldCode);

        getParameters().getBSuccess().assignEn(false);       
        if (fieldCode == null || fieldCode.equals("")) return;

        try {
            /* support for user defined calculated fields */
            putUserFieldCodeBoolean(fieldCode);
            getParameters().getBSuccess().assignEn(true);
            return;
        } catch (Exception e) {
            getDriverWrapper().logError("PutFieldCodeBoolean failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during putFieldCodeBoolean");
        } finally {
            Loggers.method().exit(LOG); // here only because of multiple returns
        }
    }
   
    /**
     * Returns the Boolean value referenced by the supplied repeating field
     * via the Parameters object.
     * 
     * @param table code
     * @param row
     * @param field code 
     */
    @Override
    public final void getTablePartBoolean(String tableCode, int row, String fieldCode) {
        Loggers.method().enter(LOG, tableCode, fieldCode);

        getParameters().getBSuccess().assignEn(false);

       
        if (tableCode == null || tableCode.isEmpty() || fieldCode == null || fieldCode.isEmpty()){ 
        	return;
        }
		
	    try{
 		} catch (Exception e) {
            getDriverWrapper().logError("getTablePartBoolean failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during getTablePartBoolean");
        } 
        
        Loggers.method().exit(LOG); 
        
     }
    
 /**
     * To put extra repeating field data values into customised entities
     * 
     * @param table code 
     * @param row
     * @param field code 
     */
    @Override
    public final void putTablePartBoolean(String tCode, int row, String fieldCode) {
        Loggers.method().enter(LOG, tCode, row, fieldCode);

        getParameters().getBSuccess().assignEn(false);
          
        if (tCode == null || tCode.isEmpty() || fieldCode == null ||
		      fieldCode.isEmpty() || row< 0 ) { 
        	return;
		}
		
	    try{
 		
        } catch (Exception e) {
            getDriverWrapper().logError("PutTablePartBoolean failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during putTablePartBoolean");
        } 
        
        
        Loggers.method().exit(LOG); 
    }
    /**
     * Returns the Date value referenced by the supplied field code
     * via the Parameters object.
     * 
     * @param fieldCode
     */
    @Override
    public final void getFieldCodeDate(String fieldCode) {
        Loggers.method().enter(LOG, fieldCode);

        getParameters().getBSuccess().assignEn(false);
        if (fieldCode == null || fieldCode.equals("")) return;

        try {
            /* support for user defined calculated fields */
            Date calcFieldVal = getUserFieldCodeDate(fieldCode);
            if (calcFieldVal != null) {
                getParameters().getReturnDate().setEnDate(calcFieldVal);
                getParameters().getBSuccess().assignEn(true);
            }
        } catch (Exception e) {
            getDriverWrapper().logError("GetFieldCodeDate failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during getFieldCodeDate");
        } finally {
            Loggers.method().exit(LOG); // here only because of multiple returns
        }
    }
    /**
     * Called by TI to put extra data values into customised entities, one by one from incoming messages
     * via the Parameters object.
     * 
     * @param fieldCode
     */
    @Override
    public final void putFieldCodeDate(String fieldCode) {
        Loggers.method().enter(LOG, fieldCode);

        getParameters().getBSuccess().assignEn(false);       
        if (fieldCode == null || fieldCode.equals("")) return;

        try {
            /* support for user defined calculated fields */
            putUserFieldCodeDate(fieldCode);
            getParameters().getBSuccess().assignEn(true);
            return;
        } catch (Exception e) {
            getDriverWrapper().logError("PutFieldCodeDate failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during putFieldCodeDate");
        } finally {
            Loggers.method().exit(LOG); // here only because of multiple returns
        }
    }
   
    /**
     * Returns the Date value referenced by the supplied repeating field
     * via the Parameters object.
     * 
     * @param table code
     * @param row
     * @param field code 
     */
    @Override
    public final void getTablePartDate(String tableCode, int row, String fieldCode) {
        Loggers.method().enter(LOG, tableCode, fieldCode);

        getParameters().getBSuccess().assignEn(false);

       
        if (tableCode == null || tableCode.isEmpty() || fieldCode == null || fieldCode.isEmpty()){ 
        	return;
        }
		
	    try{
 		} catch (Exception e) {
            getDriverWrapper().logError("getTablePartDate failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during getTablePartDate");
        } 
        
        Loggers.method().exit(LOG); 
        
     }
    
 /**
     * To put extra repeating field data values into customised entities
     * 
     * @param table code 
     * @param row
     * @param field code 
     */
    @Override
    public final void putTablePartDate(String tCode, int row, String fieldCode) {
        Loggers.method().enter(LOG, tCode, row, fieldCode);

        getParameters().getBSuccess().assignEn(false);
          
        if (tCode == null || tCode.isEmpty() || fieldCode == null ||
		      fieldCode.isEmpty() || row< 0 ) { 
        	return;
		}
		
	    try{
 		
        } catch (Exception e) {
            getDriverWrapper().logError("PutTablePartDate failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during putTablePartDate");
        } 
        
        
        Loggers.method().exit(LOG); 
    }
    /**
     * Returns the Integer value referenced by the supplied field code
     * via the Parameters object.
     * 
     * @param fieldCode
     */
    @Override
    public final void getFieldCodeInteger(String fieldCode) {
        Loggers.method().enter(LOG, fieldCode);

        getParameters().getBSuccess().assignEn(false);
        if (fieldCode == null || fieldCode.equals("")) return;

        try {
            /* support for user defined calculated fields */
            Integer calcFieldVal = getUserFieldCodeInteger(fieldCode);
            if (calcFieldVal != null) {
                getParameters().getReturnInteger().assignEn(calcFieldVal);
                getParameters().getBSuccess().assignEn(true);
            }
        } catch (Exception e) {
            getDriverWrapper().logError("GetFieldCodeInteger failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during getFieldCodeInteger");
        } finally {
            Loggers.method().exit(LOG); // here only because of multiple returns
        }
    }
    /**
     * Called by TI to put extra data values into customised entities, one by one from incoming messages
     * via the Parameters object.
     * 
     * @param fieldCode
     */
    @Override
    public final void putFieldCodeInteger(String fieldCode) {
        Loggers.method().enter(LOG, fieldCode);

        getParameters().getBSuccess().assignEn(false);       
        if (fieldCode == null || fieldCode.equals("")) return;

        try {
            /* support for user defined calculated fields */
            putUserFieldCodeInteger(fieldCode);
            getParameters().getBSuccess().assignEn(true);
            return;
        } catch (Exception e) {
            getDriverWrapper().logError("PutFieldCodeInteger failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during putFieldCodeInteger");
        } finally {
            Loggers.method().exit(LOG); // here only because of multiple returns
        }
    }
   
    /**
     * Returns the Integer value referenced by the supplied repeating field
     * via the Parameters object.
     * 
     * @param table code
     * @param row
     * @param field code 
     */
    @Override
    public final void getTablePartInteger(String tableCode, int row, String fieldCode) {
        Loggers.method().enter(LOG, tableCode, fieldCode);

        getParameters().getBSuccess().assignEn(false);

       
        if (tableCode == null || tableCode.isEmpty() || fieldCode == null || fieldCode.isEmpty()){ 
        	return;
        }
		
	    try{
 		} catch (Exception e) {
            getDriverWrapper().logError("getTablePartInteger failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during getTablePartInteger");
        } 
        
        Loggers.method().exit(LOG); 
        
     }
    
 /**
     * To put extra repeating field data values into customised entities
     * 
     * @param table code 
     * @param row
     * @param field code 
     */
    @Override
    public final void putTablePartInteger(String tCode, int row, String fieldCode) {
        Loggers.method().enter(LOG, tCode, row, fieldCode);

        getParameters().getBSuccess().assignEn(false);
          
        if (tCode == null || tCode.isEmpty() || fieldCode == null ||
		      fieldCode.isEmpty() || row< 0 ) { 
        	return;
		}
		
	    try{
 		
        } catch (Exception e) {
            getDriverWrapper().logError("PutTablePartInteger failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during putTablePartInteger");
        } 
        
        
        Loggers.method().exit(LOG); 
    }
    /**
     * Returns the String value referenced by the supplied field code
     * via the Parameters object.
     * 
     * @param fieldCode
     */
    @Override
    public final void getFieldCodeString(String fieldCode) {
        Loggers.method().enter(LOG, fieldCode);

        getParameters().getBSuccess().assignEn(false);
        if (fieldCode == null || fieldCode.equals("")) return;

        try {
            if (fieldCode.equals("cAAB")) {
                getParameters().getReturnString().assignEn(getNullSafeString(getWrapper().getAgentWithholdingAmount()));
                getParameters().getBSuccess().assignEn(true);

                return;
             }
            if (fieldCode.equals("cAAB.s")) {
                String mstAgentWithholdingAmount = getFieldOnMaster("AgentWithholdingAmount");
                if (!("").equals(mstAgentWithholdingAmount)) {
                    getParameters().getReturnString().assignEn(getNullSafeString(getStringFieldFromSS(CustomisationHelper.createGetter(mstAgentWithholdingAmount))));
                    getParameters().getBSuccess().assignEn(true);
                }
                return;
            }
            if (fieldCode.equals("cAAC")) {
                getParameters().getReturnString().assignEn(getNullSafeString(getWrapper().getAgentAmount()));
                getParameters().getBSuccess().assignEn(true);

                return;
             }
            if (fieldCode.equals("cAAC.s")) {
                String mstAgentAmount = getFieldOnMaster("AgentAmount");
                if (!("").equals(mstAgentAmount)) {
                    getParameters().getReturnString().assignEn(getNullSafeString(getStringFieldFromSS(CustomisationHelper.createGetter(mstAgentAmount))));
                    getParameters().getBSuccess().assignEn(true);
                }
                return;
            }
            /* support for user defined calculated fields */
            String calcFieldVal = getUserFieldCodeString(fieldCode);
            if (calcFieldVal != null) {
                getParameters().getReturnString().assignEn(getNullSafeString(calcFieldVal));
                getParameters().getBSuccess().assignEn(true);
            }
        } catch (Exception e) {
            getDriverWrapper().logError("GetFieldCodeString failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during getFieldCodeString");
        } finally {
            Loggers.method().exit(LOG); // here only because of multiple returns
        }
    }
    /**
     * Called by TI to put extra data values into customised entities, one by one from incoming messages
     * via the Parameters object.
     * 
     * @param fieldCode
     */
    @Override
    public final void putFieldCodeString(String fieldCode) {
        Loggers.method().enter(LOG, fieldCode);

        getParameters().getBSuccess().assignEn(false);       
        if (fieldCode == null || fieldCode.equals("")) return;

        try {
            if (fieldCode.equals("cAAB")) {
                getWrapper().setAgentWithholdingAmount(getNullSafeString(getParameters().getReturnString().getEnValue()));
                getPane().setAgentWithholdingAmount(getWrapper().getAgentWithholdingAmount());
                getParameters().getBSuccess().assignEn(true);
                return;
            }
            if (fieldCode.equals("cAAC")) {
                getWrapper().setAgentAmount(getNullSafeString(getParameters().getReturnString().getEnValue()));
                getPane().setAgentAmount(getWrapper().getAgentAmount());
                getParameters().getBSuccess().assignEn(true);
                return;
            }
            /* support for user defined calculated fields */
            putUserFieldCodeString(fieldCode);
            getParameters().getBSuccess().assignEn(true);
            return;
        } catch (Exception e) {
            getDriverWrapper().logError("PutFieldCodeString failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during putFieldCodeString");
        } finally {
            Loggers.method().exit(LOG); // here only because of multiple returns
        }
    }
   
    /**
     * Returns the String value referenced by the supplied repeating field
     * via the Parameters object.
     * 
     * @param table code
     * @param row
     * @param field code 
     */
    @Override
    public final void getTablePartString(String tableCode, int row, String fieldCode) {
        Loggers.method().enter(LOG, tableCode, fieldCode);

        getParameters().getBSuccess().assignEn(false);

       
        if (tableCode == null || tableCode.isEmpty() || fieldCode == null || fieldCode.isEmpty()){ 
        	return;
        }
		
	    try{
 		} catch (Exception e) {
            getDriverWrapper().logError("getTablePartString failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during getTablePartString");
        } 
        
        Loggers.method().exit(LOG); 
        
     }
    
 /**
     * To put extra repeating field data values into customised entities
     * 
     * @param table code 
     * @param row
     * @param field code 
     */
    @Override
    public final void putTablePartString(String tCode, int row, String fieldCode) {
        Loggers.method().enter(LOG, tCode, row, fieldCode);

        getParameters().getBSuccess().assignEn(false);
          
        if (tCode == null || tCode.isEmpty() || fieldCode == null ||
		      fieldCode.isEmpty() || row< 0 ) { 
        	return;
		}
		
	    try{
 		
        } catch (Exception e) {
            getDriverWrapper().logError("PutTablePartString failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during putTablePartString");
        } 
        
        
        Loggers.method().exit(LOG); 
    }

    private ExtMasterWrapper getMasterWrapper() {
        return masterWrapper;
    }

	private ExtMasterSnapshotWrapper getMasterSSWrapper() {
        if (isForSnapshot() && masterSSWrapper == null
                && eventExtensionPane.getExtMasterSnapshot() != null) {
            masterSSWrapper = new ExtMasterSnapshotWrapper(eventExtensionPane.getExtMasterSnapshot());
        }
        return masterSSWrapper;
    }

    private final void updateMasterInternal() {
        Loggers.method().enter(LOG);

        try {
            getParameters().getBSuccess().assignEn(false);
            for (String controlName : getRelatedControlNames()) {
                Attributes masterAttr = getRelatedMasterAttributes(controlName);
                if (masterAttr == null) continue;

                updateMember(getWrapper(), getMasterWrapper(), controlName, masterAttr.getName());
                Attributes eventAttr = getRelatedAttributes(controlName);
                if (eventAttr.getCurrencyName() != null) {
                    updateMember(getWrapper(), getMasterWrapper(), eventAttr.getCurrencyName(), masterAttr.getCurrencyName());
                }
            }

            // repeating fields
            Set<String> rfs = getRelatedRepeatingFields();
            for (String rf: rfs) {
                updateRepeatingField(getWrapper(), getMasterWrapper(), rf);
            }

            getParameters().getBSuccess().assignEn(true);
        } catch (Exception e) {
            getDriverWrapper().logError("Failed to update extended master. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during updateMasterInternal");
        }

        Loggers.method().exit(LOG);
    }

    private final String getAssociatedCcyFromSS(String eventFieldName) {
        Loggers.method().enter(LOG, eventFieldName);

        String result = null;
        try {
            Attributes masterAttr = getRelatedMasterAttributes(eventFieldName);
            if (masterAttr != null) {
                String ccyName = masterAttr.getCurrencyName();
                String getterName = "get" + CustomisationHelper.upperCaseFirstLetter(ccyName);
                Method getter = getMasterSSWrapper().getClass().getMethod(getterName, new Class[] {});
                result = String.valueOf(getter.invoke(getMasterSSWrapper(), new Object[] {}));
            }
        } catch (Exception e) {
            throw new RuntimeException("Unable to obtain master snapshot associated currency for field " + eventFieldName, e);
        }

        Loggers.method().exit(LOG, result);
        return result;
	}

    private final Boolean getBooleanFieldFromSS(String getterName) {
        try {
            Method getter = getMasterSSWrapper().getClass().getMethod(getterName, new Class[] {});
            return (Boolean)getter.invoke(getMasterSSWrapper(), new Object[] {});
        } catch (Exception e) {
            throw new RuntimeException("Unable to obtain master snapshot field "+getterName, e);
        }
    }

    private final String getStringFieldFromSS(String getterName) {
        try {
            Method getter = getMasterSSWrapper().getClass().getMethod(getterName, new Class[] {});
            return (String)getter.invoke(getMasterSSWrapper(), new Object[] {});
        } catch (Exception e) {
            throw new RuntimeException("Unable to obtain master snapshot field "+getterName, e);
        }
    }
	
}
