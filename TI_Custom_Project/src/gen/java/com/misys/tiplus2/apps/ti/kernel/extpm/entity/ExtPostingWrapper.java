package com.misys.tiplus2.apps.ti.kernel.extpm.entity;

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
 
public class ExtPostingWrapper extends EnigmaCustomisedEntityWrapper {

    private static final Logger LOG = LoggerFactory.getLogger(ExtPostingWrapper.class);

    public ExtPostingWrapper(Key_ExtPosting<? extends ExtPosting> key) {
        super(key);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final Key_ExtPosting<? extends ExtPosting> getKey() {
        return (Key_ExtPosting<? extends ExtPosting>) super.getKey();
    }

    public final int getInitialised() {
        return getKey().getDbValue().getInitialised().getIntValue();
    }

    public final void setInitialised(int value) {
        getKey().getDbValue().getInitialised().setIntValue(value);
    }

 


 


  

 

 

 }// end of wrapper
