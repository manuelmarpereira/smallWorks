<%-- 
    Document   : FormRegisterUser
    Created on : 18/jun/2015, 0:14:22
    Author     : Manuel
--%>

<form class="form-horizontal" role="form" name="formreg" action="RegisteUser" method="POST">  
    <div class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2 form-margin-center">
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Sign Up</div>
                <div class="panel-title-signin"><a href="${pageContext.request.contextPath}/login/login.jsp" >Sign In</a></div>
            </div>  
            <div class="panel-body" >
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
                        <span class="btn-or">or</span>
                        <button id="btn-fbsignup" type="button" class="btn btn-primary"><i class="icon-facebook"></i>   Sign Up with Facebook</button>
                    </div>
                </div>
            </div>
        </div>              
    </div> 
</form>


