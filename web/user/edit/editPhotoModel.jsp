<%-- 
    Document   : editNameModel
    Created on : 6/jun/2015, 22:46:50
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
        <div class="modal fade" id="editPhotoModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                        <h4 class="modal-title" id="myModalLabel">Edit profile Photo</h4>
                    </div>
                    <div class="modal-body">

                        <div class="text-center">

                            <img src="../assets/img/user.jpg" alt="" class="avatar img-circle"  />

                            <h6>Carregar Foto</h6>
                            <input type="file" class="form-control">
                        </div>
                    </div>
                    <div class="modal-footer">
                       <jsp:include page="confirmations.jsp" />
                    </div>
                </div>
            </div>
        </div>
