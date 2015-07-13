<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<layout:simple_layout title="Search Offers" class2="">
    <jsp:attribute name="head"> 
        <link href="${pageContext.request.contextPath}/assets/css/showTask.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/slider.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/feedback-stars.css" rel="stylesheet" type="text/css"/> 
        <link href="${pageContext.request.contextPath}/assets/css/jquery-ui.css" rel="stylesheet" type="text/css"/> 

    </jsp:attribute>

    <jsp:attribute name="foot"></jsp:attribute>
    <jsp:attribute name="container">

       
        <div class="container-fluid container-background">
            <form role="form" id="formsub" name="formreg" action="index" method="POST">
                <div class="container-pad" id="property-listings">
                     <h2>Search <small> customize your small works search</small></h2>
                    <hr>
                    <div class="row col-md-12">
                        <div class="col-md-5">
                            <div class="form-group has-feedback has-feedback-left">
                                <input type="text" class="form-control" value="${requestScope.task}" name="task" placeholder="Task or keyword">
                                <span class="glyphicon glyphicon-search form-control-feedback glyphicon-info"></span>
                            </div>
                        </div>
                        <div class="col-md-5">
                            <div class="form-group has-feedback has-feedback-left">
                                <input type="text" class="form-control" value="${requestScope.district}" name="location" placeholder="Location">
                                <span class="glyphicon glyphicon-map-marker form-control-feedback glyphicon-info"></span>
                            </div>
                        </div>
                        <div class="col-md-2">
                            <input id="btn-search" class="pull-right btn btn-primary"  type="submit" value="Search" name="ShowWorksbtn"/>
                        </div>
                    </div>  
                               
                    <div class="row col-md-12" > 
                      
                        <div class="row col-md-5" >
                            <div class=" col-md-6">
                                <div style="color:#5bc0de">Min Value €</div>
                                <input type="text" value="0.00" readonly  name="amount_low" id="amount_low" class=" form-control date" />
                            </div>
                            <div class="col-md-6">
                                <div style="color:#337ab7"> Max Value € </div>
                                <input type="text" value="500.01" readonly name="amount_high" id="amount_high" class="form-control date"/>
                            </div>
                        </div>
                         <div class="row col-md-7" style="margin-top: 10px" > </div>
                    </div>
                    <div class="row col-md-12">
                        <div id="slider-range"  class="col-md-5" style="margin-top: 10px"></div>
                        <div class="col-md-2">
                            <div class="po-markup"  style=" margin-bottom:  15px; margin-top: 5px;">
                                        <a class="po-help btn btn-warning btn-xs" data-original-title="" title="">?</a>

                                        <div class="po-content hidden">
                                            <div class="po-title">
                                                Filter Reward (Help)
                                            </div> 

                                            <div class="po-body">
                                                <p>
                                                   You can drag the minimum and maximum values ​​in order to filter the reward values that you  need search
                                                </p>
                                            </div>
                                        </div> 
                                    </div>
                        </div>
                        <div class=" col-md-4" style=" margin-bottom:  5px;" >                             
                            <div class=" col-md-2" ></div>
                            <div class=" col-md-6" >
                            <label class=" pull-right control-label " >Order by: </label>
                             </div>
                              <div class=" col-md-4 " >
                                <select id="selectOrder" name="order" class=" selectpicker_location btn btn-info btn-sm">                     
                                    <option value="1" >Most recents</option>
                                    <option value="2">Best Rewards</option>                                         
                                </select>
                            </div>
                        </div>
                    </div>
                </div>

                <input type="text"  value="${sessionScope.user.id}"  name="iduser" id="iduser"  style="visibility:hidden" />
        
            </form>
        </div>
                <hr>
                <jsp:include page="/offer/listOffers.jsp" />   
                       
      
                  

        <script>

            $(document).ready(function () {


                $(function () {

                    $(".ui-slider-handle").first().css('background-color', "#5bc0de");

                    $(".ui-slider-handle:nth-child(3)").css('background-color', "#337ab7");
                });
                $("#selectOrder").val("${requestScope.order}");

                $("#selectOrder").change(function () {
                    document.getElementById("formsub").submit();
                });
            });




        </script>

        <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>

        <script src="${pageContext.request.contextPath}/assets/js/slider.js"></script>
        
        <script>

                            $(document).ready(function () {

                                $('.po-markup > .po-help').popover({
                                    trigger: 'hover',
                                    html: true, // must have if HTML is contained in popover

                                    // get the title and conent
                                    title: function () {
                                        return $(this).parent().find('.po-title').html();
                                    },
                                    content: function () {
                                        return $(this).parent().find('.po-body').html();
                                    },
                                    container: 'body',
                                    placement: 'right'

                                });

                            });
</script>



    </jsp:attribute>
</layout:simple_layout> 
