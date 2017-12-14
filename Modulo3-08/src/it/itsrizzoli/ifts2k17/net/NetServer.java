package it.itsrizzoli.ifts2k17.net;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class NetServer {

	List<PrintWriter> pws;

	public static void main(String[] args) {
		try {
			NetServer ns = new NetServer();

			// per costruire un ServerSocket, la porta TCP che
			// scelgo non deve essere già utilizzata
			ServerSocket server = new ServerSocket(11000);
			System.out.println("Attesa connessione sulla porta 11000");
			ns.pws = new ArrayList<PrintWriter>();
			while (true) {
				Socket s = server.accept();
				ns.pws.add(new PrintWriter(s.getOutputStream()));
				Runnable chat = () -> ns.chat(s);
				new Thread(chat).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void chat(Socket socket) {
		System.out.println("Connessione da " + socket.getRemoteSocketAddress());

		// scrivo (mando bytes) al client remoto
		PrintWriter pw;
		BufferedReader br = null;
		String nick = "anonimo";
		
		try {
			if(!socket.isClosed()) {
				pw = new PrintWriter(socket.getOutputStream());
	
				pw.println("Buongiorno!");
				pw.print("Inserisci un nome da usare in chat (nick): ");
				pw.flush();
	
				// leggo (ricevo bytes) dal client remoto
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				nick = br.readLine();
				pw.println("Grazie " + nick + ", ora puoi iniziare a chattare.");
				pw.flush();
			}
			if(!socket.isClosed() && br != null) {
				String datiInArrivo = br.readLine();
				while (!"esci".equals(datiInArrivo)) {
					scriviMessaggio("[" + nick + "] > " + datiInArrivo);
					if(!socket.isClosed() && br != null)
						datiInArrivo = br.readLine();
					else
						break;
				}
			}
			scriviMessaggio("# mi spiace che vai via...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void scriviMessaggio(String messaggio) {
		if (!"null".equals(messaggio)) {
			for (PrintWriter pw : pws) {
				if (pw != null && !pw.checkError()) {
					pw.println(messaggio);
					pw.flush();
				}
			}
		}
	}

}
