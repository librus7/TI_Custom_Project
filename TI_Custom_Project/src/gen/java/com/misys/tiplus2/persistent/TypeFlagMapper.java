package com.misys.tiplus2.persistent;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.misys.tiplus2.persistent.TypeFlagMap;
import com.misys.tiplus2.persistent.Pair;

/**
*   Class used for mapping test class entities
*/
public class TypeFlagMapper implements TypeFlagMap {

	// This class must be generated
	
	public Class<?> getEntityClass(final String tablename, final Integer typeFlag) {
	    Pair pair = new Pair<String, Integer>(tablename, typeFlag);
		Class<?> c = TYPE_MAP.get(pair);
		if(c==null) {
            System.out.println("Missing typeflag tablename:" + tablename + " of type " + typeFlag);
		}
		return c;
	}
	
	protected static Map<Pair<String, Integer>, Class<?>> TYPE_MAP = new HashMap<Pair<String, Integer>, Class<?>>();
	
    public Map<Pair<String, Integer>, Class<?>> getMap() {
       return TYPE_MAP;
	}
	
	/**
	*  Combines the existing typeflag map with that provided - normally for unit testing classes.
	*/
    public void combine(Map<Pair<String, Integer>, Class<?>> map) {
       System.out.println("Merging test type flag mappings into current map of " + TYPE_MAP.size() + " entries");
       //
       Set<Entry<Pair<String, Integer>, Class<?>>> entrySet = map.entrySet();
        for (Entry<Pair<String, Integer>, Class<?>> entry : entrySet) {
            Pair<String, Integer> key = entry.getKey();
            Class val = entry.getValue();
            if (!TYPE_MAP.containsKey(key)) {
                TYPE_MAP.put(key, val);
            }
       }
       //
       System.out.println("Merged type flag map size is " + TYPE_MAP.size());
    }
	
	static {
        TYPE_MAP.put(new Pair<String, Integer>("EXTEVENT", 1874), com.misys.tiplus2.apps.ti.kernel.extpm.entity.ExtEvent.class);
        TYPE_MAP.put(new Pair<String, Integer>("EXTEVSTEP", 10745), com.misys.tiplus2.apps.ti.kernel.extpm.entity.ExtEventStep.class);
        TYPE_MAP.put(new Pair<String, Integer>("EXTMASTER", 7728), com.misys.tiplus2.apps.ti.kernel.extpm.entity.ExtMaster.class);
        TYPE_MAP.put(new Pair<String, Integer>("EXTMSS", 26222), com.misys.tiplus2.apps.ti.kernel.extpm.entity.ExtMasterSnapshot.class);
        TYPE_MAP.put(new Pair<String, Integer>("EXTPOSTING", 25585), com.misys.tiplus2.apps.ti.kernel.extpm.entity.ExtPosting.class);
        TYPE_MAP.put(new Pair<String, Integer>("EXTICUST", 12733), com.misys.tiplus2.apps.ti.tistatic.extsm.entity.ExtTICustomerDetails.class);
	}
}
