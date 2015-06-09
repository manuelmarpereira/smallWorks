<%-- 
    Document   : footer
    Created on : 7/jun/2015, 0:35:35
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div class="navbar navbar-default navbar-fixed-bottom" style="height:5px ">
            <div class="container">
                <p class="navbar-text pull-left">© 2015 - MEI | UMinho 
                    <a href="<%=request.getContextPath()%>/menu/about.jsp"> smallWorks Project</a>
                </p>

                <a href="https://www.facebook.com/mysmallworks" target="_blank" class="navbar-btn btn-primary btn pull-right">
                    <span class="glyphicon glyphicon-star"></span>  Follow us on Facebok</a>
            </div>
        </div>
    </body>
</html>
