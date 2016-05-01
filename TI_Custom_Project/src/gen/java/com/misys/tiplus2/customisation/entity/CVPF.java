package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class CVPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(CVPF.class);

    /**
     * Primary Key
     */

    public static class Key_CVPF {

        private String cvcna;
        private Integer cvyoc;
        private String cvccy;
 
        public String getCvcna() {
            return this.cvcna;
        }
        public void setCvcna(String cvcna) {
           this.cvcna = cvcna;
        }  

        public Integer getCvyoc() {
            return this.cvyoc;
        }
        public void setCvyoc(Integer cvyoc) {
           this.cvyoc = cvyoc;
        }  

        public String getCvccy() {
            return this.cvccy;
        }
        public void setCvccy(String cvccy) {
           this.cvccy = cvccy;
        }  

     }

    private Key_CVPF $key = new Key_CVPF();

    public Key_CVPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String cvdiy;
    private Integer cvdoo;
    private String cvcld;
    private String mnt_in_bo;
    private String cvdiw;
 
    /**
     * Getters/Setters members 
     */   
    public String getCvcna() {
        return this.$key.cvcna;
    }

    public void setCvcna(String cvcna) {
        this.$key.cvcna = cvcna;
    }

    public Integer getCvyoc() {
        return this.$key.cvyoc;
    }

    public void setCvyoc(Integer cvyoc) {
        this.$key.cvyoc = cvyoc;
    }

    public String getCvccy() {
        return this.$key.cvccy;
    }

    public void setCvccy(String cvccy) {
        this.$key.cvccy = cvccy;
    }

     public String getCvdiy() {
        return this.cvdiy;
    }

    public void setCvdiy(String cvdiy) {
        this.cvdiy = cvdiy;
    }

    public Integer getCvdoo() {
        return this.cvdoo;
    }

    public void setCvdoo(Integer cvdoo) {
        this.cvdoo = cvdoo;
    }

    public String getCvcld() {
        return this.cvcld;
    }

    public void setCvcld(String cvcld) {
        this.cvcld = cvcld;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getCvdiw() {
        return this.cvdiw;
    }

    public void setCvdiw(String cvdiw) {
        this.cvdiw = cvdiw;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("cvcna"))
            return getCvcna();
        if (columnName.trim().equalsIgnoreCase("cvyoc"))
            return getCvyoc();
        if (columnName.trim().equalsIgnoreCase("cvccy"))
            return getCvccy();
        if (columnName.trim().equalsIgnoreCase("cvdiy"))
            return getCvdiy();
        if (columnName.trim().equalsIgnoreCase("cvdoo"))
            return getCvdoo();
        if (columnName.trim().equalsIgnoreCase("cvcld"))
            return getCvcld();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("cvdiw"))
            return getCvdiw();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("cvcna")) {
                setCvcna(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cvyoc")) {
                setCvyoc(CustomisationHelper.getIntegerFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cvccy")) {
                setCvccy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cvdiy")) {
                setCvdiy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cvdoo")) {
                setCvdoo(CustomisationHelper.getIntegerFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cvcld")) {
                setCvcld(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cvdiw")) {
                setCvdiw(value);
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