package it.rizzoli.ifts2k18.business;

import javax.persistence.EntityManager;

import it.rizzoli.ifts2k18.Utente;
import it.rizzoli.ifts2k18.util.JPAUtils;

public class GestioneAccount {

	public EsitoOperazione login(String email, String password) {
		EsitoOperazione _return = new EsitoOperazione();
		try {
			EntityManager em = JPAUtils.getInstance().getEm();
			Utente u = em.find(Utente.class, email);
			boolean ok = u != null && u.getPassword().equals(password);
			_return.setSuccess(ok);
			_return.setMessaggio(!ok ? "Accesso fallito" : "Accesso effettuato");
			if (ok)
				_return.setOggettoRisultante(u);
			else
				_return.setOggettoRisultante(null);
		} catch (Exception ex) {
			_return.setSuccess(false);
			_return.setMessaggio("Qualcosa è andato male => " + ex.getMessage());
			_return.setOggettoRisultante(ex);
		}
		return _return;
	}

	public EsitoOperazione registraUtente(String email, String password, String nome, String cognome,
			String numeroTelefono) {
		EsitoOperazione _return = new EsitoOperazione();
		Utente u = new Utente();
		u.setEmail(email);
		u.setPassword(password);
		u.setNome(nome);
		u.setCognome(cognome);
		u.setNumeroTelefono(numeroTelefono);
		_return = registraUtente(u);
		return _return;
	}
	
	public EsitoOperazione registraUtente(Utente nuovoUtente) {
		EsitoOperazione _return = new EsitoOperazione();
		try {
			EntityManager em = JPAUtils.getInstance().getEm();
			Utente u = em.find(Utente.class, nuovoUtente.getEmail());
			if(u != null) {
				_return.setSuccess(false);
				_return.setMessaggio("L'utente esiste già");
				_return.setOggettoRisultante(u);
			} else {				
				em.getTransaction().begin();
				em.persist(nuovoUtente);
				em.getTransaction().commit();
				
				_return.setSuccess(true);
				_return.setMessaggio("Utente creato con successo");
				_return.setOggettoRisultante(nuovoUtente);
			}
		} catch (Exception ex) {
			_return.setSuccess(false);
			_return.setMessaggio("Qualcosa è andato male => " + ex.getMessage());
			_return.setOggettoRisultante(ex);
		}
		return _return;
	}	

	public EsitoOperazione rimuoviUtente(String email) {
		EsitoOperazione _return = new EsitoOperazione();
		try {
			EntityManager em = JPAUtils.getInstance().getEm();
			Utente u = em.find(Utente.class, email);
			if (u != null) {
				em.getTransaction().begin();
				em.remove(u);
				em.getTransaction().commit();
				
				_return.setSuccess(true);
				_return.setMessaggio("Utente eliminato");
				_return.setOggettoRisultante(null);
			} else {
				_return.setSuccess(false);
				_return.setMessaggio("L'utente non esiste");
				_return.setOggettoRisultante(null);
			}
		} catch (Exception ex) {
			_return.setSuccess(false);
			_return.setMessaggio("Qualcosa è andato male => " + ex.getMessage());
			_return.setOggettoRisultante(ex);
		}
		return _return;
	}
}
