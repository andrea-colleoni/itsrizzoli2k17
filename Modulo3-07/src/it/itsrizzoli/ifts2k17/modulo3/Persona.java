package it.itsrizzoli.ifts2k17.modulo3;

import java.util.Date;

public class Persona {
	
	// i campi (fields) che costituiscono lo stato
	// devono essere privati
	private int id;
	private String nome;
	private String cognome;
	private Date dataNascita;
	private int altezzaCm;
	
	// info che non ci sono sul DB (ignoriamole...)
	private int eta;
	private String codiceFiscale;
	private boolean patentato;

	// getter del campo nome (accessor)
	public String getNome() {
		return this.nome;
	}
	// setter del campo (mutator)
	public void setNome(String nome) {
		this.nome = nome;
	}
	// a parte la prima lettera da maiuscolizzare il 
	// resto segue camelCase
	public String getCodiceFiscale() {
		return this.codiceFiscale;
	}
	// accessor di un boolean inizia con is
	public boolean isPatentato() {
		return this.patentato;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public void setPatentato(boolean patentato) {
		this.patentato = patentato;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public int getAltezzaCm() {
		return altezzaCm;
	}
	public void setAltezzaCm(int altezzaCm) {
		this.altezzaCm = altezzaCm;
	}
	
}
