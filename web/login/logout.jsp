<%
    session.setAttribute("user", null);
    // New location to be redirected
    String site = new String(request.getContextPath() + "/index.jsp");
    response.setStatus(response.SC_MOVED_TEMPORARILY);
    response.setHeader("Location", site);
%>
 
