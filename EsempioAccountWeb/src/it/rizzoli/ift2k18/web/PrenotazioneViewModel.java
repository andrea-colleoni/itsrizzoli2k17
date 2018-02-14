package it.rizzoli.ift2k18.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrenotazioneViewModel {
	String ristorante;
	String data;
	String ora;
	String coperti;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat stf = new SimpleDateFormat("HH:mm");
	
	public String getRistorante() {
		return ristorante;
	}
	public void setRistorante(String ristorante) {
		this.ristorante = ristorante;
	}
	public Date getDateData() throws ParseException {
		return sdf.parse(data);
	}
	
	public Date getTimeOra() throws ParseException {
		return stf.parse(ora);
	}
	
	public int getNumCoperti() {
		return Integer.parseInt(coperti);
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getOra() {
		return ora;
	}
	public void setOra(String ora) {
		this.ora = ora;
	}
	public String getCoperti() {
		return coperti;
	}
	public void setCoperti(String coperti) {
		this.coperti = coperti;
	}
	
	@Override
	public String toString() {
		return "PrenotazioneViewModel [ristorante=" + ristorante + ", data=" + data + ", ora=" + ora + ", coperti="
				+ coperti + "]";
	}
}
