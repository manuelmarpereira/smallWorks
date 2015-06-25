<%@tag description="smallWorks" pageEncoding="UTF-8"%>
<%@attribute name="title" required = "true" rtexprvalue="true" %>
<%@attribute name="class2" required = "true" rtexprvalue="true" %>
<%@attribute name="head" fragment="true" %>
<%@attribute name="container" fragment="true" %>
<%@attribute name="foot" fragment="true" %>
<%@attribute name="session" fragment="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8" content="text/html; charset=utf-8" />
        <title>${title}</title>
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/img/icon.png">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <link href="<%=request.getContextPath()%>/assets/css/custom.css" rel="stylesheet" type="text/css"/>
        <jsp:invoke fragment="head"></jsp:invoke>
        </head>

    <% user.User user = (user.User) request.getAttribute("user");
        if (user != null) {
            session.setAttribute("name", user.getFirstname());
        }
    %>

    <jsp:invoke fragment="session"></jsp:invoke>

        <body class="${class2}">
        <header>
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
                        <a class="navbar-brand topnav control-label" href="${pageContext.request.contextPath}/index.jsp">smallWorks</a>
                    </div>

                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav navbar-right">
                            <% if (session.getAttribute("name") != null) {%>

                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <i><img alt="image" class="img-circle" src="${pageContext.request.contextPath}/assets/img/user2.jpg" width="30" height="30"></i></span> <%= session.getAttribute("name")%></a>
                                <ul class="dropdown-menu">
                                    <li><a href="${pageContext.request.contextPath}/user/editUser.jsp">Account<span class="glyphicon glyphicon-cog pull-right"></span>  </a></li>
                                    <li class="divider"></li> 
                                    <li><a href="${pageContext.request.contextPath}/user/chart.jsp">User stats <span class="glyphicon glyphicon-stats pull-right"></span></a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">Favourites<span class="glyphicon glyphicon-heart pull-right"></span></a></li>
                                    <li class="divider"></li>
                                    <li><a   href="${pageContext.request.contextPath}/login/logout.jsp">Sign Out <span class=" glyphicon glyphicon-log-out pull-right"></span></a></li>
                                </ul>
                            </li>
                            <% } else {%>
                            <li><a class="control-label" href="<%=request.getContextPath()%>/about.jsp">About</a></li>
                            <li><a class="control-label" href="<%=request.getContextPath()%>/login/login.jsp">Login</a></li>
                                <% }%>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
                        
        <jsp:invoke fragment="container"></jsp:invoke>
            <footer>
                <div class="navbar navbar-default navbar-fixed-bottom" style="height:5px ">
                    <div class="container">
                        <p class="navbar-text pull-left">© 2015 - MEI | UMinho 
                            <a href="<%=request.getContextPath()%>/menu/about.jsp"> smallWorks Project</a>
                        </p>
                        <a href="https://www.facebook.com/mysmallworks" target="_blank" class="navbar-btn btn-primary btn pull-right">
                            <span class="glyphicon glyphicon-star"></span>  Follow us on Facebok</a>
                    </div>
                </div>             
            </footer>
                        
        <jsp:invoke fragment="foot"></jsp:invoke>
        <script src="<%=request.getContextPath()%>/assets/js/plugins/jquery.js" type="text/javascript"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    </body>
</html>