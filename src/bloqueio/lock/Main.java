package bloqueio.lock;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {		
		Banheiro banheiro = new Banheiro();

		List<Thread> convidados = new ArrayList<>();
		
		String[] nomes = {"Pedro", "Leon", "Josiscreide", "Darci"};
		
		for(String nome : nomes) {
			Thread convidado = new Thread(new Atividade(banheiro), nome);
			
			convidados.add(convidado);
		}
		
		for(Thread convidado : convidados)
			convidado.start();
	}
}