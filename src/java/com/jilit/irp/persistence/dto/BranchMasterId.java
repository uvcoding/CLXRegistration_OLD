package com.jilit.irp.persistence.dto;
// Generated Sep 12, 2009 11:04:12 AM by Hibernate Tools 3.2.1.GA



/**
 * BranchMasterId generated by hbm2java
 */
public class BranchMasterId  implements java.io.Serializable {


     private String instituteid;
     private String programid;
     private String branchid;

    public BranchMasterId() {
    }

    public BranchMasterId(String instituteid, String programid, String branchid) {
       this.instituteid = instituteid;
       this.programid = programid;
       this.branchid = branchid;
    }

    public String getInstituteid() {
        return this.instituteid;
    }

    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
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
		 if ( !(other instanceof BranchMasterId) ) return false;
		 BranchMasterId castOther = ( BranchMasterId ) other;

		 return ( (this.getInstituteid()==castOther.getInstituteid()) || ( this.getInstituteid()!=null && castOther.getInstituteid()!=null && this.getInstituteid().equals(castOther.getInstituteid()) ) )
 && ( (this.getProgramid()==castOther.getProgramid()) || ( this.getProgramid()!=null && castOther.getProgramid()!=null && this.getProgramid().equals(castOther.getProgramid()) ) )
 && ( (this.getBranchid()==castOther.getBranchid()) || ( this.getBranchid()!=null && castOther.getBranchid()!=null && this.getBranchid().equals(castOther.getBranchid()) ) );
   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getInstituteid() == null ? 0 : this.getInstituteid().hashCode() );
         result = 37 * result + ( getProgramid() == null ? 0 : this.getProgramid().hashCode() );
         result = 37 * result + ( getBranchid() == null ? 0 : this.getBranchid().hashCode() );
         return result;
   }


}


