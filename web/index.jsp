<%@page import="user.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>

<%
    User me = (User) request.getAttribute("user");
    session.setAttribute("user", me);
%>

<layout:simple_layout title="smallWorks" class2="bodyBackground">

    <jsp:attribute name="session"></jsp:attribute>
    <jsp:attribute name="head"></jsp:attribute>
    <jsp:attribute name="foot"></jsp:attribute>
    <jsp:attribute name="container">

        <div class="search-form">

            <div class="text-center">
                <img src="${pageContext.request.contextPath}/assets/img/logo.png" alt="" class="img-thumbnail"/>   
            </div>
            <hr>

            <div class="row search-form-center" >
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
                    <div class="col-xs-4">
                        <a class="pull-left btn btn-default" href="${pageContext.request.contextPath}/offer/search.jsp">Search</a>
                    </div>
                </form>
            </div>

            <c:if test="${sessionScope.user == null}" >
                <div class="register-account">
                    Don't have an account! 


                    <a href="${request.getContextPath()}/user/registeUser.jsp" >

                        Sign Up Here
                    </a>
                </div>
            </c:if>

            <hr>

        </div>
    </jsp:attribute>
</layout:simple_layout>
