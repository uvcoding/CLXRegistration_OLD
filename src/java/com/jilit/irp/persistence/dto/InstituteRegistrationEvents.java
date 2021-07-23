package com.jilit.irp.persistence.dto;
// Generated Dec 19, 2009 4:28:16 PM by Hibernate Tools 3.2.1.GA



/**
 * Instituteregistrationevents generated by hbm2java
 */
public class InstituteRegistrationEvents  implements java.io.Serializable {


     private InstituteRegistrationEventsId id;
     private InstituteMaster institutemaster;
     private RegistrationMaster registrationmaster;
     private String preregistrationallowed;
     private String gradeentryallowed;
     private String marksentryallowed;
     private String attendentryallowed;
     private String srsallowed;
     private String supplymentryrequestallowed;
     private String hostelallocationallowed;

    public InstituteRegistrationEvents() {
    }


    public InstituteRegistrationEvents(InstituteRegistrationEventsId id) {
        this.id = id;
    }
    public InstituteRegistrationEvents(InstituteRegistrationEventsId id, String preregistrationallowed, String gradeentryallowed, String marksentryallowed, String attendentryallowed, String srsallowed, String supplymentryrequestallowed) {
       this.id = id;
       this.preregistrationallowed = preregistrationallowed;
       this.gradeentryallowed = gradeentryallowed;
       this.marksentryallowed = marksentryallowed;
       this.attendentryallowed = attendentryallowed;
       this.srsallowed = srsallowed;
       this.supplymentryrequestallowed = supplymentryrequestallowed;
    }

    public InstituteRegistrationEvents(InstituteRegistrationEvents dto) {
        this.id = dto.getId();
        this.preregistrationallowed = dto.getPreregistrationallowed();
        this.gradeentryallowed = dto.getGradeentryallowed();
        this.marksentryallowed = dto.getMarksentryallowed();
        this.attendentryallowed = dto.getAttendentryallowed();
        this.srsallowed = dto.getSrsallowed();
        this.supplymentryrequestallowed = dto.getSupplymentryrequestallowed();
    }

    public InstituteRegistrationEventsId getId() {
        return this.id;
    }

    public void setId(InstituteRegistrationEventsId id) {
        this.id = id;
    }
    public String getPreregistrationallowed() {
        return this.preregistrationallowed;
    }

    public void setPreregistrationallowed(String preregistrationallowed) {
        this.preregistrationallowed = preregistrationallowed;
    }
    public String getGradeentryallowed() {
        return this.gradeentryallowed;
    }

    public void setGradeentryallowed(String gradeentryallowed) {
        this.gradeentryallowed = gradeentryallowed;
    }
    public String getMarksentryallowed() {
        return this.marksentryallowed;
    }

    public void setMarksentryallowed(String marksentryallowed) {
        this.marksentryallowed = marksentryallowed;
    }
    public String getAttendentryallowed() {
        return this.attendentryallowed;
    }

    public void setAttendentryallowed(String attendentryallowed) {
        this.attendentryallowed = attendentryallowed;
    }
    public String getSrsallowed() {
        return this.srsallowed;
    }

    public void setSrsallowed(String srsallowed) {
        this.srsallowed = srsallowed;
    }
    public String getSupplymentryrequestallowed() {
        return this.supplymentryrequestallowed;
    }

    public void setSupplymentryrequestallowed(String supplymentryrequestallowed) {
        this.supplymentryrequestallowed = supplymentryrequestallowed;
    }

    public InstituteMaster getInstitutemaster() {
        return institutemaster;
    }

    public void setInstitutemaster(InstituteMaster institutemaster) {
        this.institutemaster = institutemaster;
    }

    public RegistrationMaster getRegistrationmaster() {
        return registrationmaster;
    }

    public void setRegistrationmaster(RegistrationMaster registrationmaster) {
        this.registrationmaster = registrationmaster;
    }


    public String getIdStr(){
        return getId().getInstituteid()+":"+getId().getRegistrationid();
    }

    public String getHostelallocationallowed() {
        return hostelallocationallowed;
    }

    public void setHostelallocationallowed(String hostelallocationallowed) {
        this.hostelallocationallowed = hostelallocationallowed;
    }

}


