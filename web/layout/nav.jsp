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