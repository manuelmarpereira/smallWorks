<%-- 
    Document   : show
    Created on : 5/jun/2015, 17:13:50
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=request.getContextPath()%>/assets/css/showTask.css" rel="stylesheet" type="text/css"/>
                <link href="<%=request.getContextPath()%>/assets/css/morris.css" rel="stylesheet" type="text/css"/>
        <link href="<%=request.getContextPath()%>/assets/css/slider.css" rel="stylesheet" type="text/css"/>
        
            <link href="css/plugins/morris.css" rel="stylesheet">
        <title>Search</title>
    </head>
    <body>
        <jsp:include page="/menu/menu.jsp" />
        <div class="marginTopMenu container-fluid" style="background-color:#e8e8e8">
            <div class="container container-pad" id="property-listings">
                <h2>Search <small> customize your small works search</small></h2>
                <hr>
                <div class="row">
                    <div class="col-md-12 col-centered">
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
                                <a class="pull-left btn btn-default" href="search.html">Search</a>
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
                    <div class="col-xs-4" style="margin-top:45px">
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
    </body>
</html>
