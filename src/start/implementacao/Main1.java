package start.implementacao;

public class Main1 {
	public static void main(String[] args) {
		// Passa a instância de MinhaThread1 (que implementa Runnable) como parâmetro do construtor da Thread
		new Thread(new MinhaThread1()).start();
	}
}
