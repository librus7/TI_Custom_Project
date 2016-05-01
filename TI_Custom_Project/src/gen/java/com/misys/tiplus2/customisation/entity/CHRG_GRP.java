package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class CHRG_GRP extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(CHRG_GRP.class);

    /**
     * Primary Key
     */

    public static class Key_CHRG_GRP {

        private Long chgrp_key;
 
        public Long getChgrp_key() {
            return this.chgrp_key;
        }
        public void setChgrp_key(Long chgrp_key) {
           this.chgrp_key = chgrp_key;
        }  

     }

    private Key_CHRG_GRP $key = new Key_CHRG_GRP();

    public Key_CHRG_GRP get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private Integer typeflag;
    private Integer tstamp;
    private String chgrp_code;
    private String chgrp_desc;
    private String mnt_in_bo;
 
    /**
     * Getters/Setters members 
     */   
    public Long getChgrp_key() {
        return this.$key.chgrp_key;
    }

    public void setChgrp_key(Long chgrp_key) {
        this.$key.chgrp_key = chgrp_key;
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

    public String getChgrp_code() {
        return this.chgrp_code;
    }

    public void setChgrp_code(String chgrp_code) {
        this.chgrp_code = chgrp_code;
    }

    public String getChgrp_desc() {
        return this.chgrp_desc;
    }

    public void setChgrp_desc(String chgrp_desc) {
        this.chgrp_desc = chgrp_desc;
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
        if (columnName.trim().equalsIgnoreCase("chgrp_key"))
            return getChgrp_key();
        if (columnName.trim().equalsIgnoreCase("typeflag"))
            return getTypeflag();
        if (columnName.trim().equalsIgnoreCase("tstamp"))
            return getTstamp();
        if (columnName.trim().equalsIgnoreCase("chgrp_code"))
            return getChgrp_code();
        if (columnName.trim().equalsIgnoreCase("chgrp_desc"))
            return getChgrp_desc();
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
            if (columnName.trim().equalsIgnoreCase("chgrp_key")) {
                setChgrp_key(CustomisationHelper.getLongFromString(value));
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
            if (columnName.trim().equalsIgnoreCase("chgrp_code")) {
                setChgrp_code(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("chgrp_desc")) {
                setChgrp_desc(value);
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