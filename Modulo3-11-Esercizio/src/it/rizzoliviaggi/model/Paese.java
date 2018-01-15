package it.rizzoliviaggi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Paese {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPaese;
	
	@Column(nullable=false)
	private String nome;
	
	@OneToMany(mappedBy="paese", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Citta> citta;

	public int getIdPaese() {
		return idPaese;
	}

	public void setIdPaese(int idPaese) {
		this.idPaese = idPaese;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Citta> getCitta() {
		return citta;
	}

	public void setCitta(List<Citta> citta) {
		this.citta = citta;
	}

	
}
