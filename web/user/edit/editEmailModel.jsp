<%-- 
    Document   : editNameModel
    Created on : 6/jun/2015, 22:46:50
    Author     : Manuel
--%>

<div class="modal fade" id="editEmailModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title" id="myModalLabel"> Change Your Email</h4>
            </div>
            <div class="modal-body">
                <div class="row">
                    <form role="form" class="form-model col-md-9 go-right">

                        <div class="form-group">
                            <input  name="email" type="text" class="form-control" placeholder="Your Email">
                            <label for="email">Your Email</label>
                        </div>
                    </form>
                    <div class="col-md-3">
                        <img src="${pageContext.request.contextPath}/assets/img/edit.png"/> 
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button class="btn btn btn-success sweet-12" id="conf-name" onclick="_gaq.push(['_trackEvent', 'example, 'try', 'Success']);">Save</button>
                <button type="button" class="btn btn-danger" data-dismiss="modal">Back</button>    
            </div>
        </div>
    </div>
</div>
