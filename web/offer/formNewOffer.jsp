<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script type="text/javascript" src="../assets/js/userdata.js"></script>

<div class="marginSide" style="margin-top:80px;"> 
    <h2>New Offer <small>Publish your new offer</small></h2>
    <hr>
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
                            <textarea class="form-control" name="description" rows="13"></textarea>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-3">Reward</label>
                        <div class="col-sm-4">
                            <div class="input-group number-spinner">
                                <span class="input-group-btn">
                                    <a class="btn btn-info" data-dir="dwn"><span class="glyphicon glyphicon-minus"></span></a>
                                </span>
                                <input type="number" required name="reward" class="form-control text-center" value="25" step="any"/>
                                <span class="input-group-btn">
                                    <a class="btn btn-info" data-dir="up"><span class="glyphicon glyphicon-plus"></span></a>
                                </span>
                            </div>
                        </div>
                        <label class="control-label pull-left">€</label>
                        <div class="col-sm-2">
                            <div class="checkbox">
                                <label class="control-label"><input id="checkNego" type="checkbox" name="negociable"/>Negociable</label>
                            </div>
                        </div>
                    </div>
                    
                    <div class="combo">
                        <input type="hidden" name="idSubtask" value=""/>
                        <p class="col-md-6">Category<select class="tasks" onchange="handleChange(this)" required ><option value="">-----</option></select></p>
                        <p class="col-md-6">Task<select class="subTasks" required><option value="">-----</option></select></p>
                    </div>
                    
                </div>
                <div class="col-md-6">
                    <div class="row">
                        <label for="txtEndereco" class="col-md-3 control">Offer location </label>
                        <div class="col-md-8">
                            <input type="text" id="txtEndereco" class="form-control" required name="txtEndereco" placeholder="Location Adress" />
                        </div>
                    </div>
                    <br/>
                    <jsp:include page="/layout/map.jsp" />  
                    <script type="text/javascript">initMyMap();</script>
                </div>
                <div>
                    <input type="submit" class="btn btn-primary pull-right" value="Save offer">
                </div>
            </form>
        </div>
    </div>
</div>

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
