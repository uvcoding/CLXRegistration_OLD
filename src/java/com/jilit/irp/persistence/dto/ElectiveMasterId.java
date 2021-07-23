package com.jilit.irp.persistence.dto;
// Generated Jun 22, 2011 4:37:22 PM by Hibernate Tools 3.2.1.GA



/**
 * ElectivemasterId generated by hbm2java
 */
public class ElectiveMasterId  implements java.io.Serializable {


     private String instituteid;
     private String electiveid;

    public ElectiveMasterId() {
    }

    public ElectiveMasterId(String instituteid, String electiveid) {
       this.instituteid = instituteid;
       this.electiveid = electiveid;
    }
   
    public String getInstituteid() {
        return this.instituteid;
    }
    
    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }
    public String getElectiveid() {
        return this.electiveid;
    }
    
    public void setElectiveid(String electiveid) {
        this.electiveid = electiveid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ElectiveMasterId) ) return false;
		 ElectiveMasterId castOther = ( ElectiveMasterId ) other;
         
		 return ( (this.getInstituteid()==castOther.getInstituteid()) || ( this.getInstituteid()!=null && castOther.getInstituteid()!=null && this.getInstituteid().equals(castOther.getInstituteid()) ) )
 && ( (this.getElectiveid()==castOther.getElectiveid()) || ( this.getElectiveid()!=null && castOther.getElectiveid()!=null && this.getElectiveid().equals(castOther.getElectiveid()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getInstituteid() == null ? 0 : this.getInstituteid().hashCode() );
         result = 37 * result + ( getElectiveid() == null ? 0 : this.getElectiveid().hashCode() );
         return result;
   }   


}


