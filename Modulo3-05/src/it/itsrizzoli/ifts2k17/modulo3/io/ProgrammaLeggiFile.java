package it.itsrizzoli.ifts2k17.modulo3.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ProgrammaLeggiFile {

	public static void main(String[] args) throws Exception {
		// creo un oggetto di classe File che rappresenta un percorso sul disco
		File f = new File("C:/Users/andre/Desktop"
				+ "/Temp/Corsi/AFOL2017/AndroidWebIoT/Modulo3/file.txt");

		// costruisco un FileReader a partire dalla definizione del mio file
		FileReader fr = new FileReader(f);
		// ho bisogno di un array di caratteri (buffer) dove mettere il contenuto
		// del file
		char[] cbuf = new char[(int)f.length()];
		// leggo il file e metto il suo contenuto in cbuf
		// leggo a partire da 0 fino a f.length() (cioè tutto il file)
		fr.read(cbuf, 0, (int)f.length());
		// chiudo il file
		fr.close();
		
		String stringa = new String(cbuf);
		System.out.println(stringa);
	}

}
