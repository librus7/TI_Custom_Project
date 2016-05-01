package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class C6PF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(C6PF.class);

    /**
     * Primary Key
     */

    public static class Key_C6PF {

        private String c6acd;
 
        public String getC6acd() {
            return this.c6acd;
        }
        public void setC6acd(String c6acd) {
           this.c6acd = c6acd;
        }  

     }

    private Key_C6PF $key = new Key_C6PF();

    public Key_C6PF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String c6ann;
    private String mnt_in_bo;
 
    /**
     * Getters/Setters members 
     */   
    public String getC6acd() {
        return this.$key.c6acd;
    }

    public void setC6acd(String c6acd) {
        this.$key.c6acd = c6acd;
    }

     public String getC6ann() {
        return this.c6ann;
    }

    public void setC6ann(String c6ann) {
        this.c6ann = c6ann;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("c6acd"))
            return getC6acd();
        if (columnName.trim().equalsIgnoreCase("c6ann"))
            return getC6ann();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("c6acd")) {
                setC6acd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c6ann")) {
                setC6ann(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
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