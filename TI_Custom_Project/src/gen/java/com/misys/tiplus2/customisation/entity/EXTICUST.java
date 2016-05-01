package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class EXTICUST extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(EXTICUST.class);

    /**
     * Primary Key
     */

    public static class Key_EXTICUST {

        private Long key29;
 
        public Long getKey29() {
            return this.key29;
        }
        public void setKey29(Long key29) {
           this.key29 = key29;
        }  

     }

    private Key_EXTICUST $key = new Key_EXTICUST();

    public Key_EXTICUST get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private Integer typeflag;
    private Integer tstamp;
    private Integer inited;
    private Long ticust;
 
    /**
     * Getters/Setters members 
     */   
    public Long getKey29() {
        return this.$key.key29;
    }

    public void setKey29(Long key29) {
        this.$key.key29 = key29;
    }

     public Integer getTypeflag() {
        return this.typeflag;
    }

    public void setTypeflag(Integer typeflag) {
        this.typeflag = typeflag;
    }
    public Integer getTstamp() {
        return this.tstamp;
    }

    public void setTstamp(Integer tstamp) {
        this.tstamp = tstamp;
    }
    public Integer getInited() {
        return this.inited;
    }

    public void setInited(Integer inited) {
        this.inited = inited;
    }
    public Long getTicust() {
        return this.ticust;
    }

    public void setTicust(Long ticust) {
        this.ticust = ticust;
    }
 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("key29"))
            return getKey29();
        if (columnName.trim().equalsIgnoreCase("typeflag"))
            return getTypeflag();
        if (columnName.trim().equalsIgnoreCase("tstamp"))
            return getTstamp();
        if (columnName.trim().equalsIgnoreCase("inited"))
            return getInited();
        if (columnName.trim().equalsIgnoreCase("ticust"))
            return getTicust();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("key29")) {
                setKey29(CustomisationHelper.getLongFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("typeflag")) {
                setTypeflag(CustomisationHelper.getIntegerFromString(value));
                return true;
            } 
            if (columnName.trim().equalsIgnoreCase("tstamp")) {
                setTstamp(CustomisationHelper.getIntegerFromString(value));
                return true;
            } 
            if (columnName.trim().equalsIgnoreCase("inited")) {
                setInited(CustomisationHelper.getIntegerFromString(value));
                return true;
            } 
            if (columnName.trim().equalsIgnoreCase("ticust")) {
                setTicust(CustomisationHelper.getLongFromString(value));
                return true;
            } 
            LOG.warn("Invalid columnName " + columnName);
            return false;
        } catch (Exception e) {
            LOG.error("Error while setting column "+columnName, e);	
            return false;
        }
    }
}