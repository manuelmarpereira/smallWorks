<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>

<layout:simple_layout title="Login" class2="bodyBackground">
    <jsp:attribute name="head"> </jsp:attribute>
    
    <jsp:attribute name="foot"></jsp:attribute>
        
    <jsp:attribute name="container">
        <jsp:include page="form.jsp" />
    </jsp:attribute>
</layout:simple_layout>