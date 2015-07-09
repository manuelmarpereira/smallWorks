<link href="${pageContext.request.contextPath}/assets/css/feedback-stars.css" rel="stylesheet" type="text/css"/> 
<form role="form" name="" action="feedback" method="POST"> 
    <div class="modal fade" id="FinishModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                    <h4 class="modal-title" id="myModalLabel">Confirmation</h4>
                </div>
                <div class="modal-body">
                    <div class="row">
            Feedback: 
          
<jsp:include page="/feedback/giveFeed.jsp" />
<br/>
Comentario:
 <textarea rows="2" cols="1"  name="description" id="description" class="form-control" ></textarea>
                </div>
                <div class="modal-footer"> 
                    <input type ="submit" class="btn btn btn-success" value ="Save" >
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Back</button>
                </div>
            </div>
        </div>
    </div>
</div>
                 <input type="text" required name="idOffer" id="idOffer" class="form-control" style="visibility: hidden;">
                    <input type="text" required value="0" name="feedback" id="feedback" class="form-control" style="visibility: hidden;" >
</form> 
                