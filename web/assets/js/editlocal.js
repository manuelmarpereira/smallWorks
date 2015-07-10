window.onload = function () {
    $("#editloca").submit(function (e) {
        e.preventDefault();
        $.ajax({
            type: "POST",
            url: "/smallWorks/editlocation",
            data: $(this).serialize(),
            processData: false,
            success: function (da) {
                if (da.resp === 'true')
                    window.location.href = '/smallWorks/user/show.jsp';
            },
            error: function (fail) {
                console.log("unssuccess district");
            }
        });
    });
};