<%-- 
    Document   : search
    Created on : 18/jun/2015, 16:03:51
    Author     : Manuel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>

<layout:simple_layout title="Search Offers" class2="">
    <jsp:attribute name="head"> 
        <link href="${pageContext.request.contextPath}/assets/css/showTask.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/slider.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/feedback-stars.css" rel="stylesheet" type="text/css"/> 
    </jsp:attribute>
        
    <jsp:attribute name="foot"></jsp:attribute>
    <jsp:attribute name="container">

        <div class="container-fluid container-background">
            <div class="container-pad" id="property-listings">
                <h2>Search <small> customize your small works search</small></h2>
                <hr>
                <div class="row">
                    <div class="col-centered">
                        <form role="search">
                            <div class="col-xs-5">
                                <div class="form-group has-feedback has-feedback-left">
                                    <input type="text" class="form-control" placeholder="Task or keyword">
                                    <span class="glyphicon glyphicon-search form-control-feedback blue"></span>
                                </div>
                            </div>
                            <div class="col-xs-5">
                                <div class="form-group has-feedback has-feedback-left">
                                    <input type="text" class="form-control" placeholder="Location">
                                    <span class="glyphicon glyphicon-map-marker form-control-feedback blue"></span>
                                </div>
                            </div>
                            <div class="col-xs-2">
                                <a class="btn btn-default" href="search.html">Search</a>
                            </div>
                        </form>

                    </div>
                </div>

                <div class="row">
                    <div class="col-xs-4">
                        <div class="control-label"  style="margin-top:10px">Min Value €</div>
                        <div class="range range-info">
                            <input type="range" name="range" min="1" max="200" value="5" onchange="rangeWarning.value = value">
                            <output id="rangeWarning">5</output>
                        </div>
                    </div>
                    <div class="col-xs-4">
                        <div class="control-label" style="margin-top:10px">Max Value €</div>
                        <div class="range range-primary">
                            <input type="range" name="range" min="1" max="200" value="100" onchange="rangeDanger.value = value">
                            <output id="rangeDanger">100</output>
                        </div>
                    </div>
                    <div class="col-xs-3 pull-right" style="margin-top:15px">
                        <div class="pull-right"  >
                            <div class="form-group">
                                <label class="white">Ordenar por: </label>
                                <select class="combobox">
                                    <option>Mais recentes</option>
                                    <option>Maior recompensa</option>
                                    <option>Melhor feedback</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>
                <hr>
            </div>
            <jsp:include page="/offer/listOffers.jsp" />                
        </div> 
    </jsp:attribute>
</layout:simple_layout>
