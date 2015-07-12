/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$("input[type=password]").keyup(function(){
    var ucase = new RegExp("[A-Z]+");
	var lcase = new RegExp("[a-z]+");
	var num = new RegExp("[0-9]+");
	
	if($("#password").val().length >= 8){
		$("#8char").removeClass("glyphicon-info-sign");
		$("#8char").addClass("glyphicon-ok");
		$("#8char").css("color","#00A41E");
	}else{
		$("#8char").removeClass("glyphicon-ok");
		$("#8char").addClass("glyphicon-info-sign");
		$("#8char").css("color","#337ab7");
	}
	
	if(ucase.test($("#password").val())){
		$("#ucase").removeClass("glyphicon-info-sign");
		$("#ucase").addClass("glyphicon-ok");
		$("#ucase").css("color","#00A41E");
	}else{
		$("#ucase").removeClass("glyphicon-ok");
		$("#ucase").addClass("glyphicon-info-sign");
		$("#ucase").css("color","#337ab7");
	}
	
	if(lcase.test($("#password").val())){
		$("#lcase").removeClass("glyphicon-info-sign");
		$("#lcase").addClass("glyphicon-ok");
		$("#lcase").css("color","#00A41E");
	}else{
		$("#lcase").removeClass("glyphicon-ok");
		$("#lcase").addClass("glyphicon-info-sign");
		$("#lcase").css("color","#337ab7");
	}
	
	if(num.test($("#password").val())){
		$("#num").removeClass("glyphicon-info-sign");
		$("#num").addClass("glyphicon-ok");
		$("#num").css("color","#00A41E");
	}else{
		$("#num").removeClass("glyphicon-ok");
		$("#num").addClass("glyphicon-info-sign");
		$("#num").css("color","#337ab7");
	}
	
	if($("#password").val() == $("#password2").val()){
		$("#pwmatch").removeClass("glyphicon-remove");
		$("#pwmatch").addClass("glyphicon-ok");
		$("#pwmatch").css("color","#00A41E");
	}else{
		$("#pwmatch").removeClass("glyphicon-ok");
		$("#pwmatch").addClass("glyphicon-remove");
		$("#pwmatch").css("color","#FF0004");
	}
});




$(document).ready(function() {
    $('.form-group input[required]').on('keyup change', function() {
            var $form = $(this).closest('form'),
                $group = $(this).closest('.input-group'),
                $addon = $group.find('.input-group-addon'),
                $icon = $addon.find('span'),
                state = false;
            
    	if ($group.data('validate') == "email") {
			state = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/.test($(this).val())

		if (state) {
				$addon.removeClass('danger');
				$addon.addClass('success');
				$icon.attr('class', 'glyphicon glyphicon-ok');
		}else{
				$addon.removeClass('success');
				$addon.addClass('danger');
				$icon.attr('class', 'glyphicon glyphicon-remove');
		}
        }
        
        if ($form.find('.input-group-addon.danger').length == 0 &&  document.getElementById('password').value == document.getElementById('password2').value) {
            $form.find('[type="submit"]').prop('disabled', false);
        }else{
            $form.find('[type="submit"]').prop('disabled', true);
        }       
       
        
	});
                         
    
   $('.form-group input[required]').trigger('change');
   
   
});