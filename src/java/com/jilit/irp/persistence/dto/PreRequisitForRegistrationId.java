package com.jilit.irp.persistence.dto;
// Generated Jul 2, 2010 10:47:07 AM by Hibernate Tools 3.2.1.GA



/**
 * PreRequisitForRegistrationId generated by hbm2java
 */
public class PreRequisitForRegistrationId  implements java.io.Serializable {


     private String instituteid;
     private String academicyear;
     private String programid;
     private String branchid;
     private byte stynumber;

    public PreRequisitForRegistrationId() {
    }

    public PreRequisitForRegistrationId(String instituteid, String academicyear, String programid, String branchid, byte stynumber) {
       this.instituteid = instituteid;
       this.academicyear = academicyear;
       this.programid = programid;
       this.branchid = branchid;
       this.stynumber = stynumber;
    }
   
    public String getInstituteid() {
        return this.instituteid;
    }
    
    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }
    public String getProgramid() {
        return this.programid;
    }
    
    public void setProgramid(String programid) {
        this.programid = programid;
    }
    public String getBranchid() {
        return this.branchid;
    }
    
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }
    public byte getStynumber() {
        return this.stynumber;
    }
    
    public void setStynumber(byte stynumber) {
        this.stynumber = stynumber;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }
}


