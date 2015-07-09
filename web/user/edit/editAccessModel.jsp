<form id="editpass"> 
    <div class="modal fade" id="editAccessModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                    <h4 class="modal-title" id="myModalLabel">Edit Password</h4>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <input type="hidden" name="id" value="${sessionScope.user.id}"/>
                        <div class="form-model col-md-8 go-right">
                            <div class="form-group">
                                <input id="password" required="true" name="password" type="password" class="form-control" >
                                <label for="password">New Password</label>
                            </div>
                            <div class="row">
                                <div class="col-sm-6">
                                    <span id="8char" class="glyphicon glyphicon-remove" style="color:#FF0004;"></span> 8 Characters<br>
                                    <span id="ucase" class="glyphicon glyphicon-remove" style="color:#FF0004;"></span> Uppercase
                                </div>
                                <div class="col-sm-6">
                                    <span id="lcase" class="glyphicon glyphicon-remove" style="color:#FF0004;"></span> Lowercase<br>
                                    <span id="num" class="glyphicon glyphicon-remove" style="color:#FF0004;"></span> Number
                                </div>
                            </div>

                            <div class="form-group" style="margin-top: 20px">
                                <input id="password2"  required="true" name="password2" type="password" class="form-control">
                                <label for="repeatpassword">Repeat Password</label>
                            </div>
                            <div class="row">
                                <div class="col-sm-12">
                                    <span id="pwmatch" class="glyphicon glyphicon-remove" style="color:#FF0004;"></span> Passwords Match
                                </div>
                            </div>
                        </div>
                        <div class="col-md-2">
                            <img src="${pageContext.request.contextPath}/assets/img/edit.png"/> 
                        </div>
                    </div>
                </div>
                <div class="modal-footer"> 
                    <input type ="submit" class="btn btn btn-success" value ="Save" disabled>
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Back</button>
                </div>
            </div>
        </div>
    </div>
</form>        

<script src='${pageContext.request.contextPath}/assets/js/editpass.js'></script>
<script src='${pageContext.request.contextPath}/assets/js/validations-user.js'></script>

