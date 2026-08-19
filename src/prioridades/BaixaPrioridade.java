package prioridades;

public class BaixaPrioridade extends Thread {
	public void run() {
		setPriority(1); // ou (Thread.MIN_PRIORITY)
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Baixa prioridade...");
		}
		try {
			sleep(100);
		} catch(InterruptedException e) {
			System.exit(0);
		}
	}
}