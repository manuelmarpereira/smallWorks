window.onload = function () {
    $("#editloca").submit(function (e) {
        e.preventDefault();
        $.ajax({
            type: "POST",
            url: "/smallWorks/editlocation",
            data: $(this).serialize(),
            processData: false,
            success: function (da) {
                
                if (da.resp === 'true')
                    $('#editLocationModel').modal('hide');
                    $('#alertsuccess').show(0).delay(1000).hide(0);   
                    
                    setTimeout(function(){
                          window.location.href = '/smallWorks/user/show.jsp' ;
                    }, 1000);
            },
            error: function (fail) {
                console.log("unssuccess district");
                document.getElementById("alerterrorlocation").style.display = "inline";  
            }
        });
    });
};