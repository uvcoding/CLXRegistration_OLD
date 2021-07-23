package com.jilit.irp.persistence.dto;
// Generated Sep 12, 2009 11:04:12 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * CategoryProgramDocumentTagging generated by hbm2java
 */
public class CategoryProgramDocumentTagging  implements java.io.Serializable {


     private CategoryProgramDocumentTaggingId id;
     private ProgramMaster programmaster;
     private StudentCategory studentcategory;
     private StudentDocumentMaster studentdocumentmaster;
     private String documentkept;
     private String deactive;
     private Set<StudentDocumentDetail> studentdocumentdetails = new HashSet<StudentDocumentDetail>(0);
      
    public CategoryProgramDocumentTagging() {
    }

	
    public CategoryProgramDocumentTagging(CategoryProgramDocumentTaggingId id, ProgramMaster programmaster, StudentCategory studentcategory, StudentDocumentMaster studentdocumentmaster, String documentkept) {
        this.id = id;
        this.programmaster = programmaster;
        this.studentcategory = studentcategory;
        this.studentdocumentmaster = studentdocumentmaster;
        this.documentkept = documentkept;
    }
    public CategoryProgramDocumentTagging(CategoryProgramDocumentTaggingId id, ProgramMaster programmaster, StudentCategory studentcategory, StudentDocumentMaster studentdocumentmaster, String documentkept, String deactive, Set<StudentDocumentDetail> studentdocumentdetails) {
       this.id = id;
       this.programmaster = programmaster;
       this.studentcategory = studentcategory;
       this.studentdocumentmaster = studentdocumentmaster;
       this.documentkept = documentkept;
       this.deactive = deactive;
       this.studentdocumentdetails = studentdocumentdetails;
    }
   
    public CategoryProgramDocumentTaggingId getId() {
        return this.id;
    }
    
    public void setId(CategoryProgramDocumentTaggingId id) {
        this.id = id;
    }
  
    public String getDocumentkept() {
        return this.documentkept;
    }
    
    public void setDocumentkept(String documentkept) {
        this.documentkept = documentkept;
    }
    public String getDeactive() {
        return this.deactive;
    }
    
    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }

    public ProgramMaster getProgrammaster() {
        return programmaster;
    }

    public void setProgrammaster(ProgramMaster programmaster) {
        this.programmaster = programmaster;
    }

    public StudentCategory getStudentcategory() {
        return studentcategory;
    }

    public void setStudentcategory(StudentCategory studentcategory) {
        this.studentcategory = studentcategory;
    }

    public Set<StudentDocumentDetail> getStudentdocumentdetails() {
        return studentdocumentdetails;
    }

    public void setStudentdocumentdetails(Set<StudentDocumentDetail> studentdocumentdetails) {
        this.studentdocumentdetails = studentdocumentdetails;
    }

    public StudentDocumentMaster getStudentdocumentmaster() {
        return studentdocumentmaster;
    }

    public void setStudentdocumentmaster(StudentDocumentMaster studentdocumentmaster) {
        this.studentdocumentmaster = studentdocumentmaster;
    } 
}


