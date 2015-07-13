function getSubTasks(){
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

function handleLocation(selectObj) {
     var id = selectObj.options[selectObj.selectedIndex].value;
    if(id>0)
        $('.comboloc input').val(id);
        getSubTasks(id);
}