package com.jilit.irp.persistence.dto;
// Generated 7 Feb, 2014 4:28:12 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Tt_programwiseslot generated by hbm2java
 */
public class TT_ProgramWiseSlot  implements java.io.Serializable {
 

     private TT_ProgramWiseSlotId id;
     private Academicyear academicyear;
     private ProgramMaster programmaster;
     private TT_SlotMaster tt_slotmaster;
     private Date timetablestartdate;
     private Date timetableenddate;
     private String deactive;
     private String entryby;
     private Date entrydate;

    public TT_ProgramWiseSlot() {
    }

    public TT_ProgramWiseSlot(TT_ProgramWiseSlot dto) {
        this.id=dto.getId();
        this.academicyear=dto.getAcademicyear();
        this.programmaster=dto.getProgrammaster();
        this.tt_slotmaster=dto.getTt_slotmaster();
        this.timetablestartdate=dto.getTimetablestartdate();
        this.timetableenddate=dto.getTimetableenddate();
        this.deactive=dto.getDeactive();
        this.entryby=dto.getEntryby();
        this.entrydate=dto.getEntrydate();
    }

	
    public TT_ProgramWiseSlot(TT_ProgramWiseSlotId id, Academicyear academicyear, ProgramMaster programmaster, TT_SlotMaster tt_slotmaster, Date timetablestartdate, Date timetableenddate) {
        this.id = id;
        this.academicyear = academicyear;
        this.programmaster = programmaster;
        this.tt_slotmaster = tt_slotmaster;
        this.timetablestartdate = timetablestartdate;
        this.timetableenddate = timetableenddate;
    }
    public TT_ProgramWiseSlot(TT_ProgramWiseSlotId id, Academicyear academicyear, ProgramMaster programmaster, TT_SlotMaster tt_slotmaster, Date timetablestartdate, Date timetableenddate, String deactive, String entryby, Date entrydate) {
       this.id = id;
       this.academicyear = academicyear;
       this.programmaster = programmaster;
       this.tt_slotmaster = tt_slotmaster;
       this.timetablestartdate = timetablestartdate;
       this.timetableenddate = timetableenddate;
       this.deactive = deactive;
       this.entryby = entryby;
       this.entrydate = entrydate;
    }

    public String getIdStr() {
        return id.getInstituteid()+":"+id.getRegistrationid()+":"+id.getDays()+":"+id.getSlotid()+":"+id.getAcademicyear()+":"+id.getProgramid();
    }
   
    

    public Date getTimetablestartdate() {
        return this.timetablestartdate;
    }
    
    public void setTimetablestartdate(Date timetablestartdate) {
        this.timetablestartdate = timetablestartdate;
    }
    public Date getTimetableenddate() {
        return this.timetableenddate;
    }
    
    public void setTimetableenddate(Date timetableenddate) {
        this.timetableenddate = timetableenddate;
    }
    public String getDeactive() {
        return this.deactive;
    }
    
    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }
    public String getEntryby() {
        return this.entryby;
    }
    
    public void setEntryby(String entryby) {
        this.entryby = entryby;
    }
    public Date getEntrydate() {
        return this.entrydate;
    }
    
    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }
 

    public TT_ProgramWiseSlotId getId() {
        return id;
    }

    public void setId(TT_ProgramWiseSlotId id) {
        this.id = id;
    }

    public ProgramMaster getProgrammaster() {
        return programmaster;
    }

    public void setProgrammaster(ProgramMaster programmaster) {
        this.programmaster = programmaster;
    }

    public TT_SlotMaster getTt_slotmaster() {
        return tt_slotmaster;
    }

    public void setTt_slotmaster(TT_SlotMaster tt_slotmaster) {
        this.tt_slotmaster = tt_slotmaster;
    }

    public Academicyear getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(Academicyear academicyear) {
        this.academicyear = academicyear;
    }

    


}


