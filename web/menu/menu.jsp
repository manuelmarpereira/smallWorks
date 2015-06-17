<%-- 
    Document   : menu
    Created on : 2/jun/2015, 19:07:43
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="user.User"%>
<%
    String user = "";
    if (session.getAttribute("name") != null) {
        user = session.getAttribute("name").toString();
    }
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=request.getContextPath()%>/assets/css/global.css" rel="stylesheet" type="text/css"/>
        <link href="<%=request.getContextPath()%>/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="<%=request.getContextPath()%>/assets/css/custom.css" rel="stylesheet" type="text/css"/>
        <link href="http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="container">
            <nav class="navbar navbar-default navbar-fixed-top topnav" role="navigation">
                <div class="container topnav">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <img  src="<%=request.getContextPath()%>/assets/img/icon.png" class="navbar-brand topnav" alt="" />
                        <a class="navbar-brand to-pnav control-label" href="${pageContext.request.contextPath}/index.jsp">smallWorks</a>
                    </div>

                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav navbar-right">
                            <% if (session.getAttribute("name") != null) {%>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <%= user%> <span class="glyphicon glyphicon-user pull-right control-label"></span></a>
                                <ul class="dropdown-menu">
                                     <li><a href="${pageContext.request.contextPath}/user/profile.jsp">Account Settings <span class="glyphicon glyphicon-cog pull-right"></span></a></li>
                                    <li class="divider"></li>
                                    <li><a href="${pageContext.request.contextPath}/user/chart.jsp">User stats <span class="glyphicon glyphicon-stats pull-right"></span></a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">Favourites<span class="glyphicon glyphicon-heart pull-right"></span></a></li>
                                    <li class="divider"></li>
                                    <li><a   href="${pageContext.request.contextPath}/login/Logout.jsp">Sign Out <span class=" glyphicon glyphicon-log-out pull-right"></span></a></li>
                                </ul>
                            </li>
                            <% } else {%>
                            <li><a class="control-label" href="<%=request.getContextPath()%>/menu/about.jsp">About</a></li>
                            <li><a class="control-label" href="<%=request.getContextPath()%>/login/Login.jsp">Login</a></li>
                                <% }%>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
        <script src="<%=request.getContextPath()%>/assets/js/jquery.js" type="text/javascript"></script>
        <script src="<%=request.getContextPath()%>/assets/js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
