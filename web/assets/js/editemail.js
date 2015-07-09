$(document).ready(function(){
    $("#email").submit(function (e) {
        e.preventDefault();
        $.ajax({
            type: "POST",
            url: "/smallWorks/editemail",
            data: $(this).serialize(),
            processData: false,
            success: function (da) {
                console.log(); // string true
                //                if (da.resp === 'false')
                window.location.href = '/smallWorks/user/show.jsp';
                //                else
                //                    window.location.href = '${pageContext.request.contextPath}' + da.resp;
            },
            error: function (fail) {
                console.log("unssuccess email");
            }
        });
    });
});