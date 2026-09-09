package bloqueio.sync;

import java.util.Random;

public class Atividade implements Runnable {
	private Banheiro banheiro;
	
	public Atividade(Banheiro banheiro) {
		this.banheiro = banheiro;
	}
	
	@Override
	public void run() {
		Random sorteador = new Random();
		
		// Sorteio do número 0 ou 1
		int numero = sorteador.nextInt(2);
		
		if(numero == 1)
			banheiro.fazNumero1();
		else
			banheiro.fazNumero2();
	}
}
