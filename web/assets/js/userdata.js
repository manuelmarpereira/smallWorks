function getUser(id){
    if ( id !== null && id > 0){
        $.ajax({
            type: "GET",
            url: "editUser", 
            data : {id:id}, 
            success: function(resp) {
                console.log(resp);
                $(".names").text(resp.firstname + " " + resp.lastname);
                //$(".district").text(resp.district.name);
                $(".email").text(resp.email);
            }, error: function(fail){
                alert("fail: " + fail);
            }
        });
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