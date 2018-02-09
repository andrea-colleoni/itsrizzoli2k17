$('#btnLogin').click(function(e) {
	// 1. impedire al form HTML di fare submit
	e.preventDefault();
	$.ajax({
		url: 'login',
		method: 'post',
		data: $('#frmLogin').serialize()
	})
	.done(function(esito){
		console.log(esito);
		if(esito.success) {
			localStorage.setItem('utente', JSON.stringify(esito.oggettoRisultante));
			// andare alla pagina areariservata
			location.href ='areariservata.html';
		} else {
			$('#pnlErrLogin').addClass('show');
		}
	})
	.fail(function() {
		console.error('qualcosa è andato storto.')
	});
	
});