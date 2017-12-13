package it.itsrizzoli.ifts2k17.collezioni;

public class Mese {
	
	private String nome;
	
	private String nomeInglese;
	
	private String stagione;

	@Override
	public String toString() {
		return "Mese [nome=" + nome + ", nomeInglese=" + nomeInglese + ", stagione=" + stagione + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeInglese() {
		return nomeInglese;
	}

	public void setNomeInglese(String nomeInglese) {
		this.nomeInglese = nomeInglese;
	}

	public String getStagione() {
		return stagione;
	}

	public void setStagione(String stagione) {
		this.stagione = stagione;
	}
	
	

}
