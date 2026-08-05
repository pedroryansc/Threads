package threads;

public class Imprimir implements Runnable {
	String str;
	
	public Imprimir(String str) {
		this.str = str;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.print(str);
		}
	}
}
