



<form id="names" > 
    <div class="modal fade" id="editNameModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">                
                
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                    <h4 class="modal-title" id="myModalLabel"> Profile Name</h4>
                </div>
                
               
                <div class="modal-body">
                                        
              <div class="alert alert-danger alert-dismissible col-md-12" role="alert" style="display:none; margin-bottom: 10px" id="alerterrorname">
                <button type="button"  class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <strong>Ops!</strong> An error occurred while trying to change your name . Please try Again.
              </div>
                    
         
                    <div class="row">
                        <div class="form-model col-md-8 go-right">
                            <input type="hidden" name="id" value="${sessionScope.user.id}"/>
                            <div class="form-group">
                                <input  id="firstname" name="firstname" required type="text" class="form-control"/>
                                <label id="labelfirstname" for="firstname">Your First Name</label>
                            </div>
                            <div class="form-group">
                                <input id="lastname" name="lastname" required type="text" class="form-control"/>
                                <label id="labellastname" for="lastname">Your Last Name</label>
                            </div>
                        </div>

                        <div class="col-md-2">
                            <img src="${pageContext.request.contextPath}/assets/img/edit.png"/> 
                        </div>
                    </div>
                </div>
                <div class="modal-footer"> 
                    <input id="submit" type ="submit" style="margin-right: 10px" class="btn btn-sm btn-success" value ="Save" >
                    <a href="#"  style="text-decoration: underline" data-dismiss="modal"> Cancel </a>
                </div>
            </div>
        </div>
    </div>
</form>
<script src="${pageContext.request.contextPath}/assets/js/editnames.js"></script>
<script LANGUAGE="JavaScript" src='${pageContext.request.contextPath}/assets/js/validations-user.js'></script>