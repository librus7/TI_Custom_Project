package com.misys.tiplus2.customisation.extension;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.lang.datatype.*;
import com.misys.tiplus2.enigma.lang.pane.EnigmaExtensionPane;
import com.misys.tiplus2.customisation.extensions.AbstractTICustomerDetailsExtension;
import com.misys.tiplus2.enigma.customisation.*;
import com.misys.tiplus2.enigma.customisation.control.*;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import com.misys.tiplus2.enigma.customisation.pane.ExtensionWebPane;
import com.misys.tiplus2.customisation.CommonModule;
import com.misys.tiplus2.customisation.DriverWrapperHelper;
import com.misys.tiplus2.foundations.lang.logging.Loggers;

import com.misys.tiplus2.apps.ti.tistatic.extsm.entity.*;
import com.misys.tiplus2.customisation.pane.*;
import com.misys.tiplus2.apps.ti.tistatic.extsm.pane.*;
/**
 * Customisation class for ExtTICustomerDetails
 * <p>StaticExtensionHandler.java.vm
 */
public class TICustomerExtension extends AbstractTICustomerDetailsExtension {

    private static final Logger LOG = LoggerFactory.getLogger(TICustomerExtension.class);

    
    @Override
    protected final ExtTICustomerDetailsWrapper getWrapper() {
        return (ExtTICustomerDetailsWrapper) super.getWrapper();
    }

    public final TICustomerPane getPane() {
        return (TICustomerPane) super.getCustomisedPane();
    }

    @Override
    protected final ExtTICustomerExtensionDriverPWrapper getDriverWrapper() {
        return (ExtTICustomerExtensionDriverPWrapper) super.getDriverWrapper();
    }

    
    /**
     * Initialises all Customisation properties required to facilitate
     * call-backs into the TI application.
     * 
     * @param olePane
     *            EnigmaExtensionPane driver pane.
     */
    @Override
    public final void initialise(EnigmaExtensionPane extensionPane) { 
        Loggers.method().enter(LOG, extensionPane);

        super.initialise(extensionPane);

        /* set reference to the wrapper in the superclass */
        setWrapper(new ExtTICustomerDetailsWrapper(((ExtTICustomerExtensionDriverP) extensionPane).getExtTICustomerDetails()));

        /* set reference to the driver wrapper in the superclass */
        setDriverWrapper(new ExtTICustomerExtensionDriverPWrapper((ExtTICustomerExtensionDriverP) extensionPane));

        /* set the local driver wrapper reference in the pane */
        getPane().setDriverWrapper(getDriverWrapper());
        
        //  set the extension handler reference in the pane
        ((ExtensionWebPane)getPane()).setExtensionHandler(this);

        /* Initialise parameters */
        setParameters(((ExtTICustomerExtensionDriverP) extensionPane).getParameters());

        Loggers.method().exit(LOG);
    }

    /**
     * Invoked method fired during initialisation chain.
     */
    public final void initialise() {
        Loggers.method().enter(LOG);

        CommonModule.initialiseTICustomer(getWrapper());
        
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
        Loggers.general().debug(LOG, "Invoked method DataCaptured() called, not implemented");
    }

    /**
     * Journals the customised fields which are saved to the extended entity
     */
    @Override
    public final void journal() {
        Loggers.method().enter(LOG);

        getParameters().getBSuccess().assignEn(false);

        getJournalDetails().initialiseJournalResources();
        getJournalDetails().clearJournalDetails();

 
        getParameters().getBSuccess().assignEn(true);

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

}// end of class
