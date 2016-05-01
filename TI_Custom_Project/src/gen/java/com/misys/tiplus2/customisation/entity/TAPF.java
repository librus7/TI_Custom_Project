package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class TAPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(TAPF.class);

    /**
     * Primary Key
     */

    public static class Key_TAPF {

        private String tagrp;
        private String tasbb;
 
        public String getTagrp() {
            return this.tagrp;
        }
        public void setTagrp(String tagrp) {
           this.tagrp = tagrp;
        }  

        public String getTasbb() {
            return this.tasbb;
        }
        public void setTasbb(String tasbb) {
           this.tasbb = tasbb;
        }  

     }

    private Key_TAPF $key = new Key_TAPF();

    public Key_TAPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String taofficer;
    private String tacna;
    private String tagrd;
    private String mnt_in_bo;
    private String tapgrp;
    private String tapsbb;
 
    /**
     * Getters/Setters members 
     */   
    public String getTagrp() {
        return this.$key.tagrp;
    }

    public void setTagrp(String tagrp) {
        this.$key.tagrp = tagrp;
    }

    public String getTasbb() {
        return this.$key.tasbb;
    }

    public void setTasbb(String tasbb) {
        this.$key.tasbb = tasbb;
    }

     public String getTaofficer() {
        return this.taofficer;
    }

    public void setTaofficer(String taofficer) {
        this.taofficer = taofficer;
    }

    public String getTacna() {
        return this.tacna;
    }

    public void setTacna(String tacna) {
        this.tacna = tacna;
    }

    public String getTagrd() {
        return this.tagrd;
    }

    public void setTagrd(String tagrd) {
        this.tagrd = tagrd;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getTapgrp() {
        return this.tapgrp;
    }

    public void setTapgrp(String tapgrp) {
        this.tapgrp = tapgrp;
    }

    public String getTapsbb() {
        return this.tapsbb;
    }

    public void setTapsbb(String tapsbb) {
        this.tapsbb = tapsbb;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("tagrp"))
            return getTagrp();
        if (columnName.trim().equalsIgnoreCase("tasbb"))
            return getTasbb();
        if (columnName.trim().equalsIgnoreCase("taofficer"))
            return getTaofficer();
        if (columnName.trim().equalsIgnoreCase("tacna"))
            return getTacna();
        if (columnName.trim().equalsIgnoreCase("tagrd"))
            return getTagrd();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("tapgrp"))
            return getTapgrp();
        if (columnName.trim().equalsIgnoreCase("tapsbb"))
            return getTapsbb();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("tagrp")) {
                setTagrp(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tasbb")) {
                setTasbb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("taofficer")) {
                setTaofficer(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tacna")) {
                setTacna(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tagrd")) {
                setTagrd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tapgrp")) {
                setTapgrp(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tapsbb")) {
                setTapsbb(value);
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