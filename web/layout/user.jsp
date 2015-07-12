<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<link href="${pageContext.request.contextPath}/assets/css/mapa.css" rel="stylesheet" type="text/css"/>
<script src="${pageContext.request.contextPath}/assets/js/userdata.js" type="text/javascript"></script>


<div class="profile-header" >
    <div class="row" style="margin-bottom: 10px;">
        <div class="col-sm-4 col-md-3 col-md-2 white">
            <img src="" alt="" class="photo img-circle img-circle-user" height="150" width="150"/>

            <p class="pull-left" id="photoEdit">
                <c:if test="${empty param.id}"> <i class="glyphicon glyphicon-camera"></i></c:if>
                <small>&nbsp;&nbsp;<c:if test="${empty param.id}"><a href="#" data-toggle="modal" data-target="#editPhotoModel">(Change your Photo)</a>  </c:if></small>
            </p>
            <p class="pull-left" id="accessEdit">
               <c:if test="${empty param.id}"> <i class="glyphicon glyphicon-pencil"></i></c:if>
               <small>&nbsp;&nbsp;<c:if test="${empty param.id}"><a  href="#" data-toggle="modal" data-target="#editAccessModel">(Change Password)</a>  </c:if></small>
            </p>
        </div>
        <div class="col-sm-4 col-md-4 white">


            <p class="nick pull-left border-text" style="font-size: 200%" ></P>
            <br><br><br>

            <p class="pull-left border-text" > 
                <i class="names glyphicon glyphicon-user">&nbsp;</i><small id="nameEdit "><i class=""><c:if test="${empty param.id}"></i><a href="#" data-toggle="modal" data-target="#editNameModel" class="edit-link">&nbsp;&nbsp;(Edit)</a></c:if></small>
            </p>
            
            <br><br>             

            <p class="pull-left border-text" >
                <i class="district glyphicon glyphicon-map-marker">&nbsp;</i><small id="locationEdit"><c:if test="${empty param.id}"><a href="#" data-toggle="modal" data-target="#editLocationModel" class="edit-link">&nbsp;&nbsp;(Edit)</a></c:if></small>
            </p>
            <br><br>  
            <p class="namepull-left border-text">
                <i class="email glyphicon glyphicon-envelope">&nbsp;</i><small id="emailEdit"><c:if test="${empty param.id}"><a href="#" data-toggle="modal" data-target="#editEmailModel" class="edit-link">&nbsp;&nbsp;(Edit)</a></c:if></small>

            </p>
            <p class="reward pull-left"></p>
        </div>
        <div class="col-sm-1" ></div>
        <div class="col-sm-3" style=" margin-top: 30px">
            <span class="rating"></span>
            <c:if test="${empty param.id}">
                <a href="myOffers.jsp" style="width:200px; margin-bottom: 10px" class="btn btn-primary"><i class="glyphicon glyphicon-th-list pull-left"></i>All My Offers</a>
                <a href="${pageContext.request.contextPath}/offer/new.jsp" style="width:200px; margin-bottom: 10px" class="btn btn-primary "><i class="glyphicon glyphicon-plus pull-left"></i>Create New Offer</a>
                <a href="dashboard.jsp" style="width:200px; margin-bottom: 10px" class="btn btn-primary"><i class="glyphicon glyphicon-stats pull-left"></i>User Stats</a>      
            </c:if>


        </div >
    </div>
                <div class="alert alert-success alert-dismissible col-md-12" role="alert" style="display:none; margin-top: 10px; margin-bottom: 10px" id="alertsuccess">
                    <button type="button"  class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <strong>Success!</strong> your changes have been successfully saved.
                </div>
</div>


<jsp:include page="/user/edit/editNameModel.jsp" />
<jsp:include page="/user/edit/editLocationModel.jsp" />
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