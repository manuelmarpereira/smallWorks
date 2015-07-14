function getSubTasks() {

    $.ajax({
        type: "GET",
        url: "/smallWorks/subtaskdata", // ver isto para conseguir comunicar, 

        success: function (resp) {
//                console.log(resp);

            for (var i = 0; i < resp.length; i++) {
                $('.subTasks').append($('<option>')
                        .attr("value", resp[i].id)
                        .text(resp[i].name));
            }
        }, error: function (fail) {
            console.log("can't get tasks");
        }
    });
}
function getLocation() {
    $.ajax({
        type: "GET",
        url: "/smallWorks/district", // ver isto para conseguir comunicar, 

        success: function (resp) {
//                console.log(resp);

            for (var i = 0; i < resp.length; i++) {
                $('.locat').append($('<option>')
                        .attr("value", resp[i].id)
                        .text(resp[i].name));
            }
        }, error: function (fail) {
            console.log("can't get tasks");
        }
    });
}

$("#subscription").submit(function (e) {
    var substask = document.getElementById("subTasks").options[document.getElementById("subTasks").selectedIndex].value;
    var idloc = document.getElementById("idloc").options[document.getElementById("idloc").selectedIndex].value;
    if (substask == "0" && idloc == "0") {
        alert("Select an option");
        return;
    } else {

        e.preventDefault();
        $.ajax({
            type: "POST",
            url: "/smallWorks/subscription",
            data: $(this).serialize(),
            processData: false,
            success: function (da) {

                alert("Successfully Inserted");

            },
            error: function (data) {
                console.log("unssuccess");

            }
        });
    }
}
);