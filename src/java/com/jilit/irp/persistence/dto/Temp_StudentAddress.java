/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jilit.irp.persistence.dto;

import org.apache.commons.beanutils.BeanUtils;

/**
 *
 * @author ankit.kumar
 */
public class Temp_StudentAddress implements java.io.Serializable {

    private String studentid;
    private StudentMaster temp_studentmaster;
    private String caddress1;
    private String caddress2;
    private String caddress3;
    private String ccityname;
    private String cdistrict;
    private String cpostoffice;
    private String crailstation;
    private String cpolicestation;
    private String cstatename;
    private Integer cpin;
    private String ccountryname;
    private String paddress1;
    private String paddress2;
    private String paddress3;
    private String pcityname;
    private String pdistrict;
    private String ppostoffice;
    private String prailstation;
    private String ppolicestation;
    private String pstatename;
    private Integer ppin;
    private String pcountryname;

    public Temp_StudentAddress() {
    }

    public Temp_StudentAddress(Temp_StudentAddress dto) {
        try {
            dto.temp_studentmaster = null;
            BeanUtils.copyProperties(this, dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Temp_StudentAddress(String studentid,StudentMaster temp_studentmaster) {
        this.studentid = studentid;
        this.temp_studentmaster = temp_studentmaster;
    }

    public Temp_StudentAddress(String studentid,StudentMaster temp_studentmaster, String caddress1, String caddress2, String caddress3, String ccityname, String cdistrict, String cpostoffice, String crailstation, String cpolicestation, String cstatename, Integer cpin, String ccountryname, String paddress1, String paddress2, String paddress3, String pcityname, String pdistrict, String ppostoffice, String prailstation, String ppolicestation, String pstatename, Integer ppin, String pcountryname) {
        this.studentid = studentid;
        this.temp_studentmaster = temp_studentmaster;
        this.caddress1 = caddress1;
        this.caddress2 = caddress2;
        this.caddress3 = caddress3;
        this.ccityname = ccityname;
        this.cdistrict = cdistrict;
        this.cpostoffice = cpostoffice;
        this.crailstation = crailstation;
        this.cpolicestation = cpolicestation;
        this.cstatename = cstatename;
        this.cpin = cpin;
        this.ccountryname = ccountryname;
        this.paddress1 = paddress1;
        this.paddress2 = paddress2;
        this.paddress3 = paddress3;
        this.pcityname = pcityname;
        this.pdistrict = pdistrict;
        this.ppostoffice = ppostoffice;
        this.prailstation = prailstation;
        this.ppolicestation = ppolicestation;
        this.pstatename = pstatename;
        this.ppin = ppin;
        this.pcountryname = pcountryname;
    }

    public String getStudentid() {
        return this.studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public StudentMaster getTemp_StudentMaster() {
        return this.temp_studentmaster;
    }

    public void setTemp_StudentMaster(StudentMaster temp_studentmaster) {
        this.temp_studentmaster = temp_studentmaster;
    }

    public String getCaddress1() {
        return this.caddress1;
    }

    public void setCaddress1(String caddress1) {
        this.caddress1 = caddress1;
    }

    public String getCaddress2() {
        return this.caddress2;
    }

    public void setCaddress2(String caddress2) {
        this.caddress2 = caddress2;
    }

    public String getCaddress3() {
        return this.caddress3;
    }

    public void setCaddress3(String caddress3) {
        this.caddress3 = caddress3;
    }

    public String getCcityname() {
        return this.ccityname;
    }

    public void setCcityname(String ccityname) {
        this.ccityname = ccityname;
    }

    public String getCdistrict() {
        return this.cdistrict;
    }

    public void setCdistrict(String cdistrict) {
        this.cdistrict = cdistrict;
    }

    public String getCpostoffice() {
        return this.cpostoffice;
    }

    public void setCpostoffice(String cpostoffice) {
        this.cpostoffice = cpostoffice;
    }

    public String getCrailstation() {
        return this.crailstation;
    }

    public void setCrailstation(String crailstation) {
        this.crailstation = crailstation;
    }

    public String getCpolicestation() {
        return this.cpolicestation;
    }

    public void setCpolicestation(String cpolicestation) {
        this.cpolicestation = cpolicestation;
    }

    public String getCstatename() {
        return this.cstatename;
    }

    public void setCstatename(String cstatename) {
        this.cstatename = cstatename;
    }

    public Integer getCpin() {
        return this.cpin;
    }

    public void setCpin(Integer cpin) {
        this.cpin = cpin;
    }

    public String getCcountryname() {
        return this.ccountryname;
    }

    public void setCcountryname(String ccountryname) {
        this.ccountryname = ccountryname;
    }

    public String getPaddress1() {
        return this.paddress1;
    }

    public void setPaddress1(String paddress1) {
        this.paddress1 = paddress1;
    }

    public String getPaddress2() {
        return this.paddress2;
    }

    public void setPaddress2(String paddress2) {
        this.paddress2 = paddress2;
    }

    public String getPaddress3() {
        return this.paddress3;
    }

    public void setPaddress3(String paddress3) {
        this.paddress3 = paddress3;
    }

    public String getPcityname() {
        return this.pcityname;
    }

    public void setPcityname(String pcityname) {
        this.pcityname = pcityname;
    }

    public String getPdistrict() {
        return this.pdistrict;
    }

    public void setPdistrict(String pdistrict) {
        this.pdistrict = pdistrict;
    }

    public String getPpostoffice() {
        return this.ppostoffice;
    }

    public void setPpostoffice(String ppostoffice) {
        this.ppostoffice = ppostoffice;
    }

    public String getPrailstation() {
        return this.prailstation;
    }

    public void setPrailstation(String prailstation) {
        this.prailstation = prailstation;
    }

    public String getPpolicestation() {
        return this.ppolicestation;
    }

    public void setPpolicestation(String ppolicestation) {
        this.ppolicestation = ppolicestation;
    }

    public String getPstatename() {
        return this.pstatename;
    }

    public void setPstatename(String pstatename) {
        this.pstatename = pstatename;
    }

    public Integer getPpin() {
        return this.ppin;
    }

    public void setPpin(Integer ppin) {
        this.ppin = ppin;
    }

    public String getPcountryname() {
        return this.pcountryname;
    }

    public void setPcountryname(String pcountryname) {
        this.pcountryname = pcountryname;
    }

    public StudentMaster getTemp_studentmaster() {
        return temp_studentmaster;
    }

    public void setTemp_studentmaster(StudentMaster temp_studentmaster) {
        this.temp_studentmaster = temp_studentmaster;
    }
}


