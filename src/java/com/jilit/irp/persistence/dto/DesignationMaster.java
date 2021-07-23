package com.jilit.irp.persistence.dto;
// Generated Sep 12, 2009 11:04:12 AM by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

/**
 * DesignationMaster generated by hbm2java
 */
public class DesignationMaster implements java.io.Serializable {

    private String designationcode;
    private String designationid; 
    private String designation;
    private String designationtype;
    private String grade;
    private Short seqid;
    private String deactive;
 
    public DesignationMaster() {
    }

    public DesignationMaster(String designationid, String designationcode,/* String shortname,*/ String designation, String designationtype, Short seqid, String deactive) {
        this.designationid = designationid;
        this.designationcode = designationcode;
        this.designationid = designationid;
        this.designationcode = designationcode;
        this.designationcode = designationcode;
        this.designationid = designationid;
        this.designationcode = designationcode;
        this.seqid = seqid;
        this.deactive = deactive;

        this.designation = designation;
        this.designationtype = designationtype;
        this.seqid = seqid;
        this.deactive = deactive;
    }

    public DesignationMaster(DesignationMaster dto, boolean childReqd) {
        this.designationid = dto.getDesignationid();
        this.designationcode = dto.getDesignationcode();
        //this.shortname = dto.getShortname();
        this.designation = dto.getDesignation();
        this.designationtype = dto.getDesignationtype();
        this.seqid = dto.getSeqid();
        this.grade = dto.getGrade();
        this.deactive = dto.getDeactive(); 
    }

    public String getDeactive() {
        return deactive;
    }

    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignationcode() {
        return designationcode;
    }

    public void setDesignationcode(String designationcode) {
        this.designationcode = designationcode;
    }

    public String getDesignationid() {
        return designationid;
    }

    public void setDesignationid(String designationid) {
        this.designationid = designationid;
    }

    public String getDesignationtype() {
        return designationtype;
    }

    public void setDesignationtype(String designationtype) {
        this.designationtype = designationtype;
    }
 

    public Short getSeqid() {
        return seqid;
    }

    public void setSeqid(Short seqid) {
        this.seqid = seqid;
    }

    
     public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    
 
}


