package com.jilit.irp.persistence.dto;
// Generated 5 Jun, 2012 6:27:14 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Employeeacademicduty generated by hbm2java
 */
public class EmployeeAcademicDuty  implements java.io.Serializable {


     private EmployeeAcademicDutyId id; 
     private InstituteMaster institutemaster;
     private Date enddate;
     private String maininstitute;
     private String deactive;
     private Date deactivedate;

    public EmployeeAcademicDuty() {
    }

    public EmployeeAcademicDuty(EmployeeAcademicDuty dto) {
        this.institutemaster = dto.getInstitutemaster();// please do not remove Rinkal
        this.id = dto.getId();
        this.enddate = dto.getEnddate();
        this.maininstitute = dto.getMaininstitute();
        this.deactive = dto.getDeactive();
        this.deactivedate = dto.getDeactivedate();
    }

	
    public EmployeeAcademicDuty(EmployeeAcademicDutyId id,  InstituteMaster institutemaster) {
        this.id = id;
         
        this.institutemaster = institutemaster;
    }
    public EmployeeAcademicDuty(EmployeeAcademicDutyId id,  InstituteMaster institutemaster, Date enddate, String maininstitute, String deactive, Date deactivedate) {
       this.id = id;
       
       this.institutemaster = institutemaster;
       this.enddate = enddate;
       this.maininstitute = maininstitute;
       this.deactive = deactive;
       this.deactivedate = deactivedate;
    }
   
    public EmployeeAcademicDutyId getId() {
        return this.id;
    }
    
    public void setId(EmployeeAcademicDutyId id) {
        this.id = id;
    }
    
    public InstituteMaster getInstitutemaster() {
        return this.institutemaster;
    }
    
    public void setInstitutemaster(InstituteMaster institutemaster) {
        this.institutemaster = institutemaster;
    }
    public Date getEnddate() {
        return this.enddate;
    }
    
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
    public String getMaininstitute() {
        return this.maininstitute;
    }
    
    public void setMaininstitute(String maininstitute) {
        this.maininstitute = maininstitute;
    }
    public String getDeactive() {
        return this.deactive;
    }
    
    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }
    public Date getDeactivedate() {
        return this.deactivedate;
    }
    
    public void setDeactivedate(Date deactivedate) {
        this.deactivedate = deactivedate;
    }




}


