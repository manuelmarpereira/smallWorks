

 <link href="${pageContext.request.contextPath}/assets/css/feedback-give-stars.css" rel="stylesheet" type="text/css"/> 
       

<span class="rating">

    <label id="0" onclick="changeText(this);" class="rating-star"></label>

    <label id="1" onclick="changeText(this);" class="rating-star"></label>

    <label id="2" onclick="changeText(this);" class="rating-star"></label>

    <label id="3" onclick="changeText(this);"  class="rating-star"></label>

    <label id="4" onclick="changeText(this);"  class="rating-star"></label>

    <label id="5" onclick="changeText(this);" class="rating-star"></label>

    <label id="6" onclick="changeText(this);"  class="rating-star"></label>

    <label id="7" onclick="changeText(this);" class="rating-star"></label>

    <label id="8" onclick="changeText(this);" class="rating-star"></label>

    <label id="9" onclick="changeText(this);"  class="rating-star"></label>
</span>
    



<script>
function changeText(star) { 
    for (var i = 0; i <=9; i++) { 
      
        $('#'+i).addClass('rating-star');
        $('#'+i).removeClass('rating-star-show');
        
       
  
}
    for (var x = 0; x <=star.id; x++) { 
       $('#'+x).addClass('rating-star-show');
         $('#'+x).removeClass('rating-star');
     
  document.getElementById("feedback").value =x+1;
}
}
</script>

