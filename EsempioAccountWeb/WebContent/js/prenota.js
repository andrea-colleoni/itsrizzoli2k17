$('#btnPrenota').click(function(e) {
	e.preventDefault();
	var prenotazione = {
			ristorante: $('#selRisto').val(),
			data: $('#dtData').val(),
			ora: $('#dtOra').val(),
			coperti: $('#numCoperti').val()
	}
	
	console.log(JSON.stringify(prenotazione));
	
	$.ajax({
		url: 'prenotazione',
		method: 'post',
		data: JSON.stringify(prenotazione)
	})
	.done(function(risp) {

	});
});