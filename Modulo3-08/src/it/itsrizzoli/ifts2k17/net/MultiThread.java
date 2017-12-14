package it.itsrizzoli.ifts2k17.net;

public class MultiThread {

	public static void main(String[] args) throws InterruptedException {
		// esecuzione di metodi sincroni (no multi thread)
//		MultiThread mt = new MultiThread();
//		mt.metodoLungo("1");
//		mt.metodoLungo("2");
//		mt.metodoLungo("3");
		
		// esecuzione multithread con classe che implementa Runnable 
//		ClasseRunnable cr1 = new ClasseRunnable();
//		cr1.id = "1";
//		cr1.metodoLungo();
//		ClasseRunnable cr2 = new ClasseRunnable();
//		cr2.id = "2";
//		cr2.metodoLungo();
//		ClasseRunnable cr3 = new ClasseRunnable();
//		cr3.id = "3";
//		cr3.metodoLungo();
		
		// esecuzione multithread con classe che estende Thread
//		Thread t1 = new Thread(cr1);
//		Thread t2 = new Thread(cr2);
//		Thread t3 = new Thread(cr3);
//		t1.start();
//		t2.start();
//		t3.start();
		
		EstensioneThread t1 = new EstensioneThread();
		t1.id = "1";
		EstensioneThread t2 = new EstensioneThread();
		t2.id = "2";
		EstensioneThread t3 = new EstensioneThread();
		t3.id = "3";
		t1.start();
		t2.start();
		t3.start();
	}
	
	

}
