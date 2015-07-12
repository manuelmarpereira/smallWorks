<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form id="editloca"> 
    <div class="modal fade" id="editLocationModel" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <input type="hidden" name="id" value="${sessionScope.user.id}"/>
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                    <h4 class="modal-title" id="myModalLabel">Edit your Location</h4>

                </div>
                <div class="modalmap modal-body" >
                    
                    <div class="alert alert-danger alert-dismissible col-md-12" role="alert" style="display:none; margin-bottom: 10px" id="alerterrorlocation">
                        <button type="button"  class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <strong>Ops!</strong> An error occurred while trying to change your Location . Please try Again.
                    </div>
                    
                    <div class="row">
                        <label for="txtEndereco" class="col-md-2 control" >Location </label>
                        <div class="col-md-8">
                            <input type="text" id="txtEndereco" class="form-control" required name="txtEndereco" placeholder="Location Adress"/>
                        </div>
                    </div>
                    <br/>
                    <jsp:include page="/layout/map.jsp" />
                    <script type="text/javascript">takeGray();</script>
                    
                </div>
                <div class="modal-footer"> 
                    <input type ="submit" class="btn btn btn-success" value="Save"/>
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Back</button>
                </div>
            </div>
        </div>
    </div>
</form>
<script src="${pageContext.request.contextPath}/assets/js/editlocal.js"></script>