

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<layout:simple_layout title="Search Offers" class2="">
    <jsp:attribute name="head"> 
        <link href="${pageContext.request.contextPath}/assets/css/showTask.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/slider.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/feedback-stars.css" rel="stylesheet" type="text/css"/> 
 
    </jsp:attribute>
        
    <jsp:attribute name="foot"></jsp:attribute>
    <jsp:attribute name="container">

        <div class="container-fluid container-background">
             <form role="form" id="formsub" name="formreg" action="index" method="POST">
            <div class="container-pad" id="property-listings">
                <h2>Search <small> customize your small works search</small></h2>
                <hr>
                <div class="row">
                    <div class="col-centered">
                       
                            <div class="col-xs-5">
                                <div class="form-group has-feedback has-feedback-left">
                                    <input type="text" class="form-control" value="${requestScope.task}" name="task" placeholder="Task or keyword">
                                    <span class="glyphicon glyphicon-search form-control-feedback glyphicon-info"></span>
                                </div>
                            </div>
                            <div class="col-xs-5">
                                <div class="form-group has-feedback has-feedback-left">
                                    <input type="text" class="form-control" value="${requestScope.district}" name="location" placeholder="Location">
                                    <span class="glyphicon glyphicon-map-marker form-control-feedback glyphicon-info"></span>
                                </div>
                            </div>
                            <div class="col-xs-2">
                                 <input id="btn-search" class="pull-left btn btn-primary"  type="submit" value="Search" name="ShowWorksbtn"/>
                            </div>
                       

                    </div>
                </div>

                <div class="row">
                    <div class="col-xs-4">
                        <div class="control-label"  style="margin-top:10px">Min Value €</div>
                        <div class="range range-info">
                            <input type="range" name="range" min="1" max="200"  value="5" onchange="rangeMin.value = value">
                            <output id="rangeMin">5</output>
                        </div>
                    </div>
                    <div class="col-xs-4">
                        <div class="control-label" style="margin-top:10px">Max Value €</div>
                        <div class="range range-info">
                            <input id="slider_max" type="range" name="range" min="1" max="200" value="100" data-slider-value="14" onchange="rangeMax.value = value">
                            <output id="rangeMax">100</output>
                        </div>
                    </div>
                    <div class="col-xs-3 pull-right" style="margin-top:15px">
                        <div class="pull-right"  >
                            <div class="form-group">
                                <label class="control-label">Ordenar por: </label>
                                <select id="selectOrder" name="order" class="combobox">
                                    <option value="1" >Mais recentes</option>
                                    <option value="2">Maior recompensa</option>
                                    <option value="3">Melhor feedback</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>
                <hr>
            </div>
                  </form>
            <jsp:include page="/offer/listOffers.jsp" />                
        </div> 
        <script>
            
            $( document ).ready(function() {
                
                   $( "#selectOrder" ).val("${requestScope.order}");  
            
                $( "#selectOrder" ).change(function() {
                   document.getElementById("formsub").submit();
                });
            });
    </script>
    </jsp:attribute>
</layout:simple_layout> 
