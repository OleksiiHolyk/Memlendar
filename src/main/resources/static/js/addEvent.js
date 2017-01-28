/**
 * Created by Oleksii on 29.01.2017.
 */
$(document).ready(function () {

        $('.monthly-day').each(function () {
            if ($(this).data('number')==14){
                $(this).css({'background-color':'deeppink'})
            }
        });


});