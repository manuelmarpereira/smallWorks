<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>

<layout:simple_layout title="smallWorks" class2="bodyBackground">

    <jsp:attribute name="session"></jsp:attribute>
    <jsp:attribute name="head"></jsp:attribute>
    <jsp:attribute name="foot"></jsp:attribute>
    
    <jsp:attribute name="container">
        <div style="background-color: white; border-style: solid; border-color: #03a1d1; margin-top: 6%; margin-right: 7%; margin-left: 7%;">
            <jsp:include page="formNewOffer.jsp" />
            <br/>
        </div>
        
    </jsp:attribute>
</layout:simple_layout>