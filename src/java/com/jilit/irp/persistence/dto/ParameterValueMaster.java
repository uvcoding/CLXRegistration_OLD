package com.jilit.irp.persistence.dto;
// Generated Sep 12, 2009 11:04:12 AM by Hibernate Tools 3.2.1.GA



/**
 * ParameterValueMaster generated by hbm2java
 */
public class ParameterValueMaster  implements java.io.Serializable {


     private ParameterValueMasterId id;
     private Parameters parameters;
     private String parametervaluedescription;
     private String parametervaluecode;
     private String deactive;

    public ParameterValueMaster() {
    }

	
    public ParameterValueMaster(ParameterValueMasterId id, Parameters parameters) {
        this.id = id;
        this.parameters = parameters;
    }
    public ParameterValueMaster(ParameterValueMasterId id, Parameters parameters, String parametervaluedescription, String parametervaluecode, String deactive) {
       this.id = id;
       this.parameters = parameters;
       this.parametervaluedescription = parametervaluedescription;
       this.parametervaluecode = parametervaluecode;
       this.deactive = deactive;
    }
   
    public ParameterValueMasterId getId() {
        return this.id;
    }
    
    public void setId(ParameterValueMasterId id) {
        this.id = id;
    }
    public Parameters getParameters() {
        return this.parameters;
    }
    
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }
    public String getParametervaluedescription() {
        return this.parametervaluedescription;
    }
    
    public void setParametervaluedescription(String parametervaluedescription) {
        this.parametervaluedescription = parametervaluedescription;
    }
    public String getParametervaluecode() {
        return this.parametervaluecode;
    }
    
    public void setParametervaluecode(String parametervaluecode) {
        this.parametervaluecode = parametervaluecode;
    }
    public String getDeactive() {
        return this.deactive;
    }
    
    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }




}


