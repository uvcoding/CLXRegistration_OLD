package com.jilit.irp.persistence.dto;
// Generated Sep 12, 2009 11:04:12 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * QualificationCategory generated by hbm2java
 */
public class QualificationCategory  implements java.io.Serializable {

     private String qualificationcategoryid;
     private String qualificationcategorycode;
     private String qualificationcategory;
     private String qualificationfor;
     private Short qualificationlevel;
     private Short seqid;
     private String deactive;
    

    public QualificationCategory() {
    }

    public QualificationCategory(QualificationCategory dto) {
        this.qualificationcategoryid = dto.getQualificationcategoryid();
        this.qualificationcategorycode = dto.getQualificationcategorycode();
        this.qualificationcategory = dto.getQualificationcategory();
        this.qualificationfor=dto.getQualificationfor();
        this.qualificationlevel=dto.getQualificationlevel();
        this.seqid = dto.seqid;
        this.deactive = dto.deactive;
    }
	
    public QualificationCategory(String qualificationcategoryid, String qualificationcategorycode,  String qualificationcategory) {
        this.qualificationcategoryid = qualificationcategoryid;
        this.qualificationcategorycode = qualificationcategorycode;
        this.qualificationcategory = qualificationcategory;
    }
    public QualificationCategory(String qualificationcategoryid, String qualificationcategorycode,  String qualificationcategory, Short seqid, String deactive ) {
       this.qualificationcategoryid = qualificationcategoryid;
       this.qualificationcategorycode = qualificationcategorycode;
       this.qualificationcategory = qualificationcategory;
       this.seqid = seqid;
       this.deactive = deactive;
        
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
 
    public String getQualificationcategory() {
        return qualificationcategory;
    }

    public void setQualificationcategory(String qualificationcategory) {
        this.qualificationcategory = qualificationcategory;
    }

    public String getQualificationcategorycode() {
        return qualificationcategorycode;
    }

    public void setQualificationcategorycode(String qualificationcategorycode) {
        this.qualificationcategorycode = qualificationcategorycode;
    }

    public String getQualificationcategoryid() {
        return qualificationcategoryid;
    }

    public void setQualificationcategoryid(String qualificationcategoryid) {
        this.qualificationcategoryid = qualificationcategoryid;
    }

    public String getQualificationfor() {
        return qualificationfor;
    }

    public void setQualificationfor(String qualificationfor) {
        this.qualificationfor = qualificationfor;
    }

    public Short getQualificationlevel() {
        return qualificationlevel;
    }

    public void setQualificationlevel(Short qualificationlevel) {
        this.qualificationlevel = qualificationlevel;
    }

    

}


