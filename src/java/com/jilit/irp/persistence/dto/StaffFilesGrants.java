package com.jilit.irp.persistence.dto;
// Generated Apr 4, 2017 11:17:54 AM by Hibernate Tools 3.2.1.GA



/**
 * StaffFilesGrants generated by hbm2java
 */
public class StaffFilesGrants  implements java.io.Serializable {


     private StaffFilesGrantsId id;
     private StaffFilesUploadingMaster stafffilesuploadingmaster;
     private String deactive;

    public StaffFilesGrants() {
    }

	
    public StaffFilesGrants(StaffFilesGrantsId id, StaffFilesUploadingMaster stafffilesuploadingmaster) {
        this.id = id;
        this.stafffilesuploadingmaster = stafffilesuploadingmaster;
    }
    public StaffFilesGrants(StaffFilesGrantsId id, StaffFilesUploadingMaster stafffilesuploadingmaster, String deactive) {
       this.id = id;
       this.stafffilesuploadingmaster = stafffilesuploadingmaster;
       this.deactive = deactive;
    }
   
    public StaffFilesGrantsId getId() {
        return this.id;
    }
    
    public void setId(StaffFilesGrantsId id) {
        this.id = id;
    }
    public StaffFilesUploadingMaster getStafffilesuploadingmaster() {
        return this.stafffilesuploadingmaster;
    }
    
    public void setStafffilesuploadingmaster(StaffFilesUploadingMaster stafffilesuploadingmaster) {
        this.stafffilesuploadingmaster = stafffilesuploadingmaster;
    }
    public String getDeactive() {
        return this.deactive;
    }
    
    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }




}


