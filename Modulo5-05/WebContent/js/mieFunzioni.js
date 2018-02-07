/*
function clickParagrafo() {
	console.log('mi hai cliccato!');
	
	var p = document.getElementById('par1');
	p.innerHTML = 'modificato!!!';
}
*/

$('#bottone').click(function () {  // passo una funzione anonima alla funzione click()
	console.log($('#par1').html());  // lettura del contenuto
	$('#par1').html('modificato!!!'); // modifica del contenuto
	
	$('h3').toggle(500);
	
	$('p').addClass('rosso');
});