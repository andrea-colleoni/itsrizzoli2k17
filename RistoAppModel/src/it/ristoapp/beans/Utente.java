package it.ristoapp.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tabella_utenti")
public class Utente {
	
	public Utente() {
		indirizzi = new ArrayList<>();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUtente;
	private String nome;
	@Column(name="pippopippo", length=50, nullable=false)
	private String cognome;
	
	@OneToMany(mappedBy="utente", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<IndirizzoEmail> indirizzi;
	
	
	public int getIdUtente() {
		return idUtente;
	}
	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}
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
	public List<IndirizzoEmail> getIndirizzi() {
		return indirizzi;
	}
	public void setIndirizzi(List<IndirizzoEmail> indirizzi) {
		this.indirizzi = indirizzi;
	}

}
