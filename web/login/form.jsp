<% 
    String fn = (String) request.getAttribute("sn");
    if(fn == null)
        fn="";
    String fp = (String) request.getAttribute("sp");
    if(fp == null)
        fp="";
    String error = (String) request.getAttribute("err");
%>

<form class="form-horizontal" name="formlogin" role="form" action="login" method="POST">
    <div id="loginbox"  class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2 form-margin-center">                    
        <div class="panel panel-info" >
            <div class="panel-heading">
                <div class="panel-title">Sign In</div>
                <div class="panel-title-forgot"><a href="#">Forgot password?</a></div>
            </div>   
            <div class="panel-body" >
                <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                    
                    <input type="text" class="form-control" name="nick" value="<%=fn%>" placeholder="username or email" required="true">                               
                </div>
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                    <input id="login-password" type="password" class="form-control" name="password" value="<%=fp%>" placeholder="password" required="true">
                </div>
                <% if(error!=null) {%>
                    <span style="color: red;"><%=error%></span>
                <%}%>
                <div class="input-group">
                    <div class="checkbox">
                        <label>
                            <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <!-- Button -->
                    <div class="col-sm-12 controls">
                        <input type="submit" class="btn btn-success" value="Login" name="Loginbtn" />
                        <a id="btn-fblogin" href="#" class="btn btn-primary">Login with Facebook</a>
                    </div>
                </div>
          
                <div class="form-group">
                    <div class="col-md-12 control">
                        <div class="form-group-register" >
                            Don't have an account! 
                            <a href="${pageContext.request.contextPath}/user/registerUser.jsp" >
                                Sign Up Here
                            </a>
                        </div>
                    </div>
                </div>    
            </div>                     
        </div>  
    </div>     
</form>
                              