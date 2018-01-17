package it.ristoapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import it.ristoapp.beans.IndirizzoEmail;
import it.ristoapp.beans.Utente;

public class Programma {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("RistoAppModel");
		EntityManager em = emf.createEntityManager();
		
		Utente u = new Utente();
		u.setNome("Farncesca");
		u.setCognome("Amarena");
		
		em.getTransaction().begin();
		
		IndirizzoEmail ie = new IndirizzoEmail();
		ie.setUtente(u);
		ie.setEmail("ajhdkja@jsdkj");
		u.getIndirizzi().add(ie);
//		em.persist(ie);
		
		ie = new IndirizzoEmail();
		ie.setUtente(u);
		ie.setEmail("ajdsfsdfkja@jsdkj");
		u.getIndirizzi().add(ie);
//		em.persist(ie);
		
		ie = new IndirizzoEmail();
		ie.setUtente(u);
		ie.setEmail("erqwerwqja@jsewrwerj");
		u.getIndirizzi().add(ie);
//		em.persist(ie);
		

		em.persist(u);
		em.getTransaction().commit();

	}

}
