        
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>
<layout:simple_layout title="Search Offers" class2="">
    <jsp:attribute name="head"> 
    </jsp:attribute>

    <jsp:attribute name="foot"></jsp:attribute>
    <jsp:attribute name="container">

        <jsp:include page="/user/editUser.jsp" />
        <div class="row marginSide">
            <div class="col-md-12">
                <hr>
                <div class="col-md-6  white">
                    <h3 style="margin-left: 45px;"><a class="control-label">Cortar a Relva </a><small>Inserido em 14 de Abril</small></h3>
                    <div class="col-sm-1"></div>
                    <div class=" panel panel-default blue col-sm-10">
                        <br>
                        <p style=" color:#888">
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
                        <p class="control-label" style=" color:#888">Recompensa:</p>
                    </div>

                    <div class="col-sm-1" style=" color:#888; padding-left: 30px;">
                        25€
                    </div>

                    <div class="col-sm-5 pull-left" style="padding-left: 30px;">
                        <input type="checkbox" id="a">
                        <label style="color:#888" for="a">Negociável</label>
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

    </jsp:attribute>
</layout:simple_layout> 