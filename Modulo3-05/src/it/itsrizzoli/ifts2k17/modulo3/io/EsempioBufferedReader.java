package it.itsrizzoli.ifts2k17.modulo3.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EsempioBufferedReader {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\andre\\Desktop\\Temp\\Corsi\\AFOL2017\\AndroidWebIoT\\Modulo3\\file.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String riga = br.readLine();
		while (riga != null) {
			System.out.println(riga);
			riga = br.readLine();
		}
	}

}
