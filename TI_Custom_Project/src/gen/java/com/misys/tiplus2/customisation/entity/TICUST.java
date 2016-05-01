package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class TICUST extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(TICUST.class);

    /**
     * Primary Key
     */

    public static class Key_TICUST {

        private Long key97;
 
        public Long getKey97() {
            return this.key97;
        }
        public void setKey97(Long key97) {
           this.key97 = key97;
        }  

     }

    private Key_TICUST $key = new Key_TICUST();

    public Key_TICUST get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private Integer typeflag;
    private Integer tstamp;
    private String int_consol;
    private String timt103_c;
    private String taxexem;
    private String fxrchrg;
    private Long chrg_grp;
    private Long corpaccess;
    private String custsbb;
    private String custmnm;
    private Long cutoff_amt;
    private String cutoff_ccy;
    private String cutoff_rcd;
    private Long extfield;
    private String mnt_in_bo;
    private String fxrprin;
    private String swackreqd;
    private String instrs;
    private String suspend_bo;
    private String suspend_ti;
    private String translit;
    private String workg;
    private String gateway;
 
    /**
     * Getters/Setters members 
     */   
    public Long getKey97() {
        return this.$key.key97;
    }

    public void setKey97(Long key97) {
        this.$key.key97 = key97;
    }

     public Integer getTypeflag() {
        return this.typeflag;
    }

    public void setTypeflag(Integer typeflag) {
        this.typeflag = typeflag;
    }

    public Integer getTstamp() {
        return this.tstamp;
    }

    public void setTstamp(Integer tstamp) {
        this.tstamp = tstamp;
    }

    public String getInt_consol() {
        return this.int_consol;
    }

    public void setInt_consol(String int_consol) {
        this.int_consol = int_consol;
    }

    public String getTimt103_c() {
        return this.timt103_c;
    }

    public void setTimt103_c(String timt103_c) {
        this.timt103_c = timt103_c;
    }

    public String getTaxexem() {
        return this.taxexem;
    }

    public void setTaxexem(String taxexem) {
        this.taxexem = taxexem;
    }

    public String getFxrchrg() {
        return this.fxrchrg;
    }

    public void setFxrchrg(String fxrchrg) {
        this.fxrchrg = fxrchrg;
    }

    public Long getChrg_grp() {
        return this.chrg_grp;
    }

    public void setChrg_grp(Long chrg_grp) {
        this.chrg_grp = chrg_grp;
    }

    public Long getCorpaccess() {
        return this.corpaccess;
    }

    public void setCorpaccess(Long corpaccess) {
        this.corpaccess = corpaccess;
    }

    public String getCustsbb() {
        return this.custsbb;
    }

    public void setCustsbb(String custsbb) {
        this.custsbb = custsbb;
    }

    public String getCustmnm() {
        return this.custmnm;
    }

    public void setCustmnm(String custmnm) {
        this.custmnm = custmnm;
    }

    public Long getCutoff_amt() {
        return this.cutoff_amt;
    }

    public void setCutoff_amt(Long cutoff_amt) {
        this.cutoff_amt = cutoff_amt;
    }

    public String getCutoff_ccy() {
        return this.cutoff_ccy;
    }

    public void setCutoff_ccy(String cutoff_ccy) {
        this.cutoff_ccy = cutoff_ccy;
    }

    public String getCutoff_rcd() {
        return this.cutoff_rcd;
    }

    public void setCutoff_rcd(String cutoff_rcd) {
        this.cutoff_rcd = cutoff_rcd;
    }

    public Long getExtfield() {
        return this.extfield;
    }

    public void setExtfield(Long extfield) {
        this.extfield = extfield;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getFxrprin() {
        return this.fxrprin;
    }

    public void setFxrprin(String fxrprin) {
        this.fxrprin = fxrprin;
    }

    public String getSwackreqd() {
        return this.swackreqd;
    }

    public void setSwackreqd(String swackreqd) {
        this.swackreqd = swackreqd;
    }

    public String getInstrs() {
        return this.instrs;
    }

    public void setInstrs(String instrs) {
        this.instrs = instrs;
    }

    public String getSuspend_bo() {
        return this.suspend_bo;
    }

    public void setSuspend_bo(String suspend_bo) {
        this.suspend_bo = suspend_bo;
    }

    public String getSuspend_ti() {
        return this.suspend_ti;
    }

    public void setSuspend_ti(String suspend_ti) {
        this.suspend_ti = suspend_ti;
    }

    public String getTranslit() {
        return this.translit;
    }

    public void setTranslit(String translit) {
        this.translit = translit;
    }

    public String getWorkg() {
        return this.workg;
    }

    public void setWorkg(String workg) {
        this.workg = workg;
    }

    public String getGateway() {
        return this.gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("key97"))
            return getKey97();
        if (columnName.trim().equalsIgnoreCase("typeflag"))
            return getTypeflag();
        if (columnName.trim().equalsIgnoreCase("tstamp"))
            return getTstamp();
        if (columnName.trim().equalsIgnoreCase("int_consol"))
            return getInt_consol();
        if (columnName.trim().equalsIgnoreCase("timt103_c"))
            return getTimt103_c();
        if (columnName.trim().equalsIgnoreCase("taxexem"))
            return getTaxexem();
        if (columnName.trim().equalsIgnoreCase("fxrchrg"))
            return getFxrchrg();
        if (columnName.trim().equalsIgnoreCase("chrg_grp"))
            return getChrg_grp();
        if (columnName.trim().equalsIgnoreCase("corpaccess"))
            return getCorpaccess();
        if (columnName.trim().equalsIgnoreCase("custsbb"))
            return getCustsbb();
        if (columnName.trim().equalsIgnoreCase("custmnm"))
            return getCustmnm();
        if (columnName.trim().equalsIgnoreCase("cutoff_amt"))
            return getCutoff_amt();
        if (columnName.trim().equalsIgnoreCase("cutoff_ccy"))
            return getCutoff_ccy();
        if (columnName.trim().equalsIgnoreCase("cutoff_rcd"))
            return getCutoff_rcd();
        if (columnName.trim().equalsIgnoreCase("extfield"))
            return getExtfield();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("fxrprin"))
            return getFxrprin();
        if (columnName.trim().equalsIgnoreCase("swackreqd"))
            return getSwackreqd();
        if (columnName.trim().equalsIgnoreCase("instrs"))
            return getInstrs();
        if (columnName.trim().equalsIgnoreCase("suspend_bo"))
            return getSuspend_bo();
        if (columnName.trim().equalsIgnoreCase("suspend_ti"))
            return getSuspend_ti();
        if (columnName.trim().equalsIgnoreCase("translit"))
            return getTranslit();
        if (columnName.trim().equalsIgnoreCase("workg"))
            return getWorkg();
        if (columnName.trim().equalsIgnoreCase("gateway"))
            return getGateway();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("key97")) {
                setKey97(CustomisationHelper.getLongFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("typeflag")) {
                setTypeflag(CustomisationHelper.getIntegerFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tstamp")) {
                setTstamp(CustomisationHelper.getIntegerFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("int_consol")) {
                setInt_consol(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("timt103_c")) {
                setTimt103_c(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("taxexem")) {
                setTaxexem(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fxrchrg")) {
                setFxrchrg(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("chrg_grp")) {
                setChrg_grp(CustomisationHelper.getLongFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("corpaccess")) {
                setCorpaccess(CustomisationHelper.getLongFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("custsbb")) {
                setCustsbb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("custmnm")) {
                setCustmnm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cutoff_amt")) {
                setCutoff_amt(CustomisationHelper.getLongFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cutoff_ccy")) {
                setCutoff_ccy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cutoff_rcd")) {
                setCutoff_rcd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("extfield")) {
                setExtfield(CustomisationHelper.getLongFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fxrprin")) {
                setFxrprin(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("swackreqd")) {
                setSwackreqd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("instrs")) {
                setInstrs(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("suspend_bo")) {
                setSuspend_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("suspend_ti")) {
                setSuspend_ti(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("translit")) {
                setTranslit(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("workg")) {
                setWorkg(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("gateway")) {
                setGateway(value);
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