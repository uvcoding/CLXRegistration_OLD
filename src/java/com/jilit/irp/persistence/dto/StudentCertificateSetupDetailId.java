package com.jilit.irp.persistence.dto;
// Generated 7 Oct, 2011 11:34:15 AM by Hibernate Tools 3.2.1.GA



/**
 * StudentcertificatesetupdetailId generated by hbm2java
 */
public class StudentCertificateSetupDetailId  implements java.io.Serializable {


     private String instituteid;
     private String certificateid;
     private String academicyear;
     private String programid;
     private String branchid;

    public StudentCertificateSetupDetailId() {
    }

    public StudentCertificateSetupDetailId(String instituteid, String certificateid, String academicyear, String programid, String branchid) {
       this.instituteid = instituteid;
       this.certificateid = certificateid;
       this.academicyear = academicyear;
       this.programid = programid;
       this.branchid = branchid;
    }
   
    public String getInstituteid() {
        return this.instituteid;
    }
    
    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }
    public String getCertificateid() {
        return this.certificateid;
    }
    
    public void setCertificateid(String certificateid) {
        this.certificateid = certificateid;
    }
    public String getAcademicyear() {
        return this.academicyear;
    }
    
    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }
    public String getProgramid() {
        return this.programid;
    }
    
    public void setProgramid(String programid) {
        this.programid = programid;
    }
    public String getBranchid() {
        return this.branchid;
    }
    
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof StudentCertificateSetupDetailId) ) return false;
		 StudentCertificateSetupDetailId castOther = ( StudentCertificateSetupDetailId ) other;
         
		 return ( (this.getInstituteid()==castOther.getInstituteid()) || ( this.getInstituteid()!=null && castOther.getInstituteid()!=null && this.getInstituteid().equals(castOther.getInstituteid()) ) )
 && ( (this.getCertificateid()==castOther.getCertificateid()) || ( this.getCertificateid()!=null && castOther.getCertificateid()!=null && this.getCertificateid().equals(castOther.getCertificateid()) ) )
 && ( (this.getAcademicyear()==castOther.getAcademicyear()) || ( this.getAcademicyear()!=null && castOther.getAcademicyear()!=null && this.getAcademicyear().equals(castOther.getAcademicyear()) ) )
 && ( (this.getProgramid()==castOther.getProgramid()) || ( this.getProgramid()!=null && castOther.getProgramid()!=null && this.getProgramid().equals(castOther.getProgramid()) ) )
 && ( (this.getBranchid()==castOther.getBranchid()) || ( this.getBranchid()!=null && castOther.getBranchid()!=null && this.getBranchid().equals(castOther.getBranchid()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getInstituteid() == null ? 0 : this.getInstituteid().hashCode() );
         result = 37 * result + ( getCertificateid() == null ? 0 : this.getCertificateid().hashCode() );
         result = 37 * result + ( getAcademicyear() == null ? 0 : this.getAcademicyear().hashCode() );
         result = 37 * result + ( getProgramid() == null ? 0 : this.getProgramid().hashCode() );
         result = 37 * result + ( getBranchid() == null ? 0 : this.getBranchid().hashCode() );
         return result;
   }   


}


