var utente = localStorage.getItem('utente');

if (utente) {
	$('#lblBenvenuto').show();
	$('#lblAnonimo').hide();
	utente = JSON.parse(utente);
	$('#lblUtente').html(utente.nome + ' ' + utente.cognome);
} else {
	$('#lblBenvenuto').hide();
	$('#lblAnonimo').show();
}

$('#btnLogout').click(function() {
	localStorage.removeItem('utente');
	location.href = 'index.html';
});