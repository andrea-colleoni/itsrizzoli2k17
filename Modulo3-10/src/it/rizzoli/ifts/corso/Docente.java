package it.rizzoli.ifts.corso;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Docente {
	
	@Id
	private String codiceFiscale;
	private String nome;
	private String cognome;
	
	@OneToMany(mappedBy="docente", cascade=CascadeType.ALL)
	private List<Corso> corsi;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Materia> materie;
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
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
	public List<Corso> getCorsi() {
		return corsi;
	}
	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}
	public List<Materia> getMaterie() {
		return materie;
	}
	public void setMaterie(List<Materia> materie) {
		this.materie = materie;
	}

}
