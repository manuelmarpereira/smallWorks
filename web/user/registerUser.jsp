<%-- 
    Document   : new
    Created on : 17/jun/2015, 23:51:40
    Author     : Manuel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>

<link href="<%=request.getContextPath() %>/assets/css/register-user.css" rel="stylesheet" type="text/css"/>

<layout:simple_layout title="New User" class2="bodyBackground">
    <jsp:attribute name="head"> </jsp:attribute>
    
    <jsp:attribute name="foot"></jsp:attribute>
        
    <jsp:attribute name="container">
        <jsp:include page="formRegisterUser.jsp" />
    </jsp:attribute>
</layout:simple_layout>