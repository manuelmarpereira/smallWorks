$("#contactar").submit(function (e) {
     $('#btncontactar').attr("disabled", true);
 e.preventDefault();
 $.ajax({
        
        type: "GET",
        url: "/smallWorks/emailcontact",
       data: $(this).serialize(),
        processData: false,       
        success: function (da) {
            $('#Contacto').modal('hide');
           $('#btncontactar').removeAttr('disabled');
            console.log("success email");
          
            
        },
        error: function (data) {
            $('#Contacto').modal('hide');
            $('#btncontactar').removeAttr('disabled');
            console.log("unssuccess email");
        }
    });
    
 });
