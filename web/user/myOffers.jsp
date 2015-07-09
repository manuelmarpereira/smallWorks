
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>
<layout:profile_layout title="my Offers" class2="">
 <jsp:attribute name="head">
        <link rel="stylesheet" href="//cdn.datatables.net/1.10.7/css/jquery.dataTables.min.css">
        <script src="//cdn.datatables.net/1.10.7/js/jquery.dataTables.min.js"></script>
</jsp:attribute>
    <jsp:attribute name="container">
       
        <div class="marginSide" style=" margin-bottom: 40px"> 
            <h2>Search <small> customize your small works search</small></h2>
            <hr>
            <div class="row">
                <div class="col-md-12">


                    <table id="datatable" >
                        <thead>
                            <tr>
                                <th><a class="glyphicon glyphicon-calendar"></a>Inserida em</th>
                                <th><a class="glyphicon glyphicon-pushpin"></a>Tarefa</th>
                                <th><a class="glyphicon glyphicon-gift"></a>Recompensa</th>
                                <th>Estado</th>
                                <th></th>


                            </tr>
                        </thead>
                        <tbody >


                        </tbody>
                    </table>

                </div>


            </div>
            <div style="margin-bottom: 2%;">.</div>
        </div>

        <script src="${pageContext.request.contextPath}/assets/js/makework.js"></script>
        <script type="text/javascript">
         var id = '<c:out value="${sessionScope.user.id}"/>';

         getMakeWork(id);
        </script>
        
        <script src="${pageContext.request.contextPath}/assets/js/datatable.js"></script>
    </jsp:attribute>
</layout:profile_layout>