package banheiroSync;

public class Pessoa extends Thread {
	private String nome;
	private int numero;
	private static boolean banheiroOcupado = false;
	
	private static final long TEMPO_RAPIDO = 5000;
	private static final long TEMPO_DEMORADO = 5000;
	
	public Pessoa(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public synchronized void run() {
		// Verifica se o banheiro está ocupado. Se sim, aguarda
		synchronized(this) {
			while(banheiroOcupado) {
				try {
					wait();
				} catch(InterruptedException e) {
					System.out.print("Aconteceu alguma coisa com o banheiro: ");
					e.printStackTrace();
				}
			}
		}
		
		// Ocupa o banheiro quando estiver liberado
		banheiroOcupado = true;
		System.out.println(nome + " entrou no banheiro.");
		
		try {
			if(numero == 1) {
				System.out.println("Iniciando atividade rápida.");
				Thread.sleep(TEMPO_RAPIDO);
			} else {
				System.out.println("Iniciando atividade demorada.");
				Thread.sleep(TEMPO_DEMORADO);
			}
			
			System.out.println("Atividade finalizada.");
			
			System.out.println("Lavando as mãos, dando descarga... (Não necessariamente nesta ordem)");
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized(this) {
			banheiroOcupado = false;
		}
		System.out.println(nome + " saiu do banheiro.");
		notifyAll();
	}
}