/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jilit.irp.iservice;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.ui.Model;

/**
 *
 * @author ashutosh1.kumar
 */
public interface TeachingSchemeReportIservice {

    public void getFormData(Model model);

    public List getBranch(HttpServletRequest request);

    public List getStyNumber(HttpServletRequest request);

    public List getSection(HttpServletRequest request);

    public void getReport(HttpServletRequest request, HttpServletResponse response);

}
