// Morris.js Charts sample data for SB Admin template

// Morris.js Charts sample data for SB Admin template

$(function() {

    // Bar Chart
    Morris.Bar({
        element: 'morris-bar-chart',
        data: [{
            month: 'Jan',
            euro: 136
        }, {
            month: 'Fev',
            euro: 137
        }, {
            month: 'Mar',
            euro: 275
        }, {
            month: 'Apr',
            euro: 380
        }, {
            month: 'May',
            euro: 655
        }, {
            month: 'Jun',
            euro: 3000
        }, {
            month: 'Jul',
            euro: 20
        }, {
            month: 'Aug',
            euro: 1571
        },{
            month: 'Sep',
            euro: 1571
        }, {
            month: 'Oct',
            euro: 1571
        },{
            month: 'Nov',
            euro: 1571
        },{
            month: 'Dec',
            euro: 1571
        }],
        xkey: 'month',
        ykeys: ['euro'],
        labels: ['Cache (€)'],
        barRatio: 0.4,
        xLabelAngle: 35,
        hideHover: 'auto',
        resize: true
    
    });


});