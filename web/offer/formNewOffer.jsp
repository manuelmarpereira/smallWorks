<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="marginSide" style="margin-top:80px;"> 
    <h2>New Offer <small>Publish your new offer</small></h2>
    <hr>
    <div class="row">
        <div class="col-md-12">
            <form class="form-horizontal" role="form">
                <div class="col-md-6">
                    <div class="form-group">
                        <label class="control-label col-sm-3">Título:</label>
                        <div class="col-sm-9">
                            <input type="text" required name="title" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-3">Descrição:</label>
                        <div class="col-sm-9">
                            <textarea class="form-control" required name="description" rows="13"></textarea>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-3">Recompensa:</label>
                        <div class="col-sm-4">
                            <div class="input-group number-spinner">
                                <span class="input-group-btn">
                                    <a class="btn btn-info" data-dir="dwn"><span class="glyphicon glyphicon-minus"></span></a>
                                </span>
                                <input type="number" required class="form-control text-center" value="25">
                                <span class="input-group-btn">
                                    <a class="btn btn-info" data-dir="up"><span class="glyphicon glyphicon-plus"></span></a>
                                </span>
                            </div>
                        </div>
                        <label class="control-label pull-left">€</label>
                        <div class="col-sm-2">
                            <div class="checkbox">
                                <label class="control-label"><input type="checkbox"  name="negociable" >Negociável</label>
                            </div>
                        </div>
                        <div class="col-sm-2 pull-right">
                            <input type="submit" class="btn btn-primary pull-right" value="Publish">

                        </div>

                    </div>
                </div>
                <div class="col-md-6">
                    <div class=" panel panel-default">
                        <div class="panel-heading">Local da Oferta Proposta</div>
                        <br/>
                        <jsp:include page="/layout/map.jsp" />  

                    </div>
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

        if (btn.attr('data-dir') == 'up') {
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
</script>
