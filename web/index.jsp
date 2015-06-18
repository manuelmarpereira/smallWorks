<%-- 
    Document   : index
    Created on : 27/mai/2015, 17:35:45
    Author     : Manuel
                 Jose
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>
<layout:simple_layout title="smallWorks" class2="bodyBackground">
    
 <jsp:attribute name="session"> </jsp:attribute>
    <jsp:attribute name="head"> </jsp:attribute>

    <jsp:attribute name="foot"></jsp:attribute>

    <jsp:attribute name="container">

        <div class="black">
            <div class="text-center">
                <img src="${pageContext.request.contextPath}/assets/img/logo.png" alt="" class="img-thumbnail"/>   
            </div>
            <hr>
            <div class="row" >
                <div class="col-md-12">
                    <div class="col-sm-5"></div>
                    <div class="col-sm-1"></div>
                </div>
                <div class="col-md-2"></div>
                <div class="col-md-10 col-centered">
                    <form role="search">
                        <div class="col-xs-4">
                            <div class="form-group has-feedback has-feedback-left">

                                <input type="text" class="form-control" placeholder="Task or key word">
                                <span class="glyphicon glyphicon-search form-control-feedback blue"></span>
                            </div>
                        </div>
                        <div class="col-xs-4">
                            <div class="form-group has-feedback has-feedback-left">
                                <input type="text" class="form-control" placeholder="Location">
                                <span class="glyphicon glyphicon-map-marker form-control-feedback blue"></span>
                            </div>
                        </div>
                        <div class="col-xs-2">
                            <a class="pull-left btn btn-default" href="${pageContext.request.contextPath}/offer/search.jsp">Search</a>
                        </div>
                    </form>
                </div>
            </div>
                         
                            <c:if test="${sessionScope.name == null}" >

                <div class="register-account">
                    Don't have an account! 
                    <a href="${request.getContextPath()}/login/RegisteUser.jsp" >
                        Sign Up Here
                    </a>
                </div>
            </c:if>


            <hr>
        </div>

    </jsp:attribute>
</layout:simple_layout>
