package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class C7PF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(C7PF.class);

    /**
     * Primary Key
     */

    public static class Key_C7PF {

        private String c7cna;
 
        public String getC7cna() {
            return this.c7cna;
        }
        public void setC7cna(String c7cna) {
           this.c7cna = c7cna;
        }  

     }

    private Key_C7PF $key = new Key_C7PF();

    public Key_C7PF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String c7rfi;
    private String isocna;
    private String mnt_in_bo;
    private Integer c7tenor;
    private String c7cnm;
 
    /**
     * Getters/Setters members 
     */   
    public String getC7cna() {
        return this.$key.c7cna;
    }

    public void setC7cna(String c7cna) {
        this.$key.c7cna = c7cna;
    }

     public String getC7rfi() {
        return this.c7rfi;
    }

    public void setC7rfi(String c7rfi) {
        this.c7rfi = c7rfi;
    }

    public String getIsocna() {
        return this.isocna;
    }

    public void setIsocna(String isocna) {
        this.isocna = isocna;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public Integer getC7tenor() {
        return this.c7tenor;
    }

    public void setC7tenor(Integer c7tenor) {
        this.c7tenor = c7tenor;
    }

    public String getC7cnm() {
        return this.c7cnm;
    }

    public void setC7cnm(String c7cnm) {
        this.c7cnm = c7cnm;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("c7cna"))
            return getC7cna();
        if (columnName.trim().equalsIgnoreCase("c7rfi"))
            return getC7rfi();
        if (columnName.trim().equalsIgnoreCase("isocna"))
            return getIsocna();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("c7tenor"))
            return getC7tenor();
        if (columnName.trim().equalsIgnoreCase("c7cnm"))
            return getC7cnm();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("c7cna")) {
                setC7cna(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c7rfi")) {
                setC7rfi(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("isocna")) {
                setIsocna(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c7tenor")) {
                setC7tenor(CustomisationHelper.getIntegerFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c7cnm")) {
                setC7cnm(value);
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