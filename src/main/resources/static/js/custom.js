/**
 * Created by OleksiiHolyk on 12.02.2017.
 */


$(document).ready(function () {
   

    $('.fc-row').each(function () {
        $(this).hide();
    });

    $('.fc-today').parents('.fc-row').show().css({"height": "50%"});
    $('.fc-today').parents('.fc-row').prev().show().css({"height": "50%"});

});
