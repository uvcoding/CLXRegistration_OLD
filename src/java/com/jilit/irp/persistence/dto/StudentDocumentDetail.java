package com.jilit.irp.persistence.dto;
// Generated Sep 12, 2009 11:04:12 AM by Hibernate Tools 3.2.1.GA



import java.util.Date;
import org.apache.commons.beanutils.BeanUtils;

/**
 * StudentDocumentDetail generated by hbm2java
 */
public class StudentDocumentDetail  implements java.io.Serializable {


     private StudentDocumentDetailId id;
     private StudentCategory studentcategory;
     private CategoryProgramDocumentTagging categoryprogramdocumenttagging;
     private StudentMaster studentmaster;
     private String documentkept;
     private Date documentkeptdate;
     private String documentkeptremarks;
     private String filename;
     private String filetype;
     private String deactive;
     private String documentreturn;
     private Date documentreturndate;
     private String documentreturnremarks;
      private String  documentverified;

    public StudentDocumentDetail() {
    }

	
    public StudentDocumentDetail(StudentDocumentDetailId id, StudentMaster studentmaster) {
        this.id = id;
        this.studentmaster = studentmaster;
    }
    public StudentDocumentDetail(StudentDocumentDetailId id,  StudentMaster studentmaster, String documentkept, Date documentkeptdate, String documentkeptremarks) {
       this.id = id;
       this.studentmaster = studentmaster;
       this.documentkept = documentkept;
       this.documentkeptdate = documentkeptdate;
       this.documentkeptremarks = documentkeptremarks;
    }
     public StudentDocumentDetail(StudentDocumentDetail dto) {
       this.id = dto.getId();
       this.documentkept =dto.getDocumentkept();
       this.documentkeptdate = dto.getDocumentkeptdate();
       this.documentkeptremarks = dto.getDocumentkeptremarks();
    }
    public StudentDocumentDetailId getId() {
        return this.id;
    }
    
    public void setId(StudentDocumentDetailId id) {
        this.id = id;
    }
   
    public String getDocumentkept() {
        return this.documentkept;
    }
    
    public void setDocumentkept(String documentkept) {
        this.documentkept = documentkept;
    }
    public Date getDocumentkeptdate() {
        return this.documentkeptdate;
    }
    
    public void setDocumentkeptdate(Date documentkeptdate) {
        this.documentkeptdate = documentkeptdate;
    }
    public String getDocumentkeptremarks() {
        return this.documentkeptremarks;
    }
    
    public void setDocumentkeptremarks(String documentkeptremarks) {
        this.documentkeptremarks = documentkeptremarks;
    }

  

    public StudentMaster getStudentmaster() {
        return studentmaster;
    }

    public void setStudentmaster(StudentMaster studentmaster) {
        this.studentmaster = studentmaster;
    }
//    public void setAsid(ASObject id){
//            if(this.id==null){
//                this.id = new StudentDocumentDetailId();
//            }
//            try{
//                BeanUtils.copyProperties(this.id,id );
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//
//        }

    public CategoryProgramDocumentTagging getCategoryprogramdocumenttagging() {
        return categoryprogramdocumenttagging;
    }

    public void setCategoryprogramdocumenttagging(CategoryProgramDocumentTagging categoryprogramdocumenttagging) {
        this.categoryprogramdocumenttagging = categoryprogramdocumenttagging;
    }

    public StudentCategory getStudentcategory() {
        return studentcategory;
    }

    public void setStudentcategory(StudentCategory studentcategory) {
        this.studentcategory = studentcategory;
    }

    public String getDeactive() {
        return deactive;
    }

    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getDocumentreturn() {
        return documentreturn;
    }

    public void setDocumentreturn(String documentreturn) {
        this.documentreturn = documentreturn;
    }

    public Date getDocumentreturndate() {
        return documentreturndate;
    }

   

    public void setDocumentreturndate(Date documentreturndate) {
        this.documentreturndate = documentreturndate;
    }

    public String getDocumentreturnremarks() {
        return documentreturnremarks;
    }

    public void setDocumentreturnremarks(String documentreturnremarks) {
        this.documentreturnremarks = documentreturnremarks;
    }
    
    public String getDocumentverified() {
        return documentverified;
    }

    public void setDocumentverified(String documentverified) {
        this.documentverified = documentverified;
    }


}


