<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>

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
                <form role="form" name="formreg" action="index" method="POST">
                    <div class="col-xs-4" >
                        <div class="form-group has-feedback has-feedback-left">

                            <input type="text" class="form-control" name="task" placeholder="Task or key word">
                            <span class="glyphicon glyphicon-search form-control-feedback glyphicon-primary"></span>
                        </div>
                    </div>
                    <div class="col-xs-4">
                        <div class="form-group has-feedback has-feedback-left">
                            <input type="text" class="form-control" name="location"  placeholder="Location">
                            <span class="glyphicon glyphicon-map-marker form-control-feedback glyphicon-primary"></span>
                        </div>
                    </div>
                    <div class="col-xs-4">
                        <input id="btn-search" class="pull-left btn btn-primary"  type="submit" value="Search" name="ShowWorksbtn"/>
                    </div>
                    <select id="selectOrder" name="order" class="combobox" style="display: none;">
                                    <option value="1" selected>Mais recentes</option>
                                    
                                </select>
                </form>
            </div>

            <c:if test="${sessionScope.user == null}" >
                <div class="register-account">
                    Don't have an account! 


                    <a href="${pageContext.request.contextPath}/user/registerUser.jsp" >

                        Sign Up Here
                    </a>
                </div>
            </c:if>

            <hr>

        </div>
    </jsp:attribute>
</layout:simple_layout>
