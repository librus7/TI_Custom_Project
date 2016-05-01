package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class GVPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(GVPF.class);

    /**
     * Primary Key
     */

    public static class Key_GVPF {

        private String bank_ent;
        private String gvbrnm;
        private String gvccy;
        private String gvcus1sbb;
        private String gvcus1;
        private String gving;
        private String gvmvt;
        private String gvprf;
 
        public String getBank_ent() {
            return this.bank_ent;
        }
        public void setBank_ent(String bank_ent) {
           this.bank_ent = bank_ent;
        }  

        public String getGvbrnm() {
            return this.gvbrnm;
        }
        public void setGvbrnm(String gvbrnm) {
           this.gvbrnm = gvbrnm;
        }  

        public String getGvccy() {
            return this.gvccy;
        }
        public void setGvccy(String gvccy) {
           this.gvccy = gvccy;
        }  

        public String getGvcus1sbb() {
            return this.gvcus1sbb;
        }
        public void setGvcus1sbb(String gvcus1sbb) {
           this.gvcus1sbb = gvcus1sbb;
        }  

        public String getGvcus1() {
            return this.gvcus1;
        }
        public void setGvcus1(String gvcus1) {
           this.gvcus1 = gvcus1;
        }  

        public String getGving() {
            return this.gving;
        }
        public void setGving(String gving) {
           this.gving = gving;
        }  

        public String getGvmvt() {
            return this.gvmvt;
        }
        public void setGvmvt(String gvmvt) {
           this.gvmvt = gvmvt;
        }  

        public String getGvprf() {
            return this.gvprf;
        }
        public void setGvprf(String gvprf) {
           this.gvprf = gvprf;
        }  

     }

    private Key_GVPF $key = new Key_GVPF();

    public Key_GVPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private BigDecimal date_dl;
    private String gvabf;
    private String gvanf;
    private String gvasf;
    private String gvclcc;
    private String gvclc;
    private String gvcusc;
    private String gvcus;
    private String mnt_in_bo;
    private BigDecimal gvnrd;
    private String gvnaacc;
    private String gvswb;
    private String gvswbr;
    private String gvcnas;
    private String gvswl;
    private String gvcus1csbb;
    private String gvcus1c;
    private String gvna1;
    private String gvna2;
    private String gvna3;
    private String gvna4;
    private String gvnatlit;
    private String gvoanc;
    private String gvyins;
    private String clearid;
    private String clearmbe;
    private String tigvnar;
    private String gvnst;
    private String gvnst_mbe;
    private String gvacct;
    private String sll_acc;
    private String sll_sbank;
    private String sll_sbrn;
    private String sll_sctr;
    private String sll_sloc;
    private String sll_sbb;
    private String sll_mnm;
    private String sll_na1;
    private String sll_na2;
    private String sll_na3;
    private String sll_na4;
    private String sll_tlit;
    private String gvsha;
    private String gvsrc;
    private String gvuc1;
    private String gvuc2;
    private String timecode1;
    private String timedet1;
    private String timecode2;
    private String timedet2;
    private String timecode3;
    private String timedet3;
    private String gvxm;
    private String gvvianost;
    private String gvsccy;
 
    /**
     * Getters/Setters members 
     */   
    public String getBank_ent() {
        return this.$key.bank_ent;
    }

    public void setBank_ent(String bank_ent) {
        this.$key.bank_ent = bank_ent;
    }

    public String getGvbrnm() {
        return this.$key.gvbrnm;
    }

    public void setGvbrnm(String gvbrnm) {
        this.$key.gvbrnm = gvbrnm;
    }

    public String getGvccy() {
        return this.$key.gvccy;
    }

    public void setGvccy(String gvccy) {
        this.$key.gvccy = gvccy;
    }

    public String getGvcus1sbb() {
        return this.$key.gvcus1sbb;
    }

    public void setGvcus1sbb(String gvcus1sbb) {
        this.$key.gvcus1sbb = gvcus1sbb;
    }

    public String getGvcus1() {
        return this.$key.gvcus1;
    }

    public void setGvcus1(String gvcus1) {
        this.$key.gvcus1 = gvcus1;
    }

    public String getGving() {
        return this.$key.gving;
    }

    public void setGving(String gving) {
        this.$key.gving = gving;
    }

    public String getGvmvt() {
        return this.$key.gvmvt;
    }

    public void setGvmvt(String gvmvt) {
        this.$key.gvmvt = gvmvt;
    }

    public String getGvprf() {
        return this.$key.gvprf;
    }

    public void setGvprf(String gvprf) {
        this.$key.gvprf = gvprf;
    }

     public BigDecimal getDate_dl() {
        return this.date_dl;
    }

    public void setDate_dl(BigDecimal date_dl) {
        this.date_dl = date_dl;
    }

    public String getGvabf() {
        return this.gvabf;
    }

    public void setGvabf(String gvabf) {
        this.gvabf = gvabf;
    }

    public String getGvanf() {
        return this.gvanf;
    }

    public void setGvanf(String gvanf) {
        this.gvanf = gvanf;
    }

    public String getGvasf() {
        return this.gvasf;
    }

    public void setGvasf(String gvasf) {
        this.gvasf = gvasf;
    }

    public String getGvclcc() {
        return this.gvclcc;
    }

    public void setGvclcc(String gvclcc) {
        this.gvclcc = gvclcc;
    }

    public String getGvclc() {
        return this.gvclc;
    }

    public void setGvclc(String gvclc) {
        this.gvclc = gvclc;
    }

    public String getGvcusc() {
        return this.gvcusc;
    }

    public void setGvcusc(String gvcusc) {
        this.gvcusc = gvcusc;
    }

    public String getGvcus() {
        return this.gvcus;
    }

    public void setGvcus(String gvcus) {
        this.gvcus = gvcus;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public BigDecimal getGvnrd() {
        return this.gvnrd;
    }

    public void setGvnrd(BigDecimal gvnrd) {
        this.gvnrd = gvnrd;
    }

    public String getGvnaacc() {
        return this.gvnaacc;
    }

    public void setGvnaacc(String gvnaacc) {
        this.gvnaacc = gvnaacc;
    }

    public String getGvswb() {
        return this.gvswb;
    }

    public void setGvswb(String gvswb) {
        this.gvswb = gvswb;
    }

    public String getGvswbr() {
        return this.gvswbr;
    }

    public void setGvswbr(String gvswbr) {
        this.gvswbr = gvswbr;
    }

    public String getGvcnas() {
        return this.gvcnas;
    }

    public void setGvcnas(String gvcnas) {
        this.gvcnas = gvcnas;
    }

    public String getGvswl() {
        return this.gvswl;
    }

    public void setGvswl(String gvswl) {
        this.gvswl = gvswl;
    }

    public String getGvcus1csbb() {
        return this.gvcus1csbb;
    }

    public void setGvcus1csbb(String gvcus1csbb) {
        this.gvcus1csbb = gvcus1csbb;
    }

    public String getGvcus1c() {
        return this.gvcus1c;
    }

    public void setGvcus1c(String gvcus1c) {
        this.gvcus1c = gvcus1c;
    }

    public String getGvna1() {
        return this.gvna1;
    }

    public void setGvna1(String gvna1) {
        this.gvna1 = gvna1;
    }

    public String getGvna2() {
        return this.gvna2;
    }

    public void setGvna2(String gvna2) {
        this.gvna2 = gvna2;
    }

    public String getGvna3() {
        return this.gvna3;
    }

    public void setGvna3(String gvna3) {
        this.gvna3 = gvna3;
    }

    public String getGvna4() {
        return this.gvna4;
    }

    public void setGvna4(String gvna4) {
        this.gvna4 = gvna4;
    }

    public String getGvnatlit() {
        return this.gvnatlit;
    }

    public void setGvnatlit(String gvnatlit) {
        this.gvnatlit = gvnatlit;
    }

    public String getGvoanc() {
        return this.gvoanc;
    }

    public void setGvoanc(String gvoanc) {
        this.gvoanc = gvoanc;
    }

    public String getGvyins() {
        return this.gvyins;
    }

    public void setGvyins(String gvyins) {
        this.gvyins = gvyins;
    }

    public String getClearid() {
        return this.clearid;
    }

    public void setClearid(String clearid) {
        this.clearid = clearid;
    }

    public String getClearmbe() {
        return this.clearmbe;
    }

    public void setClearmbe(String clearmbe) {
        this.clearmbe = clearmbe;
    }

    public String getTigvnar() {
        return this.tigvnar;
    }

    public void setTigvnar(String tigvnar) {
        this.tigvnar = tigvnar;
    }

    public String getGvnst() {
        return this.gvnst;
    }

    public void setGvnst(String gvnst) {
        this.gvnst = gvnst;
    }

    public String getGvnst_mbe() {
        return this.gvnst_mbe;
    }

    public void setGvnst_mbe(String gvnst_mbe) {
        this.gvnst_mbe = gvnst_mbe;
    }

    public String getGvacct() {
        return this.gvacct;
    }

    public void setGvacct(String gvacct) {
        this.gvacct = gvacct;
    }

    public String getSll_acc() {
        return this.sll_acc;
    }

    public void setSll_acc(String sll_acc) {
        this.sll_acc = sll_acc;
    }

    public String getSll_sbank() {
        return this.sll_sbank;
    }

    public void setSll_sbank(String sll_sbank) {
        this.sll_sbank = sll_sbank;
    }

    public String getSll_sbrn() {
        return this.sll_sbrn;
    }

    public void setSll_sbrn(String sll_sbrn) {
        this.sll_sbrn = sll_sbrn;
    }

    public String getSll_sctr() {
        return this.sll_sctr;
    }

    public void setSll_sctr(String sll_sctr) {
        this.sll_sctr = sll_sctr;
    }

    public String getSll_sloc() {
        return this.sll_sloc;
    }

    public void setSll_sloc(String sll_sloc) {
        this.sll_sloc = sll_sloc;
    }

    public String getSll_sbb() {
        return this.sll_sbb;
    }

    public void setSll_sbb(String sll_sbb) {
        this.sll_sbb = sll_sbb;
    }

    public String getSll_mnm() {
        return this.sll_mnm;
    }

    public void setSll_mnm(String sll_mnm) {
        this.sll_mnm = sll_mnm;
    }

    public String getSll_na1() {
        return this.sll_na1;
    }

    public void setSll_na1(String sll_na1) {
        this.sll_na1 = sll_na1;
    }

    public String getSll_na2() {
        return this.sll_na2;
    }

    public void setSll_na2(String sll_na2) {
        this.sll_na2 = sll_na2;
    }

    public String getSll_na3() {
        return this.sll_na3;
    }

    public void setSll_na3(String sll_na3) {
        this.sll_na3 = sll_na3;
    }

    public String getSll_na4() {
        return this.sll_na4;
    }

    public void setSll_na4(String sll_na4) {
        this.sll_na4 = sll_na4;
    }

    public String getSll_tlit() {
        return this.sll_tlit;
    }

    public void setSll_tlit(String sll_tlit) {
        this.sll_tlit = sll_tlit;
    }

    public String getGvsha() {
        return this.gvsha;
    }

    public void setGvsha(String gvsha) {
        this.gvsha = gvsha;
    }

    public String getGvsrc() {
        return this.gvsrc;
    }

    public void setGvsrc(String gvsrc) {
        this.gvsrc = gvsrc;
    }

    public String getGvuc1() {
        return this.gvuc1;
    }

    public void setGvuc1(String gvuc1) {
        this.gvuc1 = gvuc1;
    }

    public String getGvuc2() {
        return this.gvuc2;
    }

    public void setGvuc2(String gvuc2) {
        this.gvuc2 = gvuc2;
    }

    public String getTimecode1() {
        return this.timecode1;
    }

    public void setTimecode1(String timecode1) {
        this.timecode1 = timecode1;
    }

    public String getTimedet1() {
        return this.timedet1;
    }

    public void setTimedet1(String timedet1) {
        this.timedet1 = timedet1;
    }

    public String getTimecode2() {
        return this.timecode2;
    }

    public void setTimecode2(String timecode2) {
        this.timecode2 = timecode2;
    }

    public String getTimedet2() {
        return this.timedet2;
    }

    public void setTimedet2(String timedet2) {
        this.timedet2 = timedet2;
    }

    public String getTimecode3() {
        return this.timecode3;
    }

    public void setTimecode3(String timecode3) {
        this.timecode3 = timecode3;
    }

    public String getTimedet3() {
        return this.timedet3;
    }

    public void setTimedet3(String timedet3) {
        this.timedet3 = timedet3;
    }

    public String getGvxm() {
        return this.gvxm;
    }

    public void setGvxm(String gvxm) {
        this.gvxm = gvxm;
    }

    public String getGvvianost() {
        return this.gvvianost;
    }

    public void setGvvianost(String gvvianost) {
        this.gvvianost = gvvianost;
    }

    public String getGvsccy() {
        return this.gvsccy;
    }

    public void setGvsccy(String gvsccy) {
        this.gvsccy = gvsccy;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("bank_ent"))
            return getBank_ent();
        if (columnName.trim().equalsIgnoreCase("gvbrnm"))
            return getGvbrnm();
        if (columnName.trim().equalsIgnoreCase("gvccy"))
            return getGvccy();
        if (columnName.trim().equalsIgnoreCase("gvcus1sbb"))
            return getGvcus1sbb();
        if (columnName.trim().equalsIgnoreCase("gvcus1"))
            return getGvcus1();
        if (columnName.trim().equalsIgnoreCase("gving"))
            return getGving();
        if (columnName.trim().equalsIgnoreCase("gvmvt"))
            return getGvmvt();
        if (columnName.trim().equalsIgnoreCase("gvprf"))
            return getGvprf();
        if (columnName.trim().equalsIgnoreCase("date_dl"))
            return getDate_dl();
        if (columnName.trim().equalsIgnoreCase("gvabf"))
            return getGvabf();
        if (columnName.trim().equalsIgnoreCase("gvanf"))
            return getGvanf();
        if (columnName.trim().equalsIgnoreCase("gvasf"))
            return getGvasf();
        if (columnName.trim().equalsIgnoreCase("gvclcc"))
            return getGvclcc();
        if (columnName.trim().equalsIgnoreCase("gvclc"))
            return getGvclc();
        if (columnName.trim().equalsIgnoreCase("gvcusc"))
            return getGvcusc();
        if (columnName.trim().equalsIgnoreCase("gvcus"))
            return getGvcus();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("gvnrd"))
            return getGvnrd();
        if (columnName.trim().equalsIgnoreCase("gvnaacc"))
            return getGvnaacc();
        if (columnName.trim().equalsIgnoreCase("gvswb"))
            return getGvswb();
        if (columnName.trim().equalsIgnoreCase("gvswbr"))
            return getGvswbr();
        if (columnName.trim().equalsIgnoreCase("gvcnas"))
            return getGvcnas();
        if (columnName.trim().equalsIgnoreCase("gvswl"))
            return getGvswl();
        if (columnName.trim().equalsIgnoreCase("gvcus1csbb"))
            return getGvcus1csbb();
        if (columnName.trim().equalsIgnoreCase("gvcus1c"))
            return getGvcus1c();
        if (columnName.trim().equalsIgnoreCase("gvna1"))
            return getGvna1();
        if (columnName.trim().equalsIgnoreCase("gvna2"))
            return getGvna2();
        if (columnName.trim().equalsIgnoreCase("gvna3"))
            return getGvna3();
        if (columnName.trim().equalsIgnoreCase("gvna4"))
            return getGvna4();
        if (columnName.trim().equalsIgnoreCase("gvnatlit"))
            return getGvnatlit();
        if (columnName.trim().equalsIgnoreCase("gvoanc"))
            return getGvoanc();
        if (columnName.trim().equalsIgnoreCase("gvyins"))
            return getGvyins();
        if (columnName.trim().equalsIgnoreCase("clearid"))
            return getClearid();
        if (columnName.trim().equalsIgnoreCase("clearmbe"))
            return getClearmbe();
        if (columnName.trim().equalsIgnoreCase("tigvnar"))
            return getTigvnar();
        if (columnName.trim().equalsIgnoreCase("gvnst"))
            return getGvnst();
        if (columnName.trim().equalsIgnoreCase("gvnst_mbe"))
            return getGvnst_mbe();
        if (columnName.trim().equalsIgnoreCase("gvacct"))
            return getGvacct();
        if (columnName.trim().equalsIgnoreCase("sll_acc"))
            return getSll_acc();
        if (columnName.trim().equalsIgnoreCase("sll_sbank"))
            return getSll_sbank();
        if (columnName.trim().equalsIgnoreCase("sll_sbrn"))
            return getSll_sbrn();
        if (columnName.trim().equalsIgnoreCase("sll_sctr"))
            return getSll_sctr();
        if (columnName.trim().equalsIgnoreCase("sll_sloc"))
            return getSll_sloc();
        if (columnName.trim().equalsIgnoreCase("sll_sbb"))
            return getSll_sbb();
        if (columnName.trim().equalsIgnoreCase("sll_mnm"))
            return getSll_mnm();
        if (columnName.trim().equalsIgnoreCase("sll_na1"))
            return getSll_na1();
        if (columnName.trim().equalsIgnoreCase("sll_na2"))
            return getSll_na2();
        if (columnName.trim().equalsIgnoreCase("sll_na3"))
            return getSll_na3();
        if (columnName.trim().equalsIgnoreCase("sll_na4"))
            return getSll_na4();
        if (columnName.trim().equalsIgnoreCase("sll_tlit"))
            return getSll_tlit();
        if (columnName.trim().equalsIgnoreCase("gvsha"))
            return getGvsha();
        if (columnName.trim().equalsIgnoreCase("gvsrc"))
            return getGvsrc();
        if (columnName.trim().equalsIgnoreCase("gvuc1"))
            return getGvuc1();
        if (columnName.trim().equalsIgnoreCase("gvuc2"))
            return getGvuc2();
        if (columnName.trim().equalsIgnoreCase("timecode1"))
            return getTimecode1();
        if (columnName.trim().equalsIgnoreCase("timedet1"))
            return getTimedet1();
        if (columnName.trim().equalsIgnoreCase("timecode2"))
            return getTimecode2();
        if (columnName.trim().equalsIgnoreCase("timedet2"))
            return getTimedet2();
        if (columnName.trim().equalsIgnoreCase("timecode3"))
            return getTimecode3();
        if (columnName.trim().equalsIgnoreCase("timedet3"))
            return getTimedet3();
        if (columnName.trim().equalsIgnoreCase("gvxm"))
            return getGvxm();
        if (columnName.trim().equalsIgnoreCase("gvvianost"))
            return getGvvianost();
        if (columnName.trim().equalsIgnoreCase("gvsccy"))
            return getGvsccy();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("bank_ent")) {
                setBank_ent(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvbrnm")) {
                setGvbrnm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvccy")) {
                setGvccy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvcus1sbb")) {
                setGvcus1sbb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvcus1")) {
                setGvcus1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gving")) {
                setGving(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvmvt")) {
                setGvmvt(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvprf")) {
                setGvprf(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("date_dl")) {
                setDate_dl(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvabf")) {
                setGvabf(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvanf")) {
                setGvanf(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvasf")) {
                setGvasf(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvclcc")) {
                setGvclcc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvclc")) {
                setGvclc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvcusc")) {
                setGvcusc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvcus")) {
                setGvcus(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvnrd")) {
                setGvnrd(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvnaacc")) {
                setGvnaacc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvswb")) {
                setGvswb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvswbr")) {
                setGvswbr(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvcnas")) {
                setGvcnas(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvswl")) {
                setGvswl(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvcus1csbb")) {
                setGvcus1csbb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvcus1c")) {
                setGvcus1c(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvna1")) {
                setGvna1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvna2")) {
                setGvna2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvna3")) {
                setGvna3(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvna4")) {
                setGvna4(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvnatlit")) {
                setGvnatlit(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvoanc")) {
                setGvoanc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvyins")) {
                setGvyins(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("clearid")) {
                setClearid(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("clearmbe")) {
                setClearmbe(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tigvnar")) {
                setTigvnar(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvnst")) {
                setGvnst(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvnst_mbe")) {
                setGvnst_mbe(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvacct")) {
                setGvacct(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sll_acc")) {
                setSll_acc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sll_sbank")) {
                setSll_sbank(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sll_sbrn")) {
                setSll_sbrn(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sll_sctr")) {
                setSll_sctr(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sll_sloc")) {
                setSll_sloc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sll_sbb")) {
                setSll_sbb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sll_mnm")) {
                setSll_mnm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sll_na1")) {
                setSll_na1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sll_na2")) {
                setSll_na2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sll_na3")) {
                setSll_na3(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sll_na4")) {
                setSll_na4(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sll_tlit")) {
                setSll_tlit(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvsha")) {
                setGvsha(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvsrc")) {
                setGvsrc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvuc1")) {
                setGvuc1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvuc2")) {
                setGvuc2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("timecode1")) {
                setTimecode1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("timedet1")) {
                setTimedet1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("timecode2")) {
                setTimecode2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("timedet2")) {
                setTimedet2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("timecode3")) {
                setTimecode3(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("timedet3")) {
                setTimedet3(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvxm")) {
                setGvxm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvvianost")) {
                setGvvianost(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gvsccy")) {
                setGvsccy(value);
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