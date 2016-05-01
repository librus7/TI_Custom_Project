package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class CKPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(CKPF.class);

    /**
     * Primary Key
     */

    public static class Key_CKPF {

        private String ckccd;
 
        public String getCkccd() {
            return this.ckccd;
        }
        public void setCkccd(String ckccd) {
           this.ckccd = ckccd;
        }  

     }

    private Key_CKPF $key = new Key_CKPF();

    public Key_CKPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String ckpat;
    private String category;
    private String ckcrt;
    private String cksde;
    private String ckdrt;
    private String mnt_in_bo;
    private String cksna;
    private String ckan;
 
    /**
     * Getters/Setters members 
     */   
    public String getCkccd() {
        return this.$key.ckccd;
    }

    public void setCkccd(String ckccd) {
        this.$key.ckccd = ckccd;
    }

     public String getCkpat() {
        return this.ckpat;
    }

    public void setCkpat(String ckpat) {
        this.ckpat = ckpat;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCkcrt() {
        return this.ckcrt;
    }

    public void setCkcrt(String ckcrt) {
        this.ckcrt = ckcrt;
    }

    public String getCksde() {
        return this.cksde;
    }

    public void setCksde(String cksde) {
        this.cksde = cksde;
    }

    public String getCkdrt() {
        return this.ckdrt;
    }

    public void setCkdrt(String ckdrt) {
        this.ckdrt = ckdrt;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getCksna() {
        return this.cksna;
    }

    public void setCksna(String cksna) {
        this.cksna = cksna;
    }

    public String getCkan() {
        return this.ckan;
    }

    public void setCkan(String ckan) {
        this.ckan = ckan;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("ckccd"))
            return getCkccd();
        if (columnName.trim().equalsIgnoreCase("ckpat"))
            return getCkpat();
        if (columnName.trim().equalsIgnoreCase("category"))
            return getCategory();
        if (columnName.trim().equalsIgnoreCase("ckcrt"))
            return getCkcrt();
        if (columnName.trim().equalsIgnoreCase("cksde"))
            return getCksde();
        if (columnName.trim().equalsIgnoreCase("ckdrt"))
            return getCkdrt();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("cksna"))
            return getCksna();
        if (columnName.trim().equalsIgnoreCase("ckan"))
            return getCkan();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("ckccd")) {
                setCkccd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("ckpat")) {
                setCkpat(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("category")) {
                setCategory(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("ckcrt")) {
                setCkcrt(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cksde")) {
                setCksde(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("ckdrt")) {
                setCkdrt(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cksna")) {
                setCksna(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("ckan")) {
                setCkan(value);
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