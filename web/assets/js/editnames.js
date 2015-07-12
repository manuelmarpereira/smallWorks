$("#names").submit(function (e) {
    e.preventDefault();
    $.ajax({
        type: "POST",
        url: "/smallWorks/editnames",
        data: $(this).serialize(),
        processData: false,
        success: function (da) {
            console.log(); // string true
                      
                if (da.resp === 'false')
                    document.getElementById("alerterrorname").style.display = "inline";            
                else    
                    $('#editNameModel').modal('hide');
                    $('#alertsuccess').show(0).delay(3000).hide(0);  
                     
                setTimeout(function(){
                      window.location.href = '/smallWorks/user/show.jsp' ;
                }, 3000);
        },
        error: function (data) {
            console.log("unssuccess");
            document.getElementById("alerterrorname").style.display = "inline";  
        }
    });
});



$('#firstname').blur(function()          
{                   
    if( $(this).val()!="" ) {                     
          document.getElementById("labelfirstname").style.color = "#fff";  
          document.getElementById("labelfirstname").style.opacity = ".4";  
    opacity: .4;
    }
});

$('#lastname').blur(function()          
{                   
    if( $(this).val()!="" ) {                     
          document.getElementById("labellastname").style.color = "#fff";  
          document.getElementById("labellastname").style.opacity = ".4";  
    opacity: .4;
    }
});

