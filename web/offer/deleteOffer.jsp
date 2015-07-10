    <div class="modal fade" id="ResetModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                    <h4 class="modal-title" id="myModalLabel">Confirmation</h4>
                </div>
                Are you sure you want to delete the offer?
                
                <div class="modal-footer"> 
                    <input type ="button" class="btn btn btn-danger" onclick="deleteOffer();" value ="Delete" >
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Back</button>
                </div>
           
        </div>
    </div>
</div>
   <input type="text" required name="idDeleteOffer" id="idDeleteOffer" class="form-control" style="visibility: hidden;">

                <script src="${pageContext.request.contextPath}/assets/js/deleteoffer.js"></script> 
