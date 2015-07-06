<%@tag description="smallWorks" pageEncoding="UTF-8"%>
<%@attribute name="title" required = "true" rtexprvalue="true" %>
<%@attribute name="class2" required = "true" rtexprvalue="true" %>
<%@attribute name="head" fragment="true" %>
<%@attribute name="container" fragment="true" %>
<%@attribute name="foot" fragment="true" %>
<%@attribute name="session" fragment="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8" content="text/html; charset=utf-8" />
        <title>${title}</title>
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/img/icon.png">
        <script src='http://code.jquery.com/jquery-1.11.3.js'></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <link href="<%=request.getContextPath()%>/assets/css/custom.css" rel="stylesheet" type="text/css"/>
         <link href="${pageContext.request.contextPath}/assets/css/models-edit.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/user.css" rel="stylesheet" type="text/css"/>   
        <link href="${pageContext.request.contextPath}/assets/css/feedback-stars.css" rel="stylesheet" type="text/css"/> 
        <link rel="stylesheet" href="http://lipis.github.io/bootstrap-sweetalert/lib/sweet-alert.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <jsp:invoke fragment="head"></jsp:invoke>
        </head>

    <% tp_aa.User user = (tp_aa.User) request.getAttribute("user");
        if (user != null) {
            session.setAttribute("name", user.getFirstname());
        }
    %>

    <jsp:invoke fragment="session"></jsp:invoke>

        <body class="${class2}">
       
        <jsp:include page="/layout/nav.jsp" />
       
        <jsp:include page="/layout/user.jsp" />
        <jsp:invoke fragment="container"></jsp:invoke>
        
        <jsp:include page="/layout/foot.jsp" />
                        
        <jsp:invoke fragment="foot"></jsp:invoke>
        <script src="${pageContext.request.contextPath}/assets/js/confirmations.js" type="text/javascript"></script>
        <script src="http://lipis.github.io/bootstrap-sweetalert/lib/sweet-alert.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
       
    </body>
</html>