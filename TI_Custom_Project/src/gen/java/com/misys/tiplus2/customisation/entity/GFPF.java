package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class GFPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(GFPF.class);

    /**
     * Primary Key
     */

    public static class Key_GFPF {

        private String gfcus1_sbb;
        private String gfcus1;
 
        public String getGfcus1_sbb() {
            return this.gfcus1_sbb;
        }
        public void setGfcus1_sbb(String gfcus1_sbb) {
           this.gfcus1_sbb = gfcus1_sbb;
        }  

        public String getGfcus1() {
            return this.gfcus1;
        }
        public void setGfcus1(String gfcus1) {
           this.gfcus1 = gfcus1;
        }  

     }

    private Key_GFPF $key = new Key_GFPF();

    public Key_GFPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String gfc201;
    private String gfc202;
    private String gfc101;
    private String gfc102;
    private BigDecimal date_dl;
    private BigDecimal gfdlm;
    private String gfclc;
    private String gfctp;
    private String gfcus;
    private String gfpclc;
    private String gfpcus;
    private String clr_number;
    private String gfmtb;
    private String mnt_in_bo;
    private String tifcmf;
    private String gfpcus1;
    private String gfcrf;
    private String source;
    private String gfca2;
    private String gfcub;
    private String gfcuc;
    private String gfcpnc;
    private String gfctp1;
    private String gfcud;
    private String gfdas;
    private String gfcun;
    private String gfgrp;
    private String gfcuz;
    private String gflnm;
    private String gfaco;
    private String gfcnap;
    private String gfcnal;
    private String gfcnar;
 
    /**
     * Getters/Setters members 
     */   
    public String getGfcus1_sbb() {
        return this.$key.gfcus1_sbb;
    }

    public void setGfcus1_sbb(String gfcus1_sbb) {
        this.$key.gfcus1_sbb = gfcus1_sbb;
    }

    public String getGfcus1() {
        return this.$key.gfcus1;
    }

    public void setGfcus1(String gfcus1) {
        this.$key.gfcus1 = gfcus1;
    }

     public String getGfc201() {
        return this.gfc201;
    }

    public void setGfc201(String gfc201) {
        this.gfc201 = gfc201;
    }

    public String getGfc202() {
        return this.gfc202;
    }

    public void setGfc202(String gfc202) {
        this.gfc202 = gfc202;
    }

    public String getGfc101() {
        return this.gfc101;
    }

    public void setGfc101(String gfc101) {
        this.gfc101 = gfc101;
    }

    public String getGfc102() {
        return this.gfc102;
    }

    public void setGfc102(String gfc102) {
        this.gfc102 = gfc102;
    }

    public BigDecimal getDate_dl() {
        return this.date_dl;
    }

    public void setDate_dl(BigDecimal date_dl) {
        this.date_dl = date_dl;
    }

    public BigDecimal getGfdlm() {
        return this.gfdlm;
    }

    public void setGfdlm(BigDecimal gfdlm) {
        this.gfdlm = gfdlm;
    }

    public String getGfclc() {
        return this.gfclc;
    }

    public void setGfclc(String gfclc) {
        this.gfclc = gfclc;
    }

    public String getGfctp() {
        return this.gfctp;
    }

    public void setGfctp(String gfctp) {
        this.gfctp = gfctp;
    }

    public String getGfcus() {
        return this.gfcus;
    }

    public void setGfcus(String gfcus) {
        this.gfcus = gfcus;
    }

    public String getGfpclc() {
        return this.gfpclc;
    }

    public void setGfpclc(String gfpclc) {
        this.gfpclc = gfpclc;
    }

    public String getGfpcus() {
        return this.gfpcus;
    }

    public void setGfpcus(String gfpcus) {
        this.gfpcus = gfpcus;
    }

    public String getClr_number() {
        return this.clr_number;
    }

    public void setClr_number(String clr_number) {
        this.clr_number = clr_number;
    }

    public String getGfmtb() {
        return this.gfmtb;
    }

    public void setGfmtb(String gfmtb) {
        this.gfmtb = gfmtb;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getTifcmf() {
        return this.tifcmf;
    }

    public void setTifcmf(String tifcmf) {
        this.tifcmf = tifcmf;
    }

    public String getGfpcus1() {
        return this.gfpcus1;
    }

    public void setGfpcus1(String gfpcus1) {
        this.gfpcus1 = gfpcus1;
    }

    public String getGfcrf() {
        return this.gfcrf;
    }

    public void setGfcrf(String gfcrf) {
        this.gfcrf = gfcrf;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getGfca2() {
        return this.gfca2;
    }

    public void setGfca2(String gfca2) {
        this.gfca2 = gfca2;
    }

    public String getGfcub() {
        return this.gfcub;
    }

    public void setGfcub(String gfcub) {
        this.gfcub = gfcub;
    }

    public String getGfcuc() {
        return this.gfcuc;
    }

    public void setGfcuc(String gfcuc) {
        this.gfcuc = gfcuc;
    }

    public String getGfcpnc() {
        return this.gfcpnc;
    }

    public void setGfcpnc(String gfcpnc) {
        this.gfcpnc = gfcpnc;
    }

    public String getGfctp1() {
        return this.gfctp1;
    }

    public void setGfctp1(String gfctp1) {
        this.gfctp1 = gfctp1;
    }

    public String getGfcud() {
        return this.gfcud;
    }

    public void setGfcud(String gfcud) {
        this.gfcud = gfcud;
    }

    public String getGfdas() {
        return this.gfdas;
    }

    public void setGfdas(String gfdas) {
        this.gfdas = gfdas;
    }

    public String getGfcun() {
        return this.gfcun;
    }

    public void setGfcun(String gfcun) {
        this.gfcun = gfcun;
    }

    public String getGfgrp() {
        return this.gfgrp;
    }

    public void setGfgrp(String gfgrp) {
        this.gfgrp = gfgrp;
    }

    public String getGfcuz() {
        return this.gfcuz;
    }

    public void setGfcuz(String gfcuz) {
        this.gfcuz = gfcuz;
    }

    public String getGflnm() {
        return this.gflnm;
    }

    public void setGflnm(String gflnm) {
        this.gflnm = gflnm;
    }

    public String getGfaco() {
        return this.gfaco;
    }

    public void setGfaco(String gfaco) {
        this.gfaco = gfaco;
    }

    public String getGfcnap() {
        return this.gfcnap;
    }

    public void setGfcnap(String gfcnap) {
        this.gfcnap = gfcnap;
    }

    public String getGfcnal() {
        return this.gfcnal;
    }

    public void setGfcnal(String gfcnal) {
        this.gfcnal = gfcnal;
    }

    public String getGfcnar() {
        return this.gfcnar;
    }

    public void setGfcnar(String gfcnar) {
        this.gfcnar = gfcnar;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("gfcus1_sbb"))
            return getGfcus1_sbb();
        if (columnName.trim().equalsIgnoreCase("gfcus1"))
            return getGfcus1();
        if (columnName.trim().equalsIgnoreCase("gfc201"))
            return getGfc201();
        if (columnName.trim().equalsIgnoreCase("gfc202"))
            return getGfc202();
        if (columnName.trim().equalsIgnoreCase("gfc101"))
            return getGfc101();
        if (columnName.trim().equalsIgnoreCase("gfc102"))
            return getGfc102();
        if (columnName.trim().equalsIgnoreCase("date_dl"))
            return getDate_dl();
        if (columnName.trim().equalsIgnoreCase("gfdlm"))
            return getGfdlm();
        if (columnName.trim().equalsIgnoreCase("gfclc"))
            return getGfclc();
        if (columnName.trim().equalsIgnoreCase("gfctp"))
            return getGfctp();
        if (columnName.trim().equalsIgnoreCase("gfcus"))
            return getGfcus();
        if (columnName.trim().equalsIgnoreCase("gfpclc"))
            return getGfpclc();
        if (columnName.trim().equalsIgnoreCase("gfpcus"))
            return getGfpcus();
        if (columnName.trim().equalsIgnoreCase("clr_number"))
            return getClr_number();
        if (columnName.trim().equalsIgnoreCase("gfmtb"))
            return getGfmtb();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("tifcmf"))
            return getTifcmf();
        if (columnName.trim().equalsIgnoreCase("gfpcus1"))
            return getGfpcus1();
        if (columnName.trim().equalsIgnoreCase("gfcrf"))
            return getGfcrf();
        if (columnName.trim().equalsIgnoreCase("source"))
            return getSource();
        if (columnName.trim().equalsIgnoreCase("gfca2"))
            return getGfca2();
        if (columnName.trim().equalsIgnoreCase("gfcub"))
            return getGfcub();
        if (columnName.trim().equalsIgnoreCase("gfcuc"))
            return getGfcuc();
        if (columnName.trim().equalsIgnoreCase("gfcpnc"))
            return getGfcpnc();
        if (columnName.trim().equalsIgnoreCase("gfctp1"))
            return getGfctp1();
        if (columnName.trim().equalsIgnoreCase("gfcud"))
            return getGfcud();
        if (columnName.trim().equalsIgnoreCase("gfdas"))
            return getGfdas();
        if (columnName.trim().equalsIgnoreCase("gfcun"))
            return getGfcun();
        if (columnName.trim().equalsIgnoreCase("gfgrp"))
            return getGfgrp();
        if (columnName.trim().equalsIgnoreCase("gfcuz"))
            return getGfcuz();
        if (columnName.trim().equalsIgnoreCase("gflnm"))
            return getGflnm();
        if (columnName.trim().equalsIgnoreCase("gfaco"))
            return getGfaco();
        if (columnName.trim().equalsIgnoreCase("gfcnap"))
            return getGfcnap();
        if (columnName.trim().equalsIgnoreCase("gfcnal"))
            return getGfcnal();
        if (columnName.trim().equalsIgnoreCase("gfcnar"))
            return getGfcnar();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("gfcus1_sbb")) {
                setGfcus1_sbb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfcus1")) {
                setGfcus1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfc201")) {
                setGfc201(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfc202")) {
                setGfc202(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfc101")) {
                setGfc101(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfc102")) {
                setGfc102(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("date_dl")) {
                setDate_dl(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfdlm")) {
                setGfdlm(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfclc")) {
                setGfclc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfctp")) {
                setGfctp(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfcus")) {
                setGfcus(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfpclc")) {
                setGfpclc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfpcus")) {
                setGfpcus(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("clr_number")) {
                setClr_number(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfmtb")) {
                setGfmtb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifcmf")) {
                setTifcmf(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfpcus1")) {
                setGfpcus1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfcrf")) {
                setGfcrf(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("source")) {
                setSource(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfca2")) {
                setGfca2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfcub")) {
                setGfcub(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfcuc")) {
                setGfcuc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfcpnc")) {
                setGfcpnc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfctp1")) {
                setGfctp1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfcud")) {
                setGfcud(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfdas")) {
                setGfdas(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfcun")) {
                setGfcun(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfgrp")) {
                setGfgrp(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfcuz")) {
                setGfcuz(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gflnm")) {
                setGflnm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfaco")) {
                setGfaco(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfcnap")) {
                setGfcnap(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfcnal")) {
                setGfcnal(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gfcnar")) {
                setGfcnar(value);
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