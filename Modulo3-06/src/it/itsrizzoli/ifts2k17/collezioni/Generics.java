package it.itsrizzoli.ifts2k17.collezioni;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Generics {
	
	public static void main(String[] args) {
		List<String> elenco = new ArrayList<String>();
		//elenco.add(10);
		elenco.add("Ciao");
		//elenco.add(new Date());
		
		for(int i=0; i < elenco.size(); i++) {
			System.out.println(elenco.get(i));
		}
		
		for(String el : elenco) {
			el.toCharArray();
		}
		
	}

}
