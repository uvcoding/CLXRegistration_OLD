package com.jilit.irp.persistence.dto;
// Generated Sep 12, 2009 11:04:12 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * SpecializationCategory generated by hbm2java
 */
public class SpecializationCategory  implements java.io.Serializable {


     private String specializationcategoryid;
     private String specializationcategorycode;
     private String specializationcategory;
     private Short seqid;
     private String deactive;
     private String instituteid;
     private InstituteMaster institutemaster;
     private Set<SpecializationMaster> specializationmasters = new HashSet<SpecializationMaster>(0);
    

    public SpecializationCategory() {
    }

    public SpecializationCategory(SpecializationCategory dto) {
        this.specializationcategoryid = dto.specializationcategoryid;
        this.specializationcategorycode = dto.specializationcategorycode;
        this.specializationcategory = dto.specializationcategory;
        this.seqid = dto.seqid;
        this.deactive = dto.deactive;
    }



    public SpecializationCategory(String specializationcategoryid, String specializationcategorycode,  String specializationcategory) {
        this.specializationcategoryid = specializationcategoryid;
        this.specializationcategorycode = specializationcategorycode;
        this.specializationcategory = specializationcategory;
    }
    public SpecializationCategory(String specializationcategoryid, String specializationcategorycode,  String specializationcategory, Short seqid, String deactive, Set<SpecializationMaster> specializationmasters) {
       this.specializationcategoryid = specializationcategoryid;
       this.specializationcategorycode = specializationcategorycode;
       this.specializationcategory = specializationcategory;
       this.seqid = seqid;
       this.deactive = deactive;
       this.specializationmasters = specializationmasters;
    }

    public String getDeactive() {
        return deactive;
    }

    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }

    public Short getSeqid() {
        return seqid;
    }

    public void setSeqid(Short seqid) {
        this.seqid = seqid;
    }

    public String getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }

    public InstituteMaster getInstitutemaster() {
        return institutemaster;
    }

    public void setInstitutemaster(InstituteMaster institutemaster) {
        this.institutemaster = institutemaster;
    }

    public String getSpecializationcategory() {
        return specializationcategory;
    }

    public void setSpecializationcategory(String specializationcategory) {
        this.specializationcategory = specializationcategory;
    }

    public String getSpecializationcategorycode() {
        return specializationcategorycode;
    }

    public void setSpecializationcategorycode(String specializationcategorycode) {
        this.specializationcategorycode = specializationcategorycode;
    }

    public String getSpecializationcategoryid() {
        return specializationcategoryid;
    }

    public void setSpecializationcategoryid(String specializationcategoryid) {
        this.specializationcategoryid = specializationcategoryid;
    }

    public Set<SpecializationMaster> getSpecializationmasters() {
        return specializationmasters;
    }

    public void setSpecializationmasters(Set<SpecializationMaster> specializationmasters) {
        this.specializationmasters = specializationmasters;
    }

    
    

}


