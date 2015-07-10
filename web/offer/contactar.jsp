<form id="contactar">
<div class="modal fade" id="Contacto" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                    <h4 class="modal-title" id="myModalLabel">Confirmation</h4>
                </div>
                 <div class="modal-body">
                 <div class="row">
                     Nome:
      <input type="text"  name="nomesend" id="nomesend" class="form-control" >
            Email: 

           <%
        if(session.getAttribute("user")==null){ %>
           <input type="text" required name="EmailContacto" id="EmailContacto" class="form-control" >
        <% }else{ %> 
        <input type="text" required name="EmailContacto" id="EmailContacto" value="${sessionScope.user.email}" class="form-control" >
       <% } %>
        <br/>    
      Assunto:
      <input type="text"  name="assunto" id="assunto" class="form-control" >
      
       
        <br/>
        
        Mensagem:
         <textarea rows="2" cols="1"  name="description" id="description" class="form-control" ></textarea>
         
                </div>
                  </div>
                <div class="modal-footer"> 
                    <input type ="submit" id="btncontactar" class="btn btn btn-success" value ="Enviar Email" >
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Back</button>
                </div>
           
        </div>
    </div>
</div>
   
       
              <input type="text"  name="emailreceive" id="emailreceive" class="form-control" style="visibility: hidden" >
               <input type="text"  name="titleoffers" id="titleoffers" class="form-control" style="visibility: hidden" >
        <input type="text"  name="namereceive" id="namereceive" class="form-control" style="visibility: hidden" >  
</form>
         <script src="${pageContext.request.contextPath}/assets/js/emailContact.js"></script> 