package com.jilit.irp.persistence.dto;
// Generated Sep 10, 2011 11:08:27 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * CoordinatorNameFSTwiseId generated by hbm2java
 */
public class CoordinatorNameFSTwiseId  implements java.io.Serializable {


     private String instituteid;
     private String coordinatortypeid;
     private String stafftype;
     private String staffid;
     private String fstid;
     private Date fromdate;

    public CoordinatorNameFSTwiseId() {
    }

    public CoordinatorNameFSTwiseId(String instituteid, String coordinatortypeid, String stafftype, String staffid, String fstid, Date fromdate) {
       this.instituteid = instituteid;
       this.coordinatortypeid = coordinatortypeid;
       this.stafftype = stafftype;
       this.staffid = staffid;
       this.fstid = fstid;
       this.fromdate = fromdate;
    }
   
    public String getInstituteid() {
        return this.instituteid;
    }
    
    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }
    public String getCoordinatortypeid() {
        return this.coordinatortypeid;
    }
    
    public void setCoordinatortypeid(String coordinatortypeid) {
        this.coordinatortypeid = coordinatortypeid;
    }
    public String getStafftype() {
        return this.stafftype;
    }
    
    public void setStafftype(String stafftype) {
        this.stafftype = stafftype;
    }
    public String getStaffid() {
        return this.staffid;
    }
    
    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }
    public String getFstid() {
        return this.fstid;
    }
    
    public void setFstid(String fstid) {
        this.fstid = fstid;
    }
    public Date getFromdate() {
        return this.fromdate;
    }
    
    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }


    


}


