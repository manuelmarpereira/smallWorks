<form id="photo" > 
    <div class="modal fade" id="editPhotoModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                    <h4 class="modal-title" id="myModalLabel">Edit profile Photo</h4>
                </div>
                <div class="modal-body">
                    
               <div class="alert alert-danger alert-dismissible col-md-12" role="alert" style="display:none; margin-bottom: 10px" id="alerterrorphoto">
                <button type="button"  class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <strong>Ops!</strong> An error occurred while trying to change your photo . Please try Again.
              </div>
                    
               <div class="alert alert-info alert-dismissible col-md-12" role="alert" style="display:none; margin-bottom: 10px" id="alertinfophoto">
                <button type="button"  class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <strong>Uploading image...</strong>wait a moment please...
                 <div class="text-center">
                     <img src="${pageContext.request.contextPath}/assets/img/load.gif" alt="" height="40" width="40" class="img-thumbnail"/>   
                </div>
              </div>
                    
                    <div class="text-center">
                        <input type="hidden" name="id" value="${sessionScope.user.id}"/>
                        <img src="${pageContext.request.contextPath}/assets/img/user.jpg" alt="" class="avatar img-circle" />

                        <h6>Carregar Foto</h6>
                        <input class="inpimg form-control" type="file" name="imagefile" accept="image/png" required onchange="setImg(this);">
                    </div>
                </div>
                <div class="modal-footer" style="font-size: 1.5em;"> 
                    <input id="submit" type ="submit" class="btn btn btn-success" value ="Save">
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Back</button>
                </div>
            </div>
        </div>
    </div>
</form>
<script src="${pageContext.request.contextPath}/assets/js/editphoto.js"></script>