package com.jilit.irp.persistence.dto;
// Generated 8 Feb, 2014 10:19:36 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tt_timetableallocation generated by hbm2java
 */
public class TT_TimeTableAllocation  implements java.io.Serializable {


     private TT_TimeTableAllocationId id;
     private TT_SlotMaster tt_slotmaster;
     private SubjectMaster subjectmaster;
     private SubjectComponent subjectcomponent;
     private ExamCenterWiseRooms examcenterwiserooms;
     private TT_TimeTable tt_timetable;
     private DepartmentMaster departmentmaster;
     private String fromsessiontime;
     private String tosessiontime;
     private String stafftype;
     private String staffid;
     private BigDecimal durationofclass;
     private BigDecimal noofclassinaweek;
     private BigDecimal totalclasses;
     private String multifaculty;
     private String status;
     private String approvedby;
     private Date approveddate;
     private String approveremarks;
     private String deactive;
     private String entryby;
     private Date entrydate;
     private String subjectid;
     private String slotid;
     private String roomid;
     private String subjectcomponentid;
     private String allocationday;
     private String examcenterid;
     private String runningdepartmentid;
     private String ttreferenceid;
     private Set<TT_TimeTableAllocationDetail> tt_timetableallocationdetails=new  HashSet<TT_TimeTableAllocationDetail>(0);
     private Set<TT_MultiFacultyTeachingLoad> tt_multifacultyteachingloads=new  HashSet<TT_MultiFacultyTeachingLoad>(0);
     private Set<TT_SuspendedSlots> tt_suspendedslotses =new  HashSet<TT_SuspendedSlots>(0);
              
    public TT_TimeTableAllocation() {
    }


    public TT_TimeTableAllocation(TT_TimeTableAllocationId id, TT_SlotMaster tt_slotmaster, SubjectMaster subjectmaster, SubjectComponent subjectcomponent, ExamCenterWiseRooms examcenterwiserooms, TT_TimeTable tt_timetable, String fromsessiontime, String tosessiontime, String stafftype, String staffid, String deactive, String subjectid) {
        this.id = id;
        this.tt_slotmaster = tt_slotmaster;
        this.subjectmaster = subjectmaster;
        this.subjectcomponent = subjectcomponent;
        this.examcenterwiserooms = examcenterwiserooms;
        this.tt_timetable = tt_timetable;
        this.fromsessiontime = fromsessiontime;
        this.tosessiontime = tosessiontime;
        this.stafftype = stafftype;
        this.staffid = staffid;        
        this.deactive = deactive;
        this.subjectid = subjectid;
    }
    public TT_TimeTableAllocation(TT_TimeTableAllocationId id, TT_SlotMaster tt_slotmaster, SubjectMaster subjectmaster, SubjectComponent subjectcomponent, ExamCenterWiseRooms examcenterwiserooms, TT_TimeTable tt_timetable, DepartmentMaster departmentmaster, String fromsessiontime, String tosessiontime, String stafftype, String staffid, String basketid, BigDecimal durationofclass, BigDecimal noofclassinaweek, String multifaculty, String status, String approvedby, Date approveddate, String approveremarks, String deactive, String entryby, Date entrydate, String subjectid) {
       this.id = id;
       this.tt_slotmaster = tt_slotmaster;
       this.subjectmaster = subjectmaster;
       this.subjectcomponent = subjectcomponent;
       this.examcenterwiserooms = examcenterwiserooms;
       this.tt_timetable = tt_timetable;
       this.departmentmaster = departmentmaster;
       this.fromsessiontime = fromsessiontime;
       this.tosessiontime = tosessiontime;
       this.stafftype = stafftype;
       this.staffid = staffid;       
       this.durationofclass = durationofclass;
       this.noofclassinaweek = noofclassinaweek;
       this.multifaculty = multifaculty;
       this.status = status;
       this.approvedby = approvedby;
       this.approveddate = approveddate;
       this.approveremarks = approveremarks;
       this.deactive = deactive;
       this.entryby = entryby;
       this.entrydate = entrydate;
       this.subjectid = subjectid;
    }

    
    public String getFromsessiontime() {
        return this.fromsessiontime;
    }

    public void setFromsessiontime(String fromsessiontime) {
        this.fromsessiontime = fromsessiontime;
    }
    public String getTosessiontime() {
        return this.tosessiontime;
    }

    public void setTosessiontime(String tosessiontime) {
        this.tosessiontime = tosessiontime;
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
    
    public BigDecimal getDurationofclass() {
        return this.durationofclass;
    }

    public void setDurationofclass(BigDecimal durationofclass) {
        this.durationofclass = durationofclass;
    }
    public BigDecimal getNoofclassinaweek() {
        return this.noofclassinaweek;
    }

    public void setNoofclassinaweek(BigDecimal noofclassinaweek) {
        this.noofclassinaweek = noofclassinaweek;
    }
    public String getMultifaculty() {
        return this.multifaculty;
    }

    public void setMultifaculty(String multifaculty) {
        this.multifaculty = multifaculty;
    }
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getApprovedby() {
        return this.approvedby;
    }

    public void setApprovedby(String approvedby) {
        this.approvedby = approvedby;
    }
    public Date getApproveddate() {
        return this.approveddate;
    }

    public void setApproveddate(Date approveddate) {
        this.approveddate = approveddate;
    }
    public String getApproveremarks() {
        return this.approveremarks;
    }

    public void setApproveremarks(String approveremarks) {
        this.approveremarks = approveremarks;
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

    public DepartmentMaster getDepartmentmaster() {
        return departmentmaster;
    }

    public void setDepartmentmaster(DepartmentMaster departmentmaster) {
        this.departmentmaster = departmentmaster;
    }

    public ExamCenterWiseRooms getExamcenterwiserooms() {
        return examcenterwiserooms;
    }

    public void setExamcenterwiserooms(ExamCenterWiseRooms examcenterwiserooms) {
        this.examcenterwiserooms = examcenterwiserooms;
    }

    public TT_TimeTableAllocationId getId() {
        return id;
    }

    public void setId(TT_TimeTableAllocationId id) {
        this.id = id;
    }

    public SubjectComponent getSubjectcomponent() {
        return subjectcomponent;
    }

    public void setSubjectcomponent(SubjectComponent subjectcomponent) {
        this.subjectcomponent = subjectcomponent;
    }

    public SubjectMaster getSubjectmaster() {
        return subjectmaster;
    }

    public void setSubjectmaster(SubjectMaster subjectmaster) {
        this.subjectmaster = subjectmaster;
    }

    public TT_SlotMaster getTt_slotmaster() {
        return tt_slotmaster;
    }

    public String getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid;
    }

    public Set<TT_MultiFacultyTeachingLoad> getTt_multifacultyteachingloads() {
        return tt_multifacultyteachingloads;
    }

    public void setTt_multifacultyteachingloads(Set<TT_MultiFacultyTeachingLoad> tt_multifacultyteachingloads) {
        this.tt_multifacultyteachingloads = tt_multifacultyteachingloads;
    }

    public Set<TT_TimeTableAllocationDetail> getTt_timetableallocationdetails() {
        return tt_timetableallocationdetails;
    }

    public void setTt_timetableallocationdetails(Set<TT_TimeTableAllocationDetail> tt_timetableallocationdetails) {
        this.tt_timetableallocationdetails = tt_timetableallocationdetails;
    }

    public void setTt_slotmaster(TT_SlotMaster tt_slotmaster) {
        this.tt_slotmaster = tt_slotmaster;
    }

    public TT_TimeTable getTt_timetable() {
        return tt_timetable;
    }

    public void setTt_timetable(TT_TimeTable tt_timetable) {
        this.tt_timetable = tt_timetable;
    }

    public String getSlotid() {
        return slotid;
    }

    public void setSlotid(String slotid) {
        this.slotid = slotid;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getAllocationday() {
        return allocationday;
    }

    public void setAllocationday(String allocationday) {
        this.allocationday = allocationday;
    }

    public String getSubjectcomponentid() {
        return subjectcomponentid;
    }

    public void setSubjectcomponentid(String subjectcomponentid) {
        this.subjectcomponentid = subjectcomponentid;
    }

    public String getExamcenterid() {
        return examcenterid;
    }

    public void setExamcenterid(String examcenterid) {
        this.examcenterid = examcenterid;
    }

    public String getRunningdepartmentid() {
        return runningdepartmentid;
    }

    public void setRunningdepartmentid(String runningdepartmentid) {
        this.runningdepartmentid = runningdepartmentid;
    }


     public BigDecimal getTotalclasses() {
        return totalclasses;
    }

    public void setTotalclasses(BigDecimal totalclasses) {
        this.totalclasses = totalclasses;
    }

    public String getTtreferenceid() {
        return ttreferenceid;
    }

    public void setTtreferenceid(String ttreferenceid) {
        this.ttreferenceid = ttreferenceid;
    }

    public Set<TT_SuspendedSlots> getTt_suspendedslotses() {
        return tt_suspendedslotses;
    }

    public void setTt_suspendedslotses(Set<TT_SuspendedSlots> tt_suspendedslotses) {
        this.tt_suspendedslotses = tt_suspendedslotses;
    }


}