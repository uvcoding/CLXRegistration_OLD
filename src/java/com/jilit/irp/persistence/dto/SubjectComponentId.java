package com.jilit.irp.persistence.dto;
// Generated Dec 19, 2009 12:17:52 PM by Hibernate Tools 3.2.1.GA



/**
 * SubjectcomponentId generated by hbm2java
 */
public class SubjectComponentId  implements java.io.Serializable {


     private String instituteid;
     private String subjectcomponentid;

    /**
     * @return the instituteid
     */
   public SubjectComponentId()
   {
     
    }

     public SubjectComponentId(String instituteid,String subjectcomponentid)
     {
            this.instituteid=instituteid;
            this.subjectcomponentid=subjectcomponentid;
     }


    public String getInstituteid() {
        return instituteid;
    }

    /**
     * @param instituteid the instituteid to set
     */
    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }

    /**
     * @return the subjectcomponentid
     */
    public String getSubjectcomponentid() {
        return subjectcomponentid;
    }

    /**
     * @param subjectcomponentid the subjectcomponentid to set
     */
    public void setSubjectcomponentid(String subjectcomponentid) {
        this.subjectcomponentid = subjectcomponentid;
    }

   

   /*public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SubjectComponentId) ) return false;
		 SubjectComponentId castOther = ( SubjectComponentId ) other;
         
		 return ( (this.getInstituteid()==castOther.getInstituteid()) || ( this.getInstituteid()!=null && castOther.getInstituteid()!=null && this.getInstituteid().equals(castOther.getInstituteid()) ) )
 && ( (this.getSubjectcomponentid()==castOther.getSubjectcomponentid()) || ( this.getSubjectcomponentid()!=null && castOther.getSubjectcomponentid()!=null && this.getSubjectcomponentid().equals(castOther.getSubjectcomponentid()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getInstituteid() == null ? 0 : this.getInstituteid().hashCode() );
         result = 37 * result + ( getSubjectcomponentid() == null ? 0 : this.getSubjectcomponentid().hashCode() );
         return result;
   } */


}


