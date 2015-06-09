<%-- 
    Document   : chart
    Created on : 7/jun/2015, 21:26:41
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <jsp:include page="/menu/menu.jsp" />
        <jsp:include page="/user/profile.jsp" />
        <div class="col-lg-10 marginSide">    
            <h2>Status <small> Your mensal caches</small></h2>
            <hr>
            <div id="morris-bar-chart" style="height: 260px" ></div>
        </div>

        <script src="<%=request.getContextPath()%>/assets/js/jquery.js" type="text/javascript"></script>
        <script src="<%=request.getContextPath()%>/assets/js/morris-data.js" type="text/javascript"></script>
        <script src="<%=request.getContextPath()%>/assets/js/morris.min.js" type="text/javascript"></script>
        <script src="<%=request.getContextPath()%>/assets/js/raphael.min.js" type="text/javascript"></script>

    </body>
</html>
