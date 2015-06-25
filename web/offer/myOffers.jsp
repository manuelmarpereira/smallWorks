<%-- 
    Document   : show
    Created on : 5/jun/2015, 16:23:42
    Author     : Manuel
--%>



<div class="marginSide"> 
    <div class="row">
        <div class="col-md-12">
            <hr>
            <div class="panel panel-default">
                <div class="panel-heading">Results</div>
                <table class="table table-striped table-bordered table-hover blue">
                    <thead>
                        <tr>
                            <th><a class="glyphicon glyphicon-calendar"></a>Inserida em</th>
                            <th><a class="glyphicon glyphicon-pushpin"></a>Tarefa</th>
                            <th><a class="glyphicon glyphicon-gift"></a>Recompensa</th>
                            <th>Estado</th>
                            <th></th>

                        </tr>
                    </thead>
                    <tbody data-link="row" class="rowlink">
                        <%for (int i = 0; i < 3; i += 1) {%>
                        <tr>
                            <td>15 de Abril</td>
                            <td>Mudança de móveis</td>
                            <td>20?</td>
                            <td style="color:green;">Aguarda Finalização</td>
                            <td><a href="${pageContext.request.contextPath}/offer/new.jsp">Editar</a></td>
                            <td><a href="#">Finalizar</a></td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="col-md-6">
            <p class="pull-left control-label">Showing 1 to 3 of 15 entries</p>
        </div>
        <div class="col-md-6">
            <ul class="pagination  pull-right">
                <li class="disabled"><a href="#">&laquo;</a></li>
                <li class="active control-label"><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#">&raquo;</a></li>
            </ul>
        </div>
    </div>
</div>

