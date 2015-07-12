<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>
<layout:profile_layout title="Search Offers" class2="">
    <jsp:attribute name="head"> 
    </jsp:attribute>

    <jsp:attribute name="foot"></jsp:attribute>
    <jsp:attribute name="container">

        
        <div class="row ">
            <div class="col-md-12">
                <hr>
                <div class="col-md-6  white">
                    <h3 style="margin-left: 45px;"><a class="control-label" id="nameOffer"> </a><small>Inserted on April 14</small></h3>
                    <div class="col-sm-1"></div>
                    <div class=" panel panel-default blue col-sm-10">
                        <br>
                        <p style=" color:#888" id="descriptionOffer">
                            
                        </p>
                    </div>
                   
                    <div class="col-sm-1"></div>
                    <div class="col-sm-3">
                        <p class="control-label pull-right" style=" color:#337ab7">Reward</p>
                    </div>

                    <div class="col-sm-3" style=" color:#888;" id="winOffer"></div>

                    <div class="col-sm-4 pull-right" >
                        <input type="checkbox" id="negociavel" disabled>
                        <label style="color:#337ab7" for="a">Negotiable</label>
                    </div>

                    <div class="col-sm-12" style="margin-top: 20px">
                        <div class="col-xs-2"></div>
                        <div class="col-xs-6 pull-left">
                            <a href="#" data-toggle="modal" id="interest" class="btn btn-warning" data-target="#Contacto">Contact the User by Email</a>
                            
                        </div>
                        <div class="col-xs-4 text-justify">
                            <c:if test="${not empty sessionScope.user}">
                                <a href="#" data-toggle="modal" id="yesoffer" class="btn btn-primary" data-target="#makeOffer">Do it now</a>
                            </c:if>
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="map text-center">
                        <iframe id="mapa" src=""
                                width="500" height="250" frameborder="1"></iframe>
                    </div>
                  
                </div>
            </div>
        </div>
       <jsp:include page="/offer/contactar.jsp" />
        <jsp:include page="/offer/facoJa.jsp" />
         <script src="${pageContext.request.contextPath}/assets/js/showOffer.js"></script>
         
         <script>
             var id='<c:out value="${param.id}"/>';
             $( document ).ready(function() {
             getData('<c:out value="${pageContext.request.contextPath}"/>',id);
             $("#namesend").val('<c:out value="${sessionScope.user.firstname}"/>');
            
             $("#idworker").val('<c:out value="${sessionScope.user.id}"/>');
              $("#personemailsend").val('<c:out value="${sessionScope.user.email}"/>');
             });
                      </script>
    </jsp:attribute>
</layout:profile_layout> 