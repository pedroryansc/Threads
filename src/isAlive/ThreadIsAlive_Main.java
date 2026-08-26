package isAlive;

public class ThreadIsAlive_Main {
	public static void main(String[] args) {
		ThreadIsAlive ta = new ThreadIsAlive();
		
		ta.start();
		
		while(ta.isAlive()) {
			System.out.println("Thread ativa!");
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread inativa.");
	}
}