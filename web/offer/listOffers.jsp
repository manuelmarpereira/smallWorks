
<%@page import="tp_aa.Work"%>
<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<script src='http://code.jquery.com/jquery-1.11.3.js'></script>

<% int min = 0; %>
<% ArrayList<Work> list = new ArrayList<Work>();
//storing passed value from jsp
    list = (ArrayList<Work>) request.getAttribute("works"); %> 

<div id="content"></div>
<img src="${pageContext.request.contextPath}/assets/img/load.gif" style="display: none;margin-right: auto;margin-left: auto;" align="middle" alt="Smiley face" id="imgload" />

<div style="height: 200px; clear:both;"></div>
<div style="height:20px; width:100%; background: #E8E8E8;"></div>
<br>

<% if (list.isEmpty()) { %>
<script>$("#content").html("<center>Don't exist offers with your search caracteristics</center>");</script>
    <% } else { %>
<script>


    var jsArray = new Array();
    <%for (int i = 0; i < list.size(); i++) {%>
    var works = {
        id: "",
        name: "",
        location: "",
        title: "",
        description: "",
        dateStart: "",
        price: "",
        photo: ""
    };
    works.id = "<%= list.get(i).getId()%>";
    works.name = "<%= list.get(i).getCreator().getFirstname()%>";
    works.location = "<%= list.get(i).getLocalization().getName()%>";
    works.title = "<%= list.get(i).getTitle()%>";
    works.description = "<%= list.get(i).getDescription()%>";
    works.dateStart = "<%= list.get(i).getStartDate()%>";
    works.price = "<%= list.get(i).getPrice()%>";
    if ("<%= list.get(i).getCreator().getPhoto()%>" == 'null') {
        works.photo = "/smallWorks/assets/img/user2.jpg";
    } else {
        works.photo = "/smallWorks/assets/img/users/" + "<%= list.get(i).getCreator().getPhoto()%>";
    }

    jsArray.push(works);
    <%}%>
    var min = 0;


    function printwork(jsArray, min) {

        var max = min + 10;
        if (min < jsArray.length) {
            if (max > jsArray.length) {
                max = jsArray.length;
            }
            for (i = min; i < max; i++) {
                
                $("#content").append(
                        "<div class=\"row\" style=\" margin-bottom: 10px\">" +
                        "<div class=\"col-sm-12\">" +
                        "<div class=\"brdr bgc-fff pad-10 box-shad\">       <div class=\"media\">" +
                        "<a class=\"pull-left\" href=\"#\" target=\"_parent\">" +
                        "<img alt=\"image\" class=\"img-circle\" src=\"" + jsArray[i].photo + "\" height=\"50\" width=\"50\"></a>" +
                        "<div class=\"clearfix visible-sm\"></div>" +
                        "<div class=\"media-body fnt-smaller\">" +
                        "<a href=\"#\" target=\"_parent\"></a>" +
                        "<h4 class=\"media-heading\">" +
                        "<a href=\"/smallWorks/offer/show.jsp?id=" + jsArray[i].id + "\" target=\"_parent\">" + jsArray[i].title + " <i class=\"pull-right\" style=\"color:#337ab7\">" + jsArray[i].price + " €</i></a></h4>" +
                        "<ul class=\"list-inline mrg-0 clr-535353\">" +
                        "<li>Inserido em: " + jsArray[i].dateStart + "</li>" +
                        "<li><i class=\"glyphicon glyphicon-map-marker\" ></i>" + jsArray[i].location + "</li>" +
                        "</ul>" +
                        "<p class=\"hidden-xs\">" + jsArray[i].description + "" +
                        "</p><span class=\"fnt-smaller fnt-lighter fnt-arial\">" + jsArray[i].name + "<small class=\"pull-right\"></small></span>" +
                        "</div>" +
                        "</div></div>" +
                        "</div>" +
                        "</div>"



                        );
            }
        }
    }


    $(window).scroll(function () {
        if (min < jsArray.length) {
            if (document.documentElement.clientHeight +
                    $(document).scrollTop() - 60 == document.body.offsetHeight) {

                $('#imgload').css("display", "block");
                var timer = setTimeout(function () {
                    clearTimeout(timer);
                    $('#imgload').css("display", "none");
                    min = min + 10;

                    printwork(jsArray, min);

                }, 600);


            }
        }
    });



    $(document).ready(function () {
        printwork(jsArray, min);
    });

</script>
<% }%>
