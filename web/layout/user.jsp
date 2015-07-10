<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="profile-header" >
    <div class="row" style="margin-bottom: 10px;">
        <div class="col-sm-4 col-md-3 col-md-2 white">
            <img src="" alt="" class="photo img-circle img-circle-user" height="150" width="150"/>

            <p class="pull-left" id="photoEdit">
                <c:if test="${empty param.id}"> <i class="glyphicon glyphicon-camera"></i></c:if>
                <small><c:if test="${empty param.id}"><a href="#" data-toggle="modal" data-target="#editPhotoModel">(Change your Photo)</a>  </c:if></small>
            </p>
            <p class="pull-left" id="accessEdit">
               <c:if test="${empty param.id}"> <i class="glyphicon glyphicon-pencil"></i></c:if>
                <small><c:if test="${empty param.id}"><a  href="#" data-toggle="modal" data-target="#editAccessModel">(Change Password)</a>  </c:if></small>
            </p>
        </div>
        <div class="col-sm-4 col-md-4 white">

            <p class="nick pull-left" style="font-size: 200%" ></P>
            <br><br><br>

            <p class="pull-left" > 
                <i class="names glyphicon glyphicon-user"></i><small id="nameEdit"><c:if test="${empty param.id}"><a href="#" data-toggle="modal" data-target="#editNameModel">(Edit)</a></c:if></small>

            </p>
            <br><br>             

            <p class="pull-left" >

                <i class="district glyphicon glyphicon-map-marker"></i><small id="locationEdit"><c:if test="${empty param.id}"><a href="#" data-toggle="modal" data-target="#editLocationModel">(Edit)</a></c:if></small>

            </p>
            <br><br>  
            <p class="namepull-left">
                <i class="email glyphicon glyphicon-envelope"></i><small id="emailEdit"><c:if test="${empty param.id}"><a href="#" data-toggle="modal" data-target="#editEmailModel">(Edit)</a></c:if></small>

            </p>
            <p class="reward pull-left"></p>
        </div>

        <div class="col-sm-1" ></div>
        <div class="col-sm-3" style=" margin-top: 30px">
            <span class="rating"></span>
            <c:if test="${empty param.id}">
                <a href="myOffers.jsp" style="width:200px; margin-bottom: 10px" class="btn btn-primary"><i class="glyphicon glyphicon-th-list pull-left"></i>All My Offers</a>
                <a href="${pageContext.request.contextPath}/offer/new.jsp" style="width:200px; margin-bottom: 10px" class="btn btn-primary"><i class="glyphicon glyphicon-plus pull-left"></i>Create New Offer</a>
                <a href="dashboard.jsp" style="width:200px; margin-bottom: 10px" class="btn btn-primary"><i class="glyphicon glyphicon-stats pull-left"></i>User Stats</a>      

            </c:if>


        </div >

    </div>
</div>


<jsp:include page="/user/edit/editNameModel.jsp" />
<jsp:include page="/user/edit/editLocationModel.jsp"/>
<jsp:include page="/user/edit/editAccessModel.jsp" />
<jsp:include page="/user/edit/editPhotoModel.jsp" />
<jsp:include page="/user/edit/editEmailModel.jsp" />


<c:if test="${empty param.id}">
<script type="text/javascript">
     var id = '<c:out value="${sessionScope.user.id}"/>';

     verifyUser(id);
     getUser('${pageContext.request.contextPath}', id);
</script>
  </c:if>

