package it.itsrizzoli.ifts2k17.net;

public class EstensioneThread extends Thread {

	String id;
	
	public void metodoLungo() throws InterruptedException {
		System.out.println(id + ": inizio...");
		//attesa
		Thread.sleep(2000); // dorme per 2 secondi
		System.out.println(id + ": fine.");
	}

	@Override
	public void run() {
		try {
			metodoLungo();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
