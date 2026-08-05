package threads;

public class MainThread {
	public static void main(String[] args) {
		new Thread1().start();
		new Thread2().start();
	}
}