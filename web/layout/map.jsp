
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
        <script src='http://code.jquery.com/jquery-1.11.3.js'></script>
<script LANGUAGE="JavaScript" src='${pageContext.request.contextPath}/assets/js/jquery-ui-1.10.3.custom.js'></script>

<link href="${pageContext.request.contextPath}/assets/css/mapa.css" rel="stylesheet" type="text/css"/>


                        <label style="display: none;">Localização : </label><input id="idlocalizacao" type="text" name="localizacao" style="display: none;">
                        <label style="display: none;">Distrito : </label><input id="distrito" type="text" name="distrito" style="display:none">
                        <label style="display: none;">Longitude : </label><input id="idlongitude" type="text" name="longitude" style="display:none;">
                        <label style="display: none;">Latitude : </label><input  id="latitude" type="text" name="latitude" style="display:none">
                        
                        <div>
                            <div >
                                <div class="form-group">
                                    <label for="txtEndereco" class="col-md-3 control-label">Endereço </label>
                                    <div class="col-md-9">
                                        <input type="text" id="txtEndereco" class="form-control" required name="txtEndereco" />
                                    </div>
                                </div>
                            </div>
                            <div id="mapa" class="mapRight">
                                <script LANGUAGE="JavaScript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB3UTzP6dux6yrwFZYUMI7Ja1wcgPj9jXA" ></script>
                                <script LANGUAGE="JavaScript" src='../assets/js/mapa.js'>

                                </script>
                            </div>
                        </div>