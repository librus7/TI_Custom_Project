package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class HAPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(HAPF.class);

    /**
     * Primary Key
     */

    public static class Key_HAPF {

        private String hacfk;
        private String halnm;
 
        public String getHacfk() {
            return this.hacfk;
        }
        public void setHacfk(String hacfk) {
           this.hacfk = hacfk;
        }  

        public String getHalnm() {
            return this.halnm;
        }
        public void setHalnm(String halnm) {
           this.halnm = halnm;
        }  

     }

    private Key_HAPF $key = new Key_HAPF();

    public Key_HAPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String mnt_in_bo;
    private String hasdx;
 
    /**
     * Getters/Setters members 
     */   
    public String getHacfk() {
        return this.$key.hacfk;
    }

    public void setHacfk(String hacfk) {
        this.$key.hacfk = hacfk;
    }

    public String getHalnm() {
        return this.$key.halnm;
    }

    public void setHalnm(String halnm) {
        this.$key.halnm = halnm;
    }

     public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getHasdx() {
        return this.hasdx;
    }

    public void setHasdx(String hasdx) {
        this.hasdx = hasdx;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("hacfk"))
            return getHacfk();
        if (columnName.trim().equalsIgnoreCase("halnm"))
            return getHalnm();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("hasdx"))
            return getHasdx();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("hacfk")) {
                setHacfk(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("halnm")) {
                setHalnm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("hasdx")) {
                setHasdx(value);
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