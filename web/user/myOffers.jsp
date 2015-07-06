
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>
<layout:profile_layout title="my Offers" class2="">
    <jsp:attribute name="container">
        <div class="marginSide" style=" margin-bottom: 40px"> 
             <h2>Search <small> customize your small works search</small></h2>
                <hr>
    <div class="row">
        <div class="col-md-12">
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
                        <tr>
                            <td>15 de Abril</td>
                            <td>Mudança de móveis</td>
                            <td>20?</td>
                            <td style="color:green;">Aguarda Finalização</td>
                            <td><a href="${pageContext.request.contextPath}/offer/new.jsp">Editar</a></td>
                            <td><a href="#">Finalizar</a></td>
                        </tr>
                      
                      
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
    </jsp:attribute>
</layout:profile_layout>