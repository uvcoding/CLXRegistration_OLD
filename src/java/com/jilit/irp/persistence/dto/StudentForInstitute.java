package com.jilit.irp.persistence.dto;
// Generated Nov 12, 2009 10:47:41 AM by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

/**
 * StudentForInstitute generated by hbm2java
 */
public class StudentForInstitute implements java.io.Serializable {

    private StudentForInstituteId id;
    private InstituteMaster institutemaster;
    private String forinstitutecode;
    private String shortname;
    private String forinstitutedesc;
    private String maininstitute;
    private Short seqid;
    private String deactive;
    private Set<StudentMaster> studentmasters = new HashSet<StudentMaster>(0);

    public StudentForInstitute() {
    }

   
    public StudentForInstitute(StudentForInstituteId id, String forinstitutecode, String shortname, String forinstitutedesc, String maininstitute) {
        this.id = id;
        this.forinstitutecode = forinstitutecode;
        this.shortname = shortname;
        this.forinstitutedesc = forinstitutedesc;
        this.maininstitute = maininstitute;
    }

    public StudentForInstitute(StudentForInstituteId id, String forinstitutecode, String shortname, String forinstitutedesc, String maininstitute, Short seqid, String deactive) {
        this.id = id;
        this.forinstitutecode = forinstitutecode;
        this.shortname = shortname;
        this.forinstitutedesc = forinstitutedesc;
        this.maininstitute = maininstitute;
        this.seqid = seqid;
        this.deactive = deactive;
    }

    public StudentForInstitute(StudentForInstitute dto) {
        this.id = dto.getId();
        this.forinstitutecode = dto.getForinstitutecode();
        this.shortname = dto.getShortname();
        this.forinstitutedesc = dto.getForinstitutedesc();
        this.maininstitute = dto.getMaininstitute();

        this.deactive = dto.getDeactive();
    }

    public StudentForInstituteId getId() {
        return this.id;
    }

    public void setId(StudentForInstituteId id) {
        this.id = id;
    }

    public String getForinstitutecode() {
        return this.forinstitutecode;
    }

    public void setForinstitutecode(String forinstitutecode) {
        this.forinstitutecode = forinstitutecode;
    }

    public String getShortname() {
        return this.shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getForinstitutedesc() {
        return this.forinstitutedesc;
    }

    public void setForinstitutedesc(String forinstitutedesc) {
        this.forinstitutedesc = forinstitutedesc;
    }

    public String getMaininstitute() {
        return this.maininstitute;
    }

    public void setMaininstitute(String maininstitute) {
        this.maininstitute = maininstitute;
    }

    public Short getSeqid() {
        return this.seqid;
    }

    public void setSeqid(Short seqid) {
        this.seqid = seqid;
    }

    public String getDeactive() {
        return this.deactive;
    }

    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }

    public String getIdStr() {
        return id.getInstituteid() + ":" + id.getForinstituteid();
    }

    public InstituteMaster getInstitutemaster() {
        return institutemaster;
    }

    public void setInstitutemaster(InstituteMaster institutemaster) {
        this.institutemaster = institutemaster;
    }

    public Set<StudentMaster> getStudentmasters() {
        return studentmasters;
    }

    public void setStudentmasters(Set<StudentMaster> studentmasters) {
        this.studentmasters = studentmasters;
    }
}


