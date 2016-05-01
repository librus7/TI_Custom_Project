package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class DHPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(DHPF.class);

    /**
     * Primary Key
     */

    public static class Key_DHPF {

        private String dhanmd;
 
        public String getDhanmd() {
            return this.dhanmd;
        }
        public void setDhanmd(String dhanmd) {
           this.dhanmd = dhanmd;
        }  

     }

    private Key_DHPF $key = new Key_DHPF();

    public Key_DHPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String dhsna;
    private String dhatp;
    private String dhbnoc;
    private String dhcrt;
    private String category;
    private String dhdrt;
    private String dhdia;
    private String mnt_in_bo;
 
    /**
     * Getters/Setters members 
     */   
    public String getDhanmd() {
        return this.$key.dhanmd;
    }

    public void setDhanmd(String dhanmd) {
        this.$key.dhanmd = dhanmd;
    }

     public String getDhsna() {
        return this.dhsna;
    }

    public void setDhsna(String dhsna) {
        this.dhsna = dhsna;
    }

    public String getDhatp() {
        return this.dhatp;
    }

    public void setDhatp(String dhatp) {
        this.dhatp = dhatp;
    }

    public String getDhbnoc() {
        return this.dhbnoc;
    }

    public void setDhbnoc(String dhbnoc) {
        this.dhbnoc = dhbnoc;
    }

    public String getDhcrt() {
        return this.dhcrt;
    }

    public void setDhcrt(String dhcrt) {
        this.dhcrt = dhcrt;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDhdrt() {
        return this.dhdrt;
    }

    public void setDhdrt(String dhdrt) {
        this.dhdrt = dhdrt;
    }

    public String getDhdia() {
        return this.dhdia;
    }

    public void setDhdia(String dhdia) {
        this.dhdia = dhdia;
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
        if (columnName.trim().equalsIgnoreCase("dhanmd"))
            return getDhanmd();
        if (columnName.trim().equalsIgnoreCase("dhsna"))
            return getDhsna();
        if (columnName.trim().equalsIgnoreCase("dhatp"))
            return getDhatp();
        if (columnName.trim().equalsIgnoreCase("dhbnoc"))
            return getDhbnoc();
        if (columnName.trim().equalsIgnoreCase("dhcrt"))
            return getDhcrt();
        if (columnName.trim().equalsIgnoreCase("category"))
            return getCategory();
        if (columnName.trim().equalsIgnoreCase("dhdrt"))
            return getDhdrt();
        if (columnName.trim().equalsIgnoreCase("dhdia"))
            return getDhdia();
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
            if (columnName.trim().equalsIgnoreCase("dhanmd")) {
                setDhanmd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("dhsna")) {
                setDhsna(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("dhatp")) {
                setDhatp(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("dhbnoc")) {
                setDhbnoc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("dhcrt")) {
                setDhcrt(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("category")) {
                setCategory(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("dhdrt")) {
                setDhdrt(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("dhdia")) {
                setDhdia(value);
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