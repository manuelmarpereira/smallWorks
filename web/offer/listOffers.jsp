<%-- 
    Document   : listOffers
    Created on : 5/jun/2015, 19:56:15
    Author     : Manuel
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%for (int i = 0; i < 5; i += 1) { %>
    
    <div class="row" style=" margin-bottom: 10px">
        <div class="col-sm-12"> 
            <div class="brdr bgc-fff pad-10 box-shad">
                <div class="media">
                    <a class="pull-left" href="#" target="_parent">
                        <img alt="image" class="img-circle" src="../assets/img/user2.jpg" height="50" width="50"></a>
                    <div class="clearfix visible-sm"></div>
                    <div class="media-body fnt-smaller">
                        <a href="#" target="_parent"></a>
                        <h4 class="media-heading">
                            <a href="${pageContext.request.contextPath}/offer/show.jsp" target="_parent">Lavar a casa <i class="pull-right">25 €</i></a></h4>
                        <ul class="list-inline mrg-0 clr-535353">
                            <li>Inserido em: 20/02/2015</li>
                            <li><i class="glyphicon glyphicon-map-marker"></i>Braga</li>
                        </ul>
                        <p class="hidden-xs">Lave a minha casa pago bem
                            ...</p><span class="fnt-smaller fnt-lighter fnt-arial">Manuel Pereira <small class="pull-right">Feedback <jsp:include page="../feedback/stars.jsp" /> (8/10)</small></span>
                    </div>
                </div>
            </div><!-- End Listing-->
        </div>
    </div>
    <% }%>
    
    
    <div class="footer-pagination">
        <ul class="pagination">
            <li class="disabled"><a href="#">«</a></li>
            <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li><a href="#">»</a></li>
        </ul>
    </div>
