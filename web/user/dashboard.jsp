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
            <br/>
            <fieldset>
    <legend>Realized Offers</legend>
           <div class="col-lg-6 col-md-2">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-3">
							<i class="fa fa-thumb-tack fa-2x"></i>
						</div>
						<div class="col-xs-9 text-right">
							<h3><b id="totMakeOffer"></b></h3>
							<div>Offers</div>
						</div>
					</div>
				</div>
			
			</div>
		</div>
                <div class="col-lg-6 col-md-2 ">
			<div class="panel panel-warning">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-3">
							<i class="fa fa-money fa-2x"></i>
						</div>
						<div class="col-xs-9 text-right">
							<h3><b id="totMakeCash"></b></h3>
							<div>Total Win</div>
						</div>
					</div>
				</div>
				
			</div>
		</div>
     </fieldset>
        </div>
        
        <div class="row">
            <br/>
            <fieldset>
    <legend>My Published Offers</legend>
		<div class="col-lg-6 col-md-2 ">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-3">
							<i class="fa fa-thumb-tack fa-2x"></i>
						</div>
						<div class="col-xs-9 text-right">
							<h3><b id="totMyOffer"></b></h3>
							<div> Offers</div>
						</div>
					</div>
				</div>
			
			</div>
		</div>
                <div class="col-lg-6 col-md-2 ">
			<div class="panel panel-warning">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-3">
							<i class="fa fa-money fa-2x"></i>
						</div>
						<div class="col-xs-9 text-right">
							<h3><b id="totMyCash"></b></h3>
							<div>Total Paid</div>
						</div>
					</div>
				</div>
				
			</div>
		</div>
                	
               

       </fieldset>
            
                 <div class="col-lg-12 border-text" style="background-color: #abaeab ;color: #FFFFFF;"><center><b id="diference">Total Cash: </b></center></div>
        
    </div>
        
        
       </div>
               
            
               <script>var id ='<c:out value="${sessionScope.user.id}"/>'</script>
               <script src="${pageContext.request.contextPath}/assets/js/dashboard.js"></script>
        </jsp:attribute>
</layout:profile_layout>