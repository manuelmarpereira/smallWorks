<form class="form-horizontal"  name="formreg" action="registerUser" method="POST">  
    <div class="mainbox col-md-8 col-md-offset-2 col-sm-8 col-sm-offset-2 form-margin-top" >
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Sign Up</div>
                <div class="panel-title-signin"><a href="${pageContext.request.contextPath}/login/login.jsp" >Sign In</a></div>
            </div>  
            <div class="panel-body" >

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
                                <div class="input-group" data-validate="email">
                                    <input type="email" class="form-control" name="email" id="validate-email" placeholder="Validate Email" required>
                                    <span class="input-group-addon danger"><span class="glyphicon glyphicon-remove"></span></span>
                                </div>
                            </div>

                        </div>
                        <div class="form-group">
                            <label for="password" class="col-md-3 control-label" >Password</label>
                            <div class="col-md-9">
                                <input type="password" class="form-control" required name="password" id="password" autocomplete="off" placeholder="Password">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-3"></div>
                            <div class="col-sm-5">
                                <span id="8char" class="glyphicon glyphicon-remove" style="color:#FF0004;"></span> 8 Characters<br>
                                <span id="ucase" class="glyphicon glyphicon-remove" style="color:#FF0004;"></span> Uppercase
                            </div>
                            <div class="col-sm-4">
                                <span id="lcase" class="glyphicon glyphicon-remove" style="color:#FF0004;"></span> Lowercase<br>

                                <span id="num" class="glyphicon glyphicon-remove" style="color:#FF0004;"></span> Number

                            </div>
                        </div>
                        <div class="form-group" style="margin-top: 20px;">
                            <label for="password" class="col-md-3 control-label">Confirm Password</label>
                            <div class="col-md-9">
                                <input type="password" class="form-control"  name="password2" required placeholder="Confirm Password" id="password2" autocomplete="off">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-3"></div>
                            <div class="col-sm-6">
                                <span id="pwmatch" class="glyphicon glyphicon-remove" style="color:#FF0004;"></span> Passwords Match
                            </div>
                            <div class="col-md-3">
                                <input id="btn-signup" class="btn btn-info pull-right"  type="submit" value="Register" name="Registebtn"/> 
                            </div>
                        </div>
                    </div>

                    <div class="col-md-6">
                        <div >
                            <div class="form-group">
                                <label for="txtEndereco" class="col-md-3 control-label">Your location </label>
                                <div class="col-md-9">
                                    <input type="text" id="txtEndereco" class="form-control" required name="txtEndereco" placeholder="Location Adress" />
                                </div>
                            </div>
                        </div>
                        <jsp:include page="/layout/map.jsp" />
                        <script type="text/javascript">initMyMap();</script>
                    </div>
                </div>
            </div>
        </div>              
    </div> 
</form>

<script src='${pageContext.request.contextPath}/assets/js/validations-user.js'></script>


