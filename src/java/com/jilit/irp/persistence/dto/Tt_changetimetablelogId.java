package com.jilit.irp.persistence.dto;
// Generated Jun 11, 2014 5:31:11 PM by Hibernate Tools 3.2.1.GA



/**
 * Tt#changetimetablelogId generated by hbm2java
 */
public class Tt_changetimetablelogId  implements java.io.Serializable {


     private String logtransid;
     private String tttransid;
     private String registrationid;

    public Tt_changetimetablelogId() {
    }

    public Tt_changetimetablelogId(String logtransid, String tttransid, String registrationid) {
       this.logtransid = logtransid;
       this.tttransid = tttransid;
       this.registrationid = registrationid;
    }

    public String getLogtransid() {
        return this.logtransid;
    }

    public void setLogtransid(String logtransid) {
        this.logtransid = logtransid;
    }
    public String getTttransid() {
        return this.tttransid;
    }

    public void setTttransid(String tttransid) {
        this.tttransid = tttransid;
    }
    public String getRegistrationid() {
        return this.registrationid;
    }

    public void setRegistrationid(String registrationid) {
        this.registrationid = registrationid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Tt_changetimetablelogId) ) return false;
		 Tt_changetimetablelogId castOther = ( Tt_changetimetablelogId ) other;

		 return ( (this.getLogtransid()==castOther.getLogtransid()) || ( this.getLogtransid()!=null && castOther.getLogtransid()!=null && this.getLogtransid().equals(castOther.getLogtransid()) ) )
 && ( (this.getTttransid()==castOther.getTttransid()) || ( this.getTttransid()!=null && castOther.getTttransid()!=null && this.getTttransid().equals(castOther.getTttransid()) ) )
 && ( (this.getRegistrationid()==castOther.getRegistrationid()) || ( this.getRegistrationid()!=null && castOther.getRegistrationid()!=null && this.getRegistrationid().equals(castOther.getRegistrationid()) ) );
   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getLogtransid() == null ? 0 : this.getLogtransid().hashCode() );
         result = 37 * result + ( getTttransid() == null ? 0 : this.getTttransid().hashCode() );
         result = 37 * result + ( getRegistrationid() == null ? 0 : this.getRegistrationid().hashCode() );
         return result;
   }


}


