package com.jilit.irp.persistence.dto;
// Generated Sep 4, 2010 3:48:00 PM by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;
import java.util.Date;

/**
 * ExamEventSubjectTagging generated by hbm2java
 */
public class ExamEventSubjectTagging implements java.io.Serializable {

    private ExamEventSubjectTaggingId id;
    private RegistrationMaster registrationmaster;
    private FacultySubjectTagging facultysubjecttagging;
    private Date fromdate;
    private Date todate;
    private String published;
    private String locked;
    private BigDecimal weightage;
    private String marksorpercentage;
    private Short maxmarks;
    private Short passingmarks;
    private String doubleentry;
    private String firstentrycompleted;
    private String secondentrycompleted;
    private String deactive;
    private String weightageeditable;
    private String entryallowuser;
    private String examtypeid;
    private String conditionalpassapplicable;

       public ExamEventSubjectTagging() {
    }

    public ExamEventSubjectTagging(ExamEventSubjectTagging dto) {
        this.fromdate=dto.getFromdate();
        this.todate=dto.getTodate();
        this.published=dto.getPublished();
        this.locked=dto.getLocked();
        this.weightage=dto.getWeightage();
        this.marksorpercentage=dto.getMarksorpercentage();
        this.maxmarks=dto.getMaxmarks();
        this.passingmarks=dto.getPassingmarks();
        this.doubleentry=dto.getDoubleentry();
        this.firstentrycompleted=dto.getFirstentrycompleted();
        this.deactive=dto.getDeactive();
        this.weightageeditable = dto.getWeightageeditable();
        this.entryallowuser = dto.getEntryallowuser();
        this.examtypeid = dto.getExamtypeid();
    }
    public ExamEventSubjectTagging(ExamEventSubjectTaggingId id, RegistrationMaster registrationmaster, FacultySubjectTagging facultysubjecttagging  ) {
        this.id = id;
        this.registrationmaster = registrationmaster;
        this.facultysubjecttagging = facultysubjecttagging;

    }

    public ExamEventSubjectTagging(ExamEventSubjectTaggingId id, RegistrationMaster registrationmaster, FacultySubjectTagging facultysubjecttagging,   Date fromdate, Date todate, String published, String locked, BigDecimal weightage, String marksorpercentage, Short maxmarks, Short passingmarks, String doubleentry, String firstentrycompleted, String deactive, String weightageeditable, String entryallowuser) {
        this.id = id;
        this.registrationmaster = registrationmaster;
        this.facultysubjecttagging = facultysubjecttagging;

        this.fromdate = fromdate;
        this.todate = todate;
        this.published = published;
        this.locked = locked;
        this.weightage = weightage;
        this.marksorpercentage = marksorpercentage;
        this.maxmarks = maxmarks;
        this.passingmarks = passingmarks;
        this.doubleentry = doubleentry;
        this.firstentrycompleted = firstentrycompleted;
        this.deactive = deactive;
        this.weightageeditable = weightageeditable;
        this.entryallowuser = entryallowuser;
    }

    public ExamEventSubjectTaggingId getId() {
        return this.id;
    }

    public void setId(ExamEventSubjectTaggingId id) {
        this.id = id;
    }


    public FacultySubjectTagging getFacultysubjecttagging() {
        return facultysubjecttagging;
    }

    public void setFacultysubjecttagging(FacultySubjectTagging facultysubjecttagging) {
        this.facultysubjecttagging = facultysubjecttagging;
    }

    public RegistrationMaster getRegistrationmaster() {
        return registrationmaster;
    }

    public void setRegistrationmaster(RegistrationMaster registrationmaster) {
        this.registrationmaster = registrationmaster;
    }

    public Date getFromdate() {
        return this.fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getTodate() {
        return this.todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }

    public String getPublished() {
        return this.published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getLocked() {
        return this.locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public BigDecimal getWeightage() {
        return this.weightage;
    }

    public void setWeightage(BigDecimal weightage) {
        this.weightage = weightage;
    }

    public String getMarksorpercentage() {
        return this.marksorpercentage;
    }

    public void setMarksorpercentage(String marksorpercentage) {
        this.marksorpercentage = marksorpercentage;
    }

    public Short getMaxmarks() {
        return this.maxmarks;
    }

    public void setMaxmarks(Short maxmarks) {
        this.maxmarks = maxmarks;
    }

    public Short getPassingmarks() {
        return this.passingmarks;
    }

    public void setPassingmarks(Short passingmarks) {
        this.passingmarks = passingmarks;
    }

    public String getDoubleentry() {
        return this.doubleentry;
    }

    public void setDoubleentry(String doubleentry) {
        this.doubleentry = doubleentry;
    }

    public String getFirstentrycompleted() {
        return this.firstentrycompleted;
    }

    public void setFirstentrycompleted(String firstentrycompleted) {
        this.firstentrycompleted = firstentrycompleted;
    }

    public String getDeactive() {
        return this.deactive;
    }

    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }

    public String getEntryallowuser() {
        return entryallowuser;
    }

    public void setEntryallowuser(String entryallowuser) {
        this.entryallowuser = entryallowuser;
    }

    public String getWeightageeditable() {
        return weightageeditable;
    }

    public void setWeightageeditable(String weightageeditable) {
        this.weightageeditable = weightageeditable;
    }

     public String getIdStr() {
        return id.getInstituteid()+":"+id.getRegistrationid()+":"+id.getExameventid();
    }

      
    public String getExamtypeid() {
        return examtypeid;
    }

    public void setExamtypeid(String examtypeid) {
        this.examtypeid = examtypeid;
    }

    public String getSecondentrycompleted() {
        return secondentrycompleted;
    }

    public void setSecondentrycompleted(String secondentrycompleted) {
        this.secondentrycompleted = secondentrycompleted;
    }
     public String getConditionalpassapplicable() {
        return conditionalpassapplicable;
    }

    public void setConditionalpassapplicable(String conditionalpassapplicable) {
        this.conditionalpassapplicable = conditionalpassapplicable;
    }

}
