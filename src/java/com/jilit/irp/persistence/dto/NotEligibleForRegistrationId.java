package com.jilit.irp.persistence.dto;
// Generated 5 Nov, 2013 4:13:13 PM by Hibernate Tools 3.2.1.GA



/**
 * NoteligibleforregistrationId generated by hbm2java
 */
public class NotEligibleForRegistrationId  implements java.io.Serializable {


     private String instituteid;
     private String registrationid;
     private String studentid;
     private String typeofreason;
     private byte fromstynumber;

    public NotEligibleForRegistrationId() {
    }

    public NotEligibleForRegistrationId(String instituteid, String registrationid, String studentid, String typeofreason, byte fromstynumber) {
       this.instituteid = instituteid;
       this.registrationid = registrationid;
       this.studentid = studentid;
       this.typeofreason = typeofreason;
       this.fromstynumber = fromstynumber;
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
    public String getStudentid() {
        return this.studentid;
    }
    
    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }
    public String getTypeofreason() {
        return this.typeofreason;
    }
    
    public void setTypeofreason(String typeofreason) {
        this.typeofreason = typeofreason;
    }
    public byte getFromstynumber() {
        return this.fromstynumber;
    }
    
    public void setFromstynumber(byte fromstynumber) {
        this.fromstynumber = fromstynumber;
    }


   

}


