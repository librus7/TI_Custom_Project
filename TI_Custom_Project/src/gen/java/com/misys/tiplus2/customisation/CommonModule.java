package com.misys.tiplus2.customisation;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.foundations.lang.logging.Loggers;
import com.misys.tiplus2.apps.ti.kernel.extpm.entity.*;
import com.misys.tiplus2.apps.ti.tistatic.extsm.entity.*;

public class CommonModule {

     private static final Logger LOG = LoggerFactory.getLogger(CommonModule.class);

    public final static void initialiseCustomer(ExtCustomerWrapper wrapper) {
        Loggers.method().enter(LOG, wrapper);

        if (wrapper.getInitialised() == 0) {
            wrapper.setInitialised(1);

            wrapper.setAgentWithholdingPercentage("");
 
  
        }
        Loggers.method().exit(LOG);
    }

    public final static void initialiseEvent(ExtEventWrapper wrapper) {
        Loggers.method().enter(LOG, wrapper);

        if (wrapper.getInitialised() == 0) {
            wrapper.setInitialised(1);

            wrapper.setAgentWithholdingAmount("");
            wrapper.setAgentAmount("");
 
  
        }
        Loggers.method().exit(LOG);
    }

    public final static void initialiseMaster(ExtMasterWrapper wrapper) {
        Loggers.method().enter(LOG, wrapper);

        if (wrapper.getInitialised() == 0) {
            wrapper.setInitialised(1);

 
  
        }
        Loggers.method().exit(LOG);
    }

    public final static void initialiseMasterSnapshot(ExtMasterSnapshotWrapper wrapper) {
        Loggers.method().enter(LOG, wrapper);

        if (wrapper.getInitialised() == 0) {
            wrapper.setInitialised(1);

 
  
        }
        Loggers.method().exit(LOG);
    }

    public final static void initialisePosting(ExtPostingWrapper wrapper) {
        Loggers.method().enter(LOG, wrapper);

        if (wrapper.getInitialised() == 0) {
            wrapper.setInitialised(1);

 
  
        }
        Loggers.method().exit(LOG);
    }

    public final static void initialiseTICustomer(ExtTICustomerDetailsWrapper wrapper) {
        Loggers.method().enter(LOG, wrapper);

        if (wrapper.getInitialised() == 0) {
            wrapper.setInitialised(1);

 
  
        }
        Loggers.method().exit(LOG);
    }

    public final static void initialiseEventStep(ExtEventStepWrapper wrapper) {
        Loggers.method().enter(LOG, wrapper);

        if (wrapper.getInitialised() == 0) {
            wrapper.setInitialised(1);

 
  
        }
        Loggers.method().exit(LOG);
    }

}
