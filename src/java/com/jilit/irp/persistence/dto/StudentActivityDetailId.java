package com.jilit.irp.persistence.dto;
// Generated May 31, 2014 4:00:34 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * StudentactivitydetailId generated by hbm2java
 */
public class StudentActivityDetailId  implements java.io.Serializable {


     private String instituteid;
     private String studentid;
     private String activityid;
     private Date startdate;

    public StudentActivityDetailId() {
    }

    public StudentActivityDetailId(String instituteid, String studentid, String activityid, Date startdate) {
       this.instituteid = instituteid;
       this.studentid = studentid;
       this.activityid = activityid;
       this.startdate = startdate;
    }
   
    public String getInstituteid() {
        return this.instituteid;
    }
    
    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }
    public String getStudentid() {
        return this.studentid;
    }
    
    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }
    public String getActivityid() {
        return this.activityid;
    }
    
    public void setActivityid(String activityid) {
        this.activityid = activityid;
    }
    public Date getStartdate() {
        return this.startdate;
    }
    
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }


 }


