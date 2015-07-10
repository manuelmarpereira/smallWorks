$("#facojacontacto").submit(function (e) {
    
    $('#btnmakeoffer').attr("disabled", true);
 e.preventDefault();
 $.ajax({
        
        type: "GET",
        url: "/smallWorks/facoja",
       data: $(this).serialize(),
        processData: false,       
        success: function (da) {
            $('#makeOffer').modal('hide');
            $('#btnmakeoffer').removeAttr('disabled');
            console.log("success facoja");
          
            
        },
        error: function (data) {
            $('#makeOffer').modal('hide');
            $('#btnmakeoffer').removeAttr('disabled');
            console.log("unssuccess email");
        }
    });
    
 });
