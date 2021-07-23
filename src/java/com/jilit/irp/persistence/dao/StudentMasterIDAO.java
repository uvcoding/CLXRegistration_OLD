/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jilit.irp.persistence.dao;

//import com.jilit.irp.bso.biz.BusinessService;
//import com.jilit.irp.data.FilterInfoData; 
import com.jilit.irp.persistence.dto.StudentMaster;
import com.jilit.irp.persistence.dto.StudentAdddress;
import com.jilit.irp.persistence.dto.StudentPhone;

import java.sql.Blob;
import java.util.ArrayList;

import java.util.List;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author Shimona.Khandelwal
 */
public interface StudentMasterIDAO extends IDAO {

    public int checkIfChildExist(final String studentid);

    public Collection<?> findAll(String instituteid);

    public abstract Collection<?> findAll(String instituteid, String acdYr, String program, String branch/*,String filert,String value */);

    public List<String> doValidate(final StudentMaster master, final String mode);

    public Collection<?> getActiveDeactiveStudent(final String memberid);

    public Collection<?> getActiveDeactiveEmployee(final String memberid);

    public List studentListData(String instituteid, String acdYr, String program, String branch);

    public List getAllSubjectChangeData(String instituteid, String programid);

    public Collection<?> getStudentListforLabel(final String[] studentid);

    public ArrayList getProgramSectionBranchStudentData(final String instituteid);

    public ArrayList totalStudentCount(final String instid, final String acadmicyear, final String programid, final String branchid, final String orderby);

    public List coustomizeTotalStudentCount(final String instid, final String acadmicyear, final String programid, final String branchid, final String rwp, final String qrp, final String xrp);

    public String updateSectionSubSection(final List<StudentMaster> studentMasters);

    public List getGridData(String instituteid, String acadYear, String programid, String branchid);

    public List getStudentDetailSubsectionWise(String instituteid, String acadYear, String programid, String branchid, String secid, String subsecid, String stynumber);

    public List getStudentInfoUpdateSummary(String companyid, final String academicyear);

    public List getNotSavedDataInformation();

    public List getAcademicYearReg(String instituteid);

    public List getAcademicYearRegList(String instituteid);

    public List getProgramCodeReg(String instituteid, String acadYear);

    public List getSecCodeReg(String instituteid, String programId);

    public List getStudentInfo(List instituteid, String enrollmentno, List registrationid, String qryFor, String specialcase);

    public List getStudentInfoForRegPermission(String instituteid, String enrollmentno);

    public List getStudentsForSupplementary(String instituteid, String registrationid);

    public List getBatchWiseStudentList(final String[] progamid, final String academicyear);

    public List getStudentInformations(final String instituteid, final String studentid);

    public List getStudentUpgradeDegradeReportData(String programid, String branchid, String academicyear, String instituteid, String stynumber, String status, String fromdate, String todate);

    public List getsectionWiseStudentReport(String instituteid, String programid, String year, String branchid, String sectionid, String orderby, String gender);

    public List StudentDocumentStatusReport(final String instituteid, final String programid, final String branchid, final String acadyear, final int styno);

    public boolean saveObjList(List saveList1, List saveList2);

    public List getAllStudentsName1(String instituteid, String academicyear, String programid, String secId);

    public List getStudentDataEligibleForUpcomingSemester(String instituteid, String registrationid, String programid, String branchid, String check, String academicyearList);

    public Collection<?> getStudentRegistrationSummaryList(final String registrationid);

    public Collection<?> getRegistrationAllowedList(final String programid, final String branchid, final String registrationid, final byte stynumber, final String parameter);

    public List getEnrollmentNo_BranchChangeChoiceReport(final String instituteid, final String acadyear);

    public List getProgramReportData(final String programid, final String branchid, final String categoryid, final String instituteid, final String reporttype, final String ordertype);

    public List getEnrollmentNumberOrName(String instituteid, String programid, String acad_year);

    public List getRegistrationCodeWiseStudentMasterData(List instituteid, List regid, String programid, String academicyear);

    public List getStudentLovForAddDropBasic(List instituteid, List regid, String programid, String academicyear);

    public List getAcademicYearForAddDrop(List instituteid, List regid);

    public List getProgramForAddDrop(List instituteid, List regid, String acadyear);

    public Collection<?> getRegistrationActivity(String instituteid);

    public List getStudentActivity(final String instituteid, final String registrationid, final String studentid);

    public List getSemesterBranchData(final String instituteid, final String acadyear, final String programid, final String br_1[], final int stynumber);

    public List getStudentData(String instituteid, String studentid);

    public List getStudentFeePaymentData(List instituteid, List registrationid, String reg_Type, String Order_By, String duestudent, String lesssubject, String exceedsubject, List feeheadid);

    public List getStudentSubCode(List instituteid, List registrationid);

    public List getStudentRegisteredSubjects(List instituteid, List registrationid);

    public List getStudentsForSummer(String instituteid, String registrationid);

    public List<Object[]> getStudentRegistrationDateBaseList(String instituteid, String registrationid, String academicyear, String compStatus, String pendingStatus);

    public List getBackPaperReportData_BPR(String instituteid, String programid, String branchid, String stynumber, String subjectid, String orderby);
    
   public List getProgramBranchCode(String regcode);
   
   public List getStudentQuotaCode();

    public List<Object[]> getStudentRegistrationDateNewBaseList(String regcode, String academicyear, String compStatus, String pendingStatus);
}
