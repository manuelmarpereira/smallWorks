<%-- 
    Document   : stars
    Created on : 5/jun/2015, 19:01:31
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
           
            .rating {
                overflow: hidden;
                display: inline-block;
            }
            .rating-input {
                position: absolute;
                left: 0;
                top: -50px;
            }
            .rating-star {        
                display: block;
                float: right;        
                width: 16px;
                height: 16px;
                background: url('http://kubyshkin.ru/samples/star-rating/star.png') 0 -16px;
            }
            .rating-star:hover,
            .rating-star:hover ~ .rating-star {
                background-position: 0 0;
            }


        </style>
    </head>
    <body>
        <span class="rating">
             
               <label id="rating-input-1-1" class="rating-star"></label>
                
               <label id="rating-input-1-2" class="rating-star"></label>
               
               <label id="rating-input-1-3" class="rating-star"></label>
                
               <label id="rating-input-1-4" class="rating-star"></label>
               
               <label id="rating-input-1-5" class="rating-star"></label>
               
               <label id="rating-input-1-6" class="rating-star"></label>
               
               <label id="rating-input-1-7" class="rating-star"></label>
              
               <label id="rating-input-1-8" class="rating-star"></label>
               
               <label id="rating-input-1-9" class="rating-star"></label>
               
               <label id="rating-input-1-10" class="rating-star"></label>
           </span>
    </body>
</html>
