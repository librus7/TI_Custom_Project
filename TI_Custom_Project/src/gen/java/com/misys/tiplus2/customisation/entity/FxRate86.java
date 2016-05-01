package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class FxRate86 extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(FxRate86.class);

    /**
     * Primary Key
     */

    public static class Key_FxRate86 {

        private String branch;
        private String code53;
        private String curren49;
 
        public String getBranch() {
            return this.branch;
        }
        public void setBranch(String branch) {
           this.branch = branch;
        }  

        public String getCode53() {
            return this.code53;
        }
        public void setCode53(String code53) {
           this.code53 = code53;
        }  

        public String getCurren49() {
            return this.curren49;
        }
        public void setCurren49(String curren49) {
           this.curren49 = curren49;
        }  

     }

    private Key_FxRate86 $key = new Key_FxRate86();

    public Key_FxRate86 get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private Integer typeflag;
    private Integer tstamp;
    private BigDecimal buyexc03;
    private BigDecimal buyperspd;
    private String buyexby;
    private BigDecimal buyspr07;
    private String mnt_in_bo;
    private BigDecimal sellex99;
    private BigDecimal sellperspd;
    private String sellexby;
    private BigDecimal sellsp03;
 
    /**
     * Getters/Setters members 
     */   
    public String getBranch() {
        return this.$key.branch;
    }

    public void setBranch(String branch) {
        this.$key.branch = branch;
    }

    public String getCode53() {
        return this.$key.code53;
    }

    public void setCode53(String code53) {
        this.$key.code53 = code53;
    }

    public String getCurren49() {
        return this.$key.curren49;
    }

    public void setCurren49(String curren49) {
        this.$key.curren49 = curren49;
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

    public BigDecimal getBuyexc03() {
        return this.buyexc03;
    }

    public void setBuyexc03(BigDecimal buyexc03) {
        this.buyexc03 = buyexc03;
    }

    public BigDecimal getBuyperspd() {
        return this.buyperspd;
    }

    public void setBuyperspd(BigDecimal buyperspd) {
        this.buyperspd = buyperspd;
    }

    public String getBuyexby() {
        return this.buyexby;
    }

    public void setBuyexby(String buyexby) {
        this.buyexby = buyexby;
    }

    public BigDecimal getBuyspr07() {
        return this.buyspr07;
    }

    public void setBuyspr07(BigDecimal buyspr07) {
        this.buyspr07 = buyspr07;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public BigDecimal getSellex99() {
        return this.sellex99;
    }

    public void setSellex99(BigDecimal sellex99) {
        this.sellex99 = sellex99;
    }

    public BigDecimal getSellperspd() {
        return this.sellperspd;
    }

    public void setSellperspd(BigDecimal sellperspd) {
        this.sellperspd = sellperspd;
    }

    public String getSellexby() {
        return this.sellexby;
    }

    public void setSellexby(String sellexby) {
        this.sellexby = sellexby;
    }

    public BigDecimal getSellsp03() {
        return this.sellsp03;
    }

    public void setSellsp03(BigDecimal sellsp03) {
        this.sellsp03 = sellsp03;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("branch"))
            return getBranch();
        if (columnName.trim().equalsIgnoreCase("code53"))
            return getCode53();
        if (columnName.trim().equalsIgnoreCase("curren49"))
            return getCurren49();
        if (columnName.trim().equalsIgnoreCase("typeflag"))
            return getTypeflag();
        if (columnName.trim().equalsIgnoreCase("tstamp"))
            return getTstamp();
        if (columnName.trim().equalsIgnoreCase("buyexc03"))
            return getBuyexc03();
        if (columnName.trim().equalsIgnoreCase("buyperspd"))
            return getBuyperspd();
        if (columnName.trim().equalsIgnoreCase("buyexby"))
            return getBuyexby();
        if (columnName.trim().equalsIgnoreCase("buyspr07"))
            return getBuyspr07();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("sellex99"))
            return getSellex99();
        if (columnName.trim().equalsIgnoreCase("sellperspd"))
            return getSellperspd();
        if (columnName.trim().equalsIgnoreCase("sellexby"))
            return getSellexby();
        if (columnName.trim().equalsIgnoreCase("sellsp03"))
            return getSellsp03();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("branch")) {
                setBranch(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("code53")) {
                setCode53(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("curren49")) {
                setCurren49(value);
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
            if (columnName.trim().equalsIgnoreCase("buyexc03")) {
                setBuyexc03(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("buyperspd")) {
                setBuyperspd(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("buyexby")) {
                setBuyexby(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("buyspr07")) {
                setBuyspr07(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sellex99")) {
                setSellex99(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sellperspd")) {
                setSellperspd(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sellexby")) {
                setSellexby(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("sellsp03")) {
                setSellsp03(CustomisationHelper.getBigDecimalFromString(value));
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