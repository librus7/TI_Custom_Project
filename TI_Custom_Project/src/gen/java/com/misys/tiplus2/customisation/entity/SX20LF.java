package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class SX20LF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(SX20LF.class);

    /**
     * Primary Key
     */

    public static class Key_SX20LF {

        private Long addrtype;
        private Integer sequence;
        private String sxcus1_sbb;
        private String sxcus1;
 
        public Long getAddrtype() {
            return this.addrtype;
        }
        public void setAddrtype(Long addrtype) {
           this.addrtype = addrtype;
        }  

        public Integer getSequence() {
            return this.sequence;
        }
        public void setSequence(Integer sequence) {
           this.sequence = sequence;
        }  

        public String getSxcus1_sbb() {
            return this.sxcus1_sbb;
        }
        public void setSxcus1_sbb(String sxcus1_sbb) {
           this.sxcus1_sbb = sxcus1_sbb;
        }  

        public String getSxcus1() {
            return this.sxcus1;
        }
        public void setSxcus1(String sxcus1) {
           this.sxcus1 = sxcus1;
        }  

     }

    private Key_SX20LF $key = new Key_SX20LF();

    public Key_SX20LF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String addr_sbb;
    private String addressee;
    private Integer numcopies;
    private Integer numdups;
    private Integer numorig;
    private String sendintern;
    private String email;
    private String svfax;
    private String mnt_in_bo;
    private String svnaff;
    private String svna2;
    private String svna3;
    private String svna4;
    private String svna5;
    private String svna1;
    private String svphn;
    private String svcsa;
    private String source;
    private String svtlx;
    private String svc08;
    private String svxm;
    private String svpzip;
    private String svlnm;
    private String svswb;
    private String svswbr;
    private String svcnas;
    private String svswl;
 
    /**
     * Getters/Setters members 
     */   
    public Long getAddrtype() {
        return this.$key.addrtype;
    }

    public void setAddrtype(Long addrtype) {
        this.$key.addrtype = addrtype;
    }

    public Integer getSequence() {
        return this.$key.sequence;
    }

    public void setSequence(Integer sequence) {
        this.$key.sequence = sequence;
    }

    public String getSxcus1_sbb() {
        return this.$key.sxcus1_sbb;
    }

    public void setSxcus1_sbb(String sxcus1_sbb) {
        this.$key.sxcus1_sbb = sxcus1_sbb;
    }

    public String getSxcus1() {
        return this.$key.sxcus1;
    }

    public void setSxcus1(String sxcus1) {
        this.$key.sxcus1 = sxcus1;
    }

     public String getAddr_sbb() {
        return this.addr_sbb;
    }

    public void setAddr_sbb(String addr_sbb) {
        this.addr_sbb = addr_sbb;
    }

    public String getAddressee() {
        return this.addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public Integer getNumcopies() {
        return this.numcopies;
    }

    public void setNumcopies(Integer numcopies) {
        this.numcopies = numcopies;
    }

    public Integer getNumdups() {
        return this.numdups;
    }

    public void setNumdups(Integer numdups) {
        this.numdups = numdups;
    }

    public Integer getNumorig() {
        return this.numorig;
    }

    public void setNumorig(Integer numorig) {
        this.numorig = numorig;
    }

    public String getSendintern() {
        return this.sendintern;
    }

    public void setSendintern(String sendintern) {
        this.sendintern = sendintern;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSvfax() {
        return this.svfax;
    }

    public void setSvfax(String svfax) {
        this.svfax = svfax;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getSvnaff() {
        return this.svnaff;
    }

    public void setSvnaff(String svnaff) {
        this.svnaff = svnaff;
    }

    public String getSvna2() {
        return this.svna2;
    }

    public void setSvna2(String svna2) {
        this.svna2 = svna2;
    }

    public String getSvna3() {
        return this.svna3;
    }

    public void setSvna3(String svna3) {
        this.svna3 = svna3;
    }

    public String getSvna4() {
        return this.svna4;
    }

    public void setSvna4(String svna4) {
        this.svna4 = svna4;
    }

    public String getSvna5() {
        return this.svna5;
    }

    public void setSvna5(String svna5) {
        this.svna5 = svna5;
    }

    public String getSvna1() {
        return this.svna1;
    }

    public void setSvna1(String svna1) {
        this.svna1 = svna1;
    }

    public String getSvphn() {
        return this.svphn;
    }

    public void setSvphn(String svphn) {
        this.svphn = svphn;
    }

    public String getSvcsa() {
        return this.svcsa;
    }

    public void setSvcsa(String svcsa) {
        this.svcsa = svcsa;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSvtlx() {
        return this.svtlx;
    }

    public void setSvtlx(String svtlx) {
        this.svtlx = svtlx;
    }

    public String getSvc08() {
        return this.svc08;
    }

    public void setSvc08(String svc08) {
        this.svc08 = svc08;
    }

    public String getSvxm() {
        return this.svxm;
    }

    public void setSvxm(String svxm) {
        this.svxm = svxm;
    }

    public String getSvpzip() {
        return this.svpzip;
    }

    public void setSvpzip(String svpzip) {
        this.svpzip = svpzip;
    }

    public String getSvlnm() {
        return this.svlnm;
    }

    public void setSvlnm(String svlnm) {
        this.svlnm = svlnm;
    }

    public String getSvswb() {
        return this.svswb;
    }

    public void setSvswb(String svswb) {
        this.svswb = svswb;
    }

    public String getSvswbr() {
        return this.svswbr;
    }

    public void setSvswbr(String svswbr) {
        this.svswbr = svswbr;
    }

    public String getSvcnas() {
        return this.svcnas;
    }

    public void setSvcnas(String svcnas) {
        this.svcnas = svcnas;
    }

    public String getSvswl() {
        return this.svswl;
    }

    public void setSvswl(String svswl) {
        this.svswl = svswl;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("addrtype"))
            return getAddrtype();
        if (columnName.trim().equalsIgnoreCase("sequence"))
            return getSequence();
        if (columnName.trim().equalsIgnoreCase("sxcus1_sbb"))
            return getSxcus1_sbb();
        if (columnName.trim().equalsIgnoreCase("sxcus1"))
            return getSxcus1();
        if (columnName.trim().equalsIgnoreCase("addr_sbb"))
            return getAddr_sbb();
        if (columnName.trim().equalsIgnoreCase("addressee"))
            return getAddressee();
        if (columnName.trim().equalsIgnoreCase("numcopies"))
            return getNumcopies();
        if (columnName.trim().equalsIgnoreCase("numdups"))
            return getNumdups();
        if (columnName.trim().equalsIgnoreCase("numorig"))
            return getNumorig();
        if (columnName.trim().equalsIgnoreCase("sendintern"))
            return getSendintern();
        if (columnName.trim().equalsIgnoreCase("email"))
            return getEmail();
        if (columnName.trim().equalsIgnoreCase("svfax"))
            return getSvfax();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("svnaff"))
            return getSvnaff();
        if (columnName.trim().equalsIgnoreCase("svna2"))
            return getSvna2();
        if (columnName.trim().equalsIgnoreCase("svna3"))
            return getSvna3();
        if (columnName.trim().equalsIgnoreCase("svna4"))
            return getSvna4();
        if (columnName.trim().equalsIgnoreCase("svna5"))
            return getSvna5();
        if (columnName.trim().equalsIgnoreCase("svna1"))
            return getSvna1();
        if (columnName.trim().equalsIgnoreCase("svphn"))
            return getSvphn();
        if (columnName.trim().equalsIgnoreCase("svcsa"))
            return getSvcsa();
        if (columnName.trim().equalsIgnoreCase("source"))
            return getSource();
        if (columnName.trim().equalsIgnoreCase("svtlx"))
            return getSvtlx();
        if (columnName.trim().equalsIgnoreCase("svc08"))
            return getSvc08();
        if (columnName.trim().equalsIgnoreCase("svxm"))
            return getSvxm();
        if (columnName.trim().equalsIgnoreCase("svpzip"))
            return getSvpzip();
        if (columnName.trim().equalsIgnoreCase("svlnm"))
            return getSvlnm();
        if (columnName.trim().equalsIgnoreCase("svswb"))
            return getSvswb();
        if (columnName.trim().equalsIgnoreCase("svswbr"))
            return getSvswbr();
        if (columnName.trim().equalsIgnoreCase("svcnas"))
            return getSvcnas();
        if (columnName.trim().equalsIgnoreCase("svswl"))
            return getSvswl();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("addrtype")) {
                setAddrtype(CustomisationHelper.getLongFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sequence")) {
                setSequence(CustomisationHelper.getIntegerFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sxcus1_sbb")) {
                setSxcus1_sbb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sxcus1")) {
                setSxcus1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("addr_sbb")) {
                setAddr_sbb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("addressee")) {
                setAddressee(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("numcopies")) {
                setNumcopies(CustomisationHelper.getIntegerFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("numdups")) {
                setNumdups(CustomisationHelper.getIntegerFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("numorig")) {
                setNumorig(CustomisationHelper.getIntegerFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sendintern")) {
                setSendintern(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("email")) {
                setEmail(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svfax")) {
                setSvfax(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svnaff")) {
                setSvnaff(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svna2")) {
                setSvna2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svna3")) {
                setSvna3(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svna4")) {
                setSvna4(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svna5")) {
                setSvna5(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svna1")) {
                setSvna1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svphn")) {
                setSvphn(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svcsa")) {
                setSvcsa(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("source")) {
                setSource(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svtlx")) {
                setSvtlx(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svc08")) {
                setSvc08(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svxm")) {
                setSvxm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svpzip")) {
                setSvpzip(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svlnm")) {
                setSvlnm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svswb")) {
                setSvswb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svswbr")) {
                setSvswbr(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svcnas")) {
                setSvcnas(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("svswl")) {
                setSvswl(value);
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