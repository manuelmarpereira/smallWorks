<form id="email"> 
    <div class="modal fade" id="editEmailModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                    <h4 class="modal-title" id="myModalLabel"> Change Your Email</h4>
                </div>
                <div class="modal-body">
                    
                    <div class="alert alert-danger alert-dismissible col-md-12" role="alert" style="display:none; margin-bottom: 10px" id="alerterroremail">
                <button type="button"  class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <strong>Ops!</strong> An error occurred while trying to change your Email . Please try Again.
              </div>
                    
                    <div class="row">
                        <div class="form-model col-md-8 go-right">
                            <div class="form-group">
                                <div class="col-md-12">
                                    <div class="input-group" data-validate="email">
                                        <input type="hidden" name="id" value="${sessionScope.user.id}"/>
                                        <input type="email" class="form-control" name="email" required placeholder="New Email"/>
                                        <span class="input-group-addon danger"><span class="glyphicon glyphicon-remove"></span></span>
                                    </div>
                                </div>
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
<script src="${pageContext.request.contextPath}/assets/js/editemail.js"></script>
<script src='${pageContext.request.contextPath}/assets/js/validations-user.js'></script>
<link href="${pageContext.request.contextPath}/assets/css/validations-user.css" rel="stylesheet" type="text/css"/>