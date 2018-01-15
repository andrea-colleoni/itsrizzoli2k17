package it.rizzoliviaggi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Disponibilita {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDisponibilita;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Struttura struttura;
	
	@OneToMany(mappedBy="disponibilita", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Prenotazione> prenotazione;

	public List<Prenotazione> getPrenotazione() {
		return prenotazione;
	}

	public void setPrenotazione(List<Prenotazione> prenotazione) {
		this.prenotazione = prenotazione;
	}

	public int getIdDisponibilita() {
		return idDisponibilita;
	}

	public void setIdDisponibilita(int idDisponibilita) {
		this.idDisponibilita = idDisponibilita;
	}

	public Struttura getStruttura() {
		return struttura;
	}

	public void setStruttura(Struttura struttura) {
		this.struttura = struttura;
	}
	
	
}
