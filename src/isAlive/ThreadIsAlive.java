package isAlive;

public class ThreadIsAlive extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		try {
			sleep(100);
		} catch(InterruptedException e) {
			System.exit(0);
		}
	}
}