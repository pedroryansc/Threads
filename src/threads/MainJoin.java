package threads;

public class MainJoin {
	public static void main(String[] args) {
		ThreadJoin1 t1 = new ThreadJoin1();
		ThreadJoin2 t2 = new ThreadJoin2();
		t1.start();
		t2.start();
		
		// A mensagem a seguir pode aparecer antes mesmo do conteúdo das threads terminar,
		// pois o Main também é uma thread.
		System.out.println("Main finalizado");
	}
}