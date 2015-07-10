function getUser(path,id){
    if ( id !== null && id > 0){
        $.ajax({
            type: "GET",
            url: "/smallWorks/userdata",
            data : {id:id}, 
            success: function(resp) {
                $(".nick").text(resp.nick);
                $(".names").after(resp.firstname + " " + resp.lastname);
                $(".district").after(resp.nameDistrict);
                if(resp.photo === "null"){
                    $(".photo").attr('src', path + '/assets/img/user.jpg');
                    $(".miniphoto").attr('src', path + '/assets/img/user2.jpg');
                } else {
                    $(".photo").attr('src', path + '/assets/img/users/'+ resp.photo);
                    $(".miniphoto").attr('src', path + '/assets/img/users/'+ resp.photo);
                }
                $(".email").after(resp.email);
                if(resp.feedback>=0 && resp.feedback <=10) {
                    $('.reward').empty();
                    for(var i = 0;i < 10; i++) {
                        if(i < resp.feedback) {
                            $(".reward").append('<label class="rating-star-show"></label>');
                        } else {
                            $(".reward").append('<label class="rating-star"></label>');
                        }
                    }
                }
            }, error: function(fail){
                console.log("fail: " + fail);
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

function handleCheckbox(checkbox){
    if(checkbox.checked === true) {
        checkbox.value='true';
//        $('#checkNego').attr('value').text('true');
    } else {
        checkbox.value='false';
//        $('#checkNego').attr('value').text('false');
    }
}

function handleChange(selectObj) {
    //var selectValue=selectObj.options[selectObj.selectedIndex].text;
//    console.log(selectObj);
    var id = selectObj.options[selectObj.selectedIndex].value;
//    console.log("You selected index: " + id);
    if(id>0)
        $('.combo input').val(id);
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