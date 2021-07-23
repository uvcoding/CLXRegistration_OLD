package com.jilit.irp.persistence.dto;
// Generated Sep 12, 2009 11:04:12 AM by Hibernate Tools 3.2.1.GA

import org.apache.commons.beanutils.BeanUtils;

/**
 * StudentAdddress generated by hbm2java
 */
public class GuestStudentAddress implements java.io.Serializable {

    private String gueststudentid;
//    private GuestStudentMaster gueststudentmaster;

    private String caddress1;
    private String caddress2;
    private String caddress3;
    private String ccityname;
    private String cstatename;
    private Integer cpin;
    private String ccountryname;

    private String paddress1;
    private String paddress2;
    private String paddress3;
    private String pcityname;
    private String pstatename;
    private Integer ppin;
    private String pcountryname;
    private String pemailid;
    private String pmobileno;
    private String semailid;
    private String smobileno;

    public String getPemailid() {
        return pemailid;
    }

    public void setPemailid(String pemailid) {
        this.pemailid = pemailid;
    }

    public String getPmobileno() {
        return pmobileno;
    }

    public void setPmobileno(String pmobileno) {
        this.pmobileno = pmobileno;
    }

    public String getSemailid() {
        return semailid;
    }

    public void setSemailid(String semailid) {
        this.semailid = semailid;
    }

    public String getSmobileno() {
        return smobileno;
    }

    public void setSmobileno(String smobileno) {
        this.smobileno = smobileno;
    }



    public GuestStudentAddress() {
    }

    public GuestStudentAddress(String studentid) {
        this.gueststudentid = studentid;
    }

    public GuestStudentAddress(String studentid, String caddress1, String caddress2, String caddress3, String ccityname, String cstatename, Integer cpin, String ccountryname, String paddress1, String paddress2, String paddress3, String pcityname, String pstatename, Integer ppin, String pcountryname) {
        this.gueststudentid = studentid;
       

        this.caddress1 = caddress1;
        this.caddress2 = caddress2;
        this.caddress3 = caddress3;
        this.ccityname = ccityname;
        //this.cdistrict = cdistrict;
        //this.cpostoffice = cpostoffice;
        //this.crailstation = crailstation;
        //this.cpolicestation = cpolicestation;
        this.cstatename = cstatename;
        this.cpin = cpin;
        this.ccountryname = ccountryname;

        this.paddress1 = paddress1;
        this.paddress2 = paddress2;
        this.paddress3 = paddress3;
        this.pcityname = pcityname;
        this.pstatename = pstatename;
        this.ppin = ppin;
        this.pcountryname = pcountryname;

    }

    public String getGueststudentid() {
        return gueststudentid;
    }

    public void setGueststudentid(String gueststudentid) {
        this.gueststudentid = gueststudentid;
    }

  

    public String getStudentid() {
        return gueststudentid;
    }

    public void setStudentid(String studentid) {
        this.gueststudentid = studentid;
    }

    public String getStatename() {
        return this.caddress1;
    }

    public void setStatename(String caddress1) {
        this.caddress1 = caddress1;
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

   

//         public void setAsid(ASObject id){
//            if(this.id==null){
//                this.id = new StudentAdddressId();
//            }
//            try{
//                BeanUtils.copyProperties(this.id,id );
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//
//        }
}
