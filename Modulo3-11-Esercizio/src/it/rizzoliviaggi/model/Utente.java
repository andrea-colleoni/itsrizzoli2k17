package it.rizzoliviaggi.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Utente {
	
	@Column(nullable=false)
	private String nome;
	@Column(length= 20, nullable=false)
	private String cognome;
	@Column(nullable=false)
	private String username;
	@Column(length= 20, nullable=false)
	private String password;
	
	@Id
	private String email;
	private String numeroTelefono;
	@Temporal(TemporalType.DATE)
	private Date dataIscirzione;
	private boolean attivo;
	
	@OneToMany(mappedBy="gestore", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Struttura> strutture;
	@OneToMany(mappedBy="prenotante", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Prenotazione> prenotazioni;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public Date getDataIscirzione() {
		return dataIscirzione;
	}
	public void setDataIscirzione(Date dataIscirzione) {
		this.dataIscirzione = dataIscirzione;
	}
	public boolean isAttivo() {
		return attivo;
	}
	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}
	public List<Struttura> getStrutture() {
		return strutture;
	}
	public void setStrutture(List<Struttura> strutture) {
		this.strutture = strutture;
	}
	public List<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	public void setPrenotazioni(List<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}

	
}
