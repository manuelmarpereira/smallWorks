$("#editpass").submit(function (e) {
    e.preventDefault();
    $.ajax({
        type: "POST",
        url: "/smallWorks/editpass",
        data: $(this).serialize(),
        processData: false,
        success: function (da) {
            console.log(); // string true
            //                if (da.resp === 'false')
            window.location.href = '/smallWorks/user/show.jsp';
            //                else
            //                    window.location.href = '${pageContext.request.contextPath}' + da.resp;
        },
        error: function (data) {
            console.log("unssuccess email");
        }
    });
});