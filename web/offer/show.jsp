<%-- 
    Document   : show
    Created on : 5/jun/2015, 20:06:35
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <jsp:include page="/user/show.jsp" />
        <div class=" marginSide"> 
        <div class="row">
            <div class="col-md-12">
                <hr>
                <div class="col-md-6  white">
                    <h1><a class="control-label">Cortar a Relva </a><small>Inserido em 14 de Abril</small></h1>
                    <div class="col-sm-1"></div>
                    <div class=" panel panel-default blue col-sm-10">
                        <br>
                        <p>
                            Estou a Necessitar de alguém que possa vir cá a casa
                            cortar a relva do meu jardim. São cerca de 20m2. Se
                            estiver interessado entre em contacto comigo até
                            dia 20 de Abril.
                        </p>
                    </div>
                    <div class="col-sm-1"></div>
                    <br>
                    <div class="col-sm-2"></div>
                    <div class="col-sm-2">
                        <p class="control-label">Recompensa:</p>
                    </div>

                    <div class=" control-label pull-left col-sm-1">
                        25€
                    </div>

                    <div class="col-sm-5 pull-left">
                        <input type="checkbox" id="a">
                        <label class="control-label" for="a">Negociável</label>
                    </div>
                    <div class="col-sm-2"></div>

                    <div class="col-sm-12">
                        <div class="col-xs-6 pull-left">
                            <button type="button" class="btn btn-warning">Entrar em contacto com o Filipe</button>
                        </div>
                        <div class="col-xs-6 text-justify">
                            <button type="button" class="btn btn-primary">Faço já</button>
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="map text-center">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d2985.4144339113373!2d-8.399444861720799!3d41.56027432127022!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd24fc279db73165%3A0x753290b0d1b763f0!2sUniversidade+do+Minho%2C+Campus+de+Gualtar!5e0!3m2!1spt-PT!2spt!4v1430594316644"
                                width="400" height="250" frameborder="1"></iframe>
                    </div>
                    <div class="text-center col-xs-12 white">
                        <p class="control-label">Rua 123, Braga</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </body>
</html>
