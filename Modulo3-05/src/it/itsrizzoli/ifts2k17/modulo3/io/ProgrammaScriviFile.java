package it.itsrizzoli.ifts2k17.modulo3.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProgrammaScriviFile {

	public static void main(String[] args) throws IOException {
		// scanner per leggere da tastiera
		Scanner sc = new Scanner(System.in);
		// leggo la parola da tastiera
		String parola = sc.nextLine();
		
		// creo un oggetto di classe File che rappresenta un percorso sul disco
		File f = new File("C:/Users/andre/Desktop"
				+ "/Temp/Corsi/AFOL2017/AndroidWebIoT/Modulo3/file.txt");
		
		// costruisco un FileWriter (che è un Writer che scrive su un
		// OutputStream collegato a un File)
		FileWriter fw = new FileWriter(f);
		// scrivo la parola sul file
		fw.write(parola);
		// chiudo il file
		fw.close();

	}

}
