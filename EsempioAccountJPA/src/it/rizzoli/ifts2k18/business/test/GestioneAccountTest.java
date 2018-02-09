package it.rizzoli.ifts2k18.business.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import it.rizzoli.ifts2k18.business.EsitoOperazione;
import it.rizzoli.ifts2k18.business.GestioneAccount;

public class GestioneAccountTest {

	@Test
	public void testLogin() {
		GestioneAccount ga = new GestioneAccount();
		
		EsitoOperazione eo = ga.registraUtente("test@email", "testpassword", "Test", "Test", "012345");
		assertTrue(eo.isSuccess());
		
		eo = ga.login("test@email", "testpassword");
		assertTrue(eo.isSuccess());
		
		eo = ga.login("test@email", "passworderrata");
		assertTrue(!eo.isSuccess());	
		
		eo = ga.rimuoviUtente("test@email");
		assertTrue(eo.isSuccess());	
	}

	@Test
	public void testRegistraUtente() {
		GestioneAccount ga = new GestioneAccount();
		
		EsitoOperazione eo = ga.registraUtente("test@email", "testpassword", "Test", "Test", "012345");
		assertTrue(eo.isSuccess());
		
		eo = ga.rimuoviUtente("test@email");
		assertTrue(eo.isSuccess());	
	}

}
