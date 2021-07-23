package com.jilit.irp.persistence.dto;
// Generated Oct 12, 2010 11:07:25 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MeetingAgendaMaster generated by hbm2java
 */
public class MeetingAgendaMaster  implements java.io.Serializable {

     private MeetingAgendaMasterId id;
     private CommitteeMaster committeemaster;
     private String agendadesc;
     private Date agendadate;
     private String agendastatus;
     private String deactive;
     private Set <CommitteeActionDetail> committeeactiondetails = new HashSet <CommitteeActionDetail>(0);
     private Set <CommitteeMeetingDetail> committeemeetingdetails = new HashSet <CommitteeMeetingDetail>(0);
     private Set <CommitteeMeetingParticipents> committeemeetingparticipentses = new HashSet <CommitteeMeetingParticipents>(0);

    public MeetingAgendaMaster() {
    }

    public MeetingAgendaMaster(MeetingAgendaMaster dto) {
       this.id = dto.getId();
       this.agendadesc = dto.getAgendadesc();
       this.agendadate = dto.getAgendadate();
       this.agendastatus = dto.getAgendastatus();
       this.deactive = dto.getDeactive();
    }

    public MeetingAgendaMaster(MeetingAgendaMasterId id, CommitteeMaster committeemaster, String agendadesc) {
        this.id = id;
        this.committeemaster = committeemaster;
        this.agendadesc = agendadesc;
    }

    public MeetingAgendaMaster(MeetingAgendaMasterId id, CommitteeMaster committeemaster, String agendadesc, Date agendadate, String agendastatus, String deactive, Set committeeactiondetails, Set committeemeetingdetails, Set committeemeetingparticipentses) {
       this.id = id;
       this.committeemaster = committeemaster;
       this.agendadesc = agendadesc;
       this.agendadate = agendadate;
       this.agendastatus = agendastatus;
       this.deactive = deactive;
       this.committeeactiondetails = committeeactiondetails;
       this.committeemeetingdetails = committeemeetingdetails;
       this.committeemeetingparticipentses = committeemeetingparticipentses;
    }

    /**
     * @return the id
     */
    public MeetingAgendaMasterId getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(MeetingAgendaMasterId id) {
        this.id = id;
    }

    /**
     * @return the committeemaster
     */
    public CommitteeMaster getCommitteemaster() {
        return committeemaster;
    }

    /**
     * @param committeemaster the committeemaster to set
     */
    public void setCommitteemaster(CommitteeMaster committeemaster) {
        this.committeemaster = committeemaster;
    }

    /**
     * @return the agendadesc
     */
    public String getAgendadesc() {
        return agendadesc;
    }

    /**
     * @param agendadesc the agendadesc to set
     */
    public void setAgendadesc(String agendadesc) {
        this.agendadesc = agendadesc;
    }

    /**
     * @return the agendadate
     */
    public Date getAgendadate() {
        return agendadate;
    }

    /**
     * @param agendadate the agendadate to set
     */
    public void setAgendadate(Date agendadate) {
        this.agendadate = agendadate;
    }

    /**
     * @return the agendastatus
     */
    public String getAgendastatus() {
        return agendastatus;
    }

    /**
     * @param agendastatus the agendastatus to set
     */
    public void setAgendastatus(String agendastatus) {
        this.agendastatus = agendastatus;
    }

    /**
     * @return the deactive
     */
    public String getDeactive() {
        return deactive;
    }

    /**
     * @param deactive the deactive to set
     */
    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }

    /**
     * @return the committeeactiondetails
     */
    public Set<CommitteeActionDetail> getCommitteeactiondetails() {
        return committeeactiondetails;
    }

    /**
     * @param committeeactiondetails the committeeactiondetails to set
     */
    public void setCommitteeactiondetails(Set<CommitteeActionDetail> committeeactiondetails) {
        this.committeeactiondetails = committeeactiondetails;
    }

    /**
     * @return the committeemeetingdetails
     */
    public Set<CommitteeMeetingDetail> getCommitteemeetingdetails() {
        return committeemeetingdetails;
    }

    /**
     * @param committeemeetingdetails the committeemeetingdetails to set
     */
    public void setCommitteemeetingdetails(Set<CommitteeMeetingDetail> committeemeetingdetails) {
        this.committeemeetingdetails = committeemeetingdetails;
    }

    /**
     * @return the committeemeetingparticipentses
     */
    public Set<CommitteeMeetingParticipents> getCommitteemeetingparticipentses() {
        return committeemeetingparticipentses;
    }

    /**
     * @param committeemeetingparticipentses the committeemeetingparticipentses to set
     */
    public void setCommitteemeetingparticipentses(Set<CommitteeMeetingParticipents> committeemeetingparticipentses) {
        this.committeemeetingparticipentses = committeemeetingparticipentses;
    }

     public String getIdStr() {
        return id.getInstituteid()+":"+id.getCommitteeid()+":"+id.getAgendaid();
    }


}
