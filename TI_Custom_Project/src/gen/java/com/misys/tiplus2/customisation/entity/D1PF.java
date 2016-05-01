package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class D1PF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(D1PF.class);

    /**
     * Primary Key
     */

    public static class Key_D1PF {

        private String d1xm;
 
        public String getD1xm() {
            return this.d1xm;
        }
        public void setD1xm(String d1xm) {
           this.d1xm = d1xm;
        }  

     }

    private Key_D1PF $key = new Key_D1PF();

    public Key_D1PF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String d1nsf;
    private String mnt_in_bo;
    private String d1xmd;
 
    /**
     * Getters/Setters members 
     */   
    public String getD1xm() {
        return this.$key.d1xm;
    }

    public void setD1xm(String d1xm) {
        this.$key.d1xm = d1xm;
    }

     public String getD1nsf() {
        return this.d1nsf;
    }

    public void setD1nsf(String d1nsf) {
        this.d1nsf = d1nsf;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getD1xmd() {
        return this.d1xmd;
    }

    public void setD1xmd(String d1xmd) {
        this.d1xmd = d1xmd;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("d1xm"))
            return getD1xm();
        if (columnName.trim().equalsIgnoreCase("d1nsf"))
            return getD1nsf();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("d1xmd"))
            return getD1xmd();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("d1xm")) {
                setD1xm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("d1nsf")) {
                setD1nsf(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("d1xmd")) {
                setD1xmd(value);
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