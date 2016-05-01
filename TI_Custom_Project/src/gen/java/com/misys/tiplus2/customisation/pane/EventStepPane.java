


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
 * This is the Pane for the EventStep.
 *  
 *
 *
 */
public class EventStepPane extends ExtensionWebPane {

    private static final Logger LOG = LoggerFactory.getLogger(EventStepPane.class);
    private static final long serialVersionUID = 1L;


    private ExtEventStepExtensionDriverPWrapper driverWrapper;

    public final void setDriverWrapper(ExtEventStepExtensionDriverPWrapper driverWrapper) {
        this.driverWrapper = driverWrapper;
    }

    public ExtEventStepExtensionDriverPWrapper getDriverWrapper() {
        return driverWrapper;
    }




    /**
     * Default constructor
     */    
    public EventStepPane() {
        Loggers.method().enter(LOG);


        Loggers.method().exit(LOG);
    }

    @Override
    public final void enigmaCleanUp() {
    }


    /**
     * Getters/setters  
     */

    /**
     * Getters for control 
     */



    /**
     *    Controls InnerClasses  
     */  
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
