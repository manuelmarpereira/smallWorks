<%-- 
    Document   : profile
    Created on : 18/jun/2015, 14:19:11
    Author     : Manuel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>


<layout:simple_layout title="Profile" class2="">
      <jsp:attribute name="session">
         
          <c:if test="${not empty param.photochange}">
              <c:set  target= "${sessionScope.user}"        property = "photo"        value = "${param.photochange}"  />
             
              
              
          </c:if>
      </jsp:attribute>
      
    <jsp:attribute name="head"> 
        <link href="${pageContext.request.contextPath}/assets/css/models-edit.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/user.css" rel="stylesheet" type="text/css"/>   
        <link href="${pageContext.request.contextPath}/assets/css/feedback-stars.css" rel="stylesheet" type="text/css"/> 
        <link rel="stylesheet" href="http://lipis.github.io/bootstrap-sweetalert/lib/sweet-alert.css">
    </jsp:attribute>
      
    <jsp:attribute name="foot">
    </jsp:attribute>
        
    <jsp:attribute name="container">
        <jsp:include page="/layout/user.jsp" />
    </jsp:attribute>
</layout:simple_layout>