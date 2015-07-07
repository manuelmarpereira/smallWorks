 function addCommas(nStr)
{
    nStr += '';
    x = nStr.split('.');
    x1 = x[0];
    x2 = x.length > 1 ? '.' + x[1] : '';
    var rgx = /(\d+)(\d{3})/;
    while (rgx.test(x1)) {
        x1 = x1.replace(rgx, '$1' + ',' + '$2');
    }
    return x1 + x2;
}

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