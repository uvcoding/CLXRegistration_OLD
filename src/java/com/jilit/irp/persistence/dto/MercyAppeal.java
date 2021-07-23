package com.jilit.irp.persistence.dto;
// Generated 14 Dec, 2011 11:27:05 AM by Hibernate Tools 3.2.1.GA

import java.util.Date;


/**
 * Srs#eventmaster generated by hbm2java
 */
public class MercyAppeal  implements java.io.Serializable
{


     private MercyAppealId id;
     private RegistrationMaster registrationmaster;
     private StudentMaster studentmaster;
     private String mercygrant;
     private String remarks;
     private String entryby;
     private Date entrydate;

    public MercyAppeal() {
    }

    public MercyAppeal(MercyAppealId id, String mercygrant, String remarks, String entryby, Date entrydate) {
        this.id = id;
        this.mercygrant = mercygrant;
        this.remarks = remarks;
        this.entryby = entryby;
        this.entrydate = entrydate;
    }

    public String getEntryby() {
        return entryby;
    }

    public void setEntryby(String entryby) {
        this.entryby = entryby;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public MercyAppealId getId() {
        return id;
    }

    public void setId(MercyAppealId id) {
        this.id = id;
    }

    public String getMercygrant() {
        return mercygrant;
    }

    public void setMercygrant(String mercygrant) {
        this.mercygrant = mercygrant;
    }

    public RegistrationMaster getRegistrationmaster() {
        return registrationmaster;
    }

    public void setRegistrationmaster(RegistrationMaster registrationmaster) {
        this.registrationmaster = registrationmaster;
    }

    public StudentMaster getStudentmaster() {
        return studentmaster;
    }

    public void setStudentmaster(StudentMaster studentmaster) {
        this.studentmaster = studentmaster;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}