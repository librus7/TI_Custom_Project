package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class EXTCUST extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(EXTCUST.class);

    /**
     * Primary Key
     */

    public static class Key_EXTCUST {

        private String cust_sbb;
        private String cust;
 
        public String getCust_sbb() {
            return this.cust_sbb;
        }
        public void setCust_sbb(String cust_sbb) {
           this.cust_sbb = cust_sbb;
        }  

        public String getCust() {
            return this.cust;
        }
        public void setCust(String cust) {
           this.cust = cust;
        }  

     }

    private Key_EXTCUST $key = new Key_EXTCUST();

    public Key_EXTCUST get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private Integer inited;
    private Integer agntwprc;
 
    /**
     * Getters/Setters members 
     */   
    public String getCust_sbb() {
        return this.$key.cust_sbb;
    }

    public void setCust_sbb(String cust_sbb) {
        this.$key.cust_sbb = cust_sbb;
    }

    public String getCust() {
        return this.$key.cust;
    }

    public void setCust(String cust) {
        this.$key.cust = cust;
    }

     public Integer getInited() {
        return this.inited;
    }

    public void setInited(Integer inited) {
        this.inited = inited;
    }
    public Integer getAgntwprc() {
        return this.agntwprc;
    }

    public void setAgntwprc(Integer agntwprc) {
        this.agntwprc = agntwprc;
    }
 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("cust_sbb"))
            return getCust_sbb();
        if (columnName.trim().equalsIgnoreCase("cust"))
            return getCust();
        if (columnName.trim().equalsIgnoreCase("inited"))
            return getInited();
        if (columnName.trim().equalsIgnoreCase("agntwprc"))
            return getAgntwprc();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("cust_sbb")) {
                setCust_sbb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cust")) {
                setCust(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("inited")) {
                setInited(CustomisationHelper.getIntegerFromString(value));
                return true;
            } 
            if (columnName.trim().equalsIgnoreCase("agntwprc")) {
                setAgntwprc(CustomisationHelper.getIntegerFromString(value));
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