package com.jilit.irp.persistence.dto;
// Generated Apr 10, 2017 2:20:27 PM by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Studentdatainformation generated by hbm2java
 */
public class StudentDataInformation implements java.io.Serializable {

    private StudentDataInformationId id;
    private String informationdesc;
    private byte requiredlevel;
    private String informationdetail;
    private String deactive;

    public StudentDataInformation() {
    }

    public StudentDataInformation(StudentDataInformation dto) {
        this.id=dto.getId();
        this.informationdesc=dto.getInformationdesc();
        this.informationdetail=dto.getInformationdetail();
        this.requiredlevel=dto.getRequiredlevel();
        this.deactive=dto.getDeactive();
    }
    
    public StudentDataInformation(StudentDataInformationId id, String informationdesc, String informationdetail) {
        this.id = id;
        this.informationdesc = informationdesc;
        this.informationdetail = informationdetail;
    }

    public StudentDataInformation(StudentDataInformationId id, String informationdesc, byte requiredlevel, String informationdetail, String deactive) {
        this.id = id;
        this.informationdesc = informationdesc;
        this.requiredlevel = requiredlevel;
        this.informationdetail = informationdetail;
        this.deactive = deactive;
    }

    public StudentDataInformationId getId() {
        return id;
    }

    public void setId(StudentDataInformationId id) {
        this.id = id;
    }

    public String getInformationdesc() {
        return informationdesc;
    }

    public void setInformationdesc(String informationdesc) {
        this.informationdesc = informationdesc;
    }

    public byte getRequiredlevel() {
        return requiredlevel;
    }

    public void setRequiredlevel(byte requiredlevel) {
        this.requiredlevel = requiredlevel;
    }

    public String getInformationdetail() {
        return informationdetail;
    }

    public void setInformationdetail(String informationdetail) {
        this.informationdetail = informationdetail;
    }

    public String getDeactive() {
        return deactive;
    }

    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }

}
