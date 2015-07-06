<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<link href="${pageContext.request.contextPath}/assets/css/mapa.css" rel="stylesheet" type="text/css"/>
<script src="${pageContext.request.contextPath}/assets/js/userdata.js" type="text/javascript"></script>

<div class="profile-header">
    <div class="row" style="margin-bottom: 10px;">
        <div class="col-sm-4 col-md-3 col-md-2 white">
            <img src="../assets/img/user.jpg" alt="" class="img-circle img-circle-user" height="150" width="150" />
            <p class="pull-left" id="photoEdit">
                <i class="glyphicon glyphicon-camera"></i>
                <small><a href="#" data-toggle="modal" data-target="#editPhotoModel">(Change your Photo)</a></small>
            </p>
            <p class="pull-left" id="accessEdit">
                <i class="glyphicon glyphicon-pencil"></i>
                <small><a  href="#" data-toggle="modal" data-target="#editAccessModel">(Access Data)</a></small>
            </p>
        </div>
        <div class="col-sm-4 col-md-4 white">
            <p class="name pull-left" > teste 
                    <small id="nameEdit"><a href="#" data-toggle="modal" data-target="#editNameModel">(Edit)</a></small>
               
                <br>
          </p>
          
            <p class="district pull-left">
            </p>
          
            <p class="email namepull-left">
                
                <small id="emailEdit"><a href="#" data-toggle="modal" data-target="#editEmailModel">(Edit)</a></small>
            </p>
            <p class="pull-left">
                <i>Feedback (8/10) </i> 
                <jsp:include page="/feedback/showStars.jsp" />
            </p>
        </div>
        <div class="col-sm-1" ></div>
        <div class="col-sm-3" style=" margin-top: 30px">


            <span class="rating">
                <c:choose>
                    <c:when test="${sessionScope.user.id!=null}"> 
                        <a href="myOffers.jsp" style="width:200px; margin-bottom: 10px" class="btn btn-primary"><i class="glyphicon glyphicon-th-list pull-left"></i>All My Offers</a>
                        <a href="newOffer.jsp" style="width:200px; margin-bottom: 10px" class="btn btn-primary"><i class="glyphicon glyphicon-plus pull-left"></i>Create New Offer</a>
                        <a href="chart.jsp" style="width:200px; margin-bottom: 10px" class="btn btn-primary"><i class="glyphicon glyphicon-stats pull-left"></i>User Stats</a>      
                    </c:when>
                    <c:otherwise>
                        <a href="chart.jsp" style="width:200px" class="btn btn-primary"><i class="glyphicon glyphicon-stats pull-left"></i>Deu</a>      
                    </c:otherwise>
                </c:choose>

        </div >
    </div>
</div>

<jsp:include page="/user/edit/editNameModel.jsp" />
<jsp:include page="/user/edit/editLocationModel.jsp" />
<jsp:include page="/user/edit/editAccessModel.jsp" />
<jsp:include page="/user/edit/editPhotoModel.jsp" />
<jsp:include page="/user/edit/editEmailModel.jsp" />

 <script type="text/javascript">
    var id = '<c:out value="${sessionScope.user.id}"/>';
    alert("antes" + id);
    verifyUser(id);
    getUser(id);
</script>
