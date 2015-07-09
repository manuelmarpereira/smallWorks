     $.ajax({
            type: "GET",
            url: "/smallWorks/dashboard",
            data : {id:id}, 
            success: function(resp) {
//                console.log(resp);
               $("#totalcash").append(resp.offerscreator);
            }, error: function(fail){
                alert("fail: " + fail);
            }
        });
