<%-- 
    Document   : about
    Created on : 7/jun/2015, 13:31:48
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=request.getContextPath()%>/assets/css/about.css" rel="stylesheet" type="text/css"/>
    </head>
    <jsp:include page="/menu/menu.jsp" />
    <body>
        <div class="[ container text-center ]">
            <div class="[ row ]">
                <div class="[ col-xs-12 ]" style="padding-bottom: 30px;">
                    <img src="${pageContext.request.contextPath}/assets/img/logo.png" alt="" /> 
                    <br>
                    <p>This is a Web Prject developed under Applications Engineering Master's degree in Informatics Engineering, University of Minh. Web App whose purpose is the exhibition of small works, directed to people wishing to earn some extra money ; Easier to find where earn extra money ;</p>                   
                </div>
            </div>
        </div>
        <div class="[ container text-center ]"> 
            <div class="control-label">Our Team</div>
            <div class="[ row ]">
                <div class="[ col-xs-12 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3 ]" role="tabpanel">
                    <div class="[ col-xs-4 col-sm-12 ]">
                        <!-- Nav tabs -->
                        <ul class="[ nav nav-justified ]" id="nav-tabs" role="tablist">
                            <li role="presentation" class="active">
                                <a href="#dustin" aria-controls="dustin" role="tab" data-toggle="tab">
                                    <img class="img-circle" src="${pageContext.request.contextPath}/assets/img/team/jose.png" />
                                    <span class="quote"><i class="fa fa-quote-left"></i></span>
                                </a>
                            </li>
                            <li role="presentation" class="">
                                <a href="#daksh" aria-controls="daksh" role="tab" data-toggle="tab">
                                    <img class="img-circle" src="${pageContext.request.contextPath}/assets/img/team/manuel.jpg" />
                                    <span class="quote"><i class="fa fa-quote-left"></i></span>
                                </a>
                            </li>
                            <li role="presentation" class="">
                                <a href="#anna" aria-controls="anna" role="tab" data-toggle="tab">
                                    <img class="img-circle" src="${pageContext.request.contextPath}/assets/img/team/jose.png" />
                                    <span class="quote"><i class="fa fa-quote-left"></i></span>
                                </a>
                            </li>
                            <li role="presentation" class="">
                                <a href="#wafer" aria-controls="wafer" role="tab" data-toggle="tab">
                                    <img class="img-circle" src="${pageContext.request.contextPath}/assets/img/team/jose.png" />
                                    <span class="quote"><i class="fa fa-quote-left"></i></span>
                                </a>
                            </li>
                        </ul>
                    </div>
                    <div class="[ col-xs-8 col-sm-12 ]">
                        <!-- Tab panes -->
                        <div class="tab-content" id="tabs-collapse">            
                            <div role="tabpanel" class="tab-pane fade in active" id="dustin">
                                <div class="tab-inner">                    
                                    <p class="lead">Etiam tincidunt enim et pretium efficitur. Donec auctor leo sollicitudin eros iaculis sollicitudin.</p>
                                    <hr>
                                    <p><strong class="text-uppercase">José Alves</strong></p>
                                    <p><em class="text-capitalize">Web Developer</em></p>                 
                                </div>
                            </div>

                            <div role="tabpanel" class="tab-pane fade" id="daksh">
                                <div class="tab-inner">
                                    <p class="lead">Suspendisse dictum gravida est, nec consequat tortor venenatis a. Suspendisse vitae venenatis sapien.</p>
                                    <hr>
                                    <p><strong class="text-uppercase">Manuel Pereira</strong></p>
                                    <p><em class="text-capitalize"> Web Developer</em></p>
                                </div>
                            </div>

                            <div role="tabpanel" class="tab-pane fade" id="anna">
                                <div class="tab-inner">
                                    <p class="lead">Nullam suscipit ante ac arcu placerat, nec sagittis quam volutpat. Vestibulum aliquam facilisis velit ut ultrices.</p>
                                    <hr>
                                    <p><strong class="text-uppercase">Paulo Guterres</strong></p>
                                    <p><em class="text-capitalize"> Web Developer</em></p>
                                </div> 
                            </div>

                            <div role="tabpanel" class="tab-pane fade" id="wafer">
                                <div class="tab-inner">
                                    <p class="lead"> Fusce erat libero, fermentum quis sollicitudin id, venenatis nec felis. Morbi sollicitudin gravida finibus.</p>
                                    <hr>
                                    <p><strong class="text-uppercase">Ruben Neves</strong></p>
                                    <p><em class="text-capitalize"> Web Developer</em></p>
                                </div>
                            </div>
                        </div>
                    </div>        
                </div>
            </div>
        </div>
    </body>
    <jsp:include page="/menu/footer.jsp" />
</html>
