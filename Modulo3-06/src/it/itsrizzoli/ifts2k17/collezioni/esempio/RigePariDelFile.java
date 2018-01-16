package it.itsrizzoli.ifts2k17.collezioni.esempio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RigePariDelFile {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\andre\\Desktop\\Temp\\"
				+ "Corsi\\AFOL2017\\AndroidWebIoT\\"
				+ "Modulo3\\eclipse\\Modulo3-06\\"
				+ "src\\esempio.txt");
		ArrayList<String> righeLette = new ArrayList<String>();
		if (f.exists() && f.isFile()) {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String riga = br.readLine();
			while(riga != null) {
				righeLette.add(riga);
				riga = br.readLine();
			}
		}
		for(int i = 0; i < righeLette.size(); i++)
			if (i % 2 != 0)
				System.out.println(righeLette.get(i));
	}

}
