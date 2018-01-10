package it.rizzoli.ifts.corso;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Corso {
	
	@Id
	// lascio generare i nomi dei campi a JPA
	//@Column(name="id_corso")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCorso;
	@Column(length=45)
    private String titolo;
	@Column(length=200)
    private String descrizione;
    
    @Temporal(TemporalType.DATE)
    //@Column(name="data_inizio")
    private Date dataInizio;
    //@Column(name="posti_disponibili")
    private int postiDisponibili;
    //@Column(name="ore_complessive")
    private int oreComplessive;
    
    @ManyToOne(cascade=CascadeType.ALL)
    private Docente docente;
    
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
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
    
    
}
