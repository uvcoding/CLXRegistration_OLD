<%-- 
    Document   : photoSignatureEdit
    Created on : Jan 9, 2019, 11:50:21 AM
    Author     : mohit1.kumar
--%>

<%@include file="../mainjstl.jsp"%>
<div class="step-pane sample-pane alert" data-step="3" id="tabs-3">   
    <form id="ajaxform_tab3" method="POST" class="form-horizontal" action="guestStudentMaster/studentPhotoSignatureUpdate"  enctype="multipart/form-data">
        <div style="height: 12px"><br/></div>
        <input type="hidden" id='student_pk3' value="${personalInfo.gueststudentid}" class="" name="student_pk3" >
        <div class="col-lg-12 container">
            <div class="row col-lg-12 form-group" >
                <label style="text-transform: capitalize;" class="col-sm-3 col-lg-4 col-xs-3 col-md-3 control-label">Download Photo:
                    <span style="font-size:19px;font-weight:bold;" class="text-danger"> </span></label>
                <div class="col-sm-6 col-lg-8 col-xs-6 col-md-6"> 
                    <input type="file" id="sphoto" name="sphoto"  data-validation-optional="true" class="fa fa-search" data-icon="false">
                    <!--&nbsp;<input type="checkbox" id="confPhoto" name="confPhoto" value="1">Confirm Photo Upload-->
                </div>
            </div>
           <img alt="noimg" src="data:image/jpeg;base64,${photo}" width="75" height="80" style="text-align:center;border:0px;vertical-align:middle"/>
        </div>
        <div class="col-lg-12 container">
            <div class="row col-lg-12 form-group" >
                <label style="text-transform: capitalize;" class="col-sm-3 col-lg-4 col-xs-3 col-md-3 control-label">Download Signature:
                    <span style="font-size:19px;font-weight:bold;" class="text-danger"> </span></label>
                <div class="col-sm-6 col-lg-8 col-xs-6 col-md-6"> 
                    <input type="file" id="ssignature" name="ssignature" data-validation-optional="true" class="fa fa-search" data-icon="false">
                    <!--&nbsp;<input type="checkbox" id="confSign" name="confSign" value="1">Confirm Signature Upload-->
                </div>
            </div>
             <img alt="noimg" src="data:image/jpeg;base64,${sign}" width="75" height="80" style="text-align:center;border:0px;vertical-align:middle"/>
        </div>
        <div class="col-lg-12 form-group">              
            <div style="margin-top: 10px;margin-right: 15px;" class="form-group pull-right">
                <a href="javascript:setFormIdAndUrl('ajaxform_tab3','guestStudentMaster/studentPhotoSignatureUpdate',3);" class="btn btn-success btn-sm btn-flat"> Update</a>
                <!--            <button class="btn btn-warning btn-sm btn-flat" id="erase" type="reset"> Reset</button> 
                            <a href="javascript:closePage();" class="btn btn-danger btn-sm btn-flat"> Cancel</a>-->
            </div>
        </div>
    </form>
</div>
<script>

    $(document).ready(function () {
        $('#studentPhoto').change(function () {
            var fp = $("#studentPhoto");
            var lg = fp[0].files.length; // get length
            var items = fp[0].files;
            var fileSize = 0;
            if (lg > 0) {
                for (var i = 0; i < lg; i++) {
                    fileSize = items[i].size; // get file size
                    if (fileSize > (2097152 / 2)) {
                        BootstrapDialog.alert('File size must not be more than 1 MB');
                        $('#studentPhoto').val('');
                    }
                }
            }
            var ext = $('#studentPhoto').val().split('.').pop().toLowerCase();
            if ($.inArray(ext, ['jpg', 'jpeg']) == -1) {
                BootstrapDialog.alert('Invalid extension! Only jpg and jpeg is allowed here.');
                $('#studentPhoto').val('');
            }
        });

        $('#studentSign').change(function () {
            var fp = $("#studentSign");
            var lg = fp[0].files.length; // get length
            var items = fp[0].files;
            var fileSize = 0;
            if (lg > 0) {
                for (var i = 0; i < lg; i++) {
                    fileSize = items[i].size; // get file size
                    if (fileSize > (2097152 / 2)) {
                        BootstrapDialog.alert('File size must not be more than 1 MB');
                        $('#studentSign').val('');
                    }
                }
            }
            var ext = $('#studentSign').val().split('.').pop().toLowerCase();
            if ($.inArray(ext, ['jpg', 'jpeg']) == -1) {
                BootstrapDialog.alert('Invalid extension! Only jpg and jpeg is allowed here.');
                $('#studentSign').val('');
            }
        });
    });

    function savePhotoSignData() {
        if ($('#studentPhoto').val() != '') {
            var ext = $('#studentPhoto').val().split('.').pop().toLowerCase();
            if ($.inArray(ext, ['jpg', 'jpeg']) == -1) {
                BootstrapDialog.alert('Invalid extension! Only jpg and jpeg is allowed here.');
                $('#studentPhoto').val('');
            } else {
                $("#ajaxform_tab3").submit();
            }
        } else {
            BootstrapDialog.alert("Please select any photo!");
        }
    }

</script>


