function deleteOffer(){
   var id = $('#idDeleteOffer').val();
           $.ajax({
            type: "POST",
            url: "/smallWorks/deleteOffer",
            data: {id:id},
            success: function (da) {
                    
            $('#alertsuccessoffer').show(0).delay(5000).hide(0);
              
             setTimeout(function(){
                   window.location.href = '/smallWorks/user/myOffers.jsp';
             }, 3000);
               
            },
            error: function (fail) {
                console.log("unssuccess delete offer");
                $('#alerterroroffer').show(0).delay(5000).hide(0);
            }
        });
}