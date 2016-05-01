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
 
public class ExtTICustomerDetailsWrapper extends EnigmaCustomisedEntityWrapper {

    private static final Logger LOG = LoggerFactory.getLogger(ExtTICustomerDetailsWrapper.class);

    public ExtTICustomerDetailsWrapper(Key_ExtTICustomerDetails<? extends ExtTICustomerDetails> key) {
        super(key);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final Key_ExtTICustomerDetails<? extends ExtTICustomerDetails> getKey() {
        return (Key_ExtTICustomerDetails<? extends ExtTICustomerDetails>) super.getKey();
    }

    public final int getInitialised() {
        return getKey().getDbValue().getInitialised().getIntValue();
    }

    public final void setInitialised(int value) {
        getKey().getDbValue().getInitialised().setIntValue(value);
    }

 


 


  

 

 

 }// end of wrapper
