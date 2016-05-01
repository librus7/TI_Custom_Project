package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class OBPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(OBPF.class);

    /**
     * Primary Key
     */

    public static class Key_OBPF {

        private String obdlp;
 
        public String getObdlp() {
            return this.obdlp;
        }
        public void setObdlp(String obdlp) {
           this.obdlp = obdlp;
        }  

     }

    private Key_OBPF $key = new Key_OBPF();

    public Key_OBPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String obapp;
    private String obbdt;
    private String obactb;
    private String obdpd;
    private String obdtyf;
    private String obiig6;
    private String obing;
    private String obdic;
    private String mnt_in_bo;
    private String obychq;
    private String obyddb;
    private String obysda;
    private String obtdt;
 
    /**
     * Getters/Setters members 
     */   
    public String getObdlp() {
        return this.$key.obdlp;
    }

    public void setObdlp(String obdlp) {
        this.$key.obdlp = obdlp;
    }

     public String getObapp() {
        return this.obapp;
    }

    public void setObapp(String obapp) {
        this.obapp = obapp;
    }

    public String getObbdt() {
        return this.obbdt;
    }

    public void setObbdt(String obbdt) {
        this.obbdt = obbdt;
    }

    public String getObactb() {
        return this.obactb;
    }

    public void setObactb(String obactb) {
        this.obactb = obactb;
    }

    public String getObdpd() {
        return this.obdpd;
    }

    public void setObdpd(String obdpd) {
        this.obdpd = obdpd;
    }

    public String getObdtyf() {
        return this.obdtyf;
    }

    public void setObdtyf(String obdtyf) {
        this.obdtyf = obdtyf;
    }

    public String getObiig6() {
        return this.obiig6;
    }

    public void setObiig6(String obiig6) {
        this.obiig6 = obiig6;
    }

    public String getObing() {
        return this.obing;
    }

    public void setObing(String obing) {
        this.obing = obing;
    }

    public String getObdic() {
        return this.obdic;
    }

    public void setObdic(String obdic) {
        this.obdic = obdic;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getObychq() {
        return this.obychq;
    }

    public void setObychq(String obychq) {
        this.obychq = obychq;
    }

    public String getObyddb() {
        return this.obyddb;
    }

    public void setObyddb(String obyddb) {
        this.obyddb = obyddb;
    }

    public String getObysda() {
        return this.obysda;
    }

    public void setObysda(String obysda) {
        this.obysda = obysda;
    }

    public String getObtdt() {
        return this.obtdt;
    }

    public void setObtdt(String obtdt) {
        this.obtdt = obtdt;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("obdlp"))
            return getObdlp();
        if (columnName.trim().equalsIgnoreCase("obapp"))
            return getObapp();
        if (columnName.trim().equalsIgnoreCase("obbdt"))
            return getObbdt();
        if (columnName.trim().equalsIgnoreCase("obactb"))
            return getObactb();
        if (columnName.trim().equalsIgnoreCase("obdpd"))
            return getObdpd();
        if (columnName.trim().equalsIgnoreCase("obdtyf"))
            return getObdtyf();
        if (columnName.trim().equalsIgnoreCase("obiig6"))
            return getObiig6();
        if (columnName.trim().equalsIgnoreCase("obing"))
            return getObing();
        if (columnName.trim().equalsIgnoreCase("obdic"))
            return getObdic();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("obychq"))
            return getObychq();
        if (columnName.trim().equalsIgnoreCase("obyddb"))
            return getObyddb();
        if (columnName.trim().equalsIgnoreCase("obysda"))
            return getObysda();
        if (columnName.trim().equalsIgnoreCase("obtdt"))
            return getObtdt();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("obdlp")) {
                setObdlp(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("obapp")) {
                setObapp(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("obbdt")) {
                setObbdt(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("obactb")) {
                setObactb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("obdpd")) {
                setObdpd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("obdtyf")) {
                setObdtyf(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("obiig6")) {
                setObiig6(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("obing")) {
                setObing(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("obdic")) {
                setObdic(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("obychq")) {
                setObychq(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("obyddb")) {
                setObyddb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("obysda")) {
                setObysda(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("obtdt")) {
                setObtdt(value);
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