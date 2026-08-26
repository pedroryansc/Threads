package join;

public class MainJoin1 {
	public static void main(String[] args) {
		ThreadJoin1 t1 = new ThreadJoin1();
		ThreadJoin2 t2 = new ThreadJoin2();
		t1.start();
		t2.start();
		
		try {
			// O Join faz com que a thread chamadora (Main) aguarde a execução das threads secundárias
			t1.join();
			t2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main finalizado");
	}
}