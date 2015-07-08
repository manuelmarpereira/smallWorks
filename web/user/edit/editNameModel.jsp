<%-- 
    Document   : editNameModel
    Created on : 6/jun/2015, 22:46:50
    Author     : Manuel
--%>

 <form role="form" name="" action="" method="POST"> 
<div class="modal fade" id="editNameModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title" id="myModalLabel"> Profile Name</h4>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="form-model col-md-8 go-right">

                        <div class="form-group">
                            <input  id="firstname" name="firstname" required="" type="text" class="form-control">
                            <label for="name">Your First Name</label>
                        </div>
                        <div class="form-group">
                            <input id="lastname"  name="lastname" required type="text" class="form-control">
                            <label for="phone">Your Last Name</label>
                        </div>

                    </div>
                    
                    <div class="col-md-2">
                        <img src="${pageContext.request.contextPath}/assets/img/edit.png"/> 
                    </div>
                </div>
            </div>
           <div class="modal-footer"> 
                        <input id="submit" type ="submit" class="btn btn btn-success" value ="Save" >
                        <button type="button" class="btn btn-danger" data-dismiss="modal">Back</button>
            </div>
        </div>
    </div>
</div>

   </form>                 
   <script LANGUAGE="JavaScript" src='${pageContext.request.contextPath}/assets/js/validations-user.js'></script>
   <script>
       
      window.onload = function() {
          
           document.getElementById("firstname").value= "teste";
           document.getElementById("lastname").value= "teste";
           document.getElementById("submit").disabled=true;
       
    }
    
   </script>