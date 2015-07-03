 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="profile-header">
    <div class="row">
        <div class="col-sm-4 col-md-3 col-md-2 white">
            <img src="../assets/img/user.jpg" alt="" class="img-circle img-circle-user" height="150" width="150" />
            <p class="pull-left">
                <i class="glyphicon glyphicon-camera"></i>
                <small><a href="#" data-toggle="modal" data-target="#editPhotoModel">(Change your Photo)</a></small>
            </p>
            <p class="pull-left">
                <i class="glyphicon glyphicon-pencil"></i>
                <small><a href="#" data-toggle="modal" data-target="#editAccessModel">(Access Data)</a></small>
            </p>
        </div>
        <div class="col-sm-4 col-md-4 white">
            <div class="pull-left">
                <h1>
                    <c:out value="${sessionScope.user.firstname}" /> <c:out value="${sessionScope.user.lastname}" />
                    <small><a href="#" data-toggle="modal" data-target="#editNameModel">(Edit)</a></small>
                </h1>
                <br>
                <h4 class="pull-left">
                    <i class="glyphicon glyphicon-map-marker"></i>
                    Porto
                    <small><a href="#" data-toggle="modal" data-target="#editLocationModel">(Edit)</a></small>
                </h4>
            </div>
            <p class="pull-left">
                <i class="glyphicon glyphicon-envelope"></i>
                <c:out value="${sessionScope.user.email}"/>
                <small><a href="#" data-toggle="modal" data-target="#editEmailModel">(Edit)</a></small>
            </p>
            <p class="pull-left">
                <i>Feedback (8/10) </i> 
                <jsp:include page="/feedback/showStars.jsp" />
            </p>
        </div>
        <div class="col-sm-4 col-md-6" style=" margin-top: 30px">
            <p><a href="myOffers.jsp" style="width:200px" class="btn btn-primary"><i class="glyphicon glyphicon-th-list pull-left"></i>All My Offers</a></p>
            <p><a href="newOffer.jsp" style="width:200px" class="btn btn-primary"><i class="glyphicon glyphicon-plus pull-left"></i>Create New Offer</a></p>
        </div>
    </div>
</div>

<jsp:include page="/user/edit/editNameModel.jsp" />
<jsp:include page="/user/edit/editLocationModel.jsp" />
<jsp:include page="/user/edit/editAccessModel.jsp" />
<jsp:include page="/user/edit/editPhotoModel.jsp" />
<jsp:include page="/user/edit/editEmailModel.jsp" />
<!--    <div class="tab-content">
        <div id="tab1" class="tab-pane fade">
            <!jsp:include page="/user/myOffers.jsp" />
        </div>

        <div id="tab2" class="tab-pane fade">
            <!jsp:include page="/user/newOffer.jsp" />
        </div>
    </div>-->

<!--    <script>
        $(document).ready(function(){
        $('#tab1 a').click(function (e) {
            e.preventDefault();
            $(this).tab('show');
          });
          $('#tab2 a').click(function (e) {
            e.preventDefault();
            $(this).tab('show');
          });
});
    </script>-->
