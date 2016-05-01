package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class FSPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(FSPF.class);

    /**
     * Primary Key
     */

    public static class Key_FSPF {

        private String fsing;
 
        public String getFsing() {
            return this.fsing;
        }
        public void setFsing(String fsing) {
           this.fsing = fsing;
        }  

     }

    private Key_FSPF $key = new Key_FSPF();

    public Key_FSPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String fsingd;
    private String mnt_in_bo;
 
    /**
     * Getters/Setters members 
     */   
    public String getFsing() {
        return this.$key.fsing;
    }

    public void setFsing(String fsing) {
        this.$key.fsing = fsing;
    }

     public String getFsingd() {
        return this.fsingd;
    }

    public void setFsingd(String fsingd) {
        this.fsingd = fsingd;
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
        if (columnName.trim().equalsIgnoreCase("fsing"))
            return getFsing();
        if (columnName.trim().equalsIgnoreCase("fsingd"))
            return getFsingd();
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
            if (columnName.trim().equalsIgnoreCase("fsing")) {
                setFsing(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fsingd")) {
                setFsingd(value);
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