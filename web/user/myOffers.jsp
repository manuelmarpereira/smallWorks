
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>
<layout:profile_layout title="my Offers" class2="">
    <jsp:attribute name="head">
        <script>
            if ('<c:out value="${requestScope.page}" />' !== '') {
                window.location.replace("/smallWorks/user/myOffers.jsp");
            }
        </script>
        <link rel="stylesheet" href="//cdn.datatables.net/1.10.7/css/jquery.dataTables.min.css">

        <script src="${pageContext.request.contextPath}/assets/js/makework.js"></script>
    </jsp:attribute>
    <jsp:attribute name="container">

        <div class="marginSide" style=" margin-bottom: 40px"> 
            <h2>My Offers <small> List of my recent Offers</small></h2>
            <hr>

            <div class="alert alert-success alert-dismissible col-md-12" role="alert" style="display:none; margin-top: 10px; margin-bottom: 10px" id="alertsuccessoffer">
                <button type="button"  class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <strong>Success!</strong> your offer has been successfully closed.
            </div>

            <div class="row">
                <div class="col-md-12">

                    <table id="datatable" >
                        <thead>
                            <tr>
                                <th><a class="glyphicon glyphicon-calendar"></a>&nbsp;&nbsp;Inserted on</th>
                                <th><a class="glyphicon glyphicon-pushpin"></a>&nbsp;&nbsp;Task</th>
                                <th><a class="glyphicon glyphicon-gift"></a>&nbsp;&nbsp;Reward</th>
                                <th>State</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody >
                        </tbody>
                    </table>
                </div>
            </div>
            <div style="margin-bottom: 2%;">.</div>
        </div>

        <script type="text/javascript">
            var id = '<c:out value="${sessionScope.user.id}"/>';
            getMakeWork(id);
        </script>

        <jsp:include page="/offer/closeOffer.jsp" />
        <jsp:include page="/offer/deleteOffer.jsp" />
    </jsp:attribute>
</layout:profile_layout>