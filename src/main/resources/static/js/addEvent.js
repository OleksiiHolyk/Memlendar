/**
 * Created by Oleksii on 29.01.2017.
 */
$(document).ready(function () {

    $('#ijk').click(function () {
        $('.monthly-day').each(function () {
            if ($(this).data('number') == 14) {
                $(this).css({'background-color': 'deeppink'}).append('<div>Help people interested in this repository'+'<br>'+'understand your project by adding a README.</div>')
            }
        });
    });


    $("#buttonSubmit").click(function () {
        $.ajax({
            url: "/addEvent",
            dataType: "JSON",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                "eventDate": $("#eventDateInput").val(),
                "eventDescr": $("#eventDescriptionTextarea").val()
            })
        }).done(function (msg) {
            console.log(msg);
            alert("User " + msg.username + " is successfully added. User ID="+msg._links.user.href);
        }).fail(function (jqXHR, textStatus) {
            alert("Request failed: " + textStatus);
        });
    });
});