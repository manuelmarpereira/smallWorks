 <script src='${pageContext.request.contextPath}/assets/js/plugins/jquery-ui-1.10.3.custom.js'></script>

<link href="${pageContext.request.contextPath}/assets/css/mapa.css" rel="stylesheet" type="text/css"/>

<label style="display: none;">Localização : </label><input id="idlocalizacao" type="text" name="localizacao" style="display: none;">
<label style="display: none;">Distrito : </label><input id="distrito" type="text" name="distrito" style="display:none">
<label style="display: none;">Longitude : </label><input id="idlongitude" type="text" name="longitude" style="display:none;">
<label style="display: none;">Latitude : </label><input  id="latitude" type="text" name="latitude" style="display:none">

<div class="row">
    <div id="mapa" class="mapRight">
        <script src="http://maps.googleapis.com/maps/api/js?key=AIzaSyDWzwHg_EeQmhIl2GjAm0vVBEZXwZ7W9J8&amp;sensor=false"></script>

        <script src='${pageContext.request.contextPath}/assets/js/mapa.js'></script>
    </div>
</div>