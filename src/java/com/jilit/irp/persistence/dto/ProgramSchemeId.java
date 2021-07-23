package com.jilit.irp.persistence.dto;
// Generated Dec 19, 2009 12:17:52 PM by Hibernate Tools 3.2.1.GA



/**
 * ProgramschemeId generated by hbm2java
 */
public class ProgramSchemeId  implements java.io.Serializable {


     private String instituteid;
     private String programschemeid;

    public ProgramSchemeId() {
    }

    public ProgramSchemeId(String instituteid, String programschemeid) {
       this.instituteid = instituteid;
       this.programschemeid = programschemeid;
    }
   
    public String getInstituteid() {
        return this.instituteid;
    }
    
    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }
    public String getProgramschemeid() {
        return this.programschemeid;
    }
    
    public void setProgramschemeid(String programschemeid) {
        this.programschemeid = programschemeid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ProgramSchemeId) ) return false;
		 ProgramSchemeId castOther = ( ProgramSchemeId ) other;
         
		 return ( (this.getInstituteid()==castOther.getInstituteid()) || ( this.getInstituteid()!=null && castOther.getInstituteid()!=null && this.getInstituteid().equals(castOther.getInstituteid()) ) )
 && ( (this.getProgramschemeid()==castOther.getProgramschemeid()) || ( this.getProgramschemeid()!=null && castOther.getProgramschemeid()!=null && this.getProgramschemeid().equals(castOther.getProgramschemeid()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getInstituteid() == null ? 0 : this.getInstituteid().hashCode() );
         result = 37 * result + ( getProgramschemeid() == null ? 0 : this.getProgramschemeid().hashCode() );
         return result;
   }   


}


