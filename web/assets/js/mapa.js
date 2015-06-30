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

$(document).ready(function () {

    initialize();


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

                    var location = new google.maps.LatLng(latitude, longitude);
                    marker.setPosition(location);
                    map.setCenter(location);
                    map.setZoom(16);
                }
            }
        })
    }

    $("#btnEndereco").click(function () {
        if ($(this).val() != "")
            carregarNoMapa($("#txtEndereco").val());
    })

    $("#txtEndereco").blur(function () {
        if ($(this).val() != "")
            carregarNoMapa($(this).val());
    })

    google.maps.event.addListener(marker, 'drag', function () {
        geocoder.geocode({'latLng': marker.getPosition()}, function (results, status) {
            if (status == google.maps.GeocoderStatus.OK) {
                if (results[0]) {
                    $('#txtEndereco').val(results[0].formatted_address);
                    $('#latitude').val(marker.getPosition().lat());
                    $('#idlongitude').val(marker.getPosition().lng());
                    $("#idlocalizacao").val($("#txtEndereco").val());
                }
            }
        });
    });

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
            var location = new google.maps.LatLng(ui.item.latitude, ui.item.longitude);
            marker.setPosition(location);
            map.setCenter(location);
            map.setZoom(16);
        }
    });


});