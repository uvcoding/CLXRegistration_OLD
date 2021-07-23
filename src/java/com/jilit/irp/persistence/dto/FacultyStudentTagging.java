package com.jilit.irp.persistence.dto;
// Generated Dec 21, 2009 11:00:34 AM by Hibernate Tools 3.2.1.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;





/**
 * Facultystudenttagging generated by hbm2java
 */

public class FacultyStudentTagging  implements java.io.Serializable {


     private FacultyStudentTaggingId id;
     private StudentMaster studentmaster;
     private FacultySubjectTagging facultysubjecttagging;
     private String deactive;
     private String fstid;
     private String entryby;
     private Date entrydate;
     private Date regconfirmationdate;
     private String auditsubject;
    private String equivalentsubjectid;
    private String subjectid;
    private String registrationid;

    //private Set<StudentPreviousAttendence> studentpreviousattendences = new HashSet<StudentPreviousAttendence>(0);
    private Set<StudentAttendance> studentattendances = new HashSet<StudentAttendance>(0);
    private Set<StudentEventSubjectMarks> studenteventsubjectmarkses = new HashSet<StudentEventSubjectMarks>(0);

    public Date getRegconfirmationdate() {
        return regconfirmationdate;
    }

    public void setRegconfirmationdate(Date regconfirmationdate) {
        this.regconfirmationdate = regconfirmationdate;
    }
    public String getEquivalentsubjectid() {
        return equivalentsubjectid;
    }

    public void setEquivalentsubjectid(String equivalentsubjectid) {
        this.equivalentsubjectid = equivalentsubjectid;
    }

    public FacultyStudentTagging() {
    }

	
    public FacultyStudentTagging(FacultyStudentTaggingId id, StudentMaster studentmaster, FacultySubjectTagging facultysubjecttagging) {
        this.id = id;
        this.studentmaster = studentmaster;
        this.facultysubjecttagging = facultysubjecttagging;
    }
    public FacultyStudentTagging(FacultyStudentTaggingId id, StudentMaster studentmaster, FacultySubjectTagging facultysubjecttagging, String deactive) {
       this.id = id;
       this.studentmaster = studentmaster;
       this.facultysubjecttagging = facultysubjecttagging;
       this.deactive = deactive;
    }
   
    public FacultyStudentTaggingId getId() {
        return this.id;
    }
    
    public void setId(FacultyStudentTaggingId id) {
        this.id = id;
    }

    public FacultySubjectTagging getFacultysubjecttagging() {
        return facultysubjecttagging;
    }

    public void setFacultysubjecttagging(FacultySubjectTagging facultysubjecttagging) {
        this.facultysubjecttagging = facultysubjecttagging;
    }

    public StudentMaster getStudentmaster() {
        return studentmaster;
    }

    public void setStudentmaster(StudentMaster studentmaster) {
        this.studentmaster = studentmaster;
    }

 
    public String getDeactive() {
        return this.deactive;
    }
    
    public void setDeactive(String deactive) {
        this.deactive = deactive;
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

    public String getFstid() {
        return fstid;
    }

    public void setFstid(String fstid) {
        this.fstid = fstid;
    }

    public Set<StudentAttendance> getStudentattendances() {
        return studentattendances;
    }

    public void setStudentattendances(Set<StudentAttendance> studentattendances) {
        this.studentattendances = studentattendances;
    }

//    public Set<StudentPreviousAttendence> getStudentpreviousattendences() {
//        return studentpreviousattendences;
//    }
//
//    public void setStudentpreviousattendences(Set<StudentPreviousAttendence> studentpreviousattendences) {
//        this.studentpreviousattendences = studentpreviousattendences;
//    }

    public Set<StudentEventSubjectMarks> getStudenteventsubjectmarkses() {
        return studenteventsubjectmarkses;
    }

    public void setStudenteventsubjectmarkses(Set<StudentEventSubjectMarks> studenteventsubjectmarkses) {
        this.studenteventsubjectmarkses = studenteventsubjectmarkses;
    }

    public String getAuditsubject() {
        return auditsubject;
    }

    public void setAuditsubject(String auditsubject) {
        this.auditsubject = auditsubject;
    }

    public String getRegistrationid() {
        return registrationid;
    }

    public void setRegistrationid(String registrationid) {
        this.registrationid = registrationid;
    }

    public String getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid;
    }


}


