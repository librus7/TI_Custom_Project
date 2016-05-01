package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class C8PF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(C8PF.class);

    /**
     * Primary Key
     */

    public static class Key_C8PF {

        private String c8ccy;
 
        public String getC8ccy() {
            return this.c8ccy;
        }
        public void setC8ccy(String c8ccy) {
           this.c8ccy = c8ccy;
        }  

     }

    private Key_C8PF $key = new Key_C8PF();

    public Key_C8PF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String c8rfi;
    private String c8bsei;
    private BigDecimal c8bspt;
    private String c8psei;
    private BigDecimal c8pspt;
    private String c8grp;
    private String c8mbr;
    private String mnt_in_bo;
    private String c8mcd;
    private Integer c8nu1o;
    private Integer c8nu1s;
    private String c8dfc;
    private String c8idbc;
    private String c8idbd;
    private String c8ced;
    private String c8cur;
    private String c8itc;
    private String c8ccyn;
    private String c8sei;
    private BigDecimal c8spt;
    private String c8sri;
    private String c8scy;
 
    /**
     * Getters/Setters members 
     */   
    public String getC8ccy() {
        return this.$key.c8ccy;
    }

    public void setC8ccy(String c8ccy) {
        this.$key.c8ccy = c8ccy;
    }

     public String getC8rfi() {
        return this.c8rfi;
    }

    public void setC8rfi(String c8rfi) {
        this.c8rfi = c8rfi;
    }

    public String getC8bsei() {
        return this.c8bsei;
    }

    public void setC8bsei(String c8bsei) {
        this.c8bsei = c8bsei;
    }

    public BigDecimal getC8bspt() {
        return this.c8bspt;
    }

    public void setC8bspt(BigDecimal c8bspt) {
        this.c8bspt = c8bspt;
    }

    public String getC8psei() {
        return this.c8psei;
    }

    public void setC8psei(String c8psei) {
        this.c8psei = c8psei;
    }

    public BigDecimal getC8pspt() {
        return this.c8pspt;
    }

    public void setC8pspt(BigDecimal c8pspt) {
        this.c8pspt = c8pspt;
    }

    public String getC8grp() {
        return this.c8grp;
    }

    public void setC8grp(String c8grp) {
        this.c8grp = c8grp;
    }

    public String getC8mbr() {
        return this.c8mbr;
    }

    public void setC8mbr(String c8mbr) {
        this.c8mbr = c8mbr;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getC8mcd() {
        return this.c8mcd;
    }

    public void setC8mcd(String c8mcd) {
        this.c8mcd = c8mcd;
    }

    public Integer getC8nu1o() {
        return this.c8nu1o;
    }

    public void setC8nu1o(Integer c8nu1o) {
        this.c8nu1o = c8nu1o;
    }

    public Integer getC8nu1s() {
        return this.c8nu1s;
    }

    public void setC8nu1s(Integer c8nu1s) {
        this.c8nu1s = c8nu1s;
    }

    public String getC8dfc() {
        return this.c8dfc;
    }

    public void setC8dfc(String c8dfc) {
        this.c8dfc = c8dfc;
    }

    public String getC8idbc() {
        return this.c8idbc;
    }

    public void setC8idbc(String c8idbc) {
        this.c8idbc = c8idbc;
    }

    public String getC8idbd() {
        return this.c8idbd;
    }

    public void setC8idbd(String c8idbd) {
        this.c8idbd = c8idbd;
    }

    public String getC8ced() {
        return this.c8ced;
    }

    public void setC8ced(String c8ced) {
        this.c8ced = c8ced;
    }

    public String getC8cur() {
        return this.c8cur;
    }

    public void setC8cur(String c8cur) {
        this.c8cur = c8cur;
    }

    public String getC8itc() {
        return this.c8itc;
    }

    public void setC8itc(String c8itc) {
        this.c8itc = c8itc;
    }

    public String getC8ccyn() {
        return this.c8ccyn;
    }

    public void setC8ccyn(String c8ccyn) {
        this.c8ccyn = c8ccyn;
    }

    public String getC8sei() {
        return this.c8sei;
    }

    public void setC8sei(String c8sei) {
        this.c8sei = c8sei;
    }

    public BigDecimal getC8spt() {
        return this.c8spt;
    }

    public void setC8spt(BigDecimal c8spt) {
        this.c8spt = c8spt;
    }

    public String getC8sri() {
        return this.c8sri;
    }

    public void setC8sri(String c8sri) {
        this.c8sri = c8sri;
    }

    public String getC8scy() {
        return this.c8scy;
    }

    public void setC8scy(String c8scy) {
        this.c8scy = c8scy;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("c8ccy"))
            return getC8ccy();
        if (columnName.trim().equalsIgnoreCase("c8rfi"))
            return getC8rfi();
        if (columnName.trim().equalsIgnoreCase("c8bsei"))
            return getC8bsei();
        if (columnName.trim().equalsIgnoreCase("c8bspt"))
            return getC8bspt();
        if (columnName.trim().equalsIgnoreCase("c8psei"))
            return getC8psei();
        if (columnName.trim().equalsIgnoreCase("c8pspt"))
            return getC8pspt();
        if (columnName.trim().equalsIgnoreCase("c8grp"))
            return getC8grp();
        if (columnName.trim().equalsIgnoreCase("c8mbr"))
            return getC8mbr();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("c8mcd"))
            return getC8mcd();
        if (columnName.trim().equalsIgnoreCase("c8nu1o"))
            return getC8nu1o();
        if (columnName.trim().equalsIgnoreCase("c8nu1s"))
            return getC8nu1s();
        if (columnName.trim().equalsIgnoreCase("c8dfc"))
            return getC8dfc();
        if (columnName.trim().equalsIgnoreCase("c8idbc"))
            return getC8idbc();
        if (columnName.trim().equalsIgnoreCase("c8idbd"))
            return getC8idbd();
        if (columnName.trim().equalsIgnoreCase("c8ced"))
            return getC8ced();
        if (columnName.trim().equalsIgnoreCase("c8cur"))
            return getC8cur();
        if (columnName.trim().equalsIgnoreCase("c8itc"))
            return getC8itc();
        if (columnName.trim().equalsIgnoreCase("c8ccyn"))
            return getC8ccyn();
        if (columnName.trim().equalsIgnoreCase("c8sei"))
            return getC8sei();
        if (columnName.trim().equalsIgnoreCase("c8spt"))
            return getC8spt();
        if (columnName.trim().equalsIgnoreCase("c8sri"))
            return getC8sri();
        if (columnName.trim().equalsIgnoreCase("c8scy"))
            return getC8scy();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("c8ccy")) {
                setC8ccy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8rfi")) {
                setC8rfi(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8bsei")) {
                setC8bsei(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8bspt")) {
                setC8bspt(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8psei")) {
                setC8psei(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8pspt")) {
                setC8pspt(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8grp")) {
                setC8grp(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8mbr")) {
                setC8mbr(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8mcd")) {
                setC8mcd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8nu1o")) {
                setC8nu1o(CustomisationHelper.getIntegerFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8nu1s")) {
                setC8nu1s(CustomisationHelper.getIntegerFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8dfc")) {
                setC8dfc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8idbc")) {
                setC8idbc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8idbd")) {
                setC8idbd(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8ced")) {
                setC8ced(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8cur")) {
                setC8cur(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8itc")) {
                setC8itc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8ccyn")) {
                setC8ccyn(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8sei")) {
                setC8sei(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8spt")) {
                setC8spt(CustomisationHelper.getBigDecimalFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8sri")) {
                setC8sri(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("c8scy")) {
                setC8scy(value);
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