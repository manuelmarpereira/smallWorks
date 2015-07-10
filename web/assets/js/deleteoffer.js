function deleteOffer(){
   var id = $('#idDeleteOffer').val();
           $.ajax({
            type: "POST",
            url: "/smallWorks/deleteOffer",
            data: {id:id},
            success: function (da) {
               
                window.location.href = '/smallWorks/user/myOffers.jsp';
               
            },
            error: function (fail) {
                console.log("unssuccess delete offer");
            }
        });
}