package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class CXPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(CXPF.class);

    /**
     * Primary Key
     */

    public static class Key_CXPF {

        private String cxmnm;
        private Integer cxyoc;
 
        public String getCxmnm() {
            return this.cxmnm;
        }
        public void setCxmnm(String cxmnm) {
           this.cxmnm = cxmnm;
        }  

        public Integer getCxyoc() {
            return this.cxyoc;
        }
        public void setCxyoc(Integer cxyoc) {
           this.cxyoc = cxyoc;
        }  

     }

    private Key_CXPF $key = new Key_CXPF();

    public Key_CXPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String cxdiy;
    private Date cxdfn;
    private Date cxdlm;
    private Integer cxdoo;
    private String cxdesc;
    private String mnt_in_bo;
    private String cxdiw;
 
    /**
     * Getters/Setters members 
     */   
    public String getCxmnm() {
        return this.$key.cxmnm;
    }

    public void setCxmnm(String cxmnm) {
        this.$key.cxmnm = cxmnm;
    }

    public Integer getCxyoc() {
        return this.$key.cxyoc;
    }

    public void setCxyoc(Integer cxyoc) {
        this.$key.cxyoc = cxyoc;
    }

     public String getCxdiy() {
        return this.cxdiy;
    }

    public void setCxdiy(String cxdiy) {
        this.cxdiy = cxdiy;
    }

    public Date getCxdfn() {
        return this.cxdfn;
    }

    public void setCxdfn(Date cxdfn) {
        this.cxdfn = cxdfn;
    }

    public Date getCxdlm() {
        return this.cxdlm;
    }

    public void setCxdlm(Date cxdlm) {
        this.cxdlm = cxdlm;
    }

    public Integer getCxdoo() {
        return this.cxdoo;
    }

    public void setCxdoo(Integer cxdoo) {
        this.cxdoo = cxdoo;
    }

    public String getCxdesc() {
        return this.cxdesc;
    }

    public void setCxdesc(String cxdesc) {
        this.cxdesc = cxdesc;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getCxdiw() {
        return this.cxdiw;
    }

    public void setCxdiw(String cxdiw) {
        this.cxdiw = cxdiw;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("cxmnm"))
            return getCxmnm();
        if (columnName.trim().equalsIgnoreCase("cxyoc"))
            return getCxyoc();
        if (columnName.trim().equalsIgnoreCase("cxdiy"))
            return getCxdiy();
        if (columnName.trim().equalsIgnoreCase("cxdfn"))
            return getCxdfn();
        if (columnName.trim().equalsIgnoreCase("cxdlm"))
            return getCxdlm();
        if (columnName.trim().equalsIgnoreCase("cxdoo"))
            return getCxdoo();
        if (columnName.trim().equalsIgnoreCase("cxdesc"))
            return getCxdesc();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("cxdiw"))
            return getCxdiw();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("cxmnm")) {
                setCxmnm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cxyoc")) {
                setCxyoc(CustomisationHelper.getIntegerFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cxdiy")) {
                setCxdiy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cxdfn")) {
                setCxdfn(CustomisationHelper.getDateFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cxdlm")) {
                setCxdlm(CustomisationHelper.getDateFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cxdoo")) {
                setCxdoo(CustomisationHelper.getIntegerFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cxdesc")) {
                setCxdesc(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cxdiw")) {
                setCxdiw(value);
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