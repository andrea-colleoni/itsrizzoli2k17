package it.rizzoliviaggi.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPrenotazione;
	
	@JoinColumn(nullable=false)
	@ManyToOne(cascade=CascadeType.ALL)
	private Utente prenotante;
	
	@JoinColumn(nullable=false)
	@ManyToOne(cascade=CascadeType.ALL)
	private Disponibilita disponibilita;
	
	@Column(nullable=false)
	private int numeroPersone;
	
	private boolean confermata;
	private boolean annullata;
	private boolean pagata;
	
	private int giudizio;
	private String feedback;
	public int getIdPrenotazione() {
		return idPrenotazione;
	}
	public void setIdPrenotazione(int idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}
	public Utente getPrenotante() {
		return prenotante;
	}
	public void setPrenotante(Utente prenotante) {
		this.prenotante = prenotante;
	}
	public Disponibilita getDisponibilita() {
		return disponibilita;
	}
	public void setDisponibilita(Disponibilita disponibilita) {
		this.disponibilita = disponibilita;
	}
	public int getNumeroPersone() {
		return numeroPersone;
	}
	public void setNumeroPersone(int numeroPersone) {
		this.numeroPersone = numeroPersone;
	}
	public boolean isConfermata() {
		return confermata;
	}
	public void setConfermata(boolean confermata) {
		this.confermata = confermata;
	}
	public boolean isAnnullata() {
		return annullata;
	}
	public void setAnnullata(boolean annullata) {
		this.annullata = annullata;
	}
	public boolean isPagata() {
		return pagata;
	}
	public void setPagata(boolean pagata) {
		this.pagata = pagata;
	}
	public int getGiudizio() {
		return giudizio;
	}
	public void setGiudizio(int giudizio) {
		this.giudizio = giudizio;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	
}
