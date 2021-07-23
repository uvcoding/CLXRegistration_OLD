package com.jilit.irp.persistence.dto;
// Generated May 12, 2010 11:54:58 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * StudentAttendanceExcused generated by hbm2java
 */
public class StudentAttendanceExcused  implements java.io.Serializable {


     private StudentAttendanceExcusedId id;
     private InstituteMaster institutemaster;
     private FacultySubjectTagging facultysubjecttagging;
     private String classtimeupto;
     private String attendancetype;
     private String selfattendance;
     private String entrybyfacultyid;
     private String entrybyfacultytype;
     private Date entrydate;
     private String remarks;
     private String deactive;

    public StudentAttendanceExcused(StudentAttendanceExcused dto, boolean childReqd) {
        this.id = dto.getId();
        this.classtimeupto = dto.getClasstimeupto();
        this.attendancetype = dto.getAttendancetype();
        this.selfattendance = dto.getSelfattendance();
        this.entrybyfacultyid = dto.getEntrybyfacultyid();
        this.entrybyfacultytype = dto.getEntrybyfacultytype();
        this.entrydate = dto.getEntrydate();
        this.remarks = dto.getRemarks();
        this.deactive = dto.getDeactive();
    }

    public StudentAttendanceExcused() {
    }

	
    public StudentAttendanceExcused(StudentAttendanceExcusedId id, InstituteMaster institutemaster, FacultySubjectTagging facultysubjecttagging, String classtimeupto, String attendancetype, String selfattendance, String entrybyfacultyid) {
        this.id = id;
        this.institutemaster = institutemaster;
        this.facultysubjecttagging = facultysubjecttagging;
        this.classtimeupto = classtimeupto;
        this.attendancetype = attendancetype;
        this.selfattendance = selfattendance;
        this.entrybyfacultyid = entrybyfacultyid;
    }
    public StudentAttendanceExcused(StudentAttendanceExcusedId id, InstituteMaster institutemaster, FacultySubjectTagging facultysubjecttagging, String classtimeupto, String attendancetype, String selfattendance, String entrybyfacultyid, String entrybyfacultytype, Date entrydate, String remarks, String deactive) {
       this.id = id;
       this.institutemaster = institutemaster;
       this.facultysubjecttagging = facultysubjecttagging;
       this.classtimeupto = classtimeupto;
       this.attendancetype = attendancetype;
       this.selfattendance = selfattendance;
       this.entrybyfacultyid = entrybyfacultyid;
       this.entrybyfacultytype = entrybyfacultytype;
       this.entrydate = entrydate;
       this.remarks = remarks;
       this.deactive = deactive;
    }
   
    public StudentAttendanceExcusedId getId() {
        return this.id;
    }
    
    public void setId(StudentAttendanceExcusedId id) {
        this.id = id;
    }

    public FacultySubjectTagging getFacultysubjecttagging() {
        return facultysubjecttagging;
    }

    public void setFacultysubjecttagging(FacultySubjectTagging facultysubjecttagging) {
        this.facultysubjecttagging = facultysubjecttagging;
    }

    public InstituteMaster getInstitutemaster() {
        return institutemaster;
    }

    public void setInstitutemaster(InstituteMaster institutemaster) {
        this.institutemaster = institutemaster;
    }
   
    public String getClasstimeupto() {
        return this.classtimeupto;
    }
    
    public void setClasstimeupto(String classtimeupto) {
        this.classtimeupto = classtimeupto;
    }
    public String getAttendancetype() {
        return this.attendancetype;
    }
    
    public void setAttendancetype(String attendancetype) {
        this.attendancetype = attendancetype;
    }
    public String getSelfattendance() {
        return this.selfattendance;
    }
    
    public void setSelfattendance(String selfattendance) {
        this.selfattendance = selfattendance;
    }
    public String getEntrybyfacultyid() {
        return this.entrybyfacultyid;
    }
    
    public void setEntrybyfacultyid(String entrybyfacultyid) {
        this.entrybyfacultyid = entrybyfacultyid;
    }
    public String getEntrybyfacultytype() {
        return this.entrybyfacultytype;
    }
    
    public void setEntrybyfacultytype(String entrybyfacultytype) {
        this.entrybyfacultytype = entrybyfacultytype;
    }
    public Date getEntrydate() {
        return this.entrydate;
    }
    
    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }
    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public String getDeactive() {
        return this.deactive;
    }
    
    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }
}