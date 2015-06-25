<%-- 
    Document   : Logout
    Created on : 2/jun/2015, 21:06:38
    Author     : PC
--%>


        <%
            session.setAttribute("name", null);
            // New location to be redirected
            String site = new String(request.getContextPath() + "/index.jsp");
            response.setStatus(response.SC_MOVED_TEMPORARILY);
            response.setHeader("Location", site);
        %>
 
