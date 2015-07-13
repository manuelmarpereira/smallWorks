
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

function getLocation(){
    $.ajax({
        type: "GET",
        url: "/smallWorks/locationdata", // ver isto para conseguir comunicar, 
        success: function(resp) {
//                console.log(resp);
            $('.locat').empty();
            for (var i = 0; i < resp.length; i++) {
                $('.locat').append($('<option>')
                    .attr("value",resp[i].id)
                    .text(resp[i].name));
            }
        }, error: function(fail){
            console.log("can't get tasks");
        }
    });
}

function handleChange(selectObj) {
    
    var id = selectObj.options[selectObj.selectedIndex].value;
    if(id>0)
        $('.combo input').val(id);
        getSubTasks(id);
}