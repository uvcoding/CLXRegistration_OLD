package com.jilit.irp.persistence.dto;
// Generated 5 Nov, 2013 4:13:13 PM by Hibernate Tools 3.2.1.GA



/**
 * Studentotherachievementdoc generated by hbm2java
 */
public class StudentOtherAchievementDoc  implements java.io.Serializable {


     private StudentOtherAchievementDocId id;
     private StudentOtherAchievementReq studentotherachievementreq;
     private String filename;
     private String filetype;
     private String commentsrelatedtodocument;
     private String deactive;

    public StudentOtherAchievementDoc() {
    }

	
    public StudentOtherAchievementDoc(StudentOtherAchievementDocId id, StudentOtherAchievementReq studentotherachievementreq) {
        this.id = id;
        this.studentotherachievementreq = studentotherachievementreq;
    }
    public StudentOtherAchievementDoc(StudentOtherAchievementDocId id, StudentOtherAchievementReq studentotherachievementreq, String filename, String filetype, String commentsrelatedtodocument, String deactive) {
       this.id = id;
       this.studentotherachievementreq = studentotherachievementreq;
       this.filename = filename;
       this.filetype = filetype;
       this.commentsrelatedtodocument = commentsrelatedtodocument;
       this.deactive = deactive;
    }
   
    public StudentOtherAchievementDocId getId() {
        return this.id;
    }
    
    public void setId(StudentOtherAchievementDocId id) {
        this.id = id;
    }
    public StudentOtherAchievementReq getStudentotherachievementreq() {
        return this.studentotherachievementreq;
    }
    
    public void setStudentotherachievementreq(StudentOtherAchievementReq studentotherachievementreq) {
        this.studentotherachievementreq = studentotherachievementreq;
    }
    public String getFilename() {
        return this.filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public String getFiletype() {
        return this.filetype;
    }
    
    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }
    public String getCommentsrelatedtodocument() {
        return this.commentsrelatedtodocument;
    }
    
    public void setCommentsrelatedtodocument(String commentsrelatedtodocument) {
        this.commentsrelatedtodocument = commentsrelatedtodocument;
    }
    public String getDeactive() {
        return this.deactive;
    }
    
    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }




}


