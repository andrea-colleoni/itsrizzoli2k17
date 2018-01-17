package it.ristoapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import it.ristoapp.beans.IndirizzoEmail;
import it.ristoapp.beans.Utente;

public class Programma2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("RistoAppModel");
		EntityManager em = emf.createEntityManager();
		
		Utente u = em.find(Utente.class, 1);
		
		for(IndirizzoEmail ie : u.getIndirizzi()) {
			System.out.println(ie.getEmail());
		}
	}

}
