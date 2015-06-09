<%-- 
    Document   : RegisteUser
    Created on : 7/mai/2015, 11:04:57
    Author     : Utilizador
--%>


<%@page import="user.User"%>

<%
    User u = (User) request.getAttribute("user");
    // para se alguem se armar em fino
    if (u == null) {
        u = new User();
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registe user</title>
        <style>
            .error {
                color : red;
            }
        </style>
    </head>
    <body class="bodyBackground">
        <jsp:include page="/menu/menu.jsp" />
        <div class="marginTopMenu"></div>  

        <div id="signupbox"  class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2 marginDivTopcenter registo">
            <div class="panel panel-info">
                <div class="panel-heading">
                    <div class="panel-title">Sign Up</div>
                    <div style="float:right; font-size: 85%; position: relative; top:-10px"><a href="${pageContext.request.contextPath}/login/Login.jsp" >Sign In</a></div>
                </div>  
                <div class="panel-body" >
                    <form class="form-horizontal" role="form" name="formreg" action="RegisteUser" method="POST">   
                        <div id="signupalert" style="display:none" class="alert alert-danger">
                            <p>Error:</p>
                            <span></span>
                        </div>
                        <div class="form-group">
                            <label for="email" class="col-md-3 control-label">Nick</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="nick" placeholder="Nick">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="firstname" class="col-md-3 control-label">First Name</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="firstname" placeholder="First Name">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="lastname" class="col-md-3 control-label">Last Name</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="lastname" placeholder="Last Name">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="email" class="col-md-3 control-label">Email</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="email" placeholder="Email">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="password" class="col-md-3 control-label">Password</label>
                            <div class="col-md-9">
                                <input type="password" class="form-control" name="password" placeholder="Password">
                            </div>
                        </div>
                        <div class="form-group">
                            <!-- Button -->                                        
                            <div class="col-md-offset-3 col-md-9">
                                <input id="btn-signup" class="btn btn-info"  type="submit" value="Registe" name="Registebtn"/> 
                                <span style="margin-left:8px;">or</span>
                                <button id="btn-fbsignup" type="button" class="btn btn-primary"><i class="icon-facebook"></i>   Sign Up with Facebook</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>              
        </div> 
    </body>
    <jsp:include page="/menu/footer.jsp" />
</html>
