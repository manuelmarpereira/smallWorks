var geocoder;
var map;
var marker;

function initialize() {
    var latlng = new google.maps.LatLng(38.687846, -9.150047);
    var options = {
        zoom: 5,
        center: latlng,
        mapTypeId: google.maps.MapTypeId.ROADMAP
    };

    map = new google.maps.Map(document.getElementById("mapa"), options);

    geocoder = new google.maps.Geocoder();

    marker = new google.maps.Marker({
        map: map,
        draggable: true,
    });

    marker.setPosition(latlng);
}

function carregarNoMapa(endereco) {
    geocoder.geocode({'address': endereco + ', Portugal', 'region': 'PT'}, function (results, status) {
        if (status == google.maps.GeocoderStatus.OK) {
            if (results[0]) {
                var latitude = results[0].geometry.location.lat();
                var longitude = results[0].geometry.location.lng();

                $('#txtEndereco').val(results[0].formatted_address);
                $('#latitude').val(latitude);
                $('#idlongitude').val(longitude);
                $("#idlocalizacao").val($("#txtEndereco").val());
                getDistrict(latitude, longitude);

                var location = new google.maps.LatLng(latitude, longitude);
                marker.setPosition(location);
                map.setCenter(location);
                map.setZoom(16);
            }
        }
    })
}

function loadtxtEndereco() {
    $("#txtEndereco").blur(function () {
        if ($(this).val() != "")
            carregarNoMapa($(this).val());
    });
}


function loadBtnEndereco() { // enter
    $("#btnEndereco").click(function () {
        if ($(this).val() != "")
            carregarNoMapa($("#txtEndereco").val());
    });
}

function addListenerMap() {
    google.maps.event.addListener(marker, 'drag', function () {
        geocoder.geocode({'latLng': marker.getPosition()}, function (results, status) {
            if (status == google.maps.GeocoderStatus.OK) {
                if (results[0]) {
                    $('#txtEndereco').val(results[0].formatted_address);

                    $('#latitude').val(marker.getPosition().lat());
                    $('#idlongitude').val(marker.getPosition().lng());
                    $("#idlocalizacao").val($("#txtEndereco").val());
                    getDistrict(marker.getPosition().lat(), marker.getPosition().lng());
                }
            }
        });
    });
}

function setAutoComplete() {
    $("#txtEndereco").autocomplete({
        source: function (request, response) {

            geocoder.geocode({'address': request.term + ', Portugal', 'region': 'PT'}, function (results, status) {
                response($.map(results, function (item) {
                    return {
                        label: item.formatted_address,
                        value: item.formatted_address,
                        latitude: item.geometry.location.lat(),
                        longitude: item.geometry.location.lng()
                    }
                }));
            })
        },
        select: function (event, ui) {
            $("#latitude").val(ui.item.latitude);
            $("#idlongitude").val(ui.item.longitude);
            $("#idlocalizacao").val($("#txtEndereco").val());
            getDistrict(ui.item.latitude, ui.item.longitude);
            var location = new google.maps.LatLng(ui.item.latitude, ui.item.longitude);
            marker.setPosition(location);
            map.setCenter(location);
            map.setZoom(16);
        }
    });
    $(".ui-autocomplete").css("z-index","2000");
    
}


function getDistrict(lat, long) {
        $.ajax({
            type: "GET",
            dataType: "json",
            url: "http://maps.googleapis.com/maps/api/geocode/json?latlng=" + lat + "," + long + "&sensor=true",
            success: function (data) {
                $.each(data, function (index, element) {
                    for (var i = 0; i < element.length; i++) {

                        if (element[0].address_components[i].types.toString().replace(",political", "") == "administrative_area_level_1") {

                            $("#distrito").val(element[0].address_components[i].long_name);
                            i = element.length;
                        }
                    }
                });
            }
        });
    }

function takeGray() {
    $('#editLocationModel').on('shown.bs.modal', function () {
        initialize();
        setAutoComplete();
    });
//    $('').show();
}

function initMyMap() {
    initialize();
}

$(document).ready(function () {

    loadtxtEndereco();

    loadBtnEndereco();

    addListenerMap();

    setAutoComplete();
});