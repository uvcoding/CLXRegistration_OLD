package com.jilit.irp.persistence.dto;
// Generated Apr 5, 2010 1:53:02 PM by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;
import java.util.Date;

/**
 * Sct_kioskmarqueetext generated by hbm2java
 */
public class Sct_KioskMarqueeText implements java.io.Serializable {

    private Sct_KioskMarqueeTextId id;
    private InstituteMaster institutemaster;
    private Date displayfrom;
    private Date displaytill;
    private String textdata;
    private String applicablefor;
    private String withoutlogin;
    private String msgboxno;
    private BigDecimal messagepriority;
    private String individulauserid;
    private String status;

    public Sct_KioskMarqueeText() {
    }

    public Sct_KioskMarqueeText(Sct_KioskMarqueeTextId id, InstituteMaster institutemaster) {
        this.id = id;
        this.institutemaster = institutemaster;
    }

    public Sct_KioskMarqueeText(Sct_KioskMarqueeTextId id, InstituteMaster institutemaster, Date displayfrom, Date displaytill, String textdata, String applicablefor, String withoutlogin, String msgboxno, BigDecimal messagepriority, String individulauserid, String status) {
        this.id = id;
        this.institutemaster = institutemaster;
        this.displayfrom = displayfrom;
        this.displaytill = displaytill;
        this.textdata = textdata;
        this.applicablefor = applicablefor;
        this.withoutlogin = withoutlogin;
        this.msgboxno = msgboxno;
        this.messagepriority = messagepriority;
        this.individulauserid = individulauserid;
        this.status = status;
    }

    public Sct_KioskMarqueeText(Sct_KioskMarqueeText dto) {
        this.id = dto.getId();
        this.displayfrom = dto.getDisplayfrom();
        this.displaytill = dto.getDisplaytill();
        this.textdata = dto.getTextdata();
        this.applicablefor = dto.getApplicablefor();
        this.withoutlogin = dto.getWithoutlogin();
        this.msgboxno = dto.getMsgboxno();
        this.messagepriority = dto.getMessagepriority();
        this.individulauserid = dto.getIndividulauserid();
        this.status = dto.getStatus();
    }

    public Sct_KioskMarqueeTextId getId() {
        return this.id;
    }

    public void setId(Sct_KioskMarqueeTextId id) {
        this.id = id;
    }

    public InstituteMaster getInstitutemaster() {
        return this.institutemaster;
    }

    public void setInstitutemaster(InstituteMaster institutemaster) {
        this.institutemaster = institutemaster;
    }

    public Date getDisplayfrom() {
        return this.displayfrom;
    }

    public void setDisplayfrom(Date displayfrom) {
        this.displayfrom = displayfrom;
    }

    public Date getDisplaytill() {
        return this.displaytill;
    }

    public void setDisplaytill(Date displaytill) {
        this.displaytill = displaytill;
    }

    public String getTextdata() {
        return this.textdata;
    }

    public void setTextdata(String textdata) {
        this.textdata = textdata;
    }

    public String getApplicablefor() {
        return this.applicablefor;
    }

    public void setApplicablefor(String applicablefor) {
        this.applicablefor = applicablefor;
    }

    public String getWithoutlogin() {
        return this.withoutlogin;
    }

    public void setWithoutlogin(String withoutlogin) {
        this.withoutlogin = withoutlogin;
    }

    public String getMsgboxno() {
        return this.msgboxno;
    }

    public void setMsgboxno(String msgboxno) {
        this.msgboxno = msgboxno;
    }

    public BigDecimal getMessagepriority() {
        return this.messagepriority;
    }

    public void setMessagepriority(BigDecimal messagepriority) {
        this.messagepriority = messagepriority;
    }

    public String getIndividulauserid() {
        return this.individulauserid;
    }

    public void setIndividulauserid(String individulauserid) {
        this.individulauserid = individulauserid;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getIdStr() {
        return id.getInstituteid() + "::" + id.getSno();
    }
}


