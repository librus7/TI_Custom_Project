package com.misys.tiplus2.customisation.pane;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.*;
import com.misys.tiplus2.enigma.customisation.control.ExtendedPostingTableControl;
import com.misys.tiplus2.customisation.model.PostingTableDataModel;
import com.misys.tiplus2.enigma.customisation.pane.ExtensionWebPane;
import com.misys.tiplus2.foundations.lang.logging.Loggers;

/**
 *
 * @author Customisation Generator.
 *
 */
public class PostingPane extends ExtensionWebPane {

    private static final Logger LOG = LoggerFactory.getLogger(PostingPane.class);

    private List<PostingTableDataModel> tableDataModel = new ArrayList<PostingTableDataModel>();

    private ExtendedPostingTableControl posting;

    /**
     * Default constructor
     */
    public PostingPane() {

    }

    /**
     * Called by Customisation class to populate values to tables
     */
    public final List<PostingTableDataModel> getTable() {
        return this.tableDataModel;
    }

    /**
     * getters Controls
     */
    public final ExtendedPostingTableControl getCTLTabledatamodel() {
        Loggers.method().enter(LOG);
        if (posting == null) {
            posting = new CTLTabledatamodel("", this);
            posting.setReadOnly(true);
            posting.setMandatory(true);
        }
        ExtendedPostingTableControl result = posting;
        Loggers.method().exit(LOG, result);
        return result;
    }

    /**
      *Controls InnerClasses
     */
    public final class CTLTabledatamodel extends ExtendedPostingTableControl {

        /**
         * Constructor
         * @param parentPane
         */
        public CTLTabledatamodel (String initialValue, PostingPane parentPane) {
            super("TableDataModel", initialValue, parentPane);
        }

        /**
         * @return the tableModel value.
         */
        public final List<PostingTableDataModel> getTableModel() {
            if (!canUpdateViaUI()) {
                return null;
            }
            return tableDataModel;
        }

        /**
         * Gets whether the value is empty (length == 0)
         * @return true if the value is empty (string)
         */
        public final boolean isValueEmpty() {
            Loggers.method().enter(LOG);
            boolean result = tableDataModel.size() == 0;
            Loggers.method().exit(LOG, result);
            return result;
        }
    }
    
      @Override
    public void postMessageProcessing() {
         Loggers.method().enter(LOG);
       
         Loggers.method().exit(LOG);
    }
}
