package it.itsrizzoli.ifts2k17.net;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class NetServer2 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(11111);
		System.out.println("Server avviato in attesa di connessioni...");
		Socket s = ss.accept();
		System.out.println("è arrivato un client");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = br.readLine();
		System.out.println(str);
		
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		pw.println("Ciao io sono il server Java");
	}

}
