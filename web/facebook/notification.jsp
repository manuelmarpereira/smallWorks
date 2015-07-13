<%-- 
    Document   : index
    Created on : 2/jul/2015, 17:58:17
    Author     : Manuel
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/facebook.css">
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    </head>
    <body class="window">

        <div class="info" style="max-width: 680px; min-width: 300px;">    
             <jsp:include page="/facebook/header.jsp" />

             <div class="row">
                <div class="col-md-10 col-md-offset-1">
                    <div class="content pull-middle">

                        <div class="panel panel-default">
                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-sm-12"> 
                                        <div class="brdr bgc-fff pad-10 box-shad">
                                            <div class="media">
                                                <a class="pull-left" href="#" target="_parent">
                                                    <img alt="image" class="img-circle" src="../assets/img/user2.jpg" height="50" width="50"></a>
                                                <div class="clearfix visible-sm"></div>
                                                <div class="media-body fnt-smaller">
                                                    <a href="#" target="_parent"></a>
                                                    <h4 class="media-heading">
                                                        <a href="${pageContext.request.contextPath}/offer/show.jsp" target="_parent">Lavar a casa <i class="pull-right">25 €</i></a></h4>
                                                    <ul class="list-inline mrg-0 clr-535353">
                                                        <li>Inserido em: 20/02/2015</li>
                                                        <li><i class="glyphicon glyphicon-map-marker"></i>Braga</li>
                                                    </ul>
                                                    <p class="hidden-xs">Lave a minha casa pago bem
                                                        ...</p><span class="fnt-smaller fnt-lighter fnt-arial">Manuel Pereira</span>
                                                </div>
                                            </div>
                                        </div><!-- End Listing-->
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>   
                </div>
            <jsp:include page="/facebook/footer.jsp" />
           </div>                  
    </body>
</html>



















