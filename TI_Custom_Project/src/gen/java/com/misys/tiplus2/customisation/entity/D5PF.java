package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class D5PF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(D5PF.class);

    /**
     * Primary Key
     */

    public static class Key_D5PF {

        private BigDecimal d5dteh;
        private String d5drr;
 
        public BigDecimal getD5dteh() {
            return this.d5dteh;
        }
        public void setD5dteh(BigDecimal d5dteh) {
           this.d5dteh = d5dteh;
        }  

        public String getD5drr() {
            return this.d5drr;
        }
        public void setD5drr(String d5drr) {
           this.d5drr = d5drr;
        }  

     }

    private Key_D5PF $key = new Key_D5PF();

    public Key_D5PF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private BigDecimal d5dte;
    private String d5dflg;
    private BigDecimal d5dlm;
    private String mnt_in_bo;
    private BigDecimal d5drar;
 
    /**
     * Getters/Setters members 
     */   
    public BigDecimal getD5dteh() {
        return this.$key.d5dteh;
    }

    public void setD5dteh(BigDecimal d5dteh) {
        this.$key.d5dteh = d5dteh;
    }

    public String getD5drr() {
        return this.$key.d5drr;
    }

    public void setD5drr(String d5drr) {
        this.$key.d5drr = d5drr;
    }

     public BigDecimal getD5dte() {
        return this.d5dte;
    }

    public void setD5dte(BigDecimal d5dte) {
        this.d5dte = d5dte;
    }

    public String getD5dflg() {
        return this.d5dflg;
    }

    public void setD5dflg(String d5dflg) {
        this.d5dflg = d5dflg;
    }

    public BigDecimal getD5dlm() {
        return this.d5dlm;
    }

    public void setD5dlm(BigDecimal d5dlm) {
        this.d5dlm = d5dlm;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public BigDecimal getD5drar() {
        return this.d5drar;
    }

    public void setD5drar(BigDecimal d5drar) {
        this.d5drar = d5drar;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("d5dteh"))
            return getD5dteh();
        if (columnName.trim().equalsIgnoreCase("d5drr"))
            return getD5drr();
        if (columnName.trim().equalsIgnoreCase("d5dte"))
            return getD5dte();
        if (columnName.trim().equalsIgnoreCase("d5dflg"))
            return getD5dflg();
        if (columnName.trim().equalsIgnoreCase("d5dlm"))
            return getD5dlm();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("d5drar"))
            return getD5drar();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("d5dteh")) {
                setD5dteh(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("d5drr")) {
                setD5drr(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("d5dte")) {
                setD5dte(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("d5dflg")) {
                setD5dflg(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("d5dlm")) {
                setD5dlm(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("d5drar")) {
                setD5drar(CustomisationHelper.getBigDecimalFromString(value));
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