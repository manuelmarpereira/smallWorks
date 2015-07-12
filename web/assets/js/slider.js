

    $(function() {
        $( "#slider-range" ).slider({
            range: true,
            min: 0.01,
            max: 510,
            step: 10,
            values: [ 0, 510 ],
            slide: function( event, ui ) {
                
                $( "#amount_low" ).val(ui.values[ 0 ].toFixed(2)-0.01);
                $( "#amount_high" ).val(ui.values[ 1 ].toFixed(2) );
                
            
            }
            });
    
        
        });