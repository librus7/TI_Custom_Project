package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class CTPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(CTPF.class);

    /**
     * Primary Key
     */

    public static class Key_CTPF {

        private String cttcd;
 
        public String getCttcd() {
            return this.cttcd;
        }
        public void setCttcd(String cttcd) {
           this.cttcd = cttcd;
        }  

     }

    private Key_CTPF $key = new Key_CTPF();

    public Key_CTPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String ctdci;
    private String ctdfa;
    private String ctrvt;
    private String mnt_in_bo;
    private String ctpca;
    private String ctpea;
    private String ctpia;
    private String ctpma;
    private String ctpta;
    private String cttcm;
    private String cttcn;
    private String cttcdr;
    private String cttc2;
    private String cttc4;
    private String cttc1;
    private String cttc3;
 
    /**
     * Getters/Setters members 
     */   
    public String getCttcd() {
        return this.$key.cttcd;
    }

    public void setCttcd(String cttcd) {
        this.$key.cttcd = cttcd;
    }

     public String getCtdci() {
        return this.ctdci;
    }

    public void setCtdci(String ctdci) {
        this.ctdci = ctdci;
    }

    public String getCtdfa() {
        return this.ctdfa;
    }

    public void setCtdfa(String ctdfa) {
        this.ctdfa = ctdfa;
    }

    public String getCtrvt() {
        return this.ctrvt;
    }

    public void setCtrvt(String ctrvt) {
        this.ctrvt = ctrvt;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getCtpca() {
        return this.ctpca;
    }

    public void setCtpca(String ctpca) {
        this.ctpca = ctpca;
    }

    public String getCtpea() {
        return this.ctpea;
    }

    public void setCtpea(String ctpea) {
        this.ctpea = ctpea;
    }

    public String getCtpia() {
        return this.ctpia;
    }

    public void setCtpia(String ctpia) {
        this.ctpia = ctpia;
    }

    public String getCtpma() {
        return this.ctpma;
    }

    public void setCtpma(String ctpma) {
        this.ctpma = ctpma;
    }

    public String getCtpta() {
        return this.ctpta;
    }

    public void setCtpta(String ctpta) {
        this.ctpta = ctpta;
    }

    public String getCttcm() {
        return this.cttcm;
    }

    public void setCttcm(String cttcm) {
        this.cttcm = cttcm;
    }

    public String getCttcn() {
        return this.cttcn;
    }

    public void setCttcn(String cttcn) {
        this.cttcn = cttcn;
    }

    public String getCttcdr() {
        return this.cttcdr;
    }

    public void setCttcdr(String cttcdr) {
        this.cttcdr = cttcdr;
    }

    public String getCttc2() {
        return this.cttc2;
    }

    public void setCttc2(String cttc2) {
        this.cttc2 = cttc2;
    }

    public String getCttc4() {
        return this.cttc4;
    }

    public void setCttc4(String cttc4) {
        this.cttc4 = cttc4;
    }

    public String getCttc1() {
        return this.cttc1;
    }

    public void setCttc1(String cttc1) {
        this.cttc1 = cttc1;
    }

    public String getCttc3() {
        return this.cttc3;
    }

    public void setCttc3(String cttc3) {
        this.cttc3 = cttc3;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("cttcd"))
            return getCttcd();
        if (columnName.trim().equalsIgnoreCase("ctdci"))
            return getCtdci();
        if (columnName.trim().equalsIgnoreCase("ctdfa"))
            return getCtdfa();
        if (columnName.trim().equalsIgnoreCase("ctrvt"))
            return getCtrvt();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("ctpca"))
            return getCtpca();
        if (columnName.trim().equalsIgnoreCase("ctpea"))
            return getCtpea();
        if (columnName.trim().equalsIgnoreCase("ctpia"))
            return getCtpia();
        if (columnName.trim().equalsIgnoreCase("ctpma"))
            return getCtpma();
        if (columnName.trim().equalsIgnoreCase("ctpta"))
            return getCtpta();
        if (columnName.trim().equalsIgnoreCase("cttcm"))
            return getCttcm();
        if (columnName.trim().equalsIgnoreCase("cttcn"))
            return getCttcn();
        if (columnName.trim().equalsIgnoreCase("cttcdr"))
            return getCttcdr();
        if (columnName.trim().equalsIgnoreCase("cttc2"))
            return getCttc2();
        if (columnName.trim().equalsIgnoreCase("cttc4"))
            return getCttc4();
        if (columnName.trim().equalsIgnoreCase("cttc1"))
            return getCttc1();
        if (columnName.trim().equalsIgnoreCase("cttc3"))
            return getCttc3();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("cttcd")) {
                setCttcd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("ctdci")) {
                setCtdci(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("ctdfa")) {
                setCtdfa(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("ctrvt")) {
                setCtrvt(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("ctpca")) {
                setCtpca(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("ctpea")) {
                setCtpea(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("ctpia")) {
                setCtpia(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("ctpma")) {
                setCtpma(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("ctpta")) {
                setCtpta(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cttcm")) {
                setCttcm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cttcn")) {
                setCttcn(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cttcdr")) {
                setCttcdr(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cttc2")) {
                setCttc2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cttc4")) {
                setCttc4(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cttc1")) {
                setCttc1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cttc3")) {
                setCttc3(value);
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