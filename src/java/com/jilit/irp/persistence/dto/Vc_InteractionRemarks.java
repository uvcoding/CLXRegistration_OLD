package com.jilit.irp.persistence.dto;
// Generated Jan 10, 2015 2:19:02 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Vc#interactionremarks generated by hbm2java
 */
public class Vc_InteractionRemarks  implements java.io.Serializable {


     private Vc_InteractionRemarksId id;
     private Sct_IrpUsers sct_irpusers;
     private String remarks;
     private Date entrydate;
     private String entryby;

    public Vc_InteractionRemarks() {
    }

    public Vc_InteractionRemarks(Vc_InteractionRemarksId id, Sct_IrpUsers sct_irpusers, String remarks, Date entrydate, String entryby) {
        this.id = id;
        this.sct_irpusers = sct_irpusers;
        this.remarks = remarks;
        this.entrydate = entrydate;
        this.entryby = entryby;
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

    public Vc_InteractionRemarksId getId() {
        return id;
    }

    public void setId(Vc_InteractionRemarksId id) {
        this.id = id;
    }



    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Sct_IrpUsers getSct_irpusers() {
        return sct_irpusers;
    }

    public void setSct_irpusers(Sct_IrpUsers sct_irpusers) {
        this.sct_irpusers = sct_irpusers;
    }

    
	
   
   
    

}


