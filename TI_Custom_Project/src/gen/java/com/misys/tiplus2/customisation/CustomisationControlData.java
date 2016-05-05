package com.misys.tiplus2.customisation;

import java.util.*;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.foundations.lang.logging.Loggers;
import com.misys.tiplus2.enigma.customisation.Attributes;
import com.misys.tiplus2.enigma.external.interfaces.customisation.CustomisationControlDataIF;
import com.misys.tiplus2.enigma.customisation.FieldCode;
import com.misys.tiplus2.enigma.customisation.control.ExtendedComboBoxControl.DBMapping;
import com.misys.tiplus2.foundations.lang.logging.Loggers;

public class CustomisationControlData implements CustomisationControlDataIF {

    private static final Logger LOG = LoggerFactory.getLogger(CustomisationControlData.class);

    /* version stamp used to ensure run time java version matches db schema version */
    private static final String versionStamp = "73FF8DC5CF4F6DA1A2927BE64CB7C3F5";

    private Map<String, List<FieldCode>> fieldCodeMap = new HashMap<String, List<FieldCode>>();

    private Map<String, String> aliasMap = new HashMap<String, String>();

    private Map<String, List<String>> staticTableMap = new HashMap<String, List<String>>();

    private List<String> noInterfaceClasses = new ArrayList<String>();

    private Map<String, Map<String, Map<String, Attributes>>> attributesMap = new HashMap<String, Map<String, Map<String, Attributes>>>();

    public CustomisationControlData() {
        Loggers.method().enter(LOG);

        initialiseFieldCodeMap();
        initialiseAliasMap();
        initialiseStaticTableMap();
        populateNoInterfaceClasses();
        // Customer
        populateCustomerC_C_Controls();
        // Event
        populateEventIGT_IIG_Controls();
        populateEventILC_CRC_Controls();
        // Master
        // Posting
        // TICustomer
        // EventStep
        Loggers.method().exit(LOG);
    }

    private final void initialiseFieldCodeMap() {
        Loggers.method().enter(LOG);
        initialiseFieldCodeMapCustomer();
        initialiseFieldCodeMapEvent();
        initialiseFieldCodeMapMaster();
        initialiseFieldCodeMapPosting();
        initialiseFieldCodeMapTICustomer();
        initialiseFieldCodeMapEventStep();
        Loggers.method().exit(LOG);
    }

    /**
     * Initialise field code map for extension Customer
     */
    private final void initialiseFieldCodeMapCustomer() {
        Loggers.method().enter(LOG);
            initialiseFieldCodeMapCustomerC_C();
            Loggers.method().exit(LOG);
    }
    
        private final void initialiseFieldCodeMapCustomerC_C() {
        Loggers.method().enter(LOG);
        //C_C
        List<FieldCode> list = new ArrayList<FieldCode>();
                list.add(new FieldCode("cAAA", "AgentWithholdingPercentage", "Agent Withholding Percentage", "i", "AGNTWPRC"));
        
                fieldCodeMap.put("C_C", list);
        Loggers.method().exit(LOG);
    }
        /**
     * Initialise field code map for extension Event
     */
    private final void initialiseFieldCodeMapEvent() {
        Loggers.method().enter(LOG);
            initialiseFieldCodeMapEventIGT_IIG();
            initialiseFieldCodeMapEventILC_CRC();
            Loggers.method().exit(LOG);
    }
    
        private final void initialiseFieldCodeMapEventIGT_IIG() {
        Loggers.method().enter(LOG);
        //IGT_IIG
        List<FieldCode> list = new ArrayList<FieldCode>();
                list.add(new FieldCode("cAAC", "AgentAmount", "Agent Amount", "s", "AGNTAMT"));
                list.add(new FieldCode("cAAB", "AgentWithholdingAmount", "Agent Withholding Amount", "s", "AGNTWAMT"));
        
                fieldCodeMap.put("IGT_IIG", list);
        Loggers.method().exit(LOG);
    }
        private final void initialiseFieldCodeMapEventILC_CRC() {
        Loggers.method().enter(LOG);
        //ILC_CRC
        List<FieldCode> list = new ArrayList<FieldCode>();
                list.add(new FieldCode("cAAC", "AgentAmount", "Agent Amount", "s", "AGNTAMT"));
                list.add(new FieldCode("cAAB", "AgentWithholdingAmount", "Agent Withholding Amount", "s", "AGNTWAMT"));
        
                fieldCodeMap.put("ILC_CRC", list);
        Loggers.method().exit(LOG);
    }
        /**
     * Initialise field code map for extension Master
     */
    private final void initialiseFieldCodeMapMaster() {
        Loggers.method().enter(LOG);
            Loggers.method().exit(LOG);
    }
    
        /**
     * Initialise field code map for extension Posting
     */
    private final void initialiseFieldCodeMapPosting() {
        Loggers.method().enter(LOG);
            Loggers.method().exit(LOG);
    }
    
        /**
     * Initialise field code map for extension TICustomer
     */
    private final void initialiseFieldCodeMapTICustomer() {
        Loggers.method().enter(LOG);
            Loggers.method().exit(LOG);
    }
    
        /**
     * Initialise field code map for extension EventStep
     */
    private final void initialiseFieldCodeMapEventStep() {
        Loggers.method().enter(LOG);
            Loggers.method().exit(LOG);
    }
    
    
    private final void populateNoInterfaceClasses() {

    }

    public List<String> getNoInterfaceClasses() {
        return noInterfaceClasses;
    }

    public List<FieldCode> getFieldCodeList(String code) {
        return this.fieldCodeMap.get(code);
    }

    private final void initialiseAliasMap() {

	}

