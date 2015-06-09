<%-- 
    Document   : index
    Created on : 27/mai/2015, 17:35:45
    Author     : Manuel
                 Jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  User user = (User) request.getAttribute("user");
    if (user != null) {
        session.setAttribute("name", user.getFirstname());
    }
%>
<%@page import="user.User"%>
<jsp:include page="/menu/menu.jsp" />
<html>
    <head>
        <title>smallWorks</title>
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/img/icon.png">
    </head>
    <body class="bodyBackground">
        <div class="marginTopMenu indexMargin"> 
            <div class="black">
                <div class="text-center">
                    <img src="${pageContext.request.contextPath}/assets/img/logo.png" alt="" class="img-thumbnail"/>   
                </div>
                <hr>
                <div class="row" >
                    <div class="col-md-12">
                        <div class="col-sm-5"></div>
                        <div class="col-sm-1"></div>
                    </div>
                    <div class="col-md-2"></div>
                    <div class="col-md-10 col-centered">
                        <form role="search">
                            <div class="col-xs-4">
                                <div class="form-group has-feedback has-feedback-left">

                                    <input type="text" class="form-control" placeholder="Task or key word">
                                    <span class="glyphicon glyphicon-search form-control-feedback blue"></span>
                                </div>
                            </div>
                            <div class="col-xs-4">
                                <div class="form-group has-feedback has-feedback-left">
                                    <input type="text" class="form-control" placeholder="Location">
                                    <span class="glyphicon glyphicon-map-marker form-control-feedback blue"></span>
                                </div>
                            </div>
                            <div class="col-xs-2">
                                <a class="pull-left btn btn-default" href="${pageContext.request.contextPath}/offer/search.jsp">Search</a>
                            </div>
                        </form>
                    </div>
                </div>
                <% if (session.getAttribute("name") == null) {%>
                <div style=" margin-left: 17%; padding-top:15px; color: white;" >
                    Don't have an account! 
                    <a href="<%= request.getContextPath()%>/login/RegisteUser.jsp" >
                        Sign Up Here
                    </a>
                </div>
                <% }%>
                <hr>
            </div>
        </div>
    </body>
    <jsp:include page="/menu/footer.jsp" />
</html>