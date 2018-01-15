package it.rizzoliviaggi.business.test;

import static org.junit.Assert.*;

import org.junit.Test;

import it.rizzoliviaggi.business.GestioneAccount;
import it.rizzoliviaggi.business.GestoreViaggi;

public class GestoreViaggiTest {

	@Test
	public void testElencoDeiMieiViaggi() {
		GestoreViaggi gv = new GestoreViaggi();
		GestioneAccount ga = new GestioneAccount();
		
		boolean esito = ga.registraUtente("io@qui.it", "io", "pwd", "Mario", "Rossi");
		assertTrue("Esito registrazione errato", esito == true);
	
		assertNotNull("Elenco viaggi non funziona", 
				gv.elencoDeiMieiViaggi(ga.utentePerEmailOUsername("io@qui.it")));
	}
	
	@Test
	public void testNuovaPrenotazione() {
		GestoreViaggi gv = new GestoreViaggi();
		boolean esito = gv.nuovaPrenotazione();
		
		assertTrue("Esito registrazione errato", esito == true);
	}

}
