package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class GJPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(GJPF.class);

    /**
     * Primary Key
     */

    public static class Key_GJPF {

        private String gjnst;
        private String gjmbe;
 
        public String getGjnst() {
            return this.gjnst;
        }
        public void setGjnst(String gjnst) {
           this.gjnst = gjnst;
        }  

        public String getGjmbe() {
            return this.gjmbe;
        }
        public void setGjmbe(String gjmbe) {
           this.gjmbe = gjmbe;
        }  

     }

    private Key_GJPF $key = new Key_GJPF();

    public Key_GJPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String gjacct;
    private String gjccy;
    private String gjnds;
    private String gjabf;
    private String gjanf;
    private String gjasf;
    private String mnt_in_bo;
    private String gjoan;
    private String gjxmr;
    private String gjxm;
 
    /**
     * Getters/Setters members 
     */   
    public String getGjnst() {
        return this.$key.gjnst;
    }

    public void setGjnst(String gjnst) {
        this.$key.gjnst = gjnst;
    }

    public String getGjmbe() {
        return this.$key.gjmbe;
    }

    public void setGjmbe(String gjmbe) {
        this.$key.gjmbe = gjmbe;
    }

     public String getGjacct() {
        return this.gjacct;
    }

    public void setGjacct(String gjacct) {
        this.gjacct = gjacct;
    }

    public String getGjccy() {
        return this.gjccy;
    }

    public void setGjccy(String gjccy) {
        this.gjccy = gjccy;
    }

    public String getGjnds() {
        return this.gjnds;
    }

    public void setGjnds(String gjnds) {
        this.gjnds = gjnds;
    }

    public String getGjabf() {
        return this.gjabf;
    }

    public void setGjabf(String gjabf) {
        this.gjabf = gjabf;
    }

    public String getGjanf() {
        return this.gjanf;
    }

    public void setGjanf(String gjanf) {
        this.gjanf = gjanf;
    }

    public String getGjasf() {
        return this.gjasf;
    }

    public void setGjasf(String gjasf) {
        this.gjasf = gjasf;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getGjoan() {
        return this.gjoan;
    }

    public void setGjoan(String gjoan) {
        this.gjoan = gjoan;
    }

    public String getGjxmr() {
        return this.gjxmr;
    }

    public void setGjxmr(String gjxmr) {
        this.gjxmr = gjxmr;
    }

    public String getGjxm() {
        return this.gjxm;
    }

    public void setGjxm(String gjxm) {
        this.gjxm = gjxm;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("gjnst"))
            return getGjnst();
        if (columnName.trim().equalsIgnoreCase("gjmbe"))
            return getGjmbe();
        if (columnName.trim().equalsIgnoreCase("gjacct"))
            return getGjacct();
        if (columnName.trim().equalsIgnoreCase("gjccy"))
            return getGjccy();
        if (columnName.trim().equalsIgnoreCase("gjnds"))
            return getGjnds();
        if (columnName.trim().equalsIgnoreCase("gjabf"))
            return getGjabf();
        if (columnName.trim().equalsIgnoreCase("gjanf"))
            return getGjanf();
        if (columnName.trim().equalsIgnoreCase("gjasf"))
            return getGjasf();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("gjoan"))
            return getGjoan();
        if (columnName.trim().equalsIgnoreCase("gjxmr"))
            return getGjxmr();
        if (columnName.trim().equalsIgnoreCase("gjxm"))
            return getGjxm();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("gjnst")) {
                setGjnst(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gjmbe")) {
                setGjmbe(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gjacct")) {
                setGjacct(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gjccy")) {
                setGjccy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gjnds")) {
                setGjnds(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gjabf")) {
                setGjabf(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gjanf")) {
                setGjanf(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gjasf")) {
                setGjasf(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gjoan")) {
                setGjoan(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gjxmr")) {
                setGjxmr(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gjxm")) {
                setGjxm(value);
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