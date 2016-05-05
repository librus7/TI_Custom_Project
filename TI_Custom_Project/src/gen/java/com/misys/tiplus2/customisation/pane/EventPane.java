


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


import com.misys.tiplus2.apps.ti.kernel.extpm.pane.*;

import com.misys.tiplus2.enigma.lang.exceptions.EnigmaTableControlException;

/**
 * This is the Pane for the Event.
 *  
 *
 *
 */
public class EventPane extends ExtensionWebPane {

    private static final Logger LOG = LoggerFactory.getLogger(EventPane.class);
    private static final long serialVersionUID = 1L;


    private ExtEventExtensionDriverPWrapper driverWrapper;

    public final void setDriverWrapper(ExtEventExtensionDriverPWrapper driverWrapper) {
        this.driverWrapper = driverWrapper;
    }

    public ExtEventExtensionDriverPWrapper getDriverWrapper() {
        return driverWrapper;
    }

    private HeavyString agentWithholdingAmount = new HeavyString();
    private HeavyString agentAmount = new HeavyString();


    private EnigmaStringControlWrapper ctlAgentWithholdingAmount_wrapper;
    private EnigmaStringControlWrapper ctlAgentAmount_wrapper;

    /**
     * Default constructor
     */    
    public EventPane() {
        Loggers.method().enter(LOG);


        Loggers.method().exit(LOG);
    }

    @Override
    public final void enigmaCleanUp() {
    }


    /**
     * Getters/setters  
     */
    public final void setAgentWithholdingAmount(String agentWithholdingAmount) {
        Loggers.method().setter(LOG, agentWithholdingAmount);
        addMessageValueChangeEvent("agentWithholdingAmount", this.agentWithholdingAmount, agentWithholdingAmount);
        this.agentWithholdingAmount.setEnValue(agentWithholdingAmount);
    }

    public final String getAgentWithholdingAmount() {
        String result = this.agentWithholdingAmount.getEnValue();
        Loggers.method().getter(LOG, result);
        return result;
    }

    public final void setAgentAmount(String agentAmount) {
        Loggers.method().setter(LOG, agentAmount);
        addMessageValueChangeEvent("agentAmount", this.agentAmount, agentAmount);
        this.agentAmount.setEnValue(agentAmount);
    }

    public final String getAgentAmount() {
        String result = this.agentAmount.getEnValue();
        Loggers.method().getter(LOG, result);
        return result;
    }


    /**
     * Getters for control 
     */
    public final EnigmaStringControlWrapper getCtlAgentWithholdingAmount() {
        if (ctlAgentWithholdingAmount_wrapper == null) {
            Attributes attr = getRelatedAttributes("AgentWithholdingAmount");
            CtlAgentWithholdingAmount ctlAgentWithholdingAmount = new CtlAgentWithholdingAmount("", this);

            /* Control initialisation. */
            ctlAgentWithholdingAmount.setReadOnly(attr.getReadOnly() );
            ctlAgentWithholdingAmount.setMandatory(attr.getMandatory() );
            ctlAgentWithholdingAmount.setAutoSubmit(attr.isAutoSubmit());
            if(attr.getMaxRownum() > 0) {
                ctlAgentWithholdingAmount.getBoundObject().setNumberOfRows(attr.getMaxRownum());
            }
            ctlAgentWithholdingAmount.getBoundObject().setMax(12);
            ctlAgentWithholdingAmount_wrapper = new EnigmaStringControlWrapper(ctlAgentWithholdingAmount);
        }
        return ctlAgentWithholdingAmount_wrapper; 
    }

    public final EnigmaStringControlWrapper getCtlAgentAmount() {
        if (ctlAgentAmount_wrapper == null) {
            Attributes attr = getRelatedAttributes("AgentAmount");
            CtlAgentAmount ctlAgentAmount = new CtlAgentAmount("", this);

            /* Control initialisation. */
            ctlAgentAmount.setReadOnly(attr.getReadOnly() );
            ctlAgentAmount.setMandatory(attr.getMandatory() );
            ctlAgentAmount.setAutoSubmit(attr.isAutoSubmit());
            if(attr.getMaxRownum() > 0) {
                ctlAgentAmount.getBoundObject().setNumberOfRows(attr.getMaxRownum());
            }
            ctlAgentAmount.getBoundObject().setMax(12);
            ctlAgentAmount_wrapper = new EnigmaStringControlWrapper(ctlAgentAmount);
        }
        return ctlAgentAmount_wrapper; 
    }



