<%-- 
    Document   : profile
    Created on : 18/jun/2015, 14:19:11
    Author     : Manuel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>


<layout:simple_layout title="Profile" class2="">
    <jsp:attribute name="head"> 
        <link href="${pageContext.request.contextPath}/assets/css/models-edit.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/user.css" rel="stylesheet" type="text/css"/>   
        <link href="${pageContext.request.contextPath}/assets/css/feedback-stars.css" rel="stylesheet" type="text/css"/> 
        <link rel="stylesheet" href="http://lipis.github.io/bootstrap-sweetalert/lib/sweet-alert.css">
    </jsp:attribute>
    
    <jsp:attribute name="foot">
        <script src="${pageContext.request.contextPath}/assets/js/confirmations.js" type="text/javascript"></script>
        <script src="http://lipis.github.io/bootstrap-sweetalert/lib/sweet-alert.js"></script>
    </jsp:attribute>
        
    <jsp:attribute name="container">
        <jsp:include page="/layout/user.jsp" />
    </jsp:attribute>
</layout:simple_layout>