     $.ajax({
            type: "GET",
            url: "/smallWorks/dashboard",
            data: {'id':id},
            success: function(resp) {
//               
               $("#totMakeOffer").append(resp.offersworker);
               $("#totMakeCash").append(resp.winoffersworker+"<i class='fa fa-euro'></i>");
               $("#totMyOffer").append(resp.offerscreator);
               $("#totMyCash").append(resp.winofferscreator+"<i class='fa fa-euro'></i>");
               $("#diference").append(resp.diference+"<i class='fa fa-euro'></i>");
            }, error: function(fail){
                console.log("fail: " + fail);
            }
        });
