<%-- 
    Document   : editNameModel
    Created on : 6/jun/2015, 22:46:50
    Author     : Manuel
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <div class="modal fade" id="editLocationModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">�</span><span class="sr-only">Close</span></button>
                        <h4 class="modal-title" id="myModalLabel">Edit your Location</h4>
                        
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <label for="txtEndereco2" >Endere�o </label>
                                  
                                        <input type="text" id="txtEndereco2" class="form-control" required name="txtEndereco2" />
                            <form role="form" class="col-md-9 go-right">

                                <div class="form-group">
                                                                 
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <jsp:include page="confirmations.jsp" />
                    </div>
                </div>
            </div>
        </div>

