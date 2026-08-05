package threads;

public class ThreadJoin1 extends Thread{
	@Override
	public void run() {
		for(int x = 0; x < 3; x++) {
			System.out.print("T1: " + x + " | ");
			Thread.currentThread();
			Thread.yield();
		}
	}
}