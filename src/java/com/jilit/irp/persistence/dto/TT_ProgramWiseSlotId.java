package com.jilit.irp.persistence.dto;
// Generated 7 Feb, 2014 4:28:12 PM by Hibernate Tools 3.2.1.GA



/**
 * Tt_programwiseslotId generated by hbm2java
 */
public class TT_ProgramWiseSlotId  implements java.io.Serializable {


     private String instituteid;
     private String registrationid;
     private String days;
     private String slotid;
     private String academicyear;
     private String programid;

    public TT_ProgramWiseSlotId() {
    }

    public TT_ProgramWiseSlotId(String instituteid, String registrationid, String days, String slotid, String academicyear, String programid) {
       this.instituteid = instituteid;
       this.registrationid = registrationid;
       this.days = days;
       this.slotid = slotid;
       this.academicyear = academicyear;
       this.programid = programid;
    }
   
    public String getInstituteid() {
        return this.instituteid;
    }
    
    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }
    public String getRegistrationid() {
        return this.registrationid;
    }
    
    public void setRegistrationid(String registrationid) {
        this.registrationid = registrationid;
    }
    public String getDays() {
        return this.days;
    }
    
    public void setDays(String days) {
        this.days = days;
    }
    public String getSlotid() {
        return this.slotid;
    }
    
    public void setSlotid(String slotid) {
        this.slotid = slotid;
    }
    public String getAcademicyear() {
        return this.academicyear;
    }
    
    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }
    public String getProgramid() {
        return this.programid;
    }
    
    public void setProgramid(String programid) {
        this.programid = programid;
    }





}


