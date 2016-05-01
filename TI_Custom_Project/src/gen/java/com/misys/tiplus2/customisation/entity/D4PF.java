package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class D4PF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(D4PF.class);

    /**
     * Primary Key
     */

    public static class Key_D4PF {

        private String d4brr;
        private String d4branch;
        private BigDecimal d4dteh;
 
        public String getD4brr() {
            return this.d4brr;
        }
        public void setD4brr(String d4brr) {
           this.d4brr = d4brr;
        }  

        public String getD4branch() {
            return this.d4branch;
        }
        public void setD4branch(String d4branch) {
           this.d4branch = d4branch;
        }  

        public BigDecimal getD4dteh() {
            return this.d4dteh;
        }
        public void setD4dteh(BigDecimal d4dteh) {
           this.d4dteh = d4dteh;
        }  

     }

    private Key_D4PF $key = new Key_D4PF();

    public Key_D4PF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private BigDecimal d4dte;
    private String d4dflg;
    private BigDecimal d4dlm;
    private String mnt_in_bo;
    private BigDecimal d4brar;
 
    /**
     * Getters/Setters members 
     */   
    public String getD4brr() {
        return this.$key.d4brr;
    }

    public void setD4brr(String d4brr) {
        this.$key.d4brr = d4brr;
    }

    public String getD4branch() {
        return this.$key.d4branch;
    }

    public void setD4branch(String d4branch) {
        this.$key.d4branch = d4branch;
    }

    public BigDecimal getD4dteh() {
        return this.$key.d4dteh;
    }

    public void setD4dteh(BigDecimal d4dteh) {
        this.$key.d4dteh = d4dteh;
    }

     public BigDecimal getD4dte() {
        return this.d4dte;
    }

    public void setD4dte(BigDecimal d4dte) {
        this.d4dte = d4dte;
    }

    public String getD4dflg() {
        return this.d4dflg;
    }

    public void setD4dflg(String d4dflg) {
        this.d4dflg = d4dflg;
    }

    public BigDecimal getD4dlm() {
        return this.d4dlm;
    }

    public void setD4dlm(BigDecimal d4dlm) {
        this.d4dlm = d4dlm;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public BigDecimal getD4brar() {
        return this.d4brar;
    }

    public void setD4brar(BigDecimal d4brar) {
        this.d4brar = d4brar;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("d4brr"))
            return getD4brr();
        if (columnName.trim().equalsIgnoreCase("d4branch"))
            return getD4branch();
        if (columnName.trim().equalsIgnoreCase("d4dteh"))
            return getD4dteh();
        if (columnName.trim().equalsIgnoreCase("d4dte"))
            return getD4dte();
        if (columnName.trim().equalsIgnoreCase("d4dflg"))
            return getD4dflg();
        if (columnName.trim().equalsIgnoreCase("d4dlm"))
            return getD4dlm();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("d4brar"))
            return getD4brar();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("d4brr")) {
                setD4brr(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("d4branch")) {
                setD4branch(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("d4dteh")) {
                setD4dteh(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("d4dte")) {
                setD4dte(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("d4dflg")) {
                setD4dflg(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("d4dlm")) {
                setD4dlm(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("d4brar")) {
                setD4brar(CustomisationHelper.getBigDecimalFromString(value));
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