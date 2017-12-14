package it.itsrizzoli.ifts2k17.net;

public class MultiThreadSenzaClasseAggiuntiva {

	public static void main(String[] args) throws InterruptedException {
		MultiThreadSenzaClasseAggiuntiva mt = new MultiThreadSenzaClasseAggiuntiva();
		
		// anonymous class
		// è l'implementazione in loco di un'interfaccia
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				try {
					mt.metodoLungo("1");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		// lambda expression
		// implementazione in loco di un'interfaccia funzionale (con un solo metodo)
		Runnable r2 = () -> {
			try {
				mt.metodoLungo("2");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		// lambda expression funziona da java 1.8 in poi
		Runnable r3 = () -> {
			try {
				mt.metodoLungo("3");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();

	}
	
	public void metodoLungo(String id) throws InterruptedException {
		System.out.println(id + ": inizio...");
		//attesa
		Thread.sleep(2000); // dorme per 2 secondi
		System.out.println(id + ": fine.");
	}

}
