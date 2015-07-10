var obj;
function getMakeWork(id) {

    $.ajax({
        type: "GET",
        url: "/smallWorks/makework",
        data: {"id": id},
        
        success: function (resp) {
            var string = JSON.stringify(resp);
            obj = JSON.parse(string);
            for (var i = 0; i < obj.works.work.length; i++)
            {
                $('#datatable tbody').append('<tr><td>' + obj.works.work[i].startdate + '</td><td>' + obj.works.work[i].tarefa + '</td><td>' + obj.works.work[i].recompensa + '</td><td>' + obj.works.work[i].estado + '</td><td><a href="#" data-toggle="modal" onclick="paramDelete(' + obj.works.work[i].id + ');" data-target="#ResetModel">Delete Offer</a></td></tr>');
            }
            for (var i = 0; i < obj.works.initwork.length; i++)
            {
                $('#datatable tbody').append('<tr><td>' + obj.works.initwork[i].startdate + '</td><td>' + obj.works.initwork[i].tarefa + '</td><td>' + obj.works.initwork[i].recompensa + '</td><td>' + obj.works.initwork[i].estado + '</td><td><a href="#" data-toggle="modal" onclick="param(' + obj.works.initwork[i].id + ');" data-target="#FinishModel">Close Offer</a></td></tr>');
            }
            for (var i = 0; i < obj.works.makework.length; i++)
            {
                $('#datatable tbody').append('<tr><td>' + obj.works.makework[i].startdate + '</td><td>' + obj.works.makework[i].tarefa + '</td><td>' + obj.works.makework[i].recompensa + '</td><td>' + obj.works.makework[i].estado + '</td><td></td></tr>');
            }
            importDataTable();

        }, error: function (fail) {
            console.log("fail: " + fail);
        }
    });

}

function importDataTable() {
    $.ajax({
        dataType: 'script',
        url: '//cdn.datatables.net/1.10.7/js/jquery.dataTables.min.js',
        crossDomain: true,
        success: function (response)
        {
            $('#datatable').DataTable();
        }
    });
}

function paramDelete(id) {
    document.getElementById("idDeleteOffer").value = id;
}

function param(id) {

    document.getElementById("idOffer").value = id;

}