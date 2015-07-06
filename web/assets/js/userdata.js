function getUser(id){
    if ( id !== null && id > 0){
        alert(id);
        
        $.get("editUser", {id:id},  
        function(resp){  
            alert(resp);
        });  
        
//        $.ajax({
//            type: "GET",
//            url: "/EditUserServlet", 
//            data : {id:id}, 
//            success: function(resp) {
//                alert(resp);
//                $(".name").text(resp.firstname + " " + resp.lastname);
//                $(".district").text(resp.district.name);
//                $(".email").text(resp.email);
//            }, error: function(fail){
//                alert("fail: " + fail);
//            }
//        });
    }
}


function verifyUser(id) { 
    if ( id === null && id > 0){
        $('#nameEdit').remove(); 
        $('#emailEdit').remove(); 
        $('#locationEdit').remove(); 
        $('#photoEdit').remove(); 
        $('#accessEdit').remove(); 
    }
}