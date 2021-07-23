package com.jilit.irp.persistence.dto;
// Generated Sep 12, 2009 11:04:12 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * CountryMaster generated by hbm2java
 */
public class CountryMaster  implements java.io.Serializable {


     private String countryid;
     private String countrycode;
     private String countryname;
     private Short seqid;
     private String deactive;
     private Set<StateMaster> statemasters = new HashSet<StateMaster>(0);

    public CountryMaster() {
    }

    public CountryMaster(CountryMaster dto) {
        this.countrycode = dto.countrycode;
        this.countryid = dto.countryid;
        this.countryname = dto.countryname;
        this.deactive = dto.deactive;
        this.seqid = dto.seqid;        
    }

    public CountryMaster(String countryid, String countrycode, String countryname) {
        this.countryid = countryid;
        this.countrycode = countrycode;
        this.countryname = countryname;
    }
    public CountryMaster(String countryid, String countrycode, String countryname, Short seqid, String deactive, Set<StateMaster> statemasters) {
       this.countryid = countryid;
       this.countrycode = countrycode;
       this.countryname = countryname;
       this.seqid = seqid;
       this.deactive = deactive;
       this.statemasters = statemasters;
    }    
    public String getCountryid() {
        return this.countryid;
    }
    
    public void setCountryid(String countryid) {
        this.countryid = countryid;
    }
    public String getCountrycode() {
        return this.countrycode;
    }
    
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
    public String getCountryname() {
        return this.countryname;
    }
    
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }
    public Short getSeqid() {
        return this.seqid;
    }
    
    public void setSeqid(Short seqid) {
        this.seqid = seqid;
    }
    public String getDeactive() {
        return this.deactive;
    }
    
    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }

    public Set<StateMaster> getStatemasters() {
        return statemasters;
    }

    public void setStatemasters(Set<StateMaster> statemasters) {
        this.statemasters = statemasters;
    }
   



}


