package it.rizzoli.ifts2k17.corso;

import java.util.Date;

public class Corso {
	
	private int idCorso;
    private String titolo;
    private String descrizione;
    private Date dataInizio;
    private int postiDisponibili;
    private int oreComplessive;
    
	public int getIdCorso() {
		return idCorso;
	}
	public void setIdCorso(int idCorso) {
		this.idCorso = idCorso;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Date getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}
	public int getPostiDisponibili() {
		return postiDisponibili;
	}
	public void setPostiDisponibili(int postiDisponibili) {
		this.postiDisponibili = postiDisponibili;
	}
	public int getOreComplessive() {
		return oreComplessive;
	}
	public void setOreComplessive(int oreComplessive) {
		this.oreComplessive = oreComplessive;
	}
	@Override
	public String toString() {
		return "Corso [idCorso=" + idCorso + ", titolo=" + titolo + ", descrizione=" + descrizione + ", dataInizio="
				+ dataInizio + ", postiDisponibili=" + postiDisponibili + ", oreComplessive=" + oreComplessive + "]";
	}
    
    
}
