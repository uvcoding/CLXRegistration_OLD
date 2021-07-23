package com.jilit.irp.persistence.dto;
// Generated Sep 12, 2009 11:04:12 AM by Hibernate Tools 3.2.1.GA

/**
 * RollNumberingSetupDetail generated by hbm2java
 */
public class RollNumberingSetupDetail implements java.io.Serializable {

    private RollNumberingSetupDetailId id;
    private RollNumberingSetup rollnumberingsetup;
    private ProgramType programtype;
    private BranchMaster branchmaster;
    private Academicyear academicyear;
    private ProgramMaster programmaster;



    public RollNumberingSetupDetail() {
    }

    public RollNumberingSetupDetail(RollNumberingSetupDetail dto, boolean childReqd) {

        this.id = dto.getId();
//        this.rollnumberingsetup = dto.getRollnumberingsetup();
//        this.programtype = dto.getProgramtype();
//        this.branchmaster = dto.getBranchmaster();
//        this.academicyear = dto.academicyear;
    }

    public RollNumberingSetupDetail(RollNumberingSetupDetail dto) {
        this.id = dto.getId();
//        this.rollnumberingsetup = dto.getRollnumberingsetup();
//        this.programtype = dto.getProgramtype();
//        this.branchmaster = dto.getBranchmaster();
//        this.academicyear = dto.academicyear;
    }

    public RollNumberingSetupDetail(RollNumberingSetupDetailId id, RollNumberingSetup rollnumberingsetup, ProgramType programtype, BranchMaster branchmaster, Academicyear academicyear) {
        this.id = id;
        this.rollnumberingsetup = rollnumberingsetup;
        this.programtype = programtype;
        this.branchmaster = branchmaster;
        this.academicyear = academicyear;
    }

    public RollNumberingSetupDetailId getId() {
        return this.id;
    }

    public void setId(RollNumberingSetupDetailId id) {
        this.id = id;
    }

    public Academicyear getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(Academicyear academicyear) {
        this.academicyear = academicyear;
    }

    public BranchMaster getBranchmaster() {
        return branchmaster;
    }

    public void setBranchmaster(BranchMaster branchmaster) {
        this.branchmaster = branchmaster;
    }

    public ProgramType getProgramtype() {
        return programtype;
    }

    public void setProgramtype(ProgramType programtype) {
        this.programtype = programtype;
    }

    public RollNumberingSetup getRollnumberingsetup() {
        return rollnumberingsetup;
    }

    public void setRollnumberingsetup(RollNumberingSetup rollnumberingsetup) {
        this.rollnumberingsetup = rollnumberingsetup;
    }

     public ProgramMaster getProgrammaster() {
        return programmaster;
    }

    public void setProgrammaster(ProgramMaster programmaster) {
        this.programmaster = programmaster;
    }

    public String getPrgtypePrgBrnIdStr() {
        return this.getId().getProgramtypeid() + ":" + this.getId().getProgramid() + ":" + this.getId().getBranchid() + ":" + this.getId().getGroupid();
    }
    public String getIdStr() {
    return id.getInstituteid() + "::" +id.getGroupid()   + "::" + id.getAcademicyear()+ "::" +id.getProgramtypeid()+ "::" +id.getProgramid()+ "::" +id.getBranchid();


    }
}




