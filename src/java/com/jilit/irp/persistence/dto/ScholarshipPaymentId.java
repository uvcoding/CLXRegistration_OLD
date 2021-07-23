package com.jilit.irp.persistence.dto;
// Generated 5 Nov, 2013 4:13:13 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * ScholarshippaymentId generated by hbm2java
 */
public class ScholarshipPaymentId  implements java.io.Serializable {


     private String sessionid;
     private String studentid;
     private String scholarshiptypeid;
     private Date paymentdate;

    public ScholarshipPaymentId() {
    }

    public ScholarshipPaymentId(String sessionid, String studentid, String scholarshiptypeid, Date paymentdate) {
       this.sessionid = sessionid;
       this.studentid = studentid;
       this.scholarshiptypeid = scholarshiptypeid;
       this.paymentdate = paymentdate;
    }
   
    public String getSessionid() {
        return this.sessionid;
    }
    
    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }
    public String getStudentid() {
        return this.studentid;
    }
    
    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }
    public String getScholarshiptypeid() {
        return this.scholarshiptypeid;
    }
    
    public void setScholarshiptypeid(String scholarshiptypeid) {
        this.scholarshiptypeid = scholarshiptypeid;
    }
    public Date getPaymentdate() {
        return this.paymentdate;
    }
    
    public void setPaymentdate(Date paymentdate) {
        this.paymentdate = paymentdate;
    }


   

}


