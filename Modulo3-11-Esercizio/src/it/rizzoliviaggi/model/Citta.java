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
public class Citta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCitta;
	
	@Column(nullable=false)
	private String nome;
	@JoinColumn(nullable=false)
	@ManyToOne(cascade=CascadeType.ALL)
	private Paese paese;
	
	@OneToMany(mappedBy="citta", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Struttura> strutture;

	public int getIdCitta() {
		return idCitta;
	}

	public void setIdCitta(int idCitta) {
		this.idCitta = idCitta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Paese getPaese() {
		return paese;
	}

	public void setPaese(Paese paese) {
		this.paese = paese;
	}

	public List<Struttura> getStrutture() {
		return strutture;
	}

	public void setStrutture(List<Struttura> strutture) {
		this.strutture = strutture;
	}

	
}
