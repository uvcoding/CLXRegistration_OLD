package com.jilit.irp.persistence.dto;
// Generated Sep 6, 2017 12:13:06 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Sct#rightscriteriamaster generated by hbm2java
 */
public class Sct_RightsCriteriaMaster  implements java.io.Serializable {


     private String rightsbasedon;
     private String rightsbasedondesc;
     private String deactive;
     private Set sct_userrolescriterabaseds = new HashSet(0);

    public Sct_RightsCriteriaMaster() {
        
    }

    public Sct_RightsCriteriaMaster(Sct_RightsCriteriaMaster dto) {
        this.rightsbasedon=dto.getRightsbasedon();
        this.rightsbasedondesc=dto.getRightsbasedondesc();
        this.deactive=dto.getDeactive();
    }

    
   
    public String getRightsbasedon() {
        return this.rightsbasedon;
    }
    
    public void setRightsbasedon(String rightsbasedon) {
        this.rightsbasedon = rightsbasedon;
    }
    public String getRightsbasedondesc() {
        return this.rightsbasedondesc;
    }
    
    public void setRightsbasedondesc(String rightsbasedondesc) {
        this.rightsbasedondesc = rightsbasedondesc;
    }
    public String getDeactive() {
        return this.deactive;
    }
    
    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }

    public Set getSct_userrolescriterabaseds() {
        return sct_userrolescriterabaseds;
    }

    public void setSct_userrolescriterabaseds(Set sct_userrolescriterabaseds) {
        this.sct_userrolescriterabaseds = sct_userrolescriterabaseds;
    }

    public Sct_RightsCriteriaMaster(String rightsbasedon, String rightsbasedondesc, String deactive) {
        this.rightsbasedon = rightsbasedon;
        this.rightsbasedondesc = rightsbasedondesc;
        this.deactive = deactive;
    }


 }


