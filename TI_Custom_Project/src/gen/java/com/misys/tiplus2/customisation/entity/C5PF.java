package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class C5PF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(C5PF.class);

    /**
     * Primary Key
     */

    public static class Key_C5PF {

        private String c5atp;
 
        public String getC5atp() {
            return this.c5atp;
        }
        public void setC5atp(String c5atp) {
           this.c5atp = c5atp;
        }  

     }

    private Key_C5PF $key = new Key_C5PF();

    public Key_C5PF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String c5idbc;
    private String c5idbd;
    private String c5atd;
    private String c5sc46;
    private String c5sc47;
    private String c5vte;
    private String mnt_in_bo;
 
    /**
     * Getters/Setters members 
     */   
    public String getC5atp() {
        return this.$key.c5atp;
    }

    public void setC5atp(String c5atp) {
        this.$key.c5atp = c5atp;
    }

     public String getC5idbc() {
        return this.c5idbc;
    }

    public void setC5idbc(String c5idbc) {
        this.c5idbc = c5idbc;
    }

    public String getC5idbd() {
        return this.c5idbd;
    }

    public void setC5idbd(String c5idbd) {
        this.c5idbd = c5idbd;
    }

    public String getC5atd() {
        return this.c5atd;
    }

    public void setC5atd(String c5atd) {
        this.c5atd = c5atd;
    }

    public String getC5sc46() {
        return this.c5sc46;
    }

    public void setC5sc46(String c5sc46) {
        this.c5sc46 = c5sc46;
    }

    public String getC5sc47() {
        return this.c5sc47;
    }

    public void setC5sc47(String c5sc47) {
        this.c5sc47 = c5sc47;
    }

    public String getC5vte() {
        return this.c5vte;
    }

    public void setC5vte(String c5vte) {
        this.c5vte = c5vte;
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
        if (columnName.trim().equalsIgnoreCase("c5atp"))
            return getC5atp();
        if (columnName.trim().equalsIgnoreCase("c5idbc"))
            return getC5idbc();
        if (columnName.trim().equalsIgnoreCase("c5idbd"))
            return getC5idbd();
        if (columnName.trim().equalsIgnoreCase("c5atd"))
            return getC5atd();
        if (columnName.trim().equalsIgnoreCase("c5sc46"))
            return getC5sc46();
        if (columnName.trim().equalsIgnoreCase("c5sc47"))
            return getC5sc47();
        if (columnName.trim().equalsIgnoreCase("c5vte"))
            return getC5vte();
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
            if (columnName.trim().equalsIgnoreCase("c5atp")) {
                setC5atp(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c5idbc")) {
                setC5idbc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c5idbd")) {
                setC5idbd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c5atd")) {
                setC5atd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c5sc46")) {
                setC5sc46(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c5sc47")) {
                setC5sc47(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c5vte")) {
                setC5vte(value);
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