<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/facebook.css">
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <script src="http://code.jquery.com/jquery-1.11.3.js"></script>


    </head>
    <body class="window">

        <div class="info" style="max-width: 680px; min-width: 300px;">
            <jsp:include page="/facebook/header.jsp" />

            <div class="row">
                <div class="col-md-10 col-md-offset-1">
                    <div class="content pull-middle">
                        <h1 class="page-header">Regist your interest in our offers</h1>
                        <div class="panel panel-default">
                            <div class="panel-body">
                                <form method="POST" id="subscription">
                                    <input type="hidden" name="id" value="${param.id}"/>
                                    <div class="row form-group">
                                        <div class="combo col-md-6">
                                            <input type="hidden" name="idSubtask" value=""/>
                                            <select name="subtask" id="subTasks" class="subTasks selectpicker_task btn btn-info" ><option value="0">-----</option></select>
                                        </div>

                                        <div class="comboloc col-md-5">
                                            <input type="hidden"  value=""/>
                                            <select name="idloc" id="idloc" class="locat selectpicker_task btn btn-info"><option value="0">-----</option></select>
                                        </div>

                                        <div class="col-md-3">
                                            <input class="btn btn-primary" value="Regist Interest" type="submit"/>
                                        </div>  
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>   
                </div>
            </div>					
            <jsp:include page="/facebook/footer.jsp" />					
        </div>
                <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/facebooksubs.js"></script>
        <script type="text/javascript">getSubTasks();getLocation();</script>
    </body>
</html>
