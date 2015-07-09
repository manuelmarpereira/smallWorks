<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>
<layout:profile_layout title="Chart" class2="">
    <jsp:attribute name="head">
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
    </jsp:attribute>
        
    <jsp:attribute name="container">
    <div class="marginSide" style=" margin-bottom: 100px"> 
        <div class="col-lg-6">    
            <h2>Stats <small> Your mensal caches</small></h2>
            <hr>
            <div id="morris-bar-chart" style="height: 145px" ></div>
        </div>
        
        <div class="row">
		<div class="col-lg-3 col-md-2 marginTopStats">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-3">
							<i class="fa fa-thumb-tack fa-5x"></i>
						</div>
						<div class="col-xs-9 text-right">
							<h3><b>10</b></h3>
							<div>Total Offers</div>
						</div>
					</div>
				</div>
				<a href="${pageContext.request.contextPath}/user/registerUser.jsp">
					<div class="panel-footer">
						<span class="pull-left">
							View All
							</span>
						<span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
						<div class="clearfix"></div>
					</div>
				</a>
			</div>
		</div>
                <div class="col-lg-3 col-md-2 marginTopStats">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-3">
							<i class="fa fa-money fa-5x"></i>
						</div>
						<div class="col-xs-9 text-right">
							<h3><b id ="totalcash">10<i class="fa fa-euro"></i></b></h3>
							<div>Total Cash</div>
						</div>
					</div>
				</div>
				<a href="${pageContext.request.contextPath}/user/registerUser.jsp">
					<div class="panel-footer">
						<span class="pull-left">
							View All
							</span>
						<span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
						<div class="clearfix"></div>
					</div>
				</a>
			</div>
		</div>
                	
               <script src="${pageContext.request.contextPath}/assets/js/dashboard.js"></script>

        <script src="${pageContext.request.contextPath}/assets/js/plugins/morris-data.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/assets/js/plugins/morris.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/assets/js/plugins/raphael.min.js" type="text/javascript"></script>

    </div>

        </jsp:attribute>
</layout:profile_layout>