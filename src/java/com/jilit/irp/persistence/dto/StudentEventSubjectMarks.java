 package com.jilit.irp.persistence.dto;
// Generated Sep 4, 2010 3:48:00 PM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.Date;
/**
 * StudentEventSubjectMarks generated by hbm2java
 */
public class StudentEventSubjectMarks  implements java.io.Serializable {

     private StudentEventSubjectMarksId id;
     private StudentRegistration studentregistration;
     private FacultyStudentTagging facultystudenttagging;
     private BigDecimal marksawarded1;
     private BigDecimal marksawarded2;
     private String marksentryprompt1;
     private String marksentryprompt2;
     private String locked;
     private String locked2;
     private String deactive;
     private String examtypeid;
     private String entryby;
     private Date entrydate;
     private String entrybylevel2;
     private Date entrydatelevel2;
     private String subjectid;
    public StudentEventSubjectMarks() {
    }

    public StudentEventSubjectMarks(StudentEventSubjectMarks dto) {
        this.id = dto.getId();
        this.marksawarded1 = dto.getMarksawarded1();
        this.marksawarded2 = dto.getMarksawarded2();
        this.marksentryprompt1 = dto.getMarksentryprompt1();
        this.marksentryprompt2 = dto.getMarksentryprompt2();
        this.locked = dto.getLocked();
        this.deactive = dto.getDeactive();
        this.examtypeid = dto.getExamtypeid();
    }

    public StudentEventSubjectMarks(StudentEventSubjectMarksId id, StudentRegistration studentregistration, FacultyStudentTagging facultystudenttagging ) {
        this.id = id;
        this.studentregistration = studentregistration;
        this.facultystudenttagging = facultystudenttagging;
    }
    public StudentEventSubjectMarks(StudentEventSubjectMarksId id, StudentRegistration studentregistration, FacultyStudentTagging facultystudenttagging , BigDecimal marksawarded1, BigDecimal marksawarded2, String marksentryprompt1, String marksentryprompt2, String locked, String deactive, String examtypeid) {
       this.id = id;
       this.studentregistration = studentregistration;
       this.facultystudenttagging = facultystudenttagging;
       this.marksawarded1 = marksawarded1;
       this.marksawarded2 = marksawarded2;
       this.marksentryprompt1 = marksentryprompt1;
       this.marksentryprompt2 = marksentryprompt2;
       this.locked = locked;
       this.deactive = deactive;
       this.examtypeid = examtypeid;
    }

    public StudentEventSubjectMarksId getId() {
        return this.id;
    }

    public void setId(StudentEventSubjectMarksId id) {
        this.id = id;
    }


    public StudentRegistration getStudentregistration() {
        return studentregistration;
    }

    public void setStudentregistration(StudentRegistration studentregistration) {
        this.studentregistration = studentregistration;
    }


    public BigDecimal getMarksawarded1() {
        return this.marksawarded1;
    }

    public void setMarksawarded1(BigDecimal marksawarded1) {
        this.marksawarded1 = marksawarded1;
    }
    public BigDecimal getMarksawarded2() {
        return this.marksawarded2;
    }

    public void setMarksawarded2(BigDecimal marksawarded2) {
        this.marksawarded2 = marksawarded2;
    }
    public String getMarksentryprompt1() {
        return this.marksentryprompt1;
    }

    public void setMarksentryprompt1(String marksentryprompt1) {
        this.marksentryprompt1 = marksentryprompt1;
    }
    public String getMarksentryprompt2() {
        return this.marksentryprompt2;
    }

    public void setMarksentryprompt2(String marksentryprompt2) {
        this.marksentryprompt2 = marksentryprompt2;
    }
    public String getLocked() {
        return this.locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }
    public String getDeactive() {
        return this.deactive;
    }

    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }

    public String getExamtypeid() {
        return examtypeid;
    }

    public void setExamtypeid(String examtypeid) {
        this.examtypeid = examtypeid;
    }

    public String getIdStr() {
        return id.getExameventid()+":"+id.getStudentfstid()+":"+id.getInstituteid()+":"+id.getRegistrationid()+":"+id.getStudentid();
    }

    public FacultyStudentTagging getFacultystudenttagging() {
        return facultystudenttagging;
    }

    public void setFacultystudenttagging(FacultyStudentTagging facultystudenttagging) {
        this.facultystudenttagging = facultystudenttagging;
    }

    public String getEntryby() {
        return entryby;
    }

    public void setEntryby(String entryby) {
        this.entryby = entryby;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public String getEntrybylevel2() {
        return entrybylevel2;
    }

    public void setEntrybylevel2(String entrybylevel2) {
        this.entrybylevel2 = entrybylevel2;
    }

    public Date getEntrydatelevel2() {
        return entrydatelevel2;
    }

    public void setEntrydatelevel2(Date entrydatelevel2) {
        this.entrydatelevel2 = entrydatelevel2;
    }

    public String getLocked2() {
        return locked2;
    }

    public void setLocked2(String locked2) {
        this.locked2 = locked2;
    }
     public String getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid;
    }
}


