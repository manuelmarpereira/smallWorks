function setImg(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();
        reader.onload = function (e) {
            $('.avatar').attr('src', e.target.result);
        };
        reader.readAsDataURL(input.files[0]);
    }
}
;

$('#photo').submit(function (event) {
    //method="POST" action="${pageContext.request.contextPath}/edituserphoto" enctype="multipart/form-data"
    event.preventDefault();
    console.log("entrou");
    var data = new FormData(this);
    $.ajax({
        type: "POST",
        url: "/smallWorks/edituserphoto",
        data: data,
        processData: false,
        contentType: false,
        beforeSend: function () {
            $("#photo").append('<div id=\"overlay\" style=\"position: fixed;top: 0;left: 0;right: 0;bottom: 0;background-color: rgba(0,0,0,0.5);z-index: 9999;\"><div style=\"background-color: #ffffff;font-size:1.8em; text-align: center;width:50%;\">Uploading image...wait a moment please.\n This window will close automatically.</div></div>');
        },
        success: function (data) {
            $("#overlay").remove();
            
            $("#photochange").val(data.resp);
            document.getElementById("DeleteUserForm").submit();
        },
        error: function (data) {
            console.log("error");
        }
    });
});