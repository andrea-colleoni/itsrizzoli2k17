package rizzoli.web;

import java.util.Date;

public class Persona {
	
	private String nome;
	private String cognome;
	private Date dataNascita;
	private int altezzaInCm;
	
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
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public int getAltezzaInCm() {
		return altezzaInCm;
	}
	public void setAltezzaInCm(int altezzaInCm) {
		this.altezzaInCm = altezzaInCm;
	}

}