    public final Map<String, String> getAliasMap() {
        return this.aliasMap;
    }

	/**
     * Returns a version stamp which is used as a version stamp
     * @return String 
     *          the version stamp
     */
    public final String getVersionStamp() {
        return versionStamp;
    }

    /**
     * Returns the number of customisation static tables defined in the customisation project
     * @return int 
     *          the number of customisation static tables
     */
    public final int getCustomTablesCount() {		
        return 0;
    }

    /**
     * Gets number of (customised) extra fields for Posting
     * 
     * @return the number of posting extra fields
     */
    public final int getPostingExtraFieldCount() {
        return 0;
    }

    public final Map<String, Attributes> getAttributeMap(String code, String layoutName) {
        Map<String, Attributes> result = new HashMap<String, Attributes>();
        Map<String, Map<String, Attributes>> layouts = attributesMap.get(code);
        if (layouts != null) {
            if (layouts.get(layoutName) != null) {
                result = layouts.get(layoutName);
            }
        }
        return result;
    }

    public final Map<String, Attributes> getAttributeMap(String code) {
        Map<String, Attributes> result = new HashMap<String, Attributes>();
        Map<String, Map<String, Attributes>> layouts = attributesMap.get(code);
        if (layouts != null) {
            for (String layoutName : layouts.keySet()) {
                Map<String, Attributes> layout = layouts.get(layoutName);
                for (String attributeName : layout.keySet()) {
                    result.put(attributeName, layout.get(attributeName));
                }
            }
        }
        return result;
    }
    
   
    /**
     * Gets the list of repeating field layouts for the given code and layout
     * name.
     * <p>
     * The layout name is suffixed with underscore ('_')
     * 
     * @param code
     * @param layoutName
     * @return the list of repeating field layouts
     */
    public final List<Map<String, Attributes>> getRepeatingFieldAttributeMap(String code, String layoutName) {
        List<Map<String, Attributes>> result = new ArrayList<Map<String, Attributes>>();
        Map<String, Map<String, Attributes>> layouts = attributesMap.get(code);
        String prefix = layoutName + "_";
        for (Entry<String, Map<String, Attributes>> item : layouts.entrySet()) {
            if(item.getKey().startsWith(prefix)){
                result.add(item.getValue());
            }
        }
        return result;
    }

    /**
     * Gets the list of repeating fields
     */
    public final Set<String> getRepeatingFields(String code, String layoutName) {
        Set<String> result = new TreeSet<String>();
        Map<String, Map<String, Attributes>> layouts = attributesMap.get(code);
        String prefix = layoutName + "_";
        for (Entry<String, Map<String, Attributes>> item : layouts.entrySet()) {
            String key = item.getKey();
            if(key.startsWith(prefix)){
                result.add(key);
            }
        }
        return result;
    }



    public final boolean isDefined(String code) {
        Loggers.method().enter(LOG, code);
        
        boolean result = false;
        Map<String, Map<String, Attributes>> layouts = attributesMap.get(code);
        if (layouts != null) {
            result = true;
        }
        Loggers.method().exit(LOG, result);
        return result;
    }

// item=AssociationProxy [C_C]

    private final void populateCustomerC_C_Controls() {
        Map<String, Map<String, Attributes>> layouts =  new HashMap<String, Map<String, Attributes>>();
        {
            // main customisation fields...
            Map<String, Attributes> layout = new HashMap<String, Attributes>();
            layout.put("AgentWithholdingPercentage", new Attributes("AgentWithholdingPercentage").setMaxRownum(1).setFromColumn("AGNTWPRC"));
            layouts.put("CustomerDefault", layout);
        }


        attributesMap.put("C_C", layouts);
        
    }

// item=AssociationProxy [IGT_IIG]

    private final void populateEventIGT_IIG_Controls() {
        Map<String, Map<String, Attributes>> layouts =  new HashMap<String, Map<String, Attributes>>();
        {
            // main customisation fields...
            Map<String, Attributes> layout = new HashMap<String, Attributes>();
            layout.put("AgentAmount", new Attributes("AgentAmount").setMaxRownum(1).setFromColumn("AGNTAMT"));
            layout.put("AgentWithholdingAmount", new Attributes("AgentWithholdingAmount").setMaxRownum(1).setFromColumn("AGNTWAMT"));
            layouts.put("EventTestLayout", layout);
        }


        attributesMap.put("IGT_IIG", layouts);
        
    }

// item=AssociationProxy [ILC_CRC]

    private final void populateEventILC_CRC_Controls() {
        Map<String, Map<String, Attributes>> layouts =  new HashMap<String, Map<String, Attributes>>();
        {
            // main customisation fields...
            Map<String, Attributes> layout = new HashMap<String, Attributes>();
            layout.put("AgentAmount", new Attributes("AgentAmount").setMaxRownum(1).setFromColumn("AGNTAMT"));
            layout.put("AgentWithholdingAmount", new Attributes("AgentWithholdingAmount").setMaxRownum(1).setFromColumn("AGNTWAMT"));
            layouts.put("EventILCClaimReceivedLayout", layout);
        }


        attributesMap.put("ILC_CRC", layouts);
        
    }


    public List<String> getStaticTableColumns(String tableName) {
        return this.staticTableMap.get(tableName);
    }

    private void initialiseStaticTableMap() {
     }

//[TI-13823] START
    public Map<String, List<FieldCode>> getFieldCodeMap()
    {
    	return this.fieldCodeMap;
    }	

	public List<String> getVariants()
	{
		List<String> lvariants = new ArrayList<String>();
     	  	        	       	       
		lvariants.add("");
		return lvariants;
	}
//[TI-13823] END
}
