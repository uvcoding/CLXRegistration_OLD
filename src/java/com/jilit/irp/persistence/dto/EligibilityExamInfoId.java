package com.jilit.irp.persistence.dto;
// Generated Jan 7, 2017 10:17:58 AM by Hibernate Tools 3.2.1.GA



/**
 * EligibilityexaminfoId generated by hbm2java
 */
public class EligibilityExamInfoId  implements java.io.Serializable {


     private String instituteid;
     private String eeexamid;

    public EligibilityExamInfoId() {
    }

    public EligibilityExamInfoId(String instituteid, String eeexamid) {
       this.instituteid = instituteid;
       this.eeexamid = eeexamid;
    }
   
    public String getInstituteid() {
        return this.instituteid;
    }

    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }
    public String getEeexamid() {
        return this.eeexamid;
    }

    public void setEeexamid(String eeexamid) {
        this.eeexamid = eeexamid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EligibilityExamInfoId) ) return false;
		 EligibilityExamInfoId castOther = ( EligibilityExamInfoId ) other;

		 return ( (this.getInstituteid()==castOther.getInstituteid()) || ( this.getInstituteid()!=null && castOther.getInstituteid()!=null && this.getInstituteid().equals(castOther.getInstituteid()) ) )
 && ( (this.getEeexamid()==castOther.getEeexamid()) || ( this.getEeexamid()!=null && castOther.getEeexamid()!=null && this.getEeexamid().equals(castOther.getEeexamid()) ) );
   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getInstituteid() == null ? 0 : this.getInstituteid().hashCode() );
         result = 37 * result + ( getEeexamid() == null ? 0 : this.getEeexamid().hashCode() );
         return result;
   }


}


