package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class HVPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(HVPF.class);

    /**
     * Primary Key
     */

    public static class Key_HVPF {

        private String hvbrnm;
        private String hvlnm;
 
        public String getHvbrnm() {
            return this.hvbrnm;
        }
        public void setHvbrnm(String hvbrnm) {
           this.hvbrnm = hvbrnm;
        }  

        public String getHvlnm() {
            return this.hvlnm;
        }
        public void setHvlnm(String hvlnm) {
           this.hvlnm = hvlnm;
        }  

     }

    private Key_HVPF $key = new Key_HVPF();

    public Key_HVPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String city;
    private String mnt_in_bo;
    private String hvbadff;
    private String hvbad2;
    private String hvbad3;
    private String hvbad4;
    private String hvbad5;
    private String hvbad1;
    private String zipcode;
    private String hvbnm;
 
    /**
     * Getters/Setters members 
     */   
    public String getHvbrnm() {
        return this.$key.hvbrnm;
    }

    public void setHvbrnm(String hvbrnm) {
        this.$key.hvbrnm = hvbrnm;
    }

    public String getHvlnm() {
        return this.$key.hvlnm;
    }

    public void setHvlnm(String hvlnm) {
        this.$key.hvlnm = hvlnm;
    }

     public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getHvbadff() {
        return this.hvbadff;
    }

    public void setHvbadff(String hvbadff) {
        this.hvbadff = hvbadff;
    }

    public String getHvbad2() {
        return this.hvbad2;
    }

    public void setHvbad2(String hvbad2) {
        this.hvbad2 = hvbad2;
    }

    public String getHvbad3() {
        return this.hvbad3;
    }

    public void setHvbad3(String hvbad3) {
        this.hvbad3 = hvbad3;
    }

    public String getHvbad4() {
        return this.hvbad4;
    }

    public void setHvbad4(String hvbad4) {
        this.hvbad4 = hvbad4;
    }

    public String getHvbad5() {
        return this.hvbad5;
    }

    public void setHvbad5(String hvbad5) {
        this.hvbad5 = hvbad5;
    }

    public String getHvbad1() {
        return this.hvbad1;
    }

    public void setHvbad1(String hvbad1) {
        this.hvbad1 = hvbad1;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getHvbnm() {
        return this.hvbnm;
    }

    public void setHvbnm(String hvbnm) {
        this.hvbnm = hvbnm;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("hvbrnm"))
            return getHvbrnm();
        if (columnName.trim().equalsIgnoreCase("hvlnm"))
            return getHvlnm();
        if (columnName.trim().equalsIgnoreCase("city"))
            return getCity();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("hvbadff"))
            return getHvbadff();
        if (columnName.trim().equalsIgnoreCase("hvbad2"))
            return getHvbad2();
        if (columnName.trim().equalsIgnoreCase("hvbad3"))
            return getHvbad3();
        if (columnName.trim().equalsIgnoreCase("hvbad4"))
            return getHvbad4();
        if (columnName.trim().equalsIgnoreCase("hvbad5"))
            return getHvbad5();
        if (columnName.trim().equalsIgnoreCase("hvbad1"))
            return getHvbad1();
        if (columnName.trim().equalsIgnoreCase("zipcode"))
            return getZipcode();
        if (columnName.trim().equalsIgnoreCase("hvbnm"))
            return getHvbnm();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("hvbrnm")) {
                setHvbrnm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("hvlnm")) {
                setHvlnm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("city")) {
                setCity(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("hvbadff")) {
                setHvbadff(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("hvbad2")) {
                setHvbad2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("hvbad3")) {
                setHvbad3(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("hvbad4")) {
                setHvbad4(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("hvbad5")) {
                setHvbad5(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("hvbad1")) {
                setHvbad1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("zipcode")) {
                setZipcode(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("hvbnm")) {
                setHvbnm(value);
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