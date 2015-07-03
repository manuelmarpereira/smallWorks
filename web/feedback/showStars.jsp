<%-- 
    Document   : stars
    Created on : 5/jun/2015, 19:01:31
    Author     : Manuel
--%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<span class="rating">
    
<c:forEach var="i" begin="1" end="10"> 
    
    <c:choose>
        <c:when test="${i > 8}">
            <label class="rating-star"></label>
     </c:when>
     <c:otherwise>
            <label class="rating-star-show"></label>
     </c:otherwise>
   </c:choose>
   
</c:forEach>
    
</span>

