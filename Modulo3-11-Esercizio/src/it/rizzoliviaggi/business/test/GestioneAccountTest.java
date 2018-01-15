package it.rizzoliviaggi.business.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import it.rizzoliviaggi.business.GestioneAccount;

public class GestioneAccountTest {

	@Test
	public void testLogin() {
		GestioneAccount ga = new GestioneAccount();
		
		boolean esito = ga.login("nonesiste", "pwderrata");
		assertTrue("Esito login errato", esito == false);
	}

	@Test
	public void testRegistraUtente() {
		GestioneAccount ga = new GestioneAccount();
		
		boolean esito = ga.registraUtente("io@qui.it", "io", "pwd", "Mario", "Rossi");
		assertTrue("Esito registrazione errato", esito == true);
		
		esito = ga.registraUtente("io@qui.it", "diverso", "pwd", "Mario", "Rossi");
		assertTrue("Esito registrazione (con email già esistente) errato", esito == false);
		
		esito = ga.registraUtente("diversa@qui.it", "io", "pwd", "Mario", "Rossi");
		assertTrue("Esito registrazione (con username già esistente) errato", esito == false);
		
		esito = ga.registraUtente("diversa@qui.it", "io", "pwd", null, null);
		assertTrue("Esito registrazione (con nome/cognome null) errato", esito == false);
	}

}
