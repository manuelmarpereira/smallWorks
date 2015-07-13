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

                            <li class="dropdown" style="padding-top: 5px;">
                                <a href="${pageContext.request.contextPath}/index.jsp" > Search&nbsp;&nbsp;<span class="glyphicon glyphicon-search "></span></a>                            
                            </li> 

                            <li class="dropdown" style="padding-top: 5px;">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"> Offers</a>
                                <ul class="dropdown-menu">
                                    <li><a href="${pageContext.request.contextPath}/offer/new.jsp">New Offer<span class="glyphicon glyphicon-plus pull-right" ></span>  </a></li>
                                    <li class="divider"></li> 


                                    <li><a   href="${pageContext.request.contextPath}/user/myOffers.jsp">List My Offers <span class=" glyphicon glyphicon-th-list pull-right"></span></a></li>
                                </ul>
                            </li>   



                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"> 
                                    <c:choose>
                                        <c:when test="${sessionScope.user.photo == null}">
                                            <i><img alt="image" class="miniphoto img-circle" src="${pageContext.request.contextPath}/assets/img/user2.jpg" width="30" height="30"> </i>
                                            </c:when>    
                                            <c:otherwise>
                                            <i><img alt="image" class="miniphoto img-circle" src="${pageContext.request.contextPath}/assets/img/users/${sessionScope.user.photo}" width="30" height="30"> </i>

                                        </c:otherwise>
                                    </c:choose>  
                                    <c:out value="${sessionScope.user.nick}"/>
                                </a>
                                <ul class="dropdown-menu">
                                    <li><a  href="${pageContext.request.contextPath}/user/show.jsp">Account<span class="glyphicon glyphicon-cog pull-right"></span>  </a></li>
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
                            <div style="margin-top: 15px">
                                 <a class="btn btn-info btn-xs" type="button"  href="${pageContext.request.contextPath}/smallworks.jsp">About</a>
                                
                                 <a class="btn btn-info btn-xs" type="button"  href="${pageContext.request.contextPath}/smallworks.jsp/#services">Services</a>
                                
                                 <a class="btn btn-info btn-xs" style="margin-right: 15px" type="button"  href="${pageContext.request.contextPath}/smallworks.jsp/#contact">Contact</a>
                                                                
                                <a type="button" class="btn btn-success btn-xs" href="${pageContext.request.contextPath}/login/login.jsp">Login</a>
                                <a  class="btn btn-default btn-xs" href="${pageContext.request.contextPath}/user/registerUser.jsp">Sign up</a>
                            </div>
                        </c:otherwise>
                    </c:choose>
                </ul>
            </div>
        </div>
    </nav>
</header>