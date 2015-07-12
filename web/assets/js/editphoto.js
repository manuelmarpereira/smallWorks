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
        document.getElementById("alertinfophoto").style.display = "inline"; 
        },
        success: function (data) {
                       
            $("#overlay").remove();
            $('#editPhotoModel').modal('hide');
            $('#alertsuccess').show(0).delay(3000).hide(0); 
     
        },
        error: function (data) {
            console.log("error");
             document.getElementById("alerterrorphoto").style.display = "inline"; 
        }
    });
});