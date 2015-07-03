<%-- 
    Document   : FormRegisterUser
    Created on : 18/jun/2015, 0:14:22
    Author     : Manuel
--%>



<form class="form-horizontal" role="form" name="formreg" action="registerUser" method="POST">  
    <div class="mainbox col-md-8 col-md-offset-2 col-sm-8 col-sm-offset-2 form-margin-center" >
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

                <div class="form-group ">
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="nick" class="col-md-3 control-label">Nick</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" required name="nick" placeholder="Nick">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="firstname" class="col-md-3 control-label">First Name</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" required name="firstname" placeholder="First Name">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="lastname" class="col-md-3 control-label">Last Name</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" required name="lastname" placeholder="Last Name">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="email" class="col-md-3 control-label">Email</label>
                            <div class="col-md-9">
                                <input type="email" class="form-control" required name="email" placeholder="Email">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="password" class="col-md-3 control-label">Password</label>
                            <div class="col-md-9">
                                <input type="password" class="form-control" required name="password" placeholder="Password">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="password" class="col-md-3 control-label">Confirm Password</label>
                            <div class="col-md-9">
                                <input type="password" class="form-control" required name="confPass" placeholder="Confirm Password">
                            </div>
                        </div>
                        <div class="form-group">
                            <!-- Button -->                                        
                            <div class="col-md-offset-3 col-md-9">
                                <input id="btn-signup" class="btn btn-info"  type="submit" value="Registe" name="Registebtn"/> 

                            </div>
                        </div>
                    </div>
                    
                    <div class="col-md-6">
                         <jsp:include page="/layout/map.jsp" />   
                    </div>
                </div>
            </div>
        </div>              
    </div> 
</form>





