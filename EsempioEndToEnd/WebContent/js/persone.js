
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