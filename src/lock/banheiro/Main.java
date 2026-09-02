package lock.banheiro;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		String[] nomes = {"Pedro", "Léo", "Josiscreide", "Darci"};
		List<Pessoa> pessoas = new ArrayList<>();
		
		Random sorteador = new Random();
		
		int numero;
		for(String nome : nomes) {
			numero = sorteador.nextInt(3);
			
			Pessoa pessoa = new Pessoa(nome, numero);
			
			pessoas.add(pessoa);
		}
		
		for(Pessoa pessoa : pessoas) {
			pessoa.start();
		}
	}
}