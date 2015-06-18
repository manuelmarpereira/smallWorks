<%-- 
    Document   : confirmations
    Created on : 7/jun/2015, 15:50:24
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
        <button class="btn btn btn-success sweet-12" onclick="_gaq.push(['_trackEvent', 'example, 'try', 'Success']);">Save</button>
        <button type="button" class="btn btn-danger" data-dismiss="modal">Back</button>    
        
        <script src="<%=request.getContextPath()%>/assets/js/confirmations.js" type="text/javascript"></script>
        <script src="http://lipis.github.io/bootstrap-sweetalert/lib/sweet-alert.js"></script>
        <link rel="stylesheet" href="http://lipis.github.io/bootstrap-sweetalert/lib/sweet-alert.css">

