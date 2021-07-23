package com.jilit.irp.persistence.dto;
// Generated Sep 12, 2009 11:04:12 AM by Hibernate Tools 3.2.1.GA



/**
 * StudentDocumentDetailId generated by hbm2java
 */
public class StudentDocumentDetailId  implements java.io.Serializable {


     private String instituteid;
     private String studentid;
     private String programid;
     private String categoryid;
     private String documentid;

        public StudentDocumentDetailId() {
    }

    public StudentDocumentDetailId( String instituteid,String studentid, String programid, String categoryid, String documentid) {
      
       this.instituteid = instituteid;
       this.studentid = studentid;
       this.programid = programid;
       this.categoryid = categoryid;
       this.documentid = documentid;
    }
   
    
    public String getStudentid() {
        return this.studentid;
    }
    
    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }
    public String getProgramid() {
        return this.programid;
    }
    
    public void setProgramid(String programid) {
        this.programid = programid;
    }
    public String getCategoryid() {
        return this.categoryid;
    }
    
    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }
    public String getDocumentid() {
        return this.documentid;
    }
    
    public void setDocumentid(String documentid) {
        this.documentid = documentid;
    }

    public String getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof StudentDocumentDetailId) ) return false;
		 StudentDocumentDetailId castOther = ( StudentDocumentDetailId ) other;
         
		 return ( (this.getStudentid()==castOther.getStudentid()) || ( this.getStudentid()!=null && castOther.getStudentid()!=null && this.getStudentid().equals(castOther.getStudentid()) ) )
 && ( (this.getProgramid()==castOther.getProgramid()) || ( this.getProgramid()!=null && castOther.getProgramid()!=null && this.getProgramid().equals(castOther.getProgramid()) ) )
 && ( (this.getCategoryid()==castOther.getCategoryid()) || ( this.getCategoryid()!=null && castOther.getCategoryid()!=null && this.getCategoryid().equals(castOther.getCategoryid()) ) )
 && ( (this.getDocumentid()==castOther.getDocumentid()) || ( this.getDocumentid()!=null && castOther.getDocumentid()!=null && this.getDocumentid().equals(castOther.getDocumentid()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getStudentid() == null ? 0 : this.getStudentid().hashCode() );
         result = 37 * result + ( getProgramid() == null ? 0 : this.getProgramid().hashCode() );
         result = 37 * result + ( getCategoryid() == null ? 0 : this.getCategoryid().hashCode() );
         result = 37 * result + ( getDocumentid() == null ? 0 : this.getDocumentid().hashCode() );
         return result;
   }   


}


