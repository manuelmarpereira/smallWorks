$(document).ready(function () {

    $("#addEvent").submit(function (e) {
        var username = $('#usernameEvent').val();
        var password = $('#passwordEvent').val();
        var title = $('#titleEvent').val();
        var description = $('#descriptionEvent').val();
        var data = $('#dateEvent').val();
        var duration = $('#durationEvent').val();
        var realdate = moment(data).format("YYYY-MM-DDTHH:mm:ss");
        e.preventDefault();
        $.ajax({
            type: "POST",
            url: "/smallWorks/aa",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify({user: {username: username, password: password, title: title, description: description, date: realdate, duration: duration}}),
           
            success: function (data, textStatus, xhr) {
                if (xhr.status == "201") {
                    alert("Inserido com sucesso");
                } else {
                    alert("erro no servidor externo");
                }

            },
            error: function (fail) {

                alert("error connect server");
            }
        });
    });
});