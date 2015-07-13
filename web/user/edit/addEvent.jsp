<form id="addEvent"> 
    <div class="modal fade" id="addEvent" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                    <h4 class="modal-title" id="myModalLabel">Edit Password</h4>
                </div>
                <div class="modal-body">

                    <div class="alert alert-danger alert-dismissible col-md-12" role="alert" style="display:none; margin-bottom: 10px" id="alerterrorpass">
                        <button type="button"  class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <strong>Ops!</strong> An error occurred while trying to change your Password . Please try Again.
                    </div>

                    <div class="row">
                        <input type="hidden" name="id" value="${sessionScope.user.id}"/>
                        <div class="form-model col-md-8 go-right">


                            <div class="form-group">
                                <label  for="usernameEvent">username</label>
                                <input  id="usernameEvent" name="usernameEvent" required type="text" value="${sessionScope.user.nick}" class="form-control"/>
                                
                            </div>
                            <div class="form-group">
                                <label  for="passwordEvent">password</label>
                                <input  id="passwordEvent" name="passwordEvent" required type="password" class="form-control"/>
                                
                            </div>
                            <div class="form-group">
                                <label  for="titleEvent">title</label>
                                <input  id="titleEvent" name="titleEvent" required type="text" class="form-control"/>
                                
                            </div>
                            <div class="form-group">
                                <label  for="descriptionEvent">description</label>
                                <input  id="descriptionEvent" name="descriptionEvent" required type="text" class="form-control"/>
                                
                            </div>
                            <div class="form-group">
                                <input  id="dateEvent" name="dateEvent" required type="date" class="form-control"/>
                                
                            </div>
                            <div class="form-group">
                                <label  for="durationEvent">duration</label>
                                <input  id="durationEvent" name="durationEvent" required type="number" class="form-control"/>
                                
                            </div>
                            <div class="form-group">

                            </div>

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

<script src="http://momentjs.com/downloads/moment.js"></script>                    
<script src="${pageContext.request.contextPath}/assets/js/addEvent.js"></script>

