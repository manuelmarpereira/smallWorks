$("#editpass").submit(function (e) {
    e.preventDefault();
    $.ajax({
        type: "POST",
        url: "/smallWorks/editpass",
        data: $(this).serialize(),
        processData: false,
        success: function (da) {
            console.log(); // string true
         
              $('#editAccessModel').modal('hide');
                    $('#alertsuccess').show(0).delay(3000).hide(0);   
            
        },
        error: function (data) {
            console.log("unssuccess email");
            document.getElementById("alerterrorpass").style.display = "inline"; 
        }
    });
});



$('#password').blur(function()          
{                   
    if( $(this).val()!="" ) {                     
          document.getElementById("labelpassword").style.color = "#fff";  
          document.getElementById("labelpassword").style.opacity = ".4";  
    
    }
});

$('#password2').blur(function()          
{                   
    if( $(this).val()!="" ) {                     
          document.getElementById("labelpassword2").style.color = "#fff";  
          document.getElementById("labelpassword2").style.opacity = ".4";  
    
    }
});