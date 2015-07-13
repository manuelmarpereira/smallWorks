$(document).ready(function(){
    $("#email").submit(function (e) {
        e.preventDefault();
        $.ajax({
            type: "POST",
            url: "/smallWorks/editemail",
            data: $(this).serialize(),
            processData: false,
            success: function (da) {
                 
              $('#editEmailModel').modal('hide');
              $('#alertsuccess').show(0).delay(1000).hide(0);
              
              setTimeout(function(){
                   window.location.href = '/smallWorks/user/show.jsp' ;
             }, 1000);
            },
            error: function (fail) {
                console.log("unssuccess email");
                 document.getElementById("alerterroremail").style.display = "inline"; 
            }
        });
    });
});