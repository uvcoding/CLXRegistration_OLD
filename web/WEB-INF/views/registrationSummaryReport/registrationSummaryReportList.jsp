<%-- 
    Document   : registrationSummaryReportList
    Created on : Feb 12, 2019, 10:33:43 AM
    Author     : ashutosh1.kumar
--%>
<%@include file="../mainjstl.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="row" id="dashboard">
    <div class="col-md-12">
        <div class="box" style="box-shadow: 0 8px 17px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);">
            <div class="box-header with-border bg-navy">
                <h3 class="box-title header_name" id="box-title"></h3>
                <div class="box-tools pull-right">                  
                    <button onclick="javascript:blank();" class="btn btn-box-tool"><i class="fa fa-close fa-2x" style="color:white"></i></button>
                </div>
            </div>
            <div class="box-body" >
                <form method="POST" id="ajaxform" class="form-horizontal">
                    <div class="row col-lg-12 form-group">
                        <div class="col-md-8 col-md-offset-2">
                            <div class="col-md-4" >
                                <label class="col-sm-12 col-lg-12 col-xs-12 col-md-12 radio-inline">
                                    <input type="radio" id="showReport" name="showReport" checked="true" value="pre" onclick="ShowHide('pre')"/>Report Type</label> 
                            </div>
                            <div class="col-md-4 ">
                                <label class="col-sm-12 col-lg-12 col-xs-12 col-md-12 radio-inline">
                                    <input type="radio" id="showReport" name="showReport" value="post" onclick="ShowHide('post')"/> Registration Datebase Report</label> 
                            </div>
                            <div class="col-md-4 ">
                                <label class="col-sm-12 col-lg-12 col-xs-12 col-md-12 radio-inline">
                                    <input type="radio" id="showReport" name="showReport" value="afterpost" onclick="ShowHide('afterpost')"/> Registration Quota Wise Report</label> 
                            </div>
                        </div>
                    </div>
                    <div class="row col-lg-12 form-group">                 
                        <label style="text-transform: capitalize;" class="col-sm-3 col-lg-3 col-xs-3 col-md-3 control-label">Semester Code:
                            <span style="font-size:19px;font-weight:bold;" class="text-danger">*</span></label>
                        <div class="col-sm-6 col-lg-4 col-xs-6 col-md-6">
                            <select class="form-control" id="registrationCode" name="registrationCode" data-live-search="true" data-validation="required" onchange="getAcademicYear()">               
                                <option value="">Select</option>
                                <c:forEach items="${registration}" var="registration">
                                    <option value="${registration[0]}~@~${registration[1]}"><c:out value="${registration[1]}" /></option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="row col-lg-12 form-group"  id="Acadyeardiv" style="display:none">
                        <label style="text-transform:capitalize;" class="col-sm-3 col-lg-3 col-xs-3 col-md-3 control-label">Academic Year:
                            <span style="font-size:19px;font-weight:bold;" class="text-danger"> *</span></label>
                        <div class="col-sm-6 col-lg-4 col-xs-6 col-md-6">
                            <select class="form-control" id="acadYear" name="acadYear" multiple="true" data-validation="required"  data-live-search="true">               
                            </select>
                        </div>
                    </div>
                    <div class="row col-lg-12 form-group" id="statusdiv" style="display:none">
                        <label style="text-transform: capitalize;" class="col-sm-3 col-lg-3 col-xs-3 col-md-3 control-label">Status:
                            <span style="font-size:19px;font-weight:bold;" class="text-danger"> *</span></label>
                        <div class="col-sm-9 col-lg-7 col-xs-12 col-md-6" style="margin-top: 8px;">
                            <label class="checkbox-inline"> <input type="checkbox" name="pendingStatus" id="pendingStatus" value="P"  checked="true" /> Pending</label>
                            <br> <label class="checkbox-inline">  <input type="checkbox" name="compStatus" id="compStatus" value="C" />  Completed</label>
                        </div>
                    </div>
                    <div class="row col-lg-12 form-group" id="statusondiv" style="display:none">
                        <label style="text-transform: capitalize;" class="col-sm-3 col-lg-3 col-xs-3 col-md-3 control-label">Status As On:
                            <span style="font-size:19px;font-weight:bold;" class="text-danger"> *</span></label>
                        <div class="col-sm-6 col-lg-4 col-xs-6 col-md-6">
                            <div class='input-group date' id='datepicker'>
                                <input type='text' name="regCurrentDate"  id="regCurrentDate" data-validation="required" data-live-search="true" class="form-control" autocomplete="off" />
                                <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar"></span>
                                </span>
                            </div>          
                        </div>
                    </div>
                    <div class="row col-lg-12 form-group">                 
                        <label style="text-transform: capitalize;" class="col-sm-3 col-lg-3 col-xs-3 col-md-3 control-label">Export To:
                            <span style="font-size:19px;font-weight:bold;" class="text-danger"> *</span></label>
                        <div class="col-sm-6 col-lg-4 col-xs-6 col-md-6">
                            <div class="col-sm-6 col-lg-3 col-xs-6 col-md-6 radio-inline" >
                                <input type="radio" id="export_To" name="export_To" checked="true" value="P"/> PDF
                            </div>
                        </div>
                    </div>
                    <div class="row col-lg-12">
                        <div style="margin-top: 10px;margin-right: 15px;" class="form-group pull-right">
                            <a onclick="getReport()" class="btn btn-success btn-sm btn-flat"> Download</a>
                            <a href="javascript:blank();" class="btn btn-danger btn-sm btn-flat">Cancel</a>
                        </div>
                    </div>
                    <div class="row col-lg-12 form-group"></div>
                    <div class="row col-lg-12 form-group"></div>
                    <div class="row col-lg-12 form-group"></div>
                </form>
            </div>
        </div>
    </div>
</div>
<script>
    $("#registrationCode").chosen();
    $("#acadYear").chosen({width: '100%'});

    $(function () {
        $('#datepicker').datetimepicker({format: 'DD/MM/YYYY'});
    });

    function getAcademicYear() {
        $("#acadYear").empty();
        $.ajax({
            type: "POST",
            url: "registrationSummaryReport/getAcademicYear",
            data: '&registrationCode=' + $("#registrationCode").val(),
            dataType: "json",
            async: false,
            timeout: 5000,
            cache: false,
            beforeSend: function (xhr, options) {
                return true;
            },
            success: function (data) {
                var str1 = '';
//                var str1 = '<option value="">Select</option>';
//                debugger;
                $.each(data.acadYearList, function (i, item)
                {
                    str1 += '<option value="' + item + '">' + item + '</option>'
                });
                $("#acadYear").append(str1);
                $("#acadYear").trigger("chosen:updated");
            },
            error: function (response) {
                toastr.warning('Something Wrong...............', "Warning!!");
            }
        });
    }

//    function showAcadYear() {
//        if ($("#showReport2").prop('checked') == true) {
//            $("#Ay").show();
//        } else
//        {
//            $("#Ay").hide();
//        }
//    }

    function ShowHide(v) {
        if (v == 'pre') {
            $('#Acadyeardiv').hide();
            $('#statusdiv').hide();
            $('#statusondiv').hide();
        } else {
            $('#Acadyeardiv').show();
            $('#statusdiv').show();
            $('#statusondiv').show();
        }
    }

    function getReport() {
        var registrationCode = $("#registrationCode").val();
        var acadYear = $("#acadYear").val();
        var export_To = $("input[name='export_To']:checked").val();
        debugger;
        var compStatus = $("input[name='compStatus']:checked").val();
        var pendingStatus = $("input[name='pendingStatus']:checked").val();
        var regCurrentDate = document.getElementById("regCurrentDate").value;
        var radio = $("input[name='showReport']:checked").val();
        var level = radio == 'pre' ? 'one' : radio == 'afterpost' ? 'four' : 'three';
        if (registrationCode != '') {
            $.blockUI();
            window.location.assign('registrationSummaryReport/getReport?level=' + level + '&registrationid=' + registrationCode + '&exportto=' + export_To + '&acadYear=' + acadYear + '&compStatus=' + compStatus + '&pendingStatus=' + pendingStatus + '&regCurrentDate=' + regCurrentDate + '');
                    setTimeout($.unblockUI, 10000);
        } else {
            BootstrapDialog.alert("Please Enter The Required Field..");
        }
    }
</script>
