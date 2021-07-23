package com.jilit.irp.persistence.dto;
// Generated Sep 12, 2009 11:04:12 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import org.apache.commons.beanutils.BeanUtils;

/**
 * StudentOutDetail generated by hbm2java
 */
public class StudentOutDetail  implements java.io.Serializable {


     private String studentid;
     private StudentMaster studentmaster;
     private String outflag;
     private Date outdate;
     private String transferto;
     private Byte outsty;
     private String noduesstatus;
     private String remarks;

    public StudentOutDetail() {
    }

    public StudentOutDetail(StudentOutDetail dto) {
        try{
            dto.studentmaster =null;
            BeanUtils.copyProperties(this, dto);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public StudentOutDetail(String studentid, StudentMaster studentmaster, String outflag, Date outdate) {
        this.studentid = studentid;
        this.studentmaster = studentmaster;
        this.outflag = outflag;
        this.outdate = outdate;
    }
    public StudentOutDetail(String studentid, StudentMaster studentmaster, String outflag, Date outdate, String transferto, Byte outsty, String noduesstatus, String remarks) {
       this.studentid = studentid;
       this.studentmaster = studentmaster;
       this.outflag = outflag;
       this.outdate = outdate;
       this.transferto = transferto;
       this.outsty = outsty;
       this.noduesstatus = noduesstatus;
       this.remarks = remarks;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }
   
  
 
    public Date getOutdate() {
        return this.outdate;
    }
    
    public void setOutdate(Date outdate) {
        this.outdate = outdate;
    }
    public String getTransferto() {
        return this.transferto;
    }
    
    public void setTransferto(String transferto) {
        this.transferto = transferto;
    }
    public Byte getOutsty() {
        return this.outsty;
    }
    
    public void setOutsty(Byte outsty) {
        this.outsty = outsty;
    }
    public String getNoduesstatus() {
        return this.noduesstatus;
    }
    
    public void setNoduesstatus(String noduesstatus) {
        this.noduesstatus = noduesstatus;
    }
    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getOutflag() {
        return outflag;
    }

    public void setOutflag(String outflag) {
        this.outflag = outflag;
    }

    public StudentMaster getStudentmaster() {
        return studentmaster;
    }

    public void setStudentmaster(StudentMaster studentmaster) {
        this.studentmaster = studentmaster;
    }

//     public void setAsid(ASObject id){
//            if(this.id==null){
//                this.id = new StudentOutDetailId();
//            }
//            try{
//                BeanUtils.copyProperties(this.id,id );
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//
//        }


}


