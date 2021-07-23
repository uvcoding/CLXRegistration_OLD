package com.jilit.irp.persistence.dto;
// Generated 5 Nov, 2013 4:13:13 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Studentyearbackdetail generated by hbm2java
 */
public class StudentYearBackDetail  implements java.io.Serializable {


     private StudentYearBackDetailId id;
     private StudentRegistration studentregistration;
     private String yearback;
     private byte tostynumber;
     private String toregistrationid;
     private String reason;
     private String updatedby;
     private Date updatedate;
     private String deactive;

    public StudentYearBackDetail() {
    }

	
    public StudentYearBackDetail(StudentYearBackDetailId id, StudentRegistration studentregistration, String yearback, byte tostynumber, String toregistrationid) {
        this.id = id;
        this.studentregistration = studentregistration;
        this.yearback = yearback;
        this.tostynumber = tostynumber;
        this.toregistrationid = toregistrationid;
    }
    public StudentYearBackDetail(StudentYearBackDetailId id, StudentRegistration studentregistration, String yearback, byte tostynumber, String toregistrationid, String reason, String updatedby, Date updatedate, String deactive) {
       this.id = id;
       this.studentregistration = studentregistration;
       this.yearback = yearback;
       this.tostynumber = tostynumber;
       this.toregistrationid = toregistrationid;
       this.reason = reason;
       this.updatedby = updatedby;
       this.updatedate = updatedate;
       this.deactive = deactive;
    }
   
    public StudentYearBackDetailId getId() {
        return this.id;
    }
    
    public void setId(StudentYearBackDetailId id) {
        this.id = id;
    }
    public StudentRegistration getStudentregistration() {
        return this.studentregistration;
    }
    
    public void setStudentregistration(StudentRegistration studentregistration) {
        this.studentregistration = studentregistration;
    }
    public String getYearback() {
        return this.yearback;
    }
    
    public void setYearback(String yearback) {
        this.yearback = yearback;
    }
    public byte getTostynumber() {
        return this.tostynumber;
    }
    
    public void setTostynumber(byte tostynumber) {
        this.tostynumber = tostynumber;
    }
    public String getToregistrationid() {
        return this.toregistrationid;
    }
    
    public void setToregistrationid(String toregistrationid) {
        this.toregistrationid = toregistrationid;
    }
    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getUpdatedby() {
        return this.updatedby;
    }
    
    public void setUpdatedby(String updatedby) {
        this.updatedby = updatedby;
    }
    public Date getUpdatedate() {
        return this.updatedate;
    }
    
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
    public String getDeactive() {
        return this.deactive;
    }
    
    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }




}


