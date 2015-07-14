$(document).ready(function () {

    $("#addEvent").submit(function (e) {
        var username = $('#usernameEvent').val();
        var password = $('#passwordEvent').val();
        var title = $('#titleEvent').val();
        var description = $('#descriptionEvent').val();
        var data = $('#dateEvent').val();
        var duration = $('#durationEvent').val();
        var realdate = moment(data).format("YYYY-MM-DDTHH:mm");
        e.preventDefault();
        $.ajax({
            type: "POST",
            url: "/smallWorks/grouporganizer",
            
            data: {usernameEvent: username, passwordEvent: password, titleEvent: title, descriptionEvent: description, dateEvent: realdate, durationEvent: duration},
            crossDomain: true,
            success: function (data) {
               alert(data.resp);
               $('#addEvent').modal('hide');

            },
            error: function (fail) {

                alert("error connect server");
            }
        });
    });
});