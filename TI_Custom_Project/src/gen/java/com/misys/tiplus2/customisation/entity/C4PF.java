package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class C4PF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(C4PF.class);

    /**
     * Primary Key
     */

    public static class Key_C4PF {

        private String c4ctp1;
 
        public String getC4ctp1() {
            return this.c4ctp1;
        }
        public void setC4ctp1(String c4ctp1) {
           this.c4ctp1 = c4ctp1;
        }  

     }

    private Key_C4PF $key = new Key_C4PF();

    public Key_C4PF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String c4ctp;
    private String mnt_in_bo;
    private String c4cbq;
    private String c4supp;
    private String c4ctd;
 
    /**
     * Getters/Setters members 
     */   
    public String getC4ctp1() {
        return this.$key.c4ctp1;
    }

    public void setC4ctp1(String c4ctp1) {
        this.$key.c4ctp1 = c4ctp1;
    }

     public String getC4ctp() {
        return this.c4ctp;
    }

    public void setC4ctp(String c4ctp) {
        this.c4ctp = c4ctp;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getC4cbq() {
        return this.c4cbq;
    }

    public void setC4cbq(String c4cbq) {
        this.c4cbq = c4cbq;
    }

    public String getC4supp() {
        return this.c4supp;
    }

    public void setC4supp(String c4supp) {
        this.c4supp = c4supp;
    }

    public String getC4ctd() {
        return this.c4ctd;
    }

    public void setC4ctd(String c4ctd) {
        this.c4ctd = c4ctd;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("c4ctp1"))
            return getC4ctp1();
        if (columnName.trim().equalsIgnoreCase("c4ctp"))
            return getC4ctp();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("c4cbq"))
            return getC4cbq();
        if (columnName.trim().equalsIgnoreCase("c4supp"))
            return getC4supp();
        if (columnName.trim().equalsIgnoreCase("c4ctd"))
            return getC4ctd();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("c4ctp1")) {
                setC4ctp1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c4ctp")) {
                setC4ctp(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c4cbq")) {
                setC4cbq(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c4supp")) {
                setC4supp(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c4ctd")) {
                setC4ctd(value);
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