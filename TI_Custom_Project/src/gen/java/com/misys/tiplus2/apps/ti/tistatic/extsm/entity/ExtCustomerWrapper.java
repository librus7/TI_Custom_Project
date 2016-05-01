package com.misys.tiplus2.apps.ti.tistatic.extsm.entity;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.math.BigDecimal;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.customisation.*;
import com.misys.tiplus2.enigma.customisation.entity.EnigmaCustomisedEntityWrapper;
import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.lang.datatype.EnigmaDate;
import com.misys.tiplus2.foundations.lang.logging.Loggers;

// model: class com.misys.tiplus2.generator.customisation.models.extension.ExtensionProxy
 
public class ExtCustomerWrapper extends EnigmaCustomisedEntityWrapper {

    private static final Logger LOG = LoggerFactory.getLogger(ExtCustomerWrapper.class);

    public ExtCustomerWrapper(Key_ExtCustomer<? extends ExtCustomer> key) {
        super(key);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final Key_ExtCustomer<? extends ExtCustomer> getKey() {
        return (Key_ExtCustomer<? extends ExtCustomer>) super.getKey();
    }

    public final int getInitialised() {
        return getKey().getDbValue().getInitialised().getIntValue();
    }

    public final void setInitialised(int value) {
        getKey().getDbValue().getInitialised().setIntValue(value);
    }

    public final String getAgentWithholdingPercentage() {
        return getStringFromInteger("AGNTWPRC");
    }

    public final void setAgentWithholdingPercentage(String agentWithholdingPercentage) {
        setIntegerFromString("AGNTWPRC", agentWithholdingPercentage, 0);
     }

 
 


 


  

 

 

 }// end of wrapper
