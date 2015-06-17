<%-- 
    Document   : profile
    Created on : 3/jun/2015, 0:00:00
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
        <link href="<%=request.getContextPath()%>/assets/css/editModels.css" rel="stylesheet" type="text/css"/>
        <link href="<%=request.getContextPath()%>/assets/css/user.css" rel="stylesheet" type="text/css"/>        
    </head>

    <jsp:include page="/menu/menu.jsp" />
    <div class=" marginTopMenu marginSide profile">
        <div class="row">
            <div class="col-sm-4 col-md-3 col-md-2 white">
                <img src="../assets/img/user.jpg" alt="" class="img-rounded img-responsive" />
                <p class="pull-left">
                    <i class="glyphicon glyphicon-camera"></i>
                    <small><a href="#" data-toggle="modal" data-target="#editPhotoModel">(Change your Photo)</a></small>
                </p>
                <p class="pull-left">
                    <i class="glyphicon glyphicon-pencil"></i>
                    <small><a href="#" data-toggle="modal" data-target="#editAccessModel">(Access Data)</a></small>
                </p>
            </div>
            <div class="col-sm-4 col-md-4 white">
                <div class="pull-left">
                    <h1>
                        Marco Correia
                        <small><a href="#" data-toggle="modal" data-target="#editNameModel">(Edit)</a></small>
                    </h1>
                    <br>
                    <h4 class="pull-left">
                        <i class="glyphicon glyphicon-map-marker"></i>
                        Porto
                        <small><a href="#" data-toggle="modal" data-target="#editLocationModel">(Edit)</a></small>
                    </h4>
                </div>
                <p class="pull-left">
                    <i class="glyphicon glyphicon-envelope"></i>
                    marco@hotmail.com
                    <small><a href="#" data-toggle="modal" data-target="#editEmailModel">(Edit)</a></small>
                </p>
                <p class="pull-left">
                    <i>Feedback (8/10) </i> 
                    <jsp:include page="/feedback/stars.jsp" />
                </p>
            </div>
            <div class="col-sm-4 col-md-6" style=" margin-top: 30px">
                <p><a href="${pageContext.request.contextPath}/offer/myOffers.jsp" style="width:200px" class="btn btn-primary">All My Offers</a></p>
                <p><a href="${pageContext.request.contextPath}/offer/new.jsp" style="width:200px" class="btn btn-primary">Create New Offer</a></p>
            </div>
        </div>
    </div>      

    <jsp:include page="/user/edit/editNameModel.jsp" />
    <jsp:include page="/user/edit/editLocationModel.jsp" />
    <jsp:include page="/user/edit/editAccessModel.jsp" />
    <jsp:include page="/user/edit/editPhotoModel.jsp" />
    <jsp:include page="/user/edit/editEmailModel.jsp" />
</html>
