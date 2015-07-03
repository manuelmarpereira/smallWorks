<%-- 
    Document   : editNameModel
    Created on : 6/jun/2015, 22:46:50
    Author     : Manuel
--%>

        <div class="modal fade" id="editAccessModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                        <h4 class="modal-title" id="myModalLabel">Edit Access Data</h4>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <form role="form" class="form-model col-md-9 go-right">

                                <div class="form-group">
                                    <input id="email"  name="email" type="text" class="form-control" placeholder="Email">
                                    <label for="email">Email</label>
                                </div>
                                
                                <div class="form-group">
                                    <input id="password"  name="password" type="text" class="form-control" placeholder="Password">
                                    <label for="password">Password</label>
                                </div>
                                
                                <div class="form-group">
                                    <input id="repeatpassword"  name="repeatpassword" type="text" class="form-control" placeholder="Repeat Password">
                                    <label for="repeatpassword">Repeat Password</label>
                                </div>
                                
                            </form>
                            <div class="col-md-3">
                                <img src="${pageContext.request.contextPath}/assets/img/edit.png"/> 
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <jsp:include page="confirmations.jsp" />
                    </div>
                </div>
            </div>
        </div>
