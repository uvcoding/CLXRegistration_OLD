/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jilit.irp.persistence.dao;

import java.util.List;

/**
 *
 * @author campus.trainee
 */
public interface SubjectRegistrationCriteriaIDAO extends IDAO{
    
    public List creditSubjectType(String instituteid);
    
    public List getGridData(String instituteid,String programid);
    
    public List getDepartmentData();
    
}
