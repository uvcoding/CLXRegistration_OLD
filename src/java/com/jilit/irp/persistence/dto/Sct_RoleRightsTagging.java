package com.jilit.irp.persistence.dto;
// Generated Sep 12, 2009 11:04:12 AM by Hibernate Tools 3.2.1.GA

/**
 * Sct_RoleRightsTagging generated by hbm2java
 */
public class Sct_RoleRightsTagging implements java.io.Serializable {

    private Sct_RoleRightsTaggingId id;
    private Sct_ModuleRightsMaster sct_modulerightsmaster;
    private Sct_RoleMaster sct_rolemaster;
    private String menulable;
    private Character deactive;

    public Sct_RoleRightsTagging() {
    }

    public Sct_RoleRightsTagging(Sct_RoleRightsTaggingId id, Sct_ModuleRightsMaster sct_modulerightsmaster, Sct_RoleMaster sct_rolemaster) {
        this.id = id;
        this.sct_modulerightsmaster = sct_modulerightsmaster;
        this.sct_rolemaster = sct_rolemaster;
    }

    public Sct_RoleRightsTagging(Sct_RoleRightsTaggingId id, Sct_ModuleRightsMaster sct_modulerightsmaster, Sct_RoleMaster sct_rolemaster, String menulable, Character deactive) {
        this.id = id;
        this.sct_modulerightsmaster = sct_modulerightsmaster;
        this.sct_rolemaster = sct_rolemaster;
        this.deactive = deactive;
        this.menulable = menulable;
    }

    public Sct_RoleRightsTaggingId getId() {
        return this.id;
    }

    public void setId(Sct_RoleRightsTaggingId id) {
        this.id = id;
    }

    public Character getDeactive() {
        return this.deactive;
    }

    public void setDeactive(Character deactive) {
        this.deactive = deactive;
    }

    public Sct_ModuleRightsMaster getSct_modulerightsmaster() {
        return sct_modulerightsmaster;
    }

    public void setSct_modulerightsmaster(Sct_ModuleRightsMaster sct_modulerightsmaster) {
        this.sct_modulerightsmaster = sct_modulerightsmaster;
    }

    public Sct_RoleMaster getSct_rolemaster() {
        return sct_rolemaster;
    }

    public void setSct_rolemaster(Sct_RoleMaster sct_rolemaster) {
        this.sct_rolemaster = sct_rolemaster;
    }

    public String getMenulable() {
        return menulable;
    }

    public void setMenulable(String menulable) {
        this.menulable = menulable;
    }
}


