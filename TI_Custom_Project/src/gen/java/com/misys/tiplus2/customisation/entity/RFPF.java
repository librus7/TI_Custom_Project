package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class RFPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(RFPF.class);

    /**
     * Primary Key
     */

    public static class Key_RFPF {

        private String rfmcy;
 
        public String getRfmcy() {
            return this.rfmcy;
        }
        public void setRfmcy(String rfmcy) {
           this.rfmcy = rfmcy;
        }  

     }

    private Key_RFPF $key = new Key_RFPF();

    public Key_RFPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private BigDecimal rfrdt;
    private BigDecimal rffrt;
    private String rfrcr;
    private String rfgcy;
    private BigDecimal rfidt;
    private BigDecimal rfdlm;
    private String mnt_in_bo;
 
    /**
     * Getters/Setters members 
     */   
    public String getRfmcy() {
        return this.$key.rfmcy;
    }

    public void setRfmcy(String rfmcy) {
        this.$key.rfmcy = rfmcy;
    }

     public BigDecimal getRfrdt() {
        return this.rfrdt;
    }

    public void setRfrdt(BigDecimal rfrdt) {
        this.rfrdt = rfrdt;
    }

    public BigDecimal getRffrt() {
        return this.rffrt;
    }

    public void setRffrt(BigDecimal rffrt) {
        this.rffrt = rffrt;
    }

    public String getRfrcr() {
        return this.rfrcr;
    }

    public void setRfrcr(String rfrcr) {
        this.rfrcr = rfrcr;
    }

    public String getRfgcy() {
        return this.rfgcy;
    }

    public void setRfgcy(String rfgcy) {
        this.rfgcy = rfgcy;
    }

    public BigDecimal getRfidt() {
        return this.rfidt;
    }

    public void setRfidt(BigDecimal rfidt) {
        this.rfidt = rfidt;
    }

    public BigDecimal getRfdlm() {
        return this.rfdlm;
    }

    public void setRfdlm(BigDecimal rfdlm) {
        this.rfdlm = rfdlm;
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
        if (columnName.trim().equalsIgnoreCase("rfmcy"))
            return getRfmcy();
        if (columnName.trim().equalsIgnoreCase("rfrdt"))
            return getRfrdt();
        if (columnName.trim().equalsIgnoreCase("rffrt"))
            return getRffrt();
        if (columnName.trim().equalsIgnoreCase("rfrcr"))
            return getRfrcr();
        if (columnName.trim().equalsIgnoreCase("rfgcy"))
            return getRfgcy();
        if (columnName.trim().equalsIgnoreCase("rfidt"))
            return getRfidt();
        if (columnName.trim().equalsIgnoreCase("rfdlm"))
            return getRfdlm();
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
            if (columnName.trim().equalsIgnoreCase("rfmcy")) {
                setRfmcy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("rfrdt")) {
                setRfrdt(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("rffrt")) {
                setRffrt(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("rfrcr")) {
                setRfrcr(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("rfgcy")) {
                setRfgcy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("rfidt")) {
                setRfidt(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("rfdlm")) {
                setRfdlm(CustomisationHelper.getBigDecimalFromString(value));
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