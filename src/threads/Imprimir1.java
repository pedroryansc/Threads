package threads;

public class Imprimir1 implements Runnable {
	String str;
	
	public Imprimir1(String str) {
		this.str = str;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.print(str);
			Thread.currentThread();
			Thread.yield();
		}
	}
}
