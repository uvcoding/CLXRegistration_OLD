package com.jilit.irp.persistence.dto;
// Generated May 31, 2014 4:00:34 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * StudentleavedetailId generated by hbm2java
 */
public class StudentLeaveDetailId  implements java.io.Serializable {


     private String instituteid;
     private String studentid;
     private String leaveid;
     private Date startdate;

    public StudentLeaveDetailId() {
    }

    public StudentLeaveDetailId(String instituteid, String studentid, String leaveid, Date startdate) {
       this.instituteid = instituteid;
       this.studentid = studentid;
       this.leaveid = leaveid;
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
    public String getLeaveid() {
        return this.leaveid;
    }
    
    public void setLeaveid(String leaveid) {
        this.leaveid = leaveid;
    }
    public Date getStartdate() {
        return this.startdate;
    }
    
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }


}


