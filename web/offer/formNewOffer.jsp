<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script type="text/javascript" src="../assets/js/userdata.js"></script>

<div class="marginSide"> 
    <br/>
    <h2>New Offer <small>Publish your new offer</small></h2>
    <hr>
    <div class="alert alert-danger alert-dismissible col-md-12" role="alert" style="display:none; margin-bottom: 10px" id="alertsuccessnewoffer">
        <button type="button"  class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <strong>Ops!</strong> An error occurred while trying to change your photo . Please try Again.
    </div>
    
     <div class="alert alert-danger alert-dismissible col-md-12" role="alert" style="display:none; margin-bottom: 10px" id="alerterrornewoffer">
        <button type="button"  class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <strong>Ops!</strong> An error occurred while trying to publish your new offer . Please try Again.
    </div>

    <div class="row">
        <div class="col-md-12">
            <form class="form-horizontal" action="new" method="POST">
                <input type="hidden" name="id" value="${sessionScope.user.id}"/>
                <div class="col-md-6">
                    <div class="form-group">
                        <label class="control-label col-sm-3">Title</label>
                        <div class="col-sm-9">
                            <input type="text" required name="tittle" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-3">Description</label>
                        <div class="col-sm-9">
                            <textarea class="form-control" name="description" rows="7"></textarea>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-3">Reward</label>
                        <div class="col-sm-5">
                            <div class="input-group number-spinner">
                                <span class="input-group-btn">
                                    <a class="btn btn-info" data-dir="dwn"><span class="glyphicon glyphicon-minus"></span></a>
                                </span>
                                <input  required name="reward" class="form-control text-center" value="25" step="any"/>
                                <span class="input-group-btn">
                                    <i class="btn btn-default" ><span class="glyphicon glyphicon-euro"></span></i>
                                </span>
                                 <span class="input-group-btn">
                                    <a class="btn btn-info" data-dir="up"><span class="glyphicon glyphicon-plus"></span></a>
                                </span>
                            </div>
                        </div>
                       
                        <div class="col-sm-4">
                         
                                <label class="control-label btn btn-info " style="width:100%; text-align:center"><input id="checkNego" type="checkbox" name="negociable"/>&nbsp;Negociable</label>
                         
                        </div>
                        
                        
                        <div class="combo row">
                            <br>
                            <input type="hidden" name="idSubtask" value=""/>
                            
                            <label class="control-label col-sm-3">Category</label>
                            <p class="col-md-4"><select class="tasks selectpicker_task btn btn-info" style="width:100%;" onchange="handleChange(this)" required ><option value="">-----</option></select></p>
                            
                            <label class="control-label col-sm-1">Task</label>
                            <p class="col-md-4"><select class="subTasks selectpicker_task btn btn-info" style="width:100%;" required><option value="">-----</option></select></p>
                        </div>
                        
                        <div class="row col-md-12">
                   
                    <input type="submit" class="btn btn-primary pull-right" style=" margin-top:10px" value="Publish">
                    </div>
                        
                    </div>
                    
                  
                    
                    
                </div>
                <div class="col-md-6">
                    <div class="row">
                        <label for="txtEndereco" class="col-md-3 control">Offer location </label>
                        <div class="col-md-7">
                            <input type="text" id="txtEndereco" class="form-control" required name="txtEndereco" placeholder="Location Adress" />
                        </div>
                        <div class="col-md-2">
                        <div class="po-markup">
                            <a class="po-help btn btn-warning btn-sm" data-original-title="" title="">?</a>

                            <div class="po-content hidden">
                                <div class="po-title">
                                    Location (Help)
                                </div> 
                                <div class="po-body">
                                    <p>
                                     You can insert your offer location and use the map marker to drag and 
                                     select any location with precision
                                    </p>
                                </div>
                            </div> 
                        </div>
                            </div>
                    </div>
                    <br/>
                    <jsp:include page="/layout/map.jsp" />  
                    <script type="text/javascript">initMyMap();</script>
                
                </div>
             
                
            </form>
        </div>
    </div>
</div>
<script src="${pageContext.request.contextPath}/assets/js/help.js"></script>


<script>
    $(document).on('click', '.number-spinner a', function () {
        var btn = $(this),
                oldValue = btn.closest('.number-spinner').find('input').val().trim(),
                newVal = 0;
        if (btn.attr('data-dir') === 'up') {
            newVal = parseInt(oldValue) + 1;
        } else {
            if (oldValue > 1) {
                newVal = parseInt(oldValue) - 1;
            } else {
                newVal = 1;
            }
        }
        btn.closest('.number-spinner').find('input').val(newVal);
    });
    
    getTasks();
    
</script>