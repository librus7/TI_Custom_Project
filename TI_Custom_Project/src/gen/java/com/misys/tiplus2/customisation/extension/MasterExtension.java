package com.misys.tiplus2.customisation.extension;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.lang.datatype.*;
import com.misys.tiplus2.enigma.lang.pane.EnigmaExtensionPane;
import com.misys.tiplus2.customisation.extensions.AbstractMasterExtension;
import com.misys.tiplus2.enigma.customisation.*;
import com.misys.tiplus2.enigma.customisation.control.*;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import com.misys.tiplus2.customisation.DriverWrapperHelper;
import com.misys.tiplus2.customisation.CommonModule;
import com.misys.tiplus2.foundations.lang.logging.Loggers;

import com.misys.tiplus2.apps.ti.kernel.extpm.entity.*;
import com.misys.tiplus2.customisation.pane.*;
import com.misys.tiplus2.apps.ti.kernel.extpm.pane.*;

/**
 * Customisation class for ExtMaster
 <p>MasterExtensionHandler.java.vm
 */
public class MasterExtension extends AbstractMasterExtension {

    private static final Logger LOG = LoggerFactory.getLogger(MasterExtension.class);

    private boolean isForSnapshot;

    private ExtMasterSnapshotWrapper ssWrapper;

	@Override
	protected final ExtMasterWrapper getWrapper() {
        return (ExtMasterWrapper) super.getWrapper();
    }

    protected final ExtMasterSnapshotWrapper getSSWrapper() {
        return this.ssWrapper;
    }

    private final void setSSWrapper(ExtMasterSnapshotWrapper ssWrapper) {
        this.ssWrapper = ssWrapper;
    }

    public final MasterPane getPane() {
        return (MasterPane) super.getCustomisedPane();
    }

    @Override
    protected final MasterExtensionDriverPWrapper getDriverWrapper() {
        return (MasterExtensionDriverPWrapper) super.getDriverWrapper();
    }

    public final boolean isForSnapshot() {
        return isForSnapshot;
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

        //set reference to the wrapper in the superclass
        setWrapper(new ExtMasterWrapper(((MasterExtensionDriverP) extensionPane).getExtMaster()));

        //set reference to the driver wrapper in the superclass
        setDriverWrapper(new MasterExtensionDriverPWrapper((MasterExtensionDriverP) extensionPane));

        //set the local driver wrapper reference in the pane
        getPane().setDriverWrapper(getDriverWrapper());
		
        if (((MasterExtensionDriverP) extensionPane).IsForSnapshot() == 0) {
            this.isForSnapshot = false;
        } else { // Master snapshot
            this.isForSnapshot = true;
            setSSWrapper(new ExtMasterSnapshotWrapper(((ExtMasterSSExtensionDriverP) extensionPane).getExtMasterSnapshot()));
        }

        setParameters(((MasterExtensionDriverP) extensionPane).getParameters());

        Loggers.method().exit(LOG);
    }

    /**
     * Initialise $tableName. Used to ensure initial values and safe data 
     * types are stored in the extended entity.
     */
    public final void initialise() {
        Loggers.method().enter(LOG);

        if (isForSnapshot()) {
            CommonModule.initialiseMasterSnapshot(getSSWrapper());
        } else {
            CommonModule.initialiseMaster(getWrapper());
        }

        Loggers.method().exit(LOG);
    }
    
    /**
     * Method invoked after Initialisation.
     * Override this method to implement code which should run after 
     * Initialise() and prior to user interaction with the pane.
     */
    @Override
    public final void postInitialise() {
        Loggers.method().enter(LOG);

        if (isForSnapshot()) {
            postInitialiseMasterSnapshot();
        } else {
            postInitialiseMaster();
        }
        getParameters().getBSuccess().assignEn(true);

        Loggers.method().exit(LOG);
    }

    @SuppressWarnings("unchecked")
    private void postInitialiseMaster() {
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
    }

    @SuppressWarnings("unchecked")
    private void postInitialiseMasterSnapshot() {
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
        } catch (Exception e) {
            getDriverWrapper().logError("GetFieldCodeAmount failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during GetFieldCodeAmount");
        }
    }

    /**
     * Returns the Amount value referenced by the supplied field code
     * via the Parameters object.
     * 
     * @param tableCode
     * @param row
     * @param fieldCode
     */
    @Override
    public final void getTablePartAmount(String tableCode, int row, String fieldCode) {
        Loggers.method().enter(LOG, tableCode, row, fieldCode);

        getParameters().getBSuccess().assignEn(false);
        if (tableCode == null || tableCode.isEmpty() || fieldCode == null || fieldCode.isEmpty()){ 
            return;
        }

        try {


        } catch (Exception e) {
            getDriverWrapper().logError("GetTablePartAmount failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during GetTablePartAmount");
        }
    } // end getFieldCodeAmount



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
        } catch (Exception e) {
            getDriverWrapper().logError("GetFieldCodeBoolean failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during GetFieldCodeBoolean");
        }
    }

    /**
     * Returns the Boolean value referenced by the supplied field code
     * via the Parameters object.
     * 
     * @param tableCode
     * @param row
     * @param fieldCode
     */
    @Override
    public final void getTablePartBoolean(String tableCode, int row, String fieldCode) {
        Loggers.method().enter(LOG, tableCode, row, fieldCode);

        getParameters().getBSuccess().assignEn(false);
        if (tableCode == null || tableCode.isEmpty() || fieldCode == null || fieldCode.isEmpty()){ 
            return;
        }

        try {


        } catch (Exception e) {
            getDriverWrapper().logError("GetTablePartBoolean failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during GetTablePartBoolean");
        }
    } // end getFieldCodeBoolean



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
        } catch (Exception e) {
            getDriverWrapper().logError("GetFieldCodeDate failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during GetFieldCodeDate");
        }
    }

    /**
     * Returns the Date value referenced by the supplied field code
     * via the Parameters object.
     * 
     * @param tableCode
     * @param row
     * @param fieldCode
     */
    @Override
    public final void getTablePartDate(String tableCode, int row, String fieldCode) {
        Loggers.method().enter(LOG, tableCode, row, fieldCode);

        getParameters().getBSuccess().assignEn(false);
        if (tableCode == null || tableCode.isEmpty() || fieldCode == null || fieldCode.isEmpty()){ 
            return;
        }

        try {


        } catch (Exception e) {
            getDriverWrapper().logError("GetTablePartDate failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during GetTablePartDate");
        }
    } // end getFieldCodeDate



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
        } catch (Exception e) {
            getDriverWrapper().logError("GetFieldCodeInteger failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during GetFieldCodeInteger");
        }
    }

    /**
     * Returns the Integer value referenced by the supplied field code
     * via the Parameters object.
     * 
     * @param tableCode
     * @param row
     * @param fieldCode
     */
    @Override
    public final void getTablePartInteger(String tableCode, int row, String fieldCode) {
        Loggers.method().enter(LOG, tableCode, row, fieldCode);

        getParameters().getBSuccess().assignEn(false);
        if (tableCode == null || tableCode.isEmpty() || fieldCode == null || fieldCode.isEmpty()){ 
            return;
        }

        try {


        } catch (Exception e) {
            getDriverWrapper().logError("GetTablePartInteger failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during GetTablePartInteger");
        }
    } // end getFieldCodeInteger



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
        } catch (Exception e) {
            getDriverWrapper().logError("GetFieldCodeString failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during GetFieldCodeString");
        }
    }

    /**
     * Returns the String value referenced by the supplied field code
     * via the Parameters object.
     * 
     * @param tableCode
     * @param row
     * @param fieldCode
     */
    @Override
    public final void getTablePartString(String tableCode, int row, String fieldCode) {
        Loggers.method().enter(LOG, tableCode, row, fieldCode);

        getParameters().getBSuccess().assignEn(false);
        if (tableCode == null || tableCode.isEmpty() || fieldCode == null || fieldCode.isEmpty()){ 
            return;
        }

        try {


        } catch (Exception e) {
            getDriverWrapper().logError("GetTablePartString failed. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during GetTablePartString");
        }
    } // end getFieldCodeString



     /**
     * Copy data from Master to Master Snapshot
     */
    @Override
    public final void setFromExtMaster() {

        try {
            getParameters().getBSuccess().assignEn(false);
            for (String controlName : getRelatedControlNames()) {
                updateMember(getWrapper(), getSSWrapper(), controlName, controlName);
                Attributes masterAttr = getRelatedAttributes(controlName);
                if (masterAttr.getCurrencyName() != null) {
                    updateMember(getWrapper(), getSSWrapper(), masterAttr.getCurrencyName(), masterAttr.getCurrencyName()); 
                }
            }
 
            // repeating fields
            Set<String> rfs = getRelatedRepeatingFields();
            for (String rf: rfs) {
                updateRepeatingField(getWrapper(), getSSWrapper(), rf);
            }

            getParameters().getBSuccess().assignEn(true);
        } catch (Exception e) {
            getDriverWrapper().logError("Failed to update extended master snapshot. Description=" + e.getMessage());
            unexpectedException(e, LOG, "Unexpected exception during setFromExtMaster");
        }
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

