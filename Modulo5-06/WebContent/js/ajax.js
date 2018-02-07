$('#btnAjax1').click(function() {
	console.log('pulsante funziona');
	$.ajax({
		url: 'prova.txt',
		method: 'get'
	})
	.done(function(risposta) {
		console.log(risposta);
	})
	.fail(function() {
		console.error('qualcosa è andato storto');
	});
	console.log('dopo ajax');
});

$('#btnAjax2').click(function() {
	$.ajax({
		url: 'prova-frammento.html',
		method: 'get'
	})
	.done(function(risposta) {
		$('#par').html(risposta);
	});
});

$('#btnAjax3').click(function() {
	$.ajax({
		url: 'oggetto.json',
		method: 'get'
	})
	.done(function(persone) {
		// <li>Anna Rossi</li>
		console.log(persone);
		persone.forEach(function(p) {
			var stringa = '<li>' + p.nome + ' ' + p.cognome + '</li>';
			$('#elencoPersone').append(stringa);
		})
	});
});

$('#btnAjax4').click(function() {
	$.ajax({
		url: 'AjaxServlet',
		method: 'get'
	})
	.done(function(ogg) {
		console.log(ogg);
	});
});