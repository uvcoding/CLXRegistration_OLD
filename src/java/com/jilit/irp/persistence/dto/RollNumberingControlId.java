package com.jilit.irp.persistence.dto;
// Generated Sep 12, 2009 11:04:12 AM by Hibernate Tools 3.2.1.GA

/**
 * RollNumberingControlId generated by hbm2java
 */
public class RollNumberingControlId implements java.io.Serializable {

    private String instituteid;
    private String groupid;
    private String programid;
    private String ym;

    public RollNumberingControlId() {
    }

    public RollNumberingControlId(String instituteid, String groupid, String ym,String programid) {
        this.instituteid = instituteid;
        this.groupid = groupid;
        this.ym = ym;
        this.programid = programid;
    }
    
     public RollNumberingControlId(String instituteid, String groupid, String ym) {
        this.instituteid = instituteid;
        this.groupid = groupid;
        this.ym = ym;
    }

    public String getInstituteid() {
        return this.instituteid;
    }

    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }

    public String getGroupid() {
        return this.groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

     public String getProgramid() {
        return programid;
    }

    public void setProgramid(String programid) {
        this.programid = programid;
    }
    
    public String getYm() {
        return this.ym;
    }

    public void setYm(String ym) {
        this.ym = ym;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof RollNumberingControlId)) {
            return false;
        }
        RollNumberingControlId castOther = (RollNumberingControlId) other;

        return ((this.getInstituteid() == castOther.getInstituteid()) || (this.getInstituteid() != null && castOther.getInstituteid() != null && this.getInstituteid().equals(castOther.getInstituteid())))
                && ((this.getGroupid() == castOther.getGroupid()) || (this.getGroupid() != null && castOther.getGroupid() != null && this.getGroupid().equals(castOther.getGroupid())))
                && ((this.getYm() == castOther.getYm()) || (this.getYm() != null && castOther.getYm() != null && this.getYm().equals(castOther.getYm())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getInstituteid() == null ? 0 : this.getInstituteid().hashCode());
        result = 37 * result + (getGroupid() == null ? 0 : this.getGroupid().hashCode());
        result = 37 * result + (getYm() == null ? 0 : this.getYm().hashCode());
        return result;
    }

}
