package com.jilit.irp.persistence.dto;
// Generated Jul 15, 2014 3:54:49 PM by Hibernate Tools 3.2.1.GA



/**
 * Tmp#studattendsummaryId generated by hbm2java
 */
public class Tmp_StudAttendSummaryDetailId  implements java.io.Serializable {


     private String unqsessionid;
     private String instituteid;
     private String registrationid;
     private String studentid;
     private String subjectid;
     private String subjectcomponentid;

    public Tmp_StudAttendSummaryDetailId() {
    }

    public Tmp_StudAttendSummaryDetailId(String unqsessionid, String instituteid, String registrationid, String studentid, String subjectid, String subjectcomponentid) {
       this.unqsessionid = unqsessionid;
       this.instituteid = instituteid;
       this.registrationid = registrationid;
       this.studentid = studentid;
       this.subjectid = subjectid;
       this.subjectcomponentid = subjectcomponentid;
    }

    public String getUnqsessionid() {
        return this.unqsessionid;
    }

    public void setUnqsessionid(String unqsessionid) {
        this.unqsessionid = unqsessionid;
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
    public String getSubjectid() {
        return this.subjectid;
    }

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid;
    }

    public String getSubjectcomponentid() {
        return subjectcomponentid;
    }

    public void setSubjectcomponentid(String subjectcomponentid) {
        this.subjectcomponentid = subjectcomponentid;
    }




}


