package com.jilit.irp.persistence.dto;
// Generated Mar 5, 2015 11:58:26 AM by Hibernate Tools 3.2.1.GA



/**
 * Numberingsetupothersmaster generated by hbm2java
 */
public class NumberingSetUpOthersMaster  implements java.io.Serializable {


     private String prefix;
     private String numberingname;

    public NumberingSetUpOthersMaster() {
    }

    public NumberingSetUpOthersMaster(String prefix, String numberingname) {
       this.prefix = prefix;
       this.numberingname = numberingname;
    }
   
    public String getPrefix() {
        return this.prefix;
    }
    
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    public String getNumberingname() {
        return this.numberingname;
    }
    
    public void setNumberingname(String numberingname) {
        this.numberingname = numberingname;
    }
}


