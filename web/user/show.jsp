<%-- 
    Document   : profile
    Created on : 3/jun/2015, 0:00:00
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
        <link href="<%=request.getContextPath()%>/assets/css/user.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="/layout/nav.jsp" />
        <div class="marginTopMenu marginSide">  
            <div class="profile">
                <div class="row">
                    <div class="col-sm-4 col-md-3 col-md-2 white">
                        <img src="../assets/img/user.jpg" alt="" class="img-rounded img-responsive" /> 
                    </div>
                    <div class="col-sm-4 col-md-4 white">
                        <div class="pull-left">
                            <h1>
                                Marco Correia
                            </h1>
                            <br>
                            <h4 class="pull-left">
                                <i class="glyphicon glyphicon-map-marker"></i>
                                Porto
                            </h4>
                        </div>
                        <p class="pull-left">
                            <i class="glyphicon glyphicon-envelope"></i>
                            marco@hotmail.com
                        </p>
                        <p class="pull-left">
                            <i>Feedback (8/10) </i> 
                            <jsp:include page="/feedback/stars.jsp" />
                        </p>          
                    </div>
                    <div class="col-sm-4 col-md-6 " style=" margin-top: 30px">
                        <p><a href="${pageContext.request.contextPath}#" style="width:200px" class="btn btn-primary">Marco Offers</a></p>
                    </div>
                </div>          
            </div>            
        </div>
    </body>
</html>
