package com.jilit.irp.persistence.dto;
// Generated Mar 7, 2016 6:43:03 PM by Hibernate Tools 3.2.1.GA



/**
 * Tt#timetableapprovalId generated by hbm2java
 */
public class Tt_TimetableapprovalId  implements java.io.Serializable {


     private String instituteid;
     private String registrationid;
     private String departmentid;
     private String programid;
     private String academicyear;
     private byte stynumber;

    public Tt_TimetableapprovalId() {
    }

    public Tt_TimetableapprovalId(String instituteid, String registrationid, String departmentid, String programid, String academicyear, byte stynumber) {
       this.instituteid = instituteid;
       this.registrationid = registrationid;
       this.departmentid = departmentid;
       this.programid = programid;
       this.academicyear = academicyear;
       this.stynumber = stynumber;
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
    public String getDepartmentid() {
        return this.departmentid;
    }
    
    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }
    public String getProgramid() {
        return this.programid;
    }
    
    public void setProgramid(String programid) {
        this.programid = programid;
    }
    public String getAcademicyear() {
        return this.academicyear;
    }
    
    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }
    public byte getStynumber() {
        return this.stynumber;
    }
    
    public void setStynumber(byte stynumber) {
        this.stynumber = stynumber;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Tt_TimetableapprovalId) ) return false;
		Tt_TimetableapprovalId castOther = ( Tt_TimetableapprovalId ) other;
         
		 return ( (this.getInstituteid()==castOther.getInstituteid()) || ( this.getInstituteid()!=null && castOther.getInstituteid()!=null && this.getInstituteid().equals(castOther.getInstituteid()) ) )
 && ( (this.getRegistrationid()==castOther.getRegistrationid()) || ( this.getRegistrationid()!=null && castOther.getRegistrationid()!=null && this.getRegistrationid().equals(castOther.getRegistrationid()) ) )
 && ( (this.getDepartmentid()==castOther.getDepartmentid()) || ( this.getDepartmentid()!=null && castOther.getDepartmentid()!=null && this.getDepartmentid().equals(castOther.getDepartmentid()) ) )
 && ( (this.getProgramid()==castOther.getProgramid()) || ( this.getProgramid()!=null && castOther.getProgramid()!=null && this.getProgramid().equals(castOther.getProgramid()) ) )
 && ( (this.getAcademicyear()==castOther.getAcademicyear()) || ( this.getAcademicyear()!=null && castOther.getAcademicyear()!=null && this.getAcademicyear().equals(castOther.getAcademicyear()) ) )
 && (this.getStynumber()==castOther.getStynumber());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getInstituteid() == null ? 0 : this.getInstituteid().hashCode() );
         result = 37 * result + ( getRegistrationid() == null ? 0 : this.getRegistrationid().hashCode() );
         result = 37 * result + ( getDepartmentid() == null ? 0 : this.getDepartmentid().hashCode() );
         result = 37 * result + ( getProgramid() == null ? 0 : this.getProgramid().hashCode() );
         result = 37 * result + ( getAcademicyear() == null ? 0 : this.getAcademicyear().hashCode() );
         result = 37 * result + this.getStynumber();
         return result;
   }   


}