    /**
     * Validates the control - Agent Withholding Amount
     *
     * @param ValidationDetails
     *                The validation details used to report any errors or warnings to TI+
     */
    public final void validateCtlAgentWithholdingAmount(ValidationDetails validationDetails) {
        Loggers.method().enter(LOG, validationDetails);
        Attributes attr = getRelatedAttributes("AgentWithholdingAmount");
        String value = agentWithholdingAmount.getEnValue();
        if ("".equals(value)) {
            if (attr.getMandatory()) {
                validationDetails.addError(ErrorType.MustBeEntered, "Agent Withholding Amount");
            }
        }
        else {
            try {
                String msg = CustomisationHelper.validateDecimal(value, 12, 2);
                if(msg != null) {
                   validationDetails.addError(ErrorType.InvalidInput, "Agent Withholding Amount", msg);
                }
            } catch (NumberFormatException e) {
                validationDetails.addError(ErrorType.InvalidInput, "Agent Withholding Amount", ValidationTexts.INVALID_DECIMAL);
            }
            validateAgentWithholdingAmount(validationDetails);
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
    public void validateAgentWithholdingAmount(ValidationDetails validationDetails) {
        Loggers.general().debug(LOG, "validate{}():{}", "AgentWithholdingAmount", ValidationTexts.METHOD_NOT_IMPLEMENTED);
    }

    /**
     * Validates the control - Agent Amount
     *
     * @param ValidationDetails
     *                The validation details used to report any errors or warnings to TI+
     */
    public final void validateCtlAgentAmount(ValidationDetails validationDetails) {
        Loggers.method().enter(LOG, validationDetails);
        Attributes attr = getRelatedAttributes("AgentAmount");
        String value = agentAmount.getEnValue();
        if ("".equals(value)) {
            if (attr.getMandatory()) {
                validationDetails.addError(ErrorType.MustBeEntered, "Agent Amount");
            }
        }
        else {
            try {
                String msg = CustomisationHelper.validateDecimal(value, 12, 2);
                if(msg != null) {
                   validationDetails.addError(ErrorType.InvalidInput, "Agent Amount", msg);
                }
            } catch (NumberFormatException e) {
                validationDetails.addError(ErrorType.InvalidInput, "Agent Amount", ValidationTexts.INVALID_DECIMAL);
            }
            validateAgentAmount(validationDetails);
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
    public void validateAgentAmount(ValidationDetails validationDetails) {
        Loggers.general().debug(LOG, "validate{}():{}", "AgentAmount", ValidationTexts.METHOD_NOT_IMPLEMENTED);
    }


    /**
     *    Controls InnerClasses  
     */  
    public final class CtlAgentWithholdingAmount extends ExtendedEditBoxControl {

        /**
         * Constructor
         */
        public CtlAgentWithholdingAmount(String initialValue, EventPane parentPane) {
            super("AgentWithholdingAmount", initialValue, parentPane);
        }

        @Override
        public HeavyString getBoundObject() {
            return agentWithholdingAmount;
        }

        /**
         * @param newValue new value to set - if control is disabled or the value is null 'change' is ignored
         */
        @Override
        public final void setValue(String newValue) {
                if (canUpdate() && newValue != null) {
                    agentWithholdingAmount.setEnValue(newValue);
                }
        }
    }
    public final class CtlAgentAmount extends ExtendedEditBoxControl {

        /**
         * Constructor
         */
        public CtlAgentAmount(String initialValue, EventPane parentPane) {
            super("AgentAmount", initialValue, parentPane);
        }

        @Override
        public HeavyString getBoundObject() {
            return agentAmount;
        }

        /**
         * @param newValue new value to set - if control is disabled or the value is null 'change' is ignored
         */
        @Override
        public final void setValue(String newValue) {
                if (canUpdate() && newValue != null) {
                    agentAmount.setEnValue(newValue);
                }
        }
    }
//button handling 
   private ExtendedButtonControlWrapper btnTestButtonTestLayout;
   
   public final ExtendedButtonControlWrapper getBtnTestButtonTestLayout() {
        if (btnTestButtonTestLayout==null){
            EnigmaButton btn = new EnigmaButton(this, "Test");
            btn.setLogicalName("btnTestButtonTestLayout");
            btnTestButtonTestLayout = new ExtendedButtonControlWrapper(btn);
        }
        return btnTestButtonTestLayout;
   }
   
   /**
    *   Method called via JSF to run the action method
    */
   public final String fireTestButtonTestLayoutButtonAction() {   
        Loggers.method().enter(LOG);
        PaneManager.enterEvent();
        try {
            onTestButtonTestLayoutButton();
        } catch (Exception ex) {
            String msg = String.format("Failed within '%s' action event within layout '%s'. Exception is: %s", "TestButton", "TestLayout", ex);
            suppressedException(ex, LOG, msg);
            driverWrapper.logError(msg);
        }	
        String result = PaneManager.exitEvent();
        Loggers.method().exit(LOG, result);
        return result;
   }
   
    /**
     * Button action method that may be overridden in extension pane
     * for control <code>TestButton</code> in layout <code>TestLayout</code>
     *
     */
   public void onTestButtonTestLayoutButton() {   
        Loggers.general().debug(LOG, "on{}Button:{}", "TestButtonTestLayout", ValidationTexts.METHOD_NOT_IMPLEMENTED);
   }   
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
