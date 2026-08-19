package prioridades;

public class AltaPrioridade extends Thread {
	public void run() {
		setPriority(10); // ou (Thread.MAX_PRIORITY)
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Alta prioridade...");
		}
		try {
			sleep(100);
		} catch(InterruptedException e) {
			System.exit(0);
		}
	}
}