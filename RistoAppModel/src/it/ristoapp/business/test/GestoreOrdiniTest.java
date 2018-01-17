package it.ristoapp.business.test;

import static org.junit.Assert.*;

import org.junit.Test;

import it.rizzoliviaggi.business.GestoreOrdini;

public class GestoreOrdiniTest {
	
	@Test
	public void simulazioneOrdineAlTavolo() throws Exception {
		GestoreOrdini go = new GestoreOrdini();
		
		// prima cosa creo l'ordine
		int idOrdine = go.nuovoOrdine();
		//poi aggiuno un po' di prodotti
		go.mettiProdottoInOrdine(1, 1, idOrdine);
		go.mettiProdottoInOrdine(2, 2, idOrdine);
		go.mettiProdottoInOrdine(3, 2, idOrdine);
		
		go.modificaQuantita(1, 1, idOrdine);
		
		go.confermaOrdine();
		
		go.paga();
	}

}
