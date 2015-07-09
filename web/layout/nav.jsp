<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <img  src="${pageContext.request.contextPath}/assets/img/icon.png" class="navbar-brand topnav" alt="" />
                <a class="navbar-brand topnav control-label" href="${pageContext.request.contextPath}/index.jsp">smallWorks</a>
            </div>

            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <c:choose>
                        <c:when test="${sessionScope.user != null}">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"> 
                                <c:choose>
                                    <c:when test="${sessionScope.user.photo == null}">
                                        <i> <img alt="image" class="miniphoto img-circle" src="${pageContext.request.contextPath}/assets/img/user2.jpg" width="30" height="30"> </i>
                                    </c:when>    
                                    <c:otherwise>
                                    <i> <img alt="image" class="miniphoto img-circle" src="${pageContext.request.contextPath}/assets/img/users/${sessionScope.user.photo}" width="30" height="30"> </i>
                                        
                                    </c:otherwise>
                                </c:choose>  
                                <c:out value="${sessionScope.user.nick}"/>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="${pageContext.request.contextPath}/user/show.jsp">Account<span class="glyphicon glyphicon-cog pull-right"></span>  </a></li>
                                <li class="divider"></li> 
                                <li><a href="${pageContext.request.contextPath}/user/dashboard.jsp">User stats <span class="glyphicon glyphicon-stats pull-right"></span></a></li>
                                <li class="divider"></li>
                                <li><a href="#">Favourites<span class="glyphicon glyphicon-heart pull-right"></span></a></li>
                                <li class="divider"></li>
                                <li><a   href="${pageContext.request.contextPath}/login/logout.jsp">Sign Out <span class=" glyphicon glyphicon-log-out pull-right"></span></a></li>
                            </ul>
                        </li>
                        </c:when>
                        <c:otherwise>
                            <li><a class="control-label" href="${pageContext.request.contextPath}/about.jsp">About</a></li>
                            <li><a class="control-label" href="${pageContext.request.contextPath}/login/login.jsp">Login</a></li>
                        </c:otherwise>
                    </c:choose>
                </ul>
            </div>
        </div>
    </nav>
</header>