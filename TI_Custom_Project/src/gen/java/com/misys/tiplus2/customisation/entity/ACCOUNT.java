package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class ACCOUNT extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(ACCOUNT.class);

    /**
     * Primary Key
     */

    public static class Key_ACCOUNT {

        private String acct_key;
 
        public String getAcct_key() {
            return this.acct_key;
        }
        public void setAcct_key(String acct_key) {
           this.acct_key = acct_key;
        }  

     }

    private Key_ACCOUNT $key = new Key_ACCOUNT();

    public Key_ACCOUNT get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private Integer typeflag;
    private Integer tstamp;
    private Integer acc_seqno;
    private String acc_type;
    private String bo_acctno;
    private String brch_mnm;
    private String category;
    private String contingent;
    private String country;
    private String cus_sbb;
    private String cus_mnm;
    private Date dateclosed;
    private Date date_dwnl;
    private Date datemaint;
    private Date dateopened;
    private String descr1;
    private String descr2;
    private String ext_acctno;
    private String iban;
    private String intrnal;
    private String mnt_in_bo;
    private String other_ccy;
    private String currency;
    private String shortname;
 
    /**
     * Getters/Setters members 
     */   
    public String getAcct_key() {
        return this.$key.acct_key;
    }

    public void setAcct_key(String acct_key) {
        this.$key.acct_key = acct_key;
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

    public Integer getAcc_seqno() {
        return this.acc_seqno;
    }

    public void setAcc_seqno(Integer acc_seqno) {
        this.acc_seqno = acc_seqno;
    }

    public String getAcc_type() {
        return this.acc_type;
    }

    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }

    public String getBo_acctno() {
        return this.bo_acctno;
    }

    public void setBo_acctno(String bo_acctno) {
        this.bo_acctno = bo_acctno;
    }

    public String getBrch_mnm() {
        return this.brch_mnm;
    }

    public void setBrch_mnm(String brch_mnm) {
        this.brch_mnm = brch_mnm;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContingent() {
        return this.contingent;
    }

    public void setContingent(String contingent) {
        this.contingent = contingent;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCus_sbb() {
        return this.cus_sbb;
    }

    public void setCus_sbb(String cus_sbb) {
        this.cus_sbb = cus_sbb;
    }

    public String getCus_mnm() {
        return this.cus_mnm;
    }

    public void setCus_mnm(String cus_mnm) {
        this.cus_mnm = cus_mnm;
    }

    public Date getDateclosed() {
        return this.dateclosed;
    }

    public void setDateclosed(Date dateclosed) {
        this.dateclosed = dateclosed;
    }

    public Date getDate_dwnl() {
        return this.date_dwnl;
    }

    public void setDate_dwnl(Date date_dwnl) {
        this.date_dwnl = date_dwnl;
    }

    public Date getDatemaint() {
        return this.datemaint;
    }

    public void setDatemaint(Date datemaint) {
        this.datemaint = datemaint;
    }

    public Date getDateopened() {
        return this.dateopened;
    }

    public void setDateopened(Date dateopened) {
        this.dateopened = dateopened;
    }

    public String getDescr1() {
        return this.descr1;
    }

    public void setDescr1(String descr1) {
        this.descr1 = descr1;
    }

    public String getDescr2() {
        return this.descr2;
    }

    public void setDescr2(String descr2) {
        this.descr2 = descr2;
    }

    public String getExt_acctno() {
        return this.ext_acctno;
    }

    public void setExt_acctno(String ext_acctno) {
        this.ext_acctno = ext_acctno;
    }

    public String getIban() {
        return this.iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getIntrnal() {
        return this.intrnal;
    }

    public void setIntrnal(String intrnal) {
        this.intrnal = intrnal;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getOther_ccy() {
        return this.other_ccy;
    }

    public void setOther_ccy(String other_ccy) {
        this.other_ccy = other_ccy;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getShortname() {
        return this.shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("acct_key"))
            return getAcct_key();
        if (columnName.trim().equalsIgnoreCase("typeflag"))
            return getTypeflag();
        if (columnName.trim().equalsIgnoreCase("tstamp"))
            return getTstamp();
        if (columnName.trim().equalsIgnoreCase("acc_seqno"))
            return getAcc_seqno();
        if (columnName.trim().equalsIgnoreCase("acc_type"))
            return getAcc_type();
        if (columnName.trim().equalsIgnoreCase("bo_acctno"))
            return getBo_acctno();
        if (columnName.trim().equalsIgnoreCase("brch_mnm"))
            return getBrch_mnm();
        if (columnName.trim().equalsIgnoreCase("category"))
            return getCategory();
        if (columnName.trim().equalsIgnoreCase("contingent"))
            return getContingent();
        if (columnName.trim().equalsIgnoreCase("country"))
            return getCountry();
        if (columnName.trim().equalsIgnoreCase("cus_sbb"))
            return getCus_sbb();
        if (columnName.trim().equalsIgnoreCase("cus_mnm"))
            return getCus_mnm();
        if (columnName.trim().equalsIgnoreCase("dateclosed"))
            return getDateclosed();
        if (columnName.trim().equalsIgnoreCase("date_dwnl"))
            return getDate_dwnl();
        if (columnName.trim().equalsIgnoreCase("datemaint"))
            return getDatemaint();
        if (columnName.trim().equalsIgnoreCase("dateopened"))
            return getDateopened();
        if (columnName.trim().equalsIgnoreCase("descr1"))
            return getDescr1();
        if (columnName.trim().equalsIgnoreCase("descr2"))
            return getDescr2();
        if (columnName.trim().equalsIgnoreCase("ext_acctno"))
            return getExt_acctno();
        if (columnName.trim().equalsIgnoreCase("iban"))
            return getIban();
        if (columnName.trim().equalsIgnoreCase("intrnal"))
            return getIntrnal();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("other_ccy"))
            return getOther_ccy();
        if (columnName.trim().equalsIgnoreCase("currency"))
            return getCurrency();
        if (columnName.trim().equalsIgnoreCase("shortname"))
            return getShortname();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("acct_key")) {
                setAcct_key(value);
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
            if (columnName.trim().equalsIgnoreCase("acc_seqno")) {
                setAcc_seqno(CustomisationHelper.getIntegerFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("acc_type")) {
                setAcc_type(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("bo_acctno")) {
                setBo_acctno(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("brch_mnm")) {
                setBrch_mnm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("category")) {
                setCategory(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("contingent")) {
                setContingent(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("country")) {
                setCountry(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cus_sbb")) {
                setCus_sbb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cus_mnm")) {
                setCus_mnm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("dateclosed")) {
                setDateclosed(CustomisationHelper.getDateFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("date_dwnl")) {
                setDate_dwnl(CustomisationHelper.getDateFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("datemaint")) {
                setDatemaint(CustomisationHelper.getDateFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("dateopened")) {
                setDateopened(CustomisationHelper.getDateFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("descr1")) {
                setDescr1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("descr2")) {
                setDescr2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("ext_acctno")) {
                setExt_acctno(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("iban")) {
                setIban(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("intrnal")) {
                setIntrnal(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("other_ccy")) {
                setOther_ccy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("currency")) {
                setCurrency(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("shortname")) {
                setShortname(value);
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