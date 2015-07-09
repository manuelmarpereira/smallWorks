<script type="text/javascript">
    
    function setImg(input) {
        if(input.files && input.files[0]) {
            var reader = new FileReader();
            reader.onload = function (e) {
                $('.avatar').attr('src', e.target.result);
            };
            reader.readAsDataURL(input.files[0]);
        }
    };
    
    $(document).ready(function () {
        $('#photo').submit(function(event) {
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
                beforeSend: function() {
                    $("#photo").append('<div id=\"overlay\" style=\"position: fixed;top: 0;left: 0;right: 0;bottom: 0;background-color: rgba(0,0,0,0.5);z-index: 9999;\"><div style=\"background-color: #ffffff;font-size:1.5em;\">Uploading image <img src=\"${pageContext.request.contextPath}/assets/img/load.gif\" alt="" height=\"20px\" width=\"50px\" /></div></div>');
                },
                success : function(data) {
                    $("#overlay").remove();
                    window.location.href = '${pageContext.request.contextPath}' + data.resp;
                },
                error: function(data) {
                    console.log("error");
                }
            });
        });
    });
    
</script>

<form id="photo" > 
        <div class="modal fade" id="editPhotoModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                        <h4 class="modal-title" id="myModalLabel">Edit profile Photo</h4>
                    </div>
                    <div class="modal-body">
                        <div class="text-center">
                            <input type="hidden" name="id" value="${sessionScope.user.id}"/>
                            <img src="${pageContext.request.contextPath}/assets/img/user.jpg" alt="" class="avatar img-circle" />

                            <h6>Carregar Foto</h6>
                            <input class="inpimg form-control" type="file" name="imagefile" accept="image/png" required onchange="setImg(this);">
                        </div>
                    </div>
                            <div class="modal-footer" style="font-size: 1.5em;"> 
                        <input id="submit" type ="submit" class="btn btn btn-success" value ="Save">
                        <button type="button" class="btn btn-danger" data-dismiss="modal">Back</button>
                    </div>
                </div>
            </div>
        </div>
 </form>