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
        <script src='http://code.jquery.com/jquery-1.11.3.js'></script>
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/img/icon.png">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <link href="<%=request.getContextPath()%>/assets/css/custom.css" rel="stylesheet" type="text/css"/>
        <jsp:invoke fragment="head"></jsp:invoke>
        </head>

<%
    hibernate.user.User me = (hibernate.user.User) request.getAttribute("user");
    if(me!=null){
    session.setAttribute("user", me);
    }
%>

    <jsp:invoke fragment="session"></jsp:invoke>

        <body class="${class2}">

            <jsp:include page="/layout/nav.jsp" />
      
                        
        <jsp:invoke fragment="container"></jsp:invoke>
        
        <jsp:include page="/layout/foot.jsp" />
                        
        <jsp:invoke fragment="foot"></jsp:invoke>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    </body>
</html>