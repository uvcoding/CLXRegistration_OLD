package com.jilit.irp.persistence.dto;
// Generated Jul 14, 2010 9:45:48 AM by Hibernate Tools 3.2.1.GA



/**
 * InstituteCampusTagging generated by hbm2java
 */
public class InstituteCampusTagging  implements java.io.Serializable {


     private String campusid;
     private InstituteMaster institutemaster;
     private Character deactive;

    public InstituteCampusTagging() {
    }

	
    public InstituteCampusTagging(String campusid) {
        this.campusid = campusid;
    }
    public InstituteCampusTagging(String campusid, InstituteMaster institutemaster, Character deactive) {
       this.campusid = campusid;
       this.institutemaster = institutemaster;
       this.deactive = deactive;
    }
   
    public String getCampusid() {
        return this.campusid;
    }
    
    public void setCampusid(String campusid) {
        this.campusid = campusid;
    }
    public InstituteMaster getInstitutemaster() {
        return this.institutemaster;
    }
    
    public void setInstitutemaster(InstituteMaster institutemaster) {
        this.institutemaster = institutemaster;
    }
    public Character getDeactive() {
        return this.deactive;
    }
    
    public void setDeactive(Character deactive) {
        this.deactive = deactive;
    }




}


