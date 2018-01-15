package it.rizzoliviaggi.business;

import java.util.List;

import javax.persistence.EntityManager;

import it.rizzoliviaggi.model.Prenotazione;
import it.rizzoliviaggi.model.Utente;

public class GestoreViaggi {
	
	public List<Prenotazione> elencoDeiMieiViaggi(Utente utente) {
		EntityManager em = JPAUtility.emf.createEntityManager();
		
		return em.createQuery("select p from Prenotazione p where p.prenotante=:utente", Prenotazione.class)
				.setParameter("utente", utente)
				.getResultList();
	}
	
	public boolean nuovaPrenotazione() {
		return false;
	}

}
