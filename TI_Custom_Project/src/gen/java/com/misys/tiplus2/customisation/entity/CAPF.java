package com.misys.tiplus2.customisation.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.misys.tiplus2.enigma.customisation.CustomisationHelper;
import com.misys.tiplus2.enigma.customisation.entity.CustomisedStaticEntity;
import java.math.BigDecimal;
import java.util.Date;

public class CAPF extends CustomisedStaticEntity {
    
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(CAPF.class);

    /**
     * Primary Key
     */

    public static class Key_CAPF {

        private String cabrnm;
 
        public String getCabrnm() {
            return this.cabrnm;
        }
        public void setCabrnm(String cabrnm) {
           this.cabrnm = cabrnm;
        }  

     }

    private Key_CAPF $key = new Key_CAPF();

    public Key_CAPF get$key() {
        return this.$key;
    }

    /**
     * Members
     */ 
    private String autonomous;
    private String business;
    private String bankgroup;
    private String baseccy;
    private String city;
    private String fullname;
    private String furtherid;
    private String services;
    private String cabad1;
    private String cabad2;
    private String cabad3;
    private String cabad4;
    private String cabad5;
    private String cabrn;
    private String catly;
    private String catph;
    private String children;
    private String email;
    private String fax;
    private String telephone;
    private String telexab;
    private String telex;
    private String country;
    private Long branchent;
    private String rateformat;
    private Integer tolerance;
    private String inheritcdp;
    private String tibicn;
    private Integer brchlevel;
    private String localccy;
    private String mainbank;
    private String mainbranch;
    private String mnt_in_bo;
    private String notrans;
    private Long optparset;
    private String paramset;
    private String parent_brn;
    private String caswb;
    private String caswbr;
    private String cacnas;
    private String caswl;
    private String swift_brn;
    private String timezone;
    private String ultparent;
    private String cabbn;
 
    /**
     * Getters/Setters members 
     */   
    public String getCabrnm() {
        return this.$key.cabrnm;
    }

    public void setCabrnm(String cabrnm) {
        this.$key.cabrnm = cabrnm;
    }

     public String getAutonomous() {
        return this.autonomous;
    }

    public void setAutonomous(String autonomous) {
        this.autonomous = autonomous;
    }

