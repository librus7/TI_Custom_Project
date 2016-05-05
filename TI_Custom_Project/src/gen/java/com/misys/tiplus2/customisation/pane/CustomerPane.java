


package com.misys.tiplus2.customisation.pane;

import java.util.*;
import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.customisation.*;
import com.misys.tiplus2.enigma.customisation.*;
import com.misys.tiplus2.enigma.customisation.control.*;
import com.misys.tiplus2.customisation.extension.*;
import com.misys.tiplus2.enigma.customisation.pane.ExtensionWebPane;
import com.misys.tiplus2.enigma.customisation.pane.ExtensionViewPaneMode;
import com.misys.tiplus2.enigma.customisation.pane.ExtensionViewWebPane;
import com.misys.tiplus2.enigma.customisation.validation.ValidationDetails;
import com.misys.tiplus2.enigma.customisation.validation.ValidationDetails.ErrorType;
import com.misys.tiplus2.enigma.customisation.validation.ValidationTexts;
import com.misys.tiplus2.enigma.customisation.entity.SequencedRepeatingFieldArrayHelper;
import com.misys.tiplus2.enigma.lang.EnigmaException;
import com.misys.tiplus2.enigma.lang.EnigmaExceptionCode;
import com.misys.tiplus2.enigma.lang.datatype.*;
import com.misys.tiplus2.enigma.lang.datatype.EnigmaArray.SelectorType;
import com.misys.tiplus2.enigma.lang.control.*;
import com.misys.tiplus2.enigma.lang.control.wrapper.*;
import com.misys.tiplus2.enigma.lang.util.*;
import com.misys.tiplus2.apps.ti.tistatic.tistatic.entity.*;
import com.misys.tiplus2.apps.ti.tistatic.tistatic1t.webpane.*;
import com.misys.tiplus2.customisation.extension.*;
import com.misys.tiplus2.apps.ti.tistatic.extstatc.entity.CustomisedStaticDefinition;
import com.misys.tiplus2.apps.ti.tistatic.extstatc.entity.CustomisedStaticDummyEnt;
import com.misys.tiplus2.apps.ti.tistatic.extstatc.entity.Key_CustomisedStaticDefinition;
import com.misys.tiplus2.apps.ti.tistatic.extstatc.entity.Key_CustomisedStaticDummyEnt;
import com.misys.tiplus2.apps.ti.tistatic.extstatt.webpane.CustomisedStaticBrowserWP;

import com.misys.tiplus2.foundations.lang.logging.Loggers;


import com.misys.tiplus2.apps.ti.tistatic.extsm.pane.*;

import com.misys.tiplus2.enigma.lang.exceptions.EnigmaTableControlException;

/**
 * This is the Pane for the Customer.
 *  
 *
 *
 */
public class CustomerPane extends ExtensionWebPane {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerPane.class);
    private static final long serialVersionUID = 1L;


    private ExtCustomerExtensionDriverPWrapper driverWrapper;

    public final void setDriverWrapper(ExtCustomerExtensionDriverPWrapper driverWrapper) {
        this.driverWrapper = driverWrapper;
    }

    public ExtCustomerExtensionDriverPWrapper getDriverWrapper() {
        return driverWrapper;
    }

    private HeavyString agentWithholdingPercentage = new HeavyString();


    private EnigmaStringControlWrapper ctlAgentWithholdingPercentage_wrapper;

    /**
     * Default constructor
     */    
    public CustomerPane() {
        Loggers.method().enter(LOG);


        Loggers.method().exit(LOG);
    }

    @Override
    public final void enigmaCleanUp() {
    }


    /**
     * Getters/setters  
     */
    public final void setAgentWithholdingPercentage(String agentWithholdingPercentage) {
        Loggers.method().setter(LOG, agentWithholdingPercentage);
        addMessageValueChangeEvent("agentWithholdingPercentage", this.agentWithholdingPercentage, agentWithholdingPercentage);
        this.agentWithholdingPercentage.setEnValue(agentWithholdingPercentage);
    }

    public final String getAgentWithholdingPercentage() {
        String result = this.agentWithholdingPercentage.getEnValue();
        Loggers.method().getter(LOG, result);
        return result;
    }


    /**
     * Getters for control 
     */
    public final EnigmaStringControlWrapper getCtlAgentWithholdingPercentage() {
        if (ctlAgentWithholdingPercentage_wrapper == null) {
            Attributes attr = getRelatedAttributes("AgentWithholdingPercentage");
            CtlAgentWithholdingPercentage ctlAgentWithholdingPercentage = new CtlAgentWithholdingPercentage("", this);

            /* Control initialisation. */
            ctlAgentWithholdingPercentage.setReadOnly(attr.getReadOnly() );
            ctlAgentWithholdingPercentage.setMandatory(attr.getMandatory() );
            ctlAgentWithholdingPercentage.setAutoSubmit(attr.isAutoSubmit());
            if(attr.getMaxRownum() > 0) {
                ctlAgentWithholdingPercentage.getBoundObject().setNumberOfRows(attr.getMaxRownum());
            }
            ctlAgentWithholdingPercentage_wrapper = new EnigmaStringControlWrapper(ctlAgentWithholdingPercentage);
        }
        return ctlAgentWithholdingPercentage_wrapper; 
    }



    /**
     * Validates the control - Agent Withholding Percentage
     *
     * @param ValidationDetails
     *                The validation details used to report any errors or warnings to TI+
     */
    public final void validateCtlAgentWithholdingPercentage(ValidationDetails validationDetails) {
        Loggers.method().enter(LOG, validationDetails);
        Attributes attr = getRelatedAttributes("AgentWithholdingPercentage");
        String value = agentWithholdingPercentage.getEnValue();
        if ("".equals(value)) {
            if (attr.getMandatory()) {
                validationDetails.addError(ErrorType.MustBeEntered, "Agent Withholding Percentage");
            }
        }
        else {
            try {
                Integer.parseInt(value);
            } catch (NumberFormatException e) {
                validationDetails.addError(ErrorType.InvalidInput, "Agent Withholding Percentage", ValidationTexts.INVALID_INTEGER);
            }
            validateAgentWithholdingPercentage(validationDetails);
        }
        Loggers.method().exit(LOG);
    }

    /**
     * Validates the extension field. This is a stub method, 
     * override this method to add your own field level validation.
     *
     * @param ValidationDetails
     *                The validation details used to report any errors or warnings to TI+
     *
     */ 
    public void validateAgentWithholdingPercentage(ValidationDetails validationDetails) {
        Loggers.general().debug(LOG, "validate{}():{}", "AgentWithholdingPercentage", ValidationTexts.METHOD_NOT_IMPLEMENTED);
    }


    /**
     *    Controls InnerClasses  
     */  
    public final class CtlAgentWithholdingPercentage extends ExtendedEditBoxControl {

        /**
         * Constructor
         */
        public CtlAgentWithholdingPercentage(String initialValue, CustomerPane parentPane) {
            super("AgentWithholdingPercentage", initialValue, parentPane);
        }

        @Override
        public HeavyString getBoundObject() {
            return agentWithholdingPercentage;
        }

        /**
         * @param newValue new value to set - if control is disabled or the value is null 'change' is ignored
         */
        @Override
        public final void setValue(String newValue) {
            Loggers.method().setter(LOG, newValue);
                if (canUpdate() && newValue != null) {
                    agentWithholdingPercentage.setEnValue(newValue);
                }
        }
    }
//button handling 
//end of button handling


;


// start:auto submit action events
   
// end:auto submit action events


// start:repeating field auto submit action events
  
// end:repeating-field auto submit action events




    /**
     *  Method called when setting data via a message is complete.
     */
    public final void postMessageProcessing() {
        Loggers.method().enter(LOG);
        
        postMessageProcessing_main();

          
        Loggers.method().exit(LOG);
    }
    
    private void postMessageProcessing_main() {
        Loggers.method().enter(LOG);
        try {
            Iterator<String> it = getMessageValueChangeEventsIterator();
            while (it.hasNext()) {
                String id = it.next();
               }
        }
        finally {
            clearMessageValueChangeEvents();
        }
    }

    /**
     * Invoke a method on the ViewPane
     *
     * @param vp
     * @param methodName
     */
    private void invokeViewPaneAutoSubmitMethod(ExtensionViewWebPane vp, String fieldName) {
        String methodName = "on" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1) + "AutoSubmit";
        try {
            Class<?>[] c = null;
            java.lang.reflect.Method method = vp.getClass().getMethod(methodName, c);
            method.invoke(vp, new Object[]{});
        } catch (Exception ex) {
            suppressedException(ex, LOG, String.format("Failed to invoke method %s.%s()", vp.getClass().getSimpleName(), methodName));
        }
    }
    
      

    /**
     *  This method may be called within validation code if required.
     *  <p>
     *  Its purpose is to delegate validation to the repeating field view pane
     *  for each row of data.
     *  <p>
     *  Note that the view pane will be dependent on the layout in use at
     *  runtime.
     */
    public final void validateRepeatingFields(ValidationDetails validationDetails) {
        Loggers.method().enter(LOG);
        
         
        Loggers.method().exit(LOG);
    }
    
 





}// end of class
