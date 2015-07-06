<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>

<layout:simple_layout title="smallWorks" class2="bodyBackground">

    <jsp:attribute name="session"></jsp:attribute>
    <jsp:attribute name="head">
                  
        <style type="text/css">
            
        html .bodyBackground{
            background: none;
            background-color: white !important;
            
        }
            
        </style>
    </jsp:attribute>
    <jsp:attribute name="foot"></jsp:attribute>
    <jsp:attribute name="container">
        
        <jsp:include page="formNewOffer.jsp" />
        
    </jsp:attribute>
</layout:simple_layout>