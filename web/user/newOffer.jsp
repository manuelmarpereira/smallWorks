<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>

<layout:profile_layout title="New Offer" class2="">
    <jsp:attribute name="head">
    </jsp:attribute>
    
    <jsp:attribute name="container">

        <div class="marginSide"> 
            <h2>Create new offer</h2>
            <hr>
            <div class="col-md-12">
                <form class="form-horizontal" role="form" action="NewOffer" method="POST">
                    <input type="hidden" name="id" value="${sessionScope.user.id}"/>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label class="control-label col-sm-2">Title</label>
                            <div class="col-sm-10">
                                <input type="text" name="title" class="form-control" required="true">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2">Description</label>
                            <div class="col-sm-10">
                                <textarea class="form-control" name="description" rows="4"></textarea>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-sm-2">Reward</label>
                            <div class="col-sm-3">
                                <input type="text" name="reward" class="form-control" required="true" >
                            </div>
                            <label class="control-label col-sm-1">€</label>
                            <div class="col-sm-6 pull-right">
                                <div class="checkbox">
                                    <label class="control-label"><input type="checkbox" name="negociable" required="true">Negociable</label>
                                </div>
                            </div>
                        </div>
                        
                        <div>
                            <div class="combo col-md-6">
                                <input type="hidden" name="idSubTask" value=""/>
                                <p> Category:<select class="tasks" onchange="handleChange(this);"><option value="-1">-----</option></select></p>                                
                            </div>
                            <div class="col-md-6"> 
                                <p> Task:<select class="subTasks"><option value="-1">-----</option></select></p>
                            </div>  
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class=" panel panel-default">
                            <div class="panel-heading">Location of the proposed offer</div>
                            <br/>
                            <jsp:include page="/layout/map.jsp" />  

                        </div>
                    </div>
                    <div>
                        <input class="btn btn-primary pull-right"  type="submit" value="Save offer"/>
                    </div>   
                </form>
            </div>
        </div>

    </jsp:attribute>
</layout:profile_layout>

<script>
    getTasks();
</script>