package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class FVPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(FVPF.class);

    /**
     * Primary Key
     */

    public static class Key_FVPF {

        private String bank_ent;
        private String fvbrnm;
        private String fvccy;
        private String fvcus1sbb;
        private String fvcus1;
        private String fving;
        private String fvmvt;
        private String fvprf;
 
        public String getBank_ent() {
            return this.bank_ent;
        }
        public void setBank_ent(String bank_ent) {
           this.bank_ent = bank_ent;
        }  

        public String getFvbrnm() {
            return this.fvbrnm;
        }
        public void setFvbrnm(String fvbrnm) {
           this.fvbrnm = fvbrnm;
        }  

        public String getFvccy() {
            return this.fvccy;
        }
        public void setFvccy(String fvccy) {
           this.fvccy = fvccy;
        }  

        public String getFvcus1sbb() {
            return this.fvcus1sbb;
        }
        public void setFvcus1sbb(String fvcus1sbb) {
           this.fvcus1sbb = fvcus1sbb;
        }  

        public String getFvcus1() {
            return this.fvcus1;
        }
        public void setFvcus1(String fvcus1) {
           this.fvcus1 = fvcus1;
        }  

        public String getFving() {
            return this.fving;
        }
        public void setFving(String fving) {
           this.fving = fving;
        }  

        public String getFvmvt() {
            return this.fvmvt;
        }
        public void setFvmvt(String fvmvt) {
           this.fvmvt = fvmvt;
        }  

        public String getFvprf() {
            return this.fvprf;
        }
        public void setFvprf(String fvprf) {
           this.fvprf = fvprf;
        }  

     }

    private Key_FVPF $key = new Key_FVPF();

    public Key_FVPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String autoch53;
    private String fvoani;
    private String cheque44;
    private String tifvcxm;
    private String tifvcvr;
    private String timecod1_1;
    private String timedet1_1;
    private String timecod2_1;
    private String timedet2_1;
    private String timecod3_1;
    private String timedet3_1;
    private String tifvswacc;
    private String fvswb;
    private String fvswbr;
    private String fvcnas;
    private String fvswl;
    private String fvcus1sbbi;
    private String fvcus1i;
    private String fvna1;
    private String fvna2;
    private String fvna3;
    private String fvna4;
    private String fvtlit;
    private String tifvintac;
    private String tifvirac;
    private String accoun72;
    private String tifvirs1;
    private String tifvirs4;
    private String tifvirs2;
    private String tifvirs3;
    private String tifvircsbb;
    private String tifvircus;
    private String tifvira1;
    private String tifvira2;
    private String tifvira3;
    private String tifvira4;
    private String tifvirtl;
    private BigDecimal tifvexrat;
    private Long tifvinamt;
    private String tifvinccy;
    private String tifvins1cd;
    private String tifvins1tx;
    private String tifvins2cd;
    private String tifvins2tx;
    private String tifvins3cd;
    private String tifvins3tx;
    private String tifvins4cd;
    private String tifvins4tx;
    private String tifvins5cd;
    private String tifvins5tx;
    private String tifvins6cd;
    private String tifvins6tx;
    private Long tifvchg1am;
    private String tifvchg1cy;
    private Long tifvchg2am;
    private String tifvchg2cy;
    private Long tifvchg3am;
    private String tifvchg3cy;
    private Long tifvchg4am;
    private String tifvchg4cy;
    private Long tifvchg5am;
    private String tifvchg5cy;
    private Long tifvchg6am;
    private String tifvchg6cy;
    private String tifvregrep;
    private String tifvsvclvl;
    private String tifvtrntyp;
    private String tifvmsgtyp;
    private String tifvocacc;
    private String tifvs1;
    private String tifvs4;
    private String tifvs2;
    private String tifvs3;
    private String tifvocsbb;
    private String tifvocus;
    private String tifvoca1;
    private String tifvoca2;
    private String tifvoca3;
    private String tifvoca4;
    private String tifvoctl;
    private String tifvpay;
    private String accoun54;
    private String tifvrcs1;
    private String tifvrcs4;
    private String tifvrcs2;
    private String tifvrcs3;
    private String tifvrcsbb;
    private String tifvrcus;
    private String tifvrca1;
    private String tifvrca2;
    private String tifvrca3;
    private String tifvrca4;
    private String tifvrctl;
    private String tifvrcac;
    private String fvchg;
    private String tifvstr;
    private String tifvsetby;
    private String timecode1;
    private String timedet1;
    private String timecode2;
    private String timedet2;
    private String timecode3;
    private String timedet3;
    private String fvclci;
    private String fvclc;
    private String fvcusi;
    private String fvcus;
    private String fvnr1;
    private String fvnr2;
    private String fvnr3;
    private String fvnr4;
    private String fvnr5;
    private String fvnr6;
    private String mnt_in_bo;
 
    /**
     * Getters/Setters members 
     */   
    public String getBank_ent() {
        return this.$key.bank_ent;
    }

    public void setBank_ent(String bank_ent) {
        this.$key.bank_ent = bank_ent;
    }

    public String getFvbrnm() {
        return this.$key.fvbrnm;
    }

    public void setFvbrnm(String fvbrnm) {
        this.$key.fvbrnm = fvbrnm;
    }

    public String getFvccy() {
        return this.$key.fvccy;
    }

    public void setFvccy(String fvccy) {
        this.$key.fvccy = fvccy;
    }

    public String getFvcus1sbb() {
        return this.$key.fvcus1sbb;
    }

    public void setFvcus1sbb(String fvcus1sbb) {
        this.$key.fvcus1sbb = fvcus1sbb;
    }

    public String getFvcus1() {
        return this.$key.fvcus1;
    }

    public void setFvcus1(String fvcus1) {
        this.$key.fvcus1 = fvcus1;
    }

    public String getFving() {
        return this.$key.fving;
    }

    public void setFving(String fving) {
        this.$key.fving = fving;
    }

    public String getFvmvt() {
        return this.$key.fvmvt;
    }

    public void setFvmvt(String fvmvt) {
        this.$key.fvmvt = fvmvt;
    }

    public String getFvprf() {
        return this.$key.fvprf;
    }

    public void setFvprf(String fvprf) {
        this.$key.fvprf = fvprf;
    }

     public String getAutoch53() {
        return this.autoch53;
    }

    public void setAutoch53(String autoch53) {
        this.autoch53 = autoch53;
    }

    public String getFvoani() {
        return this.fvoani;
    }

    public void setFvoani(String fvoani) {
        this.fvoani = fvoani;
    }

    public String getCheque44() {
        return this.cheque44;
    }

    public void setCheque44(String cheque44) {
        this.cheque44 = cheque44;
    }

    public String getTifvcxm() {
        return this.tifvcxm;
    }

    public void setTifvcxm(String tifvcxm) {
        this.tifvcxm = tifvcxm;
    }

    public String getTifvcvr() {
        return this.tifvcvr;
    }

    public void setTifvcvr(String tifvcvr) {
        this.tifvcvr = tifvcvr;
    }

    public String getTimecod1_1() {
        return this.timecod1_1;
    }

    public void setTimecod1_1(String timecod1_1) {
        this.timecod1_1 = timecod1_1;
    }

    public String getTimedet1_1() {
        return this.timedet1_1;
    }

    public void setTimedet1_1(String timedet1_1) {
        this.timedet1_1 = timedet1_1;
    }

    public String getTimecod2_1() {
        return this.timecod2_1;
    }

    public void setTimecod2_1(String timecod2_1) {
        this.timecod2_1 = timecod2_1;
    }

    public String getTimedet2_1() {
        return this.timedet2_1;
    }

    public void setTimedet2_1(String timedet2_1) {
        this.timedet2_1 = timedet2_1;
    }

    public String getTimecod3_1() {
        return this.timecod3_1;
    }

    public void setTimecod3_1(String timecod3_1) {
        this.timecod3_1 = timecod3_1;
    }

    public String getTimedet3_1() {
        return this.timedet3_1;
    }

    public void setTimedet3_1(String timedet3_1) {
        this.timedet3_1 = timedet3_1;
    }

    public String getTifvswacc() {
        return this.tifvswacc;
    }

    public void setTifvswacc(String tifvswacc) {
        this.tifvswacc = tifvswacc;
    }

    public String getFvswb() {
        return this.fvswb;
    }

    public void setFvswb(String fvswb) {
        this.fvswb = fvswb;
    }

    public String getFvswbr() {
        return this.fvswbr;
    }

    public void setFvswbr(String fvswbr) {
        this.fvswbr = fvswbr;
    }

    public String getFvcnas() {
        return this.fvcnas;
    }

    public void setFvcnas(String fvcnas) {
        this.fvcnas = fvcnas;
    }

    public String getFvswl() {
        return this.fvswl;
    }

    public void setFvswl(String fvswl) {
        this.fvswl = fvswl;
    }

    public String getFvcus1sbbi() {
        return this.fvcus1sbbi;
    }

    public void setFvcus1sbbi(String fvcus1sbbi) {
        this.fvcus1sbbi = fvcus1sbbi;
    }

    public String getFvcus1i() {
        return this.fvcus1i;
    }

    public void setFvcus1i(String fvcus1i) {
        this.fvcus1i = fvcus1i;
    }

    public String getFvna1() {
        return this.fvna1;
    }

    public void setFvna1(String fvna1) {
        this.fvna1 = fvna1;
    }

    public String getFvna2() {
        return this.fvna2;
    }

    public void setFvna2(String fvna2) {
        this.fvna2 = fvna2;
    }

    public String getFvna3() {
        return this.fvna3;
    }

    public void setFvna3(String fvna3) {
        this.fvna3 = fvna3;
    }

    public String getFvna4() {
        return this.fvna4;
    }

    public void setFvna4(String fvna4) {
        this.fvna4 = fvna4;
    }

    public String getFvtlit() {
        return this.fvtlit;
    }

    public void setFvtlit(String fvtlit) {
        this.fvtlit = fvtlit;
    }

    public String getTifvintac() {
        return this.tifvintac;
    }

    public void setTifvintac(String tifvintac) {
        this.tifvintac = tifvintac;
    }

    public String getTifvirac() {
        return this.tifvirac;
    }

    public void setTifvirac(String tifvirac) {
        this.tifvirac = tifvirac;
    }

    public String getAccoun72() {
        return this.accoun72;
    }

    public void setAccoun72(String accoun72) {
        this.accoun72 = accoun72;
    }

    public String getTifvirs1() {
        return this.tifvirs1;
    }

    public void setTifvirs1(String tifvirs1) {
        this.tifvirs1 = tifvirs1;
    }

    public String getTifvirs4() {
        return this.tifvirs4;
    }

    public void setTifvirs4(String tifvirs4) {
        this.tifvirs4 = tifvirs4;
    }

    public String getTifvirs2() {
        return this.tifvirs2;
    }

    public void setTifvirs2(String tifvirs2) {
        this.tifvirs2 = tifvirs2;
    }

    public String getTifvirs3() {
        return this.tifvirs3;
    }

    public void setTifvirs3(String tifvirs3) {
        this.tifvirs3 = tifvirs3;
    }

    public String getTifvircsbb() {
        return this.tifvircsbb;
    }

    public void setTifvircsbb(String tifvircsbb) {
        this.tifvircsbb = tifvircsbb;
    }

    public String getTifvircus() {
        return this.tifvircus;
    }

    public void setTifvircus(String tifvircus) {
        this.tifvircus = tifvircus;
    }

    public String getTifvira1() {
        return this.tifvira1;
    }

    public void setTifvira1(String tifvira1) {
        this.tifvira1 = tifvira1;
    }

    public String getTifvira2() {
        return this.tifvira2;
    }

    public void setTifvira2(String tifvira2) {
        this.tifvira2 = tifvira2;
    }

    public String getTifvira3() {
        return this.tifvira3;
    }

    public void setTifvira3(String tifvira3) {
        this.tifvira3 = tifvira3;
    }

    public String getTifvira4() {
        return this.tifvira4;
    }

    public void setTifvira4(String tifvira4) {
        this.tifvira4 = tifvira4;
    }

    public String getTifvirtl() {
        return this.tifvirtl;
    }

    public void setTifvirtl(String tifvirtl) {
        this.tifvirtl = tifvirtl;
    }

    public BigDecimal getTifvexrat() {
        return this.tifvexrat;
    }

    public void setTifvexrat(BigDecimal tifvexrat) {
        this.tifvexrat = tifvexrat;
    }

    public Long getTifvinamt() {
        return this.tifvinamt;
    }

    public void setTifvinamt(Long tifvinamt) {
        this.tifvinamt = tifvinamt;
    }

    public String getTifvinccy() {
        return this.tifvinccy;
    }

    public void setTifvinccy(String tifvinccy) {
        this.tifvinccy = tifvinccy;
    }

    public String getTifvins1cd() {
        return this.tifvins1cd;
    }

    public void setTifvins1cd(String tifvins1cd) {
        this.tifvins1cd = tifvins1cd;
    }

    public String getTifvins1tx() {
        return this.tifvins1tx;
    }

    public void setTifvins1tx(String tifvins1tx) {
        this.tifvins1tx = tifvins1tx;
    }

    public String getTifvins2cd() {
        return this.tifvins2cd;
    }

    public void setTifvins2cd(String tifvins2cd) {
        this.tifvins2cd = tifvins2cd;
    }

    public String getTifvins2tx() {
        return this.tifvins2tx;
    }

    public void setTifvins2tx(String tifvins2tx) {
        this.tifvins2tx = tifvins2tx;
    }

    public String getTifvins3cd() {
        return this.tifvins3cd;
    }

    public void setTifvins3cd(String tifvins3cd) {
        this.tifvins3cd = tifvins3cd;
    }

    public String getTifvins3tx() {
        return this.tifvins3tx;
    }

    public void setTifvins3tx(String tifvins3tx) {
        this.tifvins3tx = tifvins3tx;
    }

    public String getTifvins4cd() {
        return this.tifvins4cd;
    }

    public void setTifvins4cd(String tifvins4cd) {
        this.tifvins4cd = tifvins4cd;
    }

    public String getTifvins4tx() {
        return this.tifvins4tx;
    }

    public void setTifvins4tx(String tifvins4tx) {
        this.tifvins4tx = tifvins4tx;
    }

    public String getTifvins5cd() {
        return this.tifvins5cd;
    }

    public void setTifvins5cd(String tifvins5cd) {
        this.tifvins5cd = tifvins5cd;
    }

    public String getTifvins5tx() {
        return this.tifvins5tx;
    }

    public void setTifvins5tx(String tifvins5tx) {
        this.tifvins5tx = tifvins5tx;
    }

    public String getTifvins6cd() {
        return this.tifvins6cd;
    }

    public void setTifvins6cd(String tifvins6cd) {
        this.tifvins6cd = tifvins6cd;
    }

    public String getTifvins6tx() {
        return this.tifvins6tx;
    }

    public void setTifvins6tx(String tifvins6tx) {
        this.tifvins6tx = tifvins6tx;
    }

    public Long getTifvchg1am() {
        return this.tifvchg1am;
    }

    public void setTifvchg1am(Long tifvchg1am) {
        this.tifvchg1am = tifvchg1am;
    }

    public String getTifvchg1cy() {
        return this.tifvchg1cy;
    }

    public void setTifvchg1cy(String tifvchg1cy) {
        this.tifvchg1cy = tifvchg1cy;
    }

    public Long getTifvchg2am() {
        return this.tifvchg2am;
    }

    public void setTifvchg2am(Long tifvchg2am) {
        this.tifvchg2am = tifvchg2am;
    }

    public String getTifvchg2cy() {
        return this.tifvchg2cy;
    }

    public void setTifvchg2cy(String tifvchg2cy) {
        this.tifvchg2cy = tifvchg2cy;
    }

    public Long getTifvchg3am() {
        return this.tifvchg3am;
    }

    public void setTifvchg3am(Long tifvchg3am) {
        this.tifvchg3am = tifvchg3am;
    }

    public String getTifvchg3cy() {
        return this.tifvchg3cy;
    }

    public void setTifvchg3cy(String tifvchg3cy) {
        this.tifvchg3cy = tifvchg3cy;
    }

    public Long getTifvchg4am() {
        return this.tifvchg4am;
    }

    public void setTifvchg4am(Long tifvchg4am) {
        this.tifvchg4am = tifvchg4am;
    }

    public String getTifvchg4cy() {
        return this.tifvchg4cy;
    }

    public void setTifvchg4cy(String tifvchg4cy) {
        this.tifvchg4cy = tifvchg4cy;
    }

    public Long getTifvchg5am() {
        return this.tifvchg5am;
    }

    public void setTifvchg5am(Long tifvchg5am) {
        this.tifvchg5am = tifvchg5am;
    }

    public String getTifvchg5cy() {
        return this.tifvchg5cy;
    }

    public void setTifvchg5cy(String tifvchg5cy) {
        this.tifvchg5cy = tifvchg5cy;
    }

    public Long getTifvchg6am() {
        return this.tifvchg6am;
    }

    public void setTifvchg6am(Long tifvchg6am) {
        this.tifvchg6am = tifvchg6am;
    }

    public String getTifvchg6cy() {
        return this.tifvchg6cy;
    }

    public void setTifvchg6cy(String tifvchg6cy) {
        this.tifvchg6cy = tifvchg6cy;
    }

    public String getTifvregrep() {
        return this.tifvregrep;
    }

    public void setTifvregrep(String tifvregrep) {
        this.tifvregrep = tifvregrep;
    }

    public String getTifvsvclvl() {
        return this.tifvsvclvl;
    }

    public void setTifvsvclvl(String tifvsvclvl) {
        this.tifvsvclvl = tifvsvclvl;
    }

    public String getTifvtrntyp() {
        return this.tifvtrntyp;
    }

    public void setTifvtrntyp(String tifvtrntyp) {
        this.tifvtrntyp = tifvtrntyp;
    }

    public String getTifvmsgtyp() {
        return this.tifvmsgtyp;
    }

    public void setTifvmsgtyp(String tifvmsgtyp) {
        this.tifvmsgtyp = tifvmsgtyp;
    }

    public String getTifvocacc() {
        return this.tifvocacc;
    }

    public void setTifvocacc(String tifvocacc) {
        this.tifvocacc = tifvocacc;
    }

    public String getTifvs1() {
        return this.tifvs1;
    }

    public void setTifvs1(String tifvs1) {
        this.tifvs1 = tifvs1;
    }

    public String getTifvs4() {
        return this.tifvs4;
    }

    public void setTifvs4(String tifvs4) {
        this.tifvs4 = tifvs4;
    }

    public String getTifvs2() {
        return this.tifvs2;
    }

    public void setTifvs2(String tifvs2) {
        this.tifvs2 = tifvs2;
    }

    public String getTifvs3() {
        return this.tifvs3;
    }

    public void setTifvs3(String tifvs3) {
        this.tifvs3 = tifvs3;
    }

    public String getTifvocsbb() {
        return this.tifvocsbb;
    }

    public void setTifvocsbb(String tifvocsbb) {
        this.tifvocsbb = tifvocsbb;
    }

    public String getTifvocus() {
        return this.tifvocus;
    }

    public void setTifvocus(String tifvocus) {
        this.tifvocus = tifvocus;
    }

    public String getTifvoca1() {
        return this.tifvoca1;
    }

    public void setTifvoca1(String tifvoca1) {
        this.tifvoca1 = tifvoca1;
    }

    public String getTifvoca2() {
        return this.tifvoca2;
    }

    public void setTifvoca2(String tifvoca2) {
        this.tifvoca2 = tifvoca2;
    }

    public String getTifvoca3() {
        return this.tifvoca3;
    }

    public void setTifvoca3(String tifvoca3) {
        this.tifvoca3 = tifvoca3;
    }

    public String getTifvoca4() {
        return this.tifvoca4;
    }

    public void setTifvoca4(String tifvoca4) {
        this.tifvoca4 = tifvoca4;
    }

    public String getTifvoctl() {
        return this.tifvoctl;
    }

    public void setTifvoctl(String tifvoctl) {
        this.tifvoctl = tifvoctl;
    }

    public String getTifvpay() {
        return this.tifvpay;
    }

    public void setTifvpay(String tifvpay) {
        this.tifvpay = tifvpay;
    }

    public String getAccoun54() {
        return this.accoun54;
    }

    public void setAccoun54(String accoun54) {
        this.accoun54 = accoun54;
    }

    public String getTifvrcs1() {
        return this.tifvrcs1;
    }

    public void setTifvrcs1(String tifvrcs1) {
        this.tifvrcs1 = tifvrcs1;
    }

    public String getTifvrcs4() {
        return this.tifvrcs4;
    }

    public void setTifvrcs4(String tifvrcs4) {
        this.tifvrcs4 = tifvrcs4;
    }

    public String getTifvrcs2() {
        return this.tifvrcs2;
    }

    public void setTifvrcs2(String tifvrcs2) {
        this.tifvrcs2 = tifvrcs2;
    }

    public String getTifvrcs3() {
        return this.tifvrcs3;
    }

    public void setTifvrcs3(String tifvrcs3) {
        this.tifvrcs3 = tifvrcs3;
    }

    public String getTifvrcsbb() {
        return this.tifvrcsbb;
    }

    public void setTifvrcsbb(String tifvrcsbb) {
        this.tifvrcsbb = tifvrcsbb;
    }

    public String getTifvrcus() {
        return this.tifvrcus;
    }

    public void setTifvrcus(String tifvrcus) {
        this.tifvrcus = tifvrcus;
    }

    public String getTifvrca1() {
        return this.tifvrca1;
    }

    public void setTifvrca1(String tifvrca1) {
        this.tifvrca1 = tifvrca1;
    }

    public String getTifvrca2() {
        return this.tifvrca2;
    }

    public void setTifvrca2(String tifvrca2) {
        this.tifvrca2 = tifvrca2;
    }

    public String getTifvrca3() {
        return this.tifvrca3;
    }

    public void setTifvrca3(String tifvrca3) {
        this.tifvrca3 = tifvrca3;
    }

    public String getTifvrca4() {
        return this.tifvrca4;
    }

    public void setTifvrca4(String tifvrca4) {
        this.tifvrca4 = tifvrca4;
    }

    public String getTifvrctl() {
        return this.tifvrctl;
    }

    public void setTifvrctl(String tifvrctl) {
        this.tifvrctl = tifvrctl;
    }

    public String getTifvrcac() {
        return this.tifvrcac;
    }

    public void setTifvrcac(String tifvrcac) {
        this.tifvrcac = tifvrcac;
    }

    public String getFvchg() {
        return this.fvchg;
    }

    public void setFvchg(String fvchg) {
        this.fvchg = fvchg;
    }

    public String getTifvstr() {
        return this.tifvstr;
    }

    public void setTifvstr(String tifvstr) {
        this.tifvstr = tifvstr;
    }

    public String getTifvsetby() {
        return this.tifvsetby;
    }

    public void setTifvsetby(String tifvsetby) {
        this.tifvsetby = tifvsetby;
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

    public String getFvclci() {
        return this.fvclci;
    }

    public void setFvclci(String fvclci) {
        this.fvclci = fvclci;
    }

    public String getFvclc() {
        return this.fvclc;
    }

    public void setFvclc(String fvclc) {
        this.fvclc = fvclc;
    }

    public String getFvcusi() {
        return this.fvcusi;
    }

    public void setFvcusi(String fvcusi) {
        this.fvcusi = fvcusi;
    }

    public String getFvcus() {
        return this.fvcus;
    }

    public void setFvcus(String fvcus) {
        this.fvcus = fvcus;
    }

    public String getFvnr1() {
        return this.fvnr1;
    }

    public void setFvnr1(String fvnr1) {
        this.fvnr1 = fvnr1;
    }

    public String getFvnr2() {
        return this.fvnr2;
    }

    public void setFvnr2(String fvnr2) {
        this.fvnr2 = fvnr2;
    }

    public String getFvnr3() {
        return this.fvnr3;
    }

    public void setFvnr3(String fvnr3) {
        this.fvnr3 = fvnr3;
    }

    public String getFvnr4() {
        return this.fvnr4;
    }

    public void setFvnr4(String fvnr4) {
        this.fvnr4 = fvnr4;
    }

    public String getFvnr5() {
        return this.fvnr5;
    }

    public void setFvnr5(String fvnr5) {
        this.fvnr5 = fvnr5;
    }

    public String getFvnr6() {
        return this.fvnr6;
    }

    public void setFvnr6(String fvnr6) {
        this.fvnr6 = fvnr6;
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
        if (columnName.trim().equalsIgnoreCase("bank_ent"))
            return getBank_ent();
        if (columnName.trim().equalsIgnoreCase("fvbrnm"))
            return getFvbrnm();
        if (columnName.trim().equalsIgnoreCase("fvccy"))
            return getFvccy();
        if (columnName.trim().equalsIgnoreCase("fvcus1sbb"))
            return getFvcus1sbb();
        if (columnName.trim().equalsIgnoreCase("fvcus1"))
            return getFvcus1();
        if (columnName.trim().equalsIgnoreCase("fving"))
            return getFving();
        if (columnName.trim().equalsIgnoreCase("fvmvt"))
            return getFvmvt();
        if (columnName.trim().equalsIgnoreCase("fvprf"))
            return getFvprf();
        if (columnName.trim().equalsIgnoreCase("autoch53"))
            return getAutoch53();
        if (columnName.trim().equalsIgnoreCase("fvoani"))
            return getFvoani();
        if (columnName.trim().equalsIgnoreCase("cheque44"))
            return getCheque44();
        if (columnName.trim().equalsIgnoreCase("tifvcxm"))
            return getTifvcxm();
        if (columnName.trim().equalsIgnoreCase("tifvcvr"))
            return getTifvcvr();
        if (columnName.trim().equalsIgnoreCase("timecod1_1"))
            return getTimecod1_1();
        if (columnName.trim().equalsIgnoreCase("timedet1_1"))
            return getTimedet1_1();
        if (columnName.trim().equalsIgnoreCase("timecod2_1"))
            return getTimecod2_1();
        if (columnName.trim().equalsIgnoreCase("timedet2_1"))
            return getTimedet2_1();
        if (columnName.trim().equalsIgnoreCase("timecod3_1"))
            return getTimecod3_1();
        if (columnName.trim().equalsIgnoreCase("timedet3_1"))
            return getTimedet3_1();
        if (columnName.trim().equalsIgnoreCase("tifvswacc"))
            return getTifvswacc();
        if (columnName.trim().equalsIgnoreCase("fvswb"))
            return getFvswb();
        if (columnName.trim().equalsIgnoreCase("fvswbr"))
            return getFvswbr();
        if (columnName.trim().equalsIgnoreCase("fvcnas"))
            return getFvcnas();
        if (columnName.trim().equalsIgnoreCase("fvswl"))
            return getFvswl();
        if (columnName.trim().equalsIgnoreCase("fvcus1sbbi"))
            return getFvcus1sbbi();
        if (columnName.trim().equalsIgnoreCase("fvcus1i"))
            return getFvcus1i();
        if (columnName.trim().equalsIgnoreCase("fvna1"))
            return getFvna1();
        if (columnName.trim().equalsIgnoreCase("fvna2"))
            return getFvna2();
        if (columnName.trim().equalsIgnoreCase("fvna3"))
            return getFvna3();
        if (columnName.trim().equalsIgnoreCase("fvna4"))
            return getFvna4();
        if (columnName.trim().equalsIgnoreCase("fvtlit"))
            return getFvtlit();
        if (columnName.trim().equalsIgnoreCase("tifvintac"))
            return getTifvintac();
        if (columnName.trim().equalsIgnoreCase("tifvirac"))
            return getTifvirac();
        if (columnName.trim().equalsIgnoreCase("accoun72"))
            return getAccoun72();
        if (columnName.trim().equalsIgnoreCase("tifvirs1"))
            return getTifvirs1();
        if (columnName.trim().equalsIgnoreCase("tifvirs4"))
            return getTifvirs4();
        if (columnName.trim().equalsIgnoreCase("tifvirs2"))
            return getTifvirs2();
        if (columnName.trim().equalsIgnoreCase("tifvirs3"))
            return getTifvirs3();
        if (columnName.trim().equalsIgnoreCase("tifvircsbb"))
            return getTifvircsbb();
        if (columnName.trim().equalsIgnoreCase("tifvircus"))
            return getTifvircus();
        if (columnName.trim().equalsIgnoreCase("tifvira1"))
            return getTifvira1();
        if (columnName.trim().equalsIgnoreCase("tifvira2"))
            return getTifvira2();
        if (columnName.trim().equalsIgnoreCase("tifvira3"))
            return getTifvira3();
        if (columnName.trim().equalsIgnoreCase("tifvira4"))
            return getTifvira4();
        if (columnName.trim().equalsIgnoreCase("tifvirtl"))
            return getTifvirtl();
        if (columnName.trim().equalsIgnoreCase("tifvexrat"))
            return getTifvexrat();
        if (columnName.trim().equalsIgnoreCase("tifvinamt"))
            return getTifvinamt();
        if (columnName.trim().equalsIgnoreCase("tifvinccy"))
            return getTifvinccy();
        if (columnName.trim().equalsIgnoreCase("tifvins1cd"))
            return getTifvins1cd();
        if (columnName.trim().equalsIgnoreCase("tifvins1tx"))
            return getTifvins1tx();
        if (columnName.trim().equalsIgnoreCase("tifvins2cd"))
            return getTifvins2cd();
        if (columnName.trim().equalsIgnoreCase("tifvins2tx"))
            return getTifvins2tx();
        if (columnName.trim().equalsIgnoreCase("tifvins3cd"))
            return getTifvins3cd();
        if (columnName.trim().equalsIgnoreCase("tifvins3tx"))
            return getTifvins3tx();
        if (columnName.trim().equalsIgnoreCase("tifvins4cd"))
            return getTifvins4cd();
        if (columnName.trim().equalsIgnoreCase("tifvins4tx"))
            return getTifvins4tx();
        if (columnName.trim().equalsIgnoreCase("tifvins5cd"))
            return getTifvins5cd();
        if (columnName.trim().equalsIgnoreCase("tifvins5tx"))
            return getTifvins5tx();
        if (columnName.trim().equalsIgnoreCase("tifvins6cd"))
            return getTifvins6cd();
        if (columnName.trim().equalsIgnoreCase("tifvins6tx"))
            return getTifvins6tx();
        if (columnName.trim().equalsIgnoreCase("tifvchg1am"))
            return getTifvchg1am();
        if (columnName.trim().equalsIgnoreCase("tifvchg1cy"))
            return getTifvchg1cy();
        if (columnName.trim().equalsIgnoreCase("tifvchg2am"))
            return getTifvchg2am();
        if (columnName.trim().equalsIgnoreCase("tifvchg2cy"))
            return getTifvchg2cy();
        if (columnName.trim().equalsIgnoreCase("tifvchg3am"))
            return getTifvchg3am();
        if (columnName.trim().equalsIgnoreCase("tifvchg3cy"))
            return getTifvchg3cy();
        if (columnName.trim().equalsIgnoreCase("tifvchg4am"))
            return getTifvchg4am();
        if (columnName.trim().equalsIgnoreCase("tifvchg4cy"))
            return getTifvchg4cy();
        if (columnName.trim().equalsIgnoreCase("tifvchg5am"))
            return getTifvchg5am();
        if (columnName.trim().equalsIgnoreCase("tifvchg5cy"))
            return getTifvchg5cy();
        if (columnName.trim().equalsIgnoreCase("tifvchg6am"))
            return getTifvchg6am();
        if (columnName.trim().equalsIgnoreCase("tifvchg6cy"))
            return getTifvchg6cy();
        if (columnName.trim().equalsIgnoreCase("tifvregrep"))
            return getTifvregrep();
        if (columnName.trim().equalsIgnoreCase("tifvsvclvl"))
            return getTifvsvclvl();
        if (columnName.trim().equalsIgnoreCase("tifvtrntyp"))
            return getTifvtrntyp();
        if (columnName.trim().equalsIgnoreCase("tifvmsgtyp"))
            return getTifvmsgtyp();
        if (columnName.trim().equalsIgnoreCase("tifvocacc"))
            return getTifvocacc();
        if (columnName.trim().equalsIgnoreCase("tifvs1"))
            return getTifvs1();
        if (columnName.trim().equalsIgnoreCase("tifvs4"))
            return getTifvs4();
        if (columnName.trim().equalsIgnoreCase("tifvs2"))
            return getTifvs2();
        if (columnName.trim().equalsIgnoreCase("tifvs3"))
            return getTifvs3();
        if (columnName.trim().equalsIgnoreCase("tifvocsbb"))
            return getTifvocsbb();
        if (columnName.trim().equalsIgnoreCase("tifvocus"))
            return getTifvocus();
        if (columnName.trim().equalsIgnoreCase("tifvoca1"))
            return getTifvoca1();
        if (columnName.trim().equalsIgnoreCase("tifvoca2"))
            return getTifvoca2();
        if (columnName.trim().equalsIgnoreCase("tifvoca3"))
            return getTifvoca3();
        if (columnName.trim().equalsIgnoreCase("tifvoca4"))
            return getTifvoca4();
        if (columnName.trim().equalsIgnoreCase("tifvoctl"))
            return getTifvoctl();
        if (columnName.trim().equalsIgnoreCase("tifvpay"))
            return getTifvpay();
        if (columnName.trim().equalsIgnoreCase("accoun54"))
            return getAccoun54();
        if (columnName.trim().equalsIgnoreCase("tifvrcs1"))
            return getTifvrcs1();
        if (columnName.trim().equalsIgnoreCase("tifvrcs4"))
            return getTifvrcs4();
        if (columnName.trim().equalsIgnoreCase("tifvrcs2"))
            return getTifvrcs2();
        if (columnName.trim().equalsIgnoreCase("tifvrcs3"))
            return getTifvrcs3();
        if (columnName.trim().equalsIgnoreCase("tifvrcsbb"))
            return getTifvrcsbb();
        if (columnName.trim().equalsIgnoreCase("tifvrcus"))
            return getTifvrcus();
        if (columnName.trim().equalsIgnoreCase("tifvrca1"))
            return getTifvrca1();
        if (columnName.trim().equalsIgnoreCase("tifvrca2"))
            return getTifvrca2();
        if (columnName.trim().equalsIgnoreCase("tifvrca3"))
            return getTifvrca3();
        if (columnName.trim().equalsIgnoreCase("tifvrca4"))
            return getTifvrca4();
        if (columnName.trim().equalsIgnoreCase("tifvrctl"))
            return getTifvrctl();
        if (columnName.trim().equalsIgnoreCase("tifvrcac"))
            return getTifvrcac();
        if (columnName.trim().equalsIgnoreCase("fvchg"))
            return getFvchg();
        if (columnName.trim().equalsIgnoreCase("tifvstr"))
            return getTifvstr();
        if (columnName.trim().equalsIgnoreCase("tifvsetby"))
            return getTifvsetby();
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
        if (columnName.trim().equalsIgnoreCase("fvclci"))
            return getFvclci();
        if (columnName.trim().equalsIgnoreCase("fvclc"))
            return getFvclc();
        if (columnName.trim().equalsIgnoreCase("fvcusi"))
            return getFvcusi();
        if (columnName.trim().equalsIgnoreCase("fvcus"))
            return getFvcus();
        if (columnName.trim().equalsIgnoreCase("fvnr1"))
            return getFvnr1();
        if (columnName.trim().equalsIgnoreCase("fvnr2"))
            return getFvnr2();
        if (columnName.trim().equalsIgnoreCase("fvnr3"))
            return getFvnr3();
        if (columnName.trim().equalsIgnoreCase("fvnr4"))
            return getFvnr4();
        if (columnName.trim().equalsIgnoreCase("fvnr5"))
            return getFvnr5();
        if (columnName.trim().equalsIgnoreCase("fvnr6"))
            return getFvnr6();
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
            if (columnName.trim().equalsIgnoreCase("bank_ent")) {
                setBank_ent(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvbrnm")) {
                setFvbrnm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvccy")) {
                setFvccy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvcus1sbb")) {
                setFvcus1sbb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvcus1")) {
                setFvcus1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fving")) {
                setFving(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvmvt")) {
                setFvmvt(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvprf")) {
                setFvprf(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("autoch53")) {
                setAutoch53(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvoani")) {
                setFvoani(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cheque44")) {
                setCheque44(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvcxm")) {
                setTifvcxm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvcvr")) {
                setTifvcvr(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("timecod1_1")) {
                setTimecod1_1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("timedet1_1")) {
                setTimedet1_1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("timecod2_1")) {
                setTimecod2_1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("timedet2_1")) {
                setTimedet2_1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("timecod3_1")) {
                setTimecod3_1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("timedet3_1")) {
                setTimedet3_1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvswacc")) {
                setTifvswacc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvswb")) {
                setFvswb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvswbr")) {
                setFvswbr(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvcnas")) {
                setFvcnas(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvswl")) {
                setFvswl(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvcus1sbbi")) {
                setFvcus1sbbi(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvcus1i")) {
                setFvcus1i(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvna1")) {
                setFvna1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvna2")) {
                setFvna2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvna3")) {
                setFvna3(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvna4")) {
                setFvna4(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvtlit")) {
                setFvtlit(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvintac")) {
                setTifvintac(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvirac")) {
                setTifvirac(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("accoun72")) {
                setAccoun72(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvirs1")) {
                setTifvirs1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvirs4")) {
                setTifvirs4(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvirs2")) {
                setTifvirs2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvirs3")) {
                setTifvirs3(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvircsbb")) {
                setTifvircsbb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvircus")) {
                setTifvircus(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvira1")) {
                setTifvira1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvira2")) {
                setTifvira2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvira3")) {
                setTifvira3(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvira4")) {
                setTifvira4(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvirtl")) {
                setTifvirtl(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvexrat")) {
                setTifvexrat(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvinamt")) {
                setTifvinamt(CustomisationHelper.getLongFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvinccy")) {
                setTifvinccy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvins1cd")) {
                setTifvins1cd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvins1tx")) {
                setTifvins1tx(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvins2cd")) {
                setTifvins2cd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvins2tx")) {
                setTifvins2tx(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvins3cd")) {
                setTifvins3cd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvins3tx")) {
                setTifvins3tx(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvins4cd")) {
                setTifvins4cd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvins4tx")) {
                setTifvins4tx(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvins5cd")) {
                setTifvins5cd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvins5tx")) {
                setTifvins5tx(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvins6cd")) {
                setTifvins6cd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvins6tx")) {
                setTifvins6tx(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvchg1am")) {
                setTifvchg1am(CustomisationHelper.getLongFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvchg1cy")) {
                setTifvchg1cy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvchg2am")) {
                setTifvchg2am(CustomisationHelper.getLongFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvchg2cy")) {
                setTifvchg2cy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvchg3am")) {
                setTifvchg3am(CustomisationHelper.getLongFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvchg3cy")) {
                setTifvchg3cy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvchg4am")) {
                setTifvchg4am(CustomisationHelper.getLongFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvchg4cy")) {
                setTifvchg4cy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvchg5am")) {
                setTifvchg5am(CustomisationHelper.getLongFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvchg5cy")) {
                setTifvchg5cy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvchg6am")) {
                setTifvchg6am(CustomisationHelper.getLongFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvchg6cy")) {
                setTifvchg6cy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvregrep")) {
                setTifvregrep(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvsvclvl")) {
                setTifvsvclvl(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvtrntyp")) {
                setTifvtrntyp(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvmsgtyp")) {
                setTifvmsgtyp(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvocacc")) {
                setTifvocacc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvs1")) {
                setTifvs1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvs4")) {
                setTifvs4(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvs2")) {
                setTifvs2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvs3")) {
                setTifvs3(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvocsbb")) {
                setTifvocsbb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvocus")) {
                setTifvocus(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvoca1")) {
                setTifvoca1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvoca2")) {
                setTifvoca2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvoca3")) {
                setTifvoca3(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvoca4")) {
                setTifvoca4(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvoctl")) {
                setTifvoctl(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvpay")) {
                setTifvpay(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("accoun54")) {
                setAccoun54(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvrcs1")) {
                setTifvrcs1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvrcs4")) {
                setTifvrcs4(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvrcs2")) {
                setTifvrcs2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvrcs3")) {
                setTifvrcs3(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvrcsbb")) {
                setTifvrcsbb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvrcus")) {
                setTifvrcus(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvrca1")) {
                setTifvrca1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvrca2")) {
                setTifvrca2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvrca3")) {
                setTifvrca3(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvrca4")) {
                setTifvrca4(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvrctl")) {
                setTifvrctl(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvrcac")) {
                setTifvrcac(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvchg")) {
                setFvchg(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvstr")) {
                setTifvstr(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tifvsetby")) {
                setTifvsetby(value);
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
            if (columnName.trim().equalsIgnoreCase("fvclci")) {
                setFvclci(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvclc")) {
                setFvclc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvcusi")) {
                setFvcusi(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvcus")) {
                setFvcus(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvnr1")) {
                setFvnr1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvnr2")) {
                setFvnr2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvnr3")) {
                setFvnr3(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvnr4")) {
                setFvnr4(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvnr5")) {
                setFvnr5(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fvnr6")) {
                setFvnr6(value);
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