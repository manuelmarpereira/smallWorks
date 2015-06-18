<%-- 
    Document   : profile
    Created on : 18/jun/2015, 14:19:11
    Author     : Manuel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>

<link href="<%=request.getContextPath()%>/assets/css/models-edit.css" rel="stylesheet" type="text/css"/>
<link href="<%=request.getContextPath()%>/assets/css/user.css" rel="stylesheet" type="text/css"/>   
<link href="<%=request.getContextPath()%>/assets/css/feedback-stars.css" rel="stylesheet" type="text/css"/> 

<layout:simple_layout title="Profile" class2="">
    <jsp:attribute name="head"> </jsp:attribute>
    
    <jsp:attribute name="foot"></jsp:attribute>
        
    <jsp:attribute name="container">
     
        
        <div class="profile-header">
        <div class="row">
            <div class="col-sm-4 col-md-3 col-md-2 white">
                <img src="../assets/img/user.jpg" alt="" class="img-circle img-circle-user" height="150" width="150" />
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
                <p><a href="${pageContext.request.contextPath}/offer/myOffers.jsp" style="width:200px" class="btn btn-primary"><i class="glyphicon glyphicon-th-list pull-left"></i>All My Offers</a></p>
                <p><a href="${pageContext.request.contextPath}/offer/new.jsp" style="width:200px" class="btn btn-primary"><i class="glyphicon glyphicon-plus pull-left"></i>Create New Offer</a></p>
            </div>
        </div>
    </div>
            
    <jsp:include page="/user/edit/editNameModel.jsp" />
    <jsp:include page="/user/edit/editLocationModel.jsp" />
    <jsp:include page="/user/edit/editAccessModel.jsp" />
    <jsp:include page="/user/edit/editPhotoModel.jsp" />
    <jsp:include page="/user/edit/editEmailModel.jsp" />
        
    </jsp:attribute>
</layout:simple_layout>