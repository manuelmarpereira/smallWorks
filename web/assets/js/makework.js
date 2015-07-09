  var obj;
  function getMakeWork(id){
          
        $.ajax({
            type: "GET",
            url: "/smallWorks/makework",
            async: false,
            data : {id:id}, 
            success: function(resp) {
                var string = JSON.stringify(resp);
                obj = JSON.parse(string);
                for (var i=0;i<obj.works.work.length;i++)
                {
                    $('#datatable tbody').append('<tr><td>'+obj.works.work[i].startdate+'</td><td>'+obj.works.work[i].tarefa+'</td><td>'+obj.works.work[i].recompensa+'</td><td>'+obj.works.work[i].estado+'</td><td>Editar</td></tr>');
                }
                for (var i=0;i<obj.works.initwork.length;i++)
                {
                    $('#datatable tbody').append('<tr><td>'+obj.works.initwork[i].startdate+'</td><td>'+obj.works.initwork[i].tarefa+'</td><td>'+obj.works.initwork[i].recompensa+'</td><td>'+obj.works.initwork[i].estado+'</td><td><a href="#" data-toggle="modal" data-target="#FinishModel">Close Offer</a></td></tr>');
                }
                for (var i=0;i<obj.works.makework.length;i++)
                {
                    $('#datatable tbody').append('<tr><td>'+obj.works.makework[i].startdate+'</td><td>'+obj.works.makework[i].tarefa+'</td><td>'+obj.works.makework[i].recompensa+'</td><td>'+obj.works.makework[i].estado+'</td><td></td></tr>');
                }
                
            }, error: function(fail){
                alert("fail: " + fail);
            }
        });

        }