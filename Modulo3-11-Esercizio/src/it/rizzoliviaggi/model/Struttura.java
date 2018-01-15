package it.rizzoliviaggi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Struttura {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idStruttura;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="gestore", nullable=false)
	private Utente gestore;
	
	@Column(nullable=false)
	private String nome;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Citta citta;
	
	@Column(nullable=false)
	private double longitudine;
	@Column(nullable=false)
	private double latitudine;
	
	@Column(nullable=false)
	private int numeroPosti;
	private int numeroStanze;
	private String descrizione;
	private int metriQuadrati;
	
	@Column(nullable=false)
	private float prezzoGiornaliero;
	
	@OneToMany(mappedBy="struttura", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Disponibilita> disponibilita;

	public int getIdStruttura() {
		return idStruttura;
	}

	public void setIdStruttura(int idStruttura) {
		this.idStruttura = idStruttura;
	}

	public Utente getGestore() {
		return gestore;
	}

	public void setGestore(Utente gestore) {
		this.gestore = gestore;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Citta getCitta() {
		return citta;
	}

	public void setCitta(Citta citta) {
		this.citta = citta;
	}

	public double getLongitudine() {
		return longitudine;
	}

	public void setLongitudine(double longitudine) {
		this.longitudine = longitudine;
	}

	public double getLatitudine() {
		return latitudine;
	}

	public void setLatitudine(double latitudine) {
		this.latitudine = latitudine;
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	public int getNumeroStanze() {
		return numeroStanze;
	}

	public void setNumeroStanze(int numeroStanze) {
		this.numeroStanze = numeroStanze;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getMetriQuadrati() {
		return metriQuadrati;
	}

	public void setMetriQuadrati(int metriQuadrati) {
		this.metriQuadrati = metriQuadrati;
	}

	public float getPrezzoGiornaliero() {
		return prezzoGiornaliero;
	}

	public void setPrezzoGiornaliero(float prezzoGiornaliero) {
		this.prezzoGiornaliero = prezzoGiornaliero;
	}

	public List<Disponibilita> getDisponibilita() {
		return disponibilita;
	}

	public void setDisponibilita(List<Disponibilita> disponibilita) {
		this.disponibilita = disponibilita;
	}
	

}
