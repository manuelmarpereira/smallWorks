<%--
    Document   : Login
    Created on : 7/mai/2015, 11:15:23
    Author     : Utilizador
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body class="bodyBackground">
        <jsp:include page="/menu/menu.jsp" />
        <div class="marginTopMenu"> 

            <form class="form-horizontal" name="formlogin" role="form" action="Login" method="POST">
                <div id="loginbox"  class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2 marginDivTopcenter">                    
                    <div class="panel panel-info" >
                        <div class="panel-heading">
                            <div class="panel-title">Sign In</div>
                            <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#">Forgot password?</a></div>
                        </div>    
                        <div style="padding-top:30px" class="panel-body" >
                            <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                            <div style="margin-bottom: 25px" class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input type="text" class="form-control" name="nick" value="" placeholder="username or email">                                        
                            </div>
                            <div style="margin-bottom: 25px" class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                <input id="login-password" type="password" class="form-control" name="password" placeholder="password">
                            </div>
                            <div class="input-group">
                                <div class="checkbox">
                                    <label>
                                        <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                                    </label>
                                </div>
                            </div>
                            <div style="margin-top:10px" class="form-group">
                                <!-- Button -->
                                <div class="col-sm-12 controls">
                                    <input type="submit" class="btn btn-success" value="Login" name="Loginbtn" />
                                    <a id="btn-fblogin" href="#" class="btn btn-primary">Login with Facebook</a>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12 control">
                                    <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                        Don't have an account! 
                                        <a href="<%= request.getContextPath()%>/login/RegisteUser.jsp" >
                                            Sign Up Here
                                        </a>
                                    </div>
                                </div>
                            </div>    
                        </div>                     
                    </div>  
                </div>
            </form>
        </div>
    </body>
    <jsp:include page="/menu/footer.jsp" />
</html>
