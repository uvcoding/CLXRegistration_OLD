package com.jilit.irp.persistence.dto;
// Generated Apr 24, 2010 5:00:22 PM by Hibernate Tools 3.2.1.GA



/**
 * DepartmentsubjecttaggingId generated by hbm2java
 */
public class DepartmentSubjectTaggingId  implements java.io.Serializable {


     private String instituteid;
     private String subjectid;
     private String departmentid;

    public DepartmentSubjectTaggingId() {
    }

    public DepartmentSubjectTaggingId(String instituteid, String subjectid, String departmentid) {
       this.instituteid = instituteid;
       this.subjectid = subjectid;
       this.departmentid = departmentid;
    }
   
    public DepartmentSubjectTaggingId(DepartmentSubjectTaggingId dto) {
        this.instituteid = dto.getInstituteid();
        this.subjectid = dto.getSubjectid();
        this.departmentid = dto.getDepartmentid();
    }

    public String getInstituteid() {
        return this.instituteid;
    }
    
    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }
    public String getSubjectid() {
        return this.subjectid;
    }
    
    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid;
    }
    public String getDepartmentid() {
        return this.departmentid;
    }
    
    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }


  


}


