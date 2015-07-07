function getUser(id){
    if ( id !== null && id > 0){
        $.ajax({
            type: "GET",
            url: "/smallWorks/userdata",
            data : {id:id}, 
            success: function(resp) {
//                console.log(resp);
                $(".nick").text(resp.nick);
                $(".names").after(resp.firstname + " " + resp.lastname);
                $(".district").after(resp.nameDistrict);
                $(".email").after(resp.email);
            }, error: function(fail){
                alert("fail: " + fail);
            }
        });
    }
}

function getTasks(){
    $.ajax({
        type: "GET",
        url: "/smallWorks/taskdata", // ver isto para conseguir comunicar, 
        success: function(resp) {
//            console.log(resp);
            for (var i = 0; i < resp.length; i++) {
                $('.tasks').append($('<option>')
                    .attr("value",resp[i].id)
                    .text(resp[i].name));
            }
        }, error: function(fail){
            console.log("can't get subtasks");
        }
    });
}

function getSubTasks(id){
    if ( id !== null && id > 0){
        $.ajax({
            type: "GET",
            url: "/smallWorks/subtaskdata", // ver isto para conseguir comunicar, 
            data : {id:id}, 
            success: function(resp) {
//                console.log(resp);
                $('.subTasks').empty();
                for (var i = 0; i < resp.length; i++) {
                    $('.subTasks').append($('<option>')
                        .attr("value",resp[i].id)
                        .text(resp[i].name));
                }
            }, error: function(fail){
                console.log("can't get tasks");
            }
        });
    }
}

function handleChange(selectObj) {
    //var selectValue=selectObj.options[selectObj.selectedIndex].text;
//    console.log(selectObj);
    var id = selectObj.options[selectObj.selectedIndex].value;
    $('.combo input').val(id);
//    console.log("You selected index: " + id);
    if(id>0)
        getSubTasks(id);
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