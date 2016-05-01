package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class HBPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(HBPF.class);

    /**
     * Primary Key
     */

    public static class Key_HBPF {

        private String hbcfl;
        private String hblnm;
        private String hbcfn;
 
        public String getHbcfl() {
            return this.hbcfl;
        }
        public void setHbcfl(String hbcfl) {
           this.hbcfl = hbcfl;
        }  

        public String getHblnm() {
            return this.hblnm;
        }
        public void setHblnm(String hblnm) {
           this.hblnm = hblnm;
        }  

        public String getHbcfn() {
            return this.hbcfn;
        }
        public void setHbcfn(String hbcfn) {
           this.hbcfn = hbcfn;
        }  

     }

    private Key_HBPF $key = new Key_HBPF();

    public Key_HBPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String hbrnm;
    private String mnt_in_bo;
 
    /**
     * Getters/Setters members 
     */   
    public String getHbcfl() {
        return this.$key.hbcfl;
    }

    public void setHbcfl(String hbcfl) {
        this.$key.hbcfl = hbcfl;
    }

    public String getHblnm() {
        return this.$key.hblnm;
    }

    public void setHblnm(String hblnm) {
        this.$key.hblnm = hblnm;
    }

    public String getHbcfn() {
        return this.$key.hbcfn;
    }

    public void setHbcfn(String hbcfn) {
        this.$key.hbcfn = hbcfn;
    }

     public String getHbrnm() {
        return this.hbrnm;
    }

    public void setHbrnm(String hbrnm) {
        this.hbrnm = hbrnm;
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
        if (columnName.trim().equalsIgnoreCase("hbcfl"))
            return getHbcfl();
        if (columnName.trim().equalsIgnoreCase("hblnm"))
            return getHblnm();
        if (columnName.trim().equalsIgnoreCase("hbcfn"))
            return getHbcfn();
        if (columnName.trim().equalsIgnoreCase("hbrnm"))
            return getHbrnm();
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
            if (columnName.trim().equalsIgnoreCase("hbcfl")) {
                setHbcfl(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("hblnm")) {
                setHblnm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("hbcfn")) {
                setHbcfn(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("hbrnm")) {
                setHbrnm(value);
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