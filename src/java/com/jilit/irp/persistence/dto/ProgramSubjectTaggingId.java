package com.jilit.irp.persistence.dto;
// Generated Dec 19, 2009 12:17:52 PM by Hibernate Tools 3.2.1.GA



/**
 * ProgramsubjecttaggingId generated by hbm2java
 */
public class ProgramSubjectTaggingId  implements java.io.Serializable {


     private String instituteid;
     private String registrationid;
     private String programsubjectid;

    public ProgramSubjectTaggingId() {
    }

    public ProgramSubjectTaggingId(String instituteid, String registrationid, String programsubjectid) {
       this.instituteid = instituteid;
       this.registrationid = registrationid;
       this.programsubjectid = programsubjectid;
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
    public String getProgramsubjectid() {
        return this.programsubjectid;
    }
    
    public void setProgramsubjectid(String programsubjectid) {
        this.programsubjectid = programsubjectid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ProgramSubjectTaggingId) ) return false;
		 ProgramSubjectTaggingId castOther = ( ProgramSubjectTaggingId ) other;
         
		 return ( (this.getInstituteid()==castOther.getInstituteid()) || ( this.getInstituteid()!=null && castOther.getInstituteid()!=null && this.getInstituteid().equals(castOther.getInstituteid()) ) )
 && ( (this.getRegistrationid()==castOther.getRegistrationid()) || ( this.getRegistrationid()!=null && castOther.getRegistrationid()!=null && this.getRegistrationid().equals(castOther.getRegistrationid()) ) )
 && ( (this.getProgramsubjectid()==castOther.getProgramsubjectid()) || ( this.getProgramsubjectid()!=null && castOther.getProgramsubjectid()!=null && this.getProgramsubjectid().equals(castOther.getProgramsubjectid()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getInstituteid() == null ? 0 : this.getInstituteid().hashCode() );
         result = 37 * result + ( getRegistrationid() == null ? 0 : this.getRegistrationid().hashCode() );
         result = 37 * result + ( getProgramsubjectid() == null ? 0 : this.getProgramsubjectid().hashCode() );
         return result;
   }   


}


