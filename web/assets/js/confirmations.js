/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

  document.querySelector('#conf-name').onclick = function(){
    swal({
      title: "Are you sure?",
      text: "You want to confirm your changes?",
      type: "success",
      showCancelButton: true,
      confirmButtonClass: 'btn-success',
      confirmButtonText: 'Confirm'
    });
  };

