package com.jilit.irp.persistence.dto;
// Generated May 18, 2011 12:08:19 PM by Hibernate Tools 3.2.1.GA



/**
 * FeeFinalizationId malkeet.singh
 */
public class FeeFinalizationId  implements java.io.Serializable {


     private String instituteid;
     private String registrationid;
     private byte stynumber;
     private String stytypeid;
     private String quotaid;
     private String feeheadid;
     private String currencyid;
     private String studentid;
     private int slno;

    public FeeFinalizationId() {
    }

     public FeeFinalizationId(String instituteid, String registrationid, byte stynumber, String stytypeid, String quotaid, String feeheadid, String currencyid, String studentid, int slno) {
       this.instituteid = instituteid;
       this.registrationid = registrationid;
       this.stynumber = stynumber;
       this.stytypeid = stytypeid;
       this.quotaid = quotaid;
       this.feeheadid = feeheadid;
       this.currencyid = currencyid;
       this.studentid = studentid;
       this.slno = slno;
    }

    public String getInstituteid() {
        return this.instituteid;
    }

    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }
    public byte getStynumber() {
        return this.stynumber;
    }

    public void setStynumber(byte stynumber) {
        this.stynumber = stynumber;
    }
    public String getStytypeid() {
        return this.stytypeid;
    }

    public void setStytypeid(String stytypeid) {
        this.stytypeid = stytypeid;
    }
    public String getQuotaid() {
        return this.quotaid;
    }

    public void setQuotaid(String quotaid) {
        this.quotaid = quotaid;
    }
    public String getFeeheadid() {
        return this.feeheadid;
    }

    public void setFeeheadid(String feeheadid) {
        this.feeheadid = feeheadid;
    }
    public String getCurrencyid() {
        return this.currencyid;
    }

    public void setCurrencyid(String currencyid) {
        this.currencyid = currencyid;
    }
    public String getStudentid() {
        return this.studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getRegistrationid() {
        return registrationid;
    }

    public void setRegistrationid(String registrationid) {
        this.registrationid = registrationid;
    }

    public int getSlno() {
        return slno;
    }

    public void setSlno(int slno) {
        this.slno = slno;
    }


  


}


