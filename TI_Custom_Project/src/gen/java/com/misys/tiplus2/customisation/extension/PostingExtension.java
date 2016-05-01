package com.misys.tiplus2.customisation.extension;

import java.util.*;
import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.lang.datatype.*;
import com.misys.tiplus2.enigma.lang.pane.EnigmaExtensionPane;
import com.misys.tiplus2.enigma.customisation.*;
import com.misys.tiplus2.enigma.customisation.control.*;
import com.misys.tiplus2.customisation.extensions.AbstractPostingExtension;
import com.misys.tiplus2.customisation.model.PostingTableDataModel;
import com.misys.tiplus2.customisation.CommonModule;
import com.misys.tiplus2.customisation.DriverWrapperHelper;
import com.misys.tiplus2.foundations.lang.logging.Loggers;

import com.misys.tiplus2.apps.ti.kernel.extpm.entity.*;
import com.misys.tiplus2.customisation.pane.*;
import com.misys.tiplus2.apps.ti.kernel.extpm.pane.*;

/**
 * Customisation class for ExtPosting
 */
public class PostingExtension extends AbstractPostingExtension {

    private static final Logger LOG = LoggerFactory.getLogger(PostingExtension.class);

    private PostingType postingType;

    private ExtAPIWrapper apiWrapper;

    private ExtPostingWrapper compWrapper;

    protected final ExtPostingWrapper getWrapper() {
        return (ExtPostingWrapper) super.getWrapper();
    }

    protected final ExtAPIWrapper getApiWrapper() {
        return this.apiWrapper;
    }

    protected final ExtPostingWrapper getCompWrapper() {
        return this.compWrapper;
    }

    @Override
    protected final PostingExtensionDriverPWrapper getDriverWrapper() {
        return (PostingExtensionDriverPWrapper) super.getDriverWrapper();
    }

    public final PostingPane getPane() {
        return (PostingPane) super.getCustomisedPane();
    }

    protected final PostingType getPostingType() {
        return this.postingType;
    }

    /**
     * Initialises all Customisation properties required to facilitate
     * call-backs into TI+.
     * 
     * @param olePane
     *            EnigmaExtensionPane driver pane.
     */
    @Override
    public final void initialise(EnigmaExtensionPane extensionPane) {
        Loggers.method().enter(LOG, extensionPane);

        super.initialise(extensionPane);

        /* Create an instance of the ExtPostingWrapper passing a reference to the key */
        setWrapper(new ExtPostingWrapper(((PostingExtensionDriverP) extensionPane).getExtPosting()));

        /* Posting only - need to create a wrapper for ExtAPI */
        this.apiWrapper = new ExtAPIWrapper(((PostingExtensionDriverP) extensionPane).getExtEQ3Posting());

        /* Posting only - need to create a wrapper for ExtPostingComp */
        this.compWrapper = new ExtPostingWrapper(((PostingExtensionDriverP) extensionPane).getExtPostingComp());

        /* set reference to the driver wrapper in the superclass */
        if (extensionPane instanceof ExtFAPExtensionDriverP) {
            setDriverWrapper(new ExtFAPExtensionDriverPWrapper((ExtFAPExtensionDriverP) extensionPane));
        } else if (extensionPane instanceof ExtPCAPExtensionDriverP) {
            setDriverWrapper(new ExtPCAPExtensionDriverPWrapper((ExtPCAPExtensionDriverP) extensionPane));
        } else if (extensionPane instanceof ExtPostingExtensionDriverP) {
            setDriverWrapper(new ExtPostingExtensionDriverPWrapper((ExtPostingExtensionDriverP) extensionPane));
        } else {
           setDriverWrapper(new PostingExtensionDriverPWrapper((PostingExtensionDriverP) extensionPane));
        }

        setParameters(((PostingExtensionDriverP) extensionPane).getParameters());

        Loggers.method().exit(LOG);
    }

    /**
     * Invoked method fired during initialisation chain
     */
    public final void initialise(String postingTypeString) {
        Loggers.method().enter(LOG, postingTypeString);

        this.postingType = getPostingTypeFromString(postingTypeString);
        CommonModule.initialisePosting(getWrapper());

        Loggers.method().exit(LOG);
    }

    /**
     * Method invoked after Initialisation. Updates the customised pane's
     * extra posting table with the extra data from extended posting entity.
     */
    @Override
    public final void postInitialise() {
        Loggers.method().enter(LOG);

        getPane().getTable().clear();

        boolean success = onPostInitialise();
        getParameters().getBSuccess().assignEn(success);

        Loggers.method().exit(LOG);
    }

    /**
     * Override this method to add extra fields to the current posting.
     */
    public void addExtraFields() {
        Loggers.general().debug(LOG, "Stub method addExtraFields() called, not implemented");
    }

    /**
     * Override this method to add extra settlement fields to the current posting.
     */
    public void addExtraSettlementFields() {
        Loggers.general().debug(LOG, "Stub method addExtraSettlementFields() called, not implemented");
    }

    /**
     * Determines whether to net the current posting. 
     *
     * Override this method to enforce netting or bulking for particular
     * types of posting. 
     *
     * @param postingTypeString
     *          String indicating the type of posting.
     */
    public void checkDoNettingOrBulking(String postingTypeString){
        Loggers.method().enter(LOG, postingTypeString);

        boolean b = true;
        getParameters().getBDoNetting().assignEn(b);

        Loggers.method().exit(LOG);
    }

    /**
     * Used to express which fields from the raw postings should be carried 
     * over to the netted posting. 
     *
     * Override this method to force certain fields from a raw posting to 
     * be carried over to the netted posting.
     *
     * @param postingTypeString
     *				String indicating the type of posting.
     */
    public void netWith(String postingTypeString) {
        Loggers.method().enter(LOG, postingTypeString);


        Loggers.method().exit(LOG);
    }

    /**
     * Method to return the entire posting's extra fields in a string.
     */
    public final void getExtendedString() {
        Loggers.method().enter(LOG);

        getParameters().getBSuccess().assignEn(false);
        StringBuilder sb = new StringBuilder("");
        getParameters().getReturnString().assignEn(sb.toString());
        getParameters().getBSuccess().assignEn(true);

        Loggers.method().exit(LOG);
    }

    /**
     * Copy the TI Posting fields to the API Posting fields for release.
     */
    public final void copyToAPI() {
        Loggers.method().enter(LOG);


        Loggers.method().exit(LOG);
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

}// end of class