    public String getBusiness() {
        return this.business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getBankgroup() {
        return this.bankgroup;
    }

    public void setBankgroup(String bankgroup) {
        this.bankgroup = bankgroup;
    }

    public String getBaseccy() {
        return this.baseccy;
    }

    public void setBaseccy(String baseccy) {
        this.baseccy = baseccy;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFurtherid() {
        return this.furtherid;
    }

    public void setFurtherid(String furtherid) {
        this.furtherid = furtherid;
    }

    public String getServices() {
        return this.services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getCabad1() {
        return this.cabad1;
    }

    public void setCabad1(String cabad1) {
        this.cabad1 = cabad1;
    }

    public String getCabad2() {
        return this.cabad2;
    }

    public void setCabad2(String cabad2) {
        this.cabad2 = cabad2;
    }

    public String getCabad3() {
        return this.cabad3;
    }

    public void setCabad3(String cabad3) {
        this.cabad3 = cabad3;
    }

    public String getCabad4() {
        return this.cabad4;
    }

    public void setCabad4(String cabad4) {
        this.cabad4 = cabad4;
    }

    public String getCabad5() {
        return this.cabad5;
    }

    public void setCabad5(String cabad5) {
        this.cabad5 = cabad5;
    }

    public String getCabrn() {
        return this.cabrn;
    }

    public void setCabrn(String cabrn) {
        this.cabrn = cabrn;
    }

    public String getCatly() {
        return this.catly;
    }

    public void setCatly(String catly) {
        this.catly = catly;
    }

    public String getCatph() {
        return this.catph;
    }

    public void setCatph(String catph) {
        this.catph = catph;
    }

    public String getChildren() {
        return this.children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelexab() {
        return this.telexab;
    }

    public void setTelexab(String telexab) {
        this.telexab = telexab;
    }

    public String getTelex() {
        return this.telex;
    }

    public void setTelex(String telex) {
        this.telex = telex;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getBranchent() {
        return this.branchent;
    }

    public void setBranchent(Long branchent) {
        this.branchent = branchent;
    }

    public String getRateformat() {
        return this.rateformat;
    }

    public void setRateformat(String rateformat) {
        this.rateformat = rateformat;
    }

    public Integer getTolerance() {
        return this.tolerance;
    }

    public void setTolerance(Integer tolerance) {
        this.tolerance = tolerance;
    }

    public String getInheritcdp() {
        return this.inheritcdp;
    }

    public void setInheritcdp(String inheritcdp) {
        this.inheritcdp = inheritcdp;
    }

    public String getTibicn() {
        return this.tibicn;
    }

    public void setTibicn(String tibicn) {
        this.tibicn = tibicn;
    }

    public Integer getBrchlevel() {
        return this.brchlevel;
    }

    public void setBrchlevel(Integer brchlevel) {
        this.brchlevel = brchlevel;
    }

    public String getLocalccy() {
        return this.localccy;
    }

    public void setLocalccy(String localccy) {
        this.localccy = localccy;
    }

    public String getMainbank() {
        return this.mainbank;
    }

    public void setMainbank(String mainbank) {
        this.mainbank = mainbank;
    }

    public String getMainbranch() {
        return this.mainbranch;
    }

    public void setMainbranch(String mainbranch) {
        this.mainbranch = mainbranch;
    }

    public String getMnt_in_bo() {
        return this.mnt_in_bo;
    }

    public void setMnt_in_bo(String mnt_in_bo) {
        this.mnt_in_bo = mnt_in_bo;
    }

    public String getNotrans() {
        return this.notrans;
    }

    public void setNotrans(String notrans) {
        this.notrans = notrans;
    }

    public Long getOptparset() {
        return this.optparset;
    }

    public void setOptparset(Long optparset) {
        this.optparset = optparset;
    }

    public String getParamset() {
        return this.paramset;
    }

    public void setParamset(String paramset) {
        this.paramset = paramset;
    }

    public String getParent_brn() {
        return this.parent_brn;
    }

    public void setParent_brn(String parent_brn) {
        this.parent_brn = parent_brn;
    }

    public String getCaswb() {
        return this.caswb;
    }

    public void setCaswb(String caswb) {
        this.caswb = caswb;
    }

    public String getCaswbr() {
        return this.caswbr;
    }

    public void setCaswbr(String caswbr) {
        this.caswbr = caswbr;
    }

    public String getCacnas() {
        return this.cacnas;
    }

    public void setCacnas(String cacnas) {
        this.cacnas = cacnas;
    }

    public String getCaswl() {
        return this.caswl;
    }

    public void setCaswl(String caswl) {
        this.caswl = caswl;
    }

    public String getSwift_brn() {
        return this.swift_brn;
    }

    public void setSwift_brn(String swift_brn) {
        this.swift_brn = swift_brn;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getUltparent() {
        return this.ultparent;
    }

    public void setUltparent(String ultparent) {
        this.ultparent = ultparent;
    }

    public String getCabbn() {
        return this.cabbn;
    }

    public void setCabbn(String cabbn) {
        this.cabbn = cabbn;
    }

 
    @Override
    public Object getColumn(String columnName) {
        if (columnName == null || ("").equals(columnName)) {
            return null;
        }
        if (columnName.trim().equalsIgnoreCase("cabrnm"))
            return getCabrnm();
        if (columnName.trim().equalsIgnoreCase("autonomous"))
            return getAutonomous();
        if (columnName.trim().equalsIgnoreCase("business"))
            return getBusiness();
        if (columnName.trim().equalsIgnoreCase("bankgroup"))
            return getBankgroup();
        if (columnName.trim().equalsIgnoreCase("baseccy"))
            return getBaseccy();
        if (columnName.trim().equalsIgnoreCase("city"))
            return getCity();
        if (columnName.trim().equalsIgnoreCase("fullname"))
            return getFullname();
        if (columnName.trim().equalsIgnoreCase("furtherid"))
            return getFurtherid();
        if (columnName.trim().equalsIgnoreCase("services"))
            return getServices();
        if (columnName.trim().equalsIgnoreCase("cabad1"))
            return getCabad1();
        if (columnName.trim().equalsIgnoreCase("cabad2"))
            return getCabad2();
        if (columnName.trim().equalsIgnoreCase("cabad3"))
            return getCabad3();
        if (columnName.trim().equalsIgnoreCase("cabad4"))
            return getCabad4();
        if (columnName.trim().equalsIgnoreCase("cabad5"))
            return getCabad5();
        if (columnName.trim().equalsIgnoreCase("cabrn"))
            return getCabrn();
        if (columnName.trim().equalsIgnoreCase("catly"))
            return getCatly();
        if (columnName.trim().equalsIgnoreCase("catph"))
            return getCatph();
        if (columnName.trim().equalsIgnoreCase("children"))
            return getChildren();
        if (columnName.trim().equalsIgnoreCase("email"))
            return getEmail();
        if (columnName.trim().equalsIgnoreCase("fax"))
            return getFax();
        if (columnName.trim().equalsIgnoreCase("telephone"))
            return getTelephone();
        if (columnName.trim().equalsIgnoreCase("telexab"))
            return getTelexab();
        if (columnName.trim().equalsIgnoreCase("telex"))
            return getTelex();
        if (columnName.trim().equalsIgnoreCase("country"))
            return getCountry();
        if (columnName.trim().equalsIgnoreCase("branchent"))
            return getBranchent();
        if (columnName.trim().equalsIgnoreCase("rateformat"))
            return getRateformat();
        if (columnName.trim().equalsIgnoreCase("tolerance"))
            return getTolerance();
        if (columnName.trim().equalsIgnoreCase("inheritcdp"))
            return getInheritcdp();
        if (columnName.trim().equalsIgnoreCase("tibicn"))
            return getTibicn();
        if (columnName.trim().equalsIgnoreCase("brchlevel"))
            return getBrchlevel();
        if (columnName.trim().equalsIgnoreCase("localccy"))
            return getLocalccy();
        if (columnName.trim().equalsIgnoreCase("mainbank"))
            return getMainbank();
        if (columnName.trim().equalsIgnoreCase("mainbranch"))
            return getMainbranch();
        if (columnName.trim().equalsIgnoreCase("mnt_in_bo"))
            return getMnt_in_bo();
        if (columnName.trim().equalsIgnoreCase("notrans"))
            return getNotrans();
        if (columnName.trim().equalsIgnoreCase("optparset"))
            return getOptparset();
        if (columnName.trim().equalsIgnoreCase("paramset"))
            return getParamset();
        if (columnName.trim().equalsIgnoreCase("parent_brn"))
            return getParent_brn();
        if (columnName.trim().equalsIgnoreCase("caswb"))
            return getCaswb();
        if (columnName.trim().equalsIgnoreCase("caswbr"))
            return getCaswbr();
        if (columnName.trim().equalsIgnoreCase("cacnas"))
            return getCacnas();
        if (columnName.trim().equalsIgnoreCase("caswl"))
            return getCaswl();
        if (columnName.trim().equalsIgnoreCase("swift_brn"))
            return getSwift_brn();
        if (columnName.trim().equalsIgnoreCase("timezone"))
            return getTimezone();
        if (columnName.trim().equalsIgnoreCase("ultparent"))
            return getUltparent();
        if (columnName.trim().equalsIgnoreCase("cabbn"))
            return getCabbn();
        return null;
    }

    @Override
    public Boolean setColumn(String columnName, String value) {
        if (columnName == null || ("").equals(columnName) || value == null) {
            return false;
        }
        try {
            if (columnName.trim().equalsIgnoreCase("cabrnm")) {
                setCabrnm(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("autonomous")) {
                setAutonomous(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("business")) {
                setBusiness(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("bankgroup")) {
                setBankgroup(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("baseccy")) {
                setBaseccy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("city")) {
                setCity(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fullname")) {
                setFullname(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("furtherid")) {
                setFurtherid(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("services")) {
                setServices(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cabad1")) {
                setCabad1(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cabad2")) {
                setCabad2(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cabad3")) {
                setCabad3(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cabad4")) {
                setCabad4(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cabad5")) {
                setCabad5(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cabrn")) {
                setCabrn(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("catly")) {
                setCatly(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("catph")) {
                setCatph(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("children")) {
                setChildren(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("email")) {
                setEmail(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("fax")) {
                setFax(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("telephone")) {
                setTelephone(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("telexab")) {
                setTelexab(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("telex")) {
                setTelex(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("country")) {
                setCountry(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("branchent")) {
                setBranchent(CustomisationHelper.getLongFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("rateformat")) {
                setRateformat(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tolerance")) {
                setTolerance(CustomisationHelper.getIntegerFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("inheritcdp")) {
                setInheritcdp(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("tibicn")) {
                setTibicn(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("brchlevel")) {
                setBrchlevel(CustomisationHelper.getIntegerFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("localccy")) {
                setLocalccy(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mainbank")) {
                setMainbank(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mainbranch")) {
                setMainbranch(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("mnt_in_bo")) {
                setMnt_in_bo(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("notrans")) {
                setNotrans(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("optparset")) {
                setOptparset(CustomisationHelper.getLongFromString(value));
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("paramset")) {
                setParamset(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("parent_brn")) {
                setParent_brn(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("caswb")) {
                setCaswb(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("caswbr")) {
                setCaswbr(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cacnas")) {
                setCacnas(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("caswl")) {
                setCaswl(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("swift_brn")) {
                setSwift_brn(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("timezone")) {
                setTimezone(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("ultparent")) {
                setUltparent(value);
                return true;
            }
            if (columnName.trim().equalsIgnoreCase("cabbn")) {
                setCabbn(value);
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