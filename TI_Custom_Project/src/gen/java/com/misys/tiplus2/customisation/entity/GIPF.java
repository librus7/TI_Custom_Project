package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class GIPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(GIPF.class);

    /**
     * Primary Key
     */

    public static class Key_GIPF {

        private String gibrnm;
        private String giccy;
        private String giing;
 
        public String getGibrnm() {
            return this.gibrnm;
        }
        public void setGibrnm(String gibrnm) {
           this.gibrnm = gibrnm;
        }  

        public String getGiccy() {
            return this.giccy;
        }
        public void setGiccy(String giccy) {
           this.giccy = giccy;
        }  

        public String getGiing() {
            return this.giing;
        }
        public void setGiing(String giing) {
           this.giing = giing;
        }  

     }

    private Key_GIPF $key = new Key_GIPF();

    public Key_GIPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String mnt_in_bo;
    private String ginst;
    private String ginst_mbe;
 
    /**
     * Getters/Setters members 
     */   
    public String getGibrnm() {
        return this.$key.gibrnm;
    }

    public void setGibrnm(String gibrnm) {
        this.$key.gibrnm = gibrnm;
    }

    public String getGiccy() {
        return this.$key.giccy;
    }

    public void setGiccy(String giccy) {
        this.$key.giccy = giccy;
    }

    public String getGiing() {
        return this.$key.giing;
    }

    public void setGiing(String giing) {
        this.$key.giing = giing;
    }

     public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getGinst() {
        return this.ginst;
    }

    public void setGinst(String ginst) {
        this.ginst = ginst;
    }

    public String getGinst_mbe() {
        return this.ginst_mbe;
    }

    public void setGinst_mbe(String ginst_mbe) {
        this.ginst_mbe = ginst_mbe;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("gibrnm"))
            return getGibrnm();
        if (columnName.trim().equalsIgnoreCase("giccy"))
            return getGiccy();
        if (columnName.trim().equalsIgnoreCase("giing"))
            return getGiing();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("ginst"))
            return getGinst();
        if (columnName.trim().equalsIgnoreCase("ginst_mbe"))
            return getGinst_mbe();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("gibrnm")) {
                setGibrnm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("giccy")) {
                setGiccy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("giing")) {
                setGiing(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("ginst")) {
                setGinst(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("ginst_mbe")) {
                setGinst_mbe(value);
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