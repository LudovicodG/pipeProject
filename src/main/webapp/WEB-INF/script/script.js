function leggiData()
{
    let mese=document.getElementById("meseSel").value;
    let anno=document.getElementById("annoSel").value;
    alert(mese+" "+anno);
    $.ajax({url: "/", success: function(result)
    {
        $("#timelineDiv").html(result);
    }});
}

function leggiAttivita()
{
    alert("Inside leggiAttività method!");
    $.ajax({url: "/", success: function(result)
    {
        $("#attivita").html(result);
    }});
}

function leggiDipendenti()
{
    alert("Inside leggiDipendenti method!");
    $.ajax({url: "/", success: function(result)
    {
        $("#dipendenti").html(result);
    }});
}

