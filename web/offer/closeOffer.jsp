<link href="${pageContext.request.contextPath}/assets/css/feedback-stars.css" rel="stylesheet" type="text/css"/> 
<form role="form" name="" action="${pageContext.request.contextPath}/offer/feedback" method="POST"> 
    <div class="modal fade" id="FinishModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                    <h4 class="modal-title" id="myModalLabel">Close offer</h4>
                </div>
                <div class="modal-body">
                    
                    <div class="row">
                        
                        <div>
                        Feedback: 
                        <jsp:include page="/feedback/giveFeed.jsp" />
                        </div>
                        
                        <div class="po-markup" style="margin-left:250px; margin-top:-30px;">
                            <a class="po-help btn btn-warning btn-xs" data-original-title="" title="">?</a>

                            <div class="po-content hidden">
                                <div class="po-title">
                                    Feedback (Help)
                                </div> 

                                <div class="po-body">
                                    <p>
                                     Give a feedback value to the worker. Rate it between 0-10 Stars.
                                    </p>
                                </div>
                            </div> 
                        </div>
                        
                    </div>
                    
                    
                    
                    <br>
                    
                    <div class=" row ">
                        Comentario:
                        <textarea rows="2" cols="1"  name="description" id="description" class="form-control" ></textarea>
                    </div>

                    
                    
                    
                </div>
               
                <div class="modal-footer"> 
                    <input type ="submit" class="btn btn btn-success" value ="Save" >
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Back</button>
                </div>
            </div>     
        </div>
    </div>
    <input type="text" required name="idOffer" id="idOffer" class="form-control" style="visibility: hidden;">
    <input type="text" required value="0" name="feedback" id="feedback" class="form-control" style="visibility: hidden;" >
</form> 

<script src="${pageContext.request.contextPath}/assets/js/help.js"></script>