package com.jilit.irp.persistence.dto;
// Generated Apr 21, 2011 3:02:39 PM by Hibernate Tools 3.2.1.GA

/**
 * FeeHeadsId generated by hbm2java
 */
public class DebarreasonMasterId implements java.io.Serializable {

    private String instituteid;
    private String debarreasonid;

    public DebarreasonMasterId() {
    }

    public DebarreasonMasterId(String instituteid, String debarreasonid) {
        this.instituteid = instituteid;
        this.debarreasonid = debarreasonid;
    }

    public String getInstituteid() {
        return this.instituteid;
    }

    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }

    public String getDebarreasonid() {
        return debarreasonid;
    }

    public void setDebarreasonid(String debarreasonid) {
        this.debarreasonid = debarreasonid;
    }

}
