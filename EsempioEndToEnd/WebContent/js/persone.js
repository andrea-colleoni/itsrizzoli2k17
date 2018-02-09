
$.ajax({
	url: 'https://raw.githubusercontent.com/matteocontrini/comuni-json/master/comuni.json',
	method: 'get'
})
.done(function(comuni) {
	$('#tblcomuni').DataTable( {
        data: comuni,
        columns: [
            { title: "Nome", data: 'nome' },
            { title: "Regione", data: 'regione.nome' },
            { title: "Provincia", data: 'provincia.nome' }
        ]
    } );
});


/*
$.ajax({
	url: 'elencoPersone',
	method: 'get'
})
.done(function(persone) {
	$('#tblPersone').DataTable( {
        data: persone,
        columns: [
            { title: "Nome", data: 'nome' },
            { title: "Cognome", data: 'cognome' }
        ]
    } );
});
*/
