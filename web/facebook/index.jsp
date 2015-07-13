<%-- 
    Document   : index
    Created on : 2/jul/2015, 17:58:17
    Author     : Manuel
--%>
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
                                <form action="#" role="form">
                                    <div class="row form-group">
                                        <div class="col-md-4">
                                            <select class="selectpicker_task btn btn-info">
                                                  <option>Task Category</option>
                                                  <option>Home</option>
                                                  <option>Baby's</option>
                                                </select>
                                        </div>
                                        <div class="col-md-4">
                                             <select class="selectpicker_location btn btn-info">                     
                                                  <option>Location</option>
                                                  <option>Viana do Castelo</option>
                                                  <option>Braga</option>                                             
                                              </select>
                                        </div>
                                        <div class="col-md-4">
        
                                                <button class="btn btn-primary" type="submit">Regist Interest</button>
                                              
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
        
    </body>
</html>
