

function getData(path,id){
$.ajax({
    type: "GET",
    url: "/smallWorks/showOffer",
    data: {'id': id},
    success: function (resp) {
        $("#namer").val(resp.name+resp.lastname);
       $("#namereceive").val(resp.name+resp.lastname);
        $(".names").after(resp.name+resp.lastname);
        $(".district").after(resp.district);
        if (resp.photo === "null" || resp.photo==="") {
            $(".photo").attr('src', path + '/assets/img/user.jpg');
            
        } else {
            $(".photo").attr('src', path + '/assets/img/users/' + resp.photo);
           
        }
        $("#emailr").val(resp.email);
        $("#emailreceive").val(resp.email);
        $(".email").after(resp.email);
        if (resp.feedback >= 0 && resp.feedback <= 10) {
            $('.reward').empty();
            for (var i = 0; i < 10; i++) {
                if (i < resp.feedback) {
                    $(".reward").append('<label class="rating-star-show"></label>');
                } else {
                    $(".reward").append('<label class="rating-star"></label>');
                }
            }
        }
        $("#titoff").val(resp.title+" ");
        $("#titleoffers").val(resp.title+" ");
        $("#nameOffer").append(resp.title+" ");
        $("#descriptionOffer").append(resp.description);
        $("#winOffer").append(resp.price+"€");
        if (resp.negociavel==='false'){
            $('#negociavel').prop('checked', false);
        }else{
            $('#negociavel').prop('checked', true);
        }
      
         $("iframe").attr('src','https://maps.google.com/maps?q='+parseFloat(resp.latitude)+','+parseFloat(resp.longitude)+'&hl=es;z=14&output=embed');  
         $("#firstname").append(resp.name);
         $("#idoffer").val(resp.idwork);
    }, error: function (fail) {
        $("#yesoffer").hide();
        $("#interest").hide();
        console.log("fail: " + fail);
    }
});
}