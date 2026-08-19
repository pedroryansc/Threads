package prioridades;

public class Main {
	public static void main(String[] args) {
		BaixaPrioridade threadBaixa = new BaixaPrioridade();
		AltaPrioridade threadAlta = new AltaPrioridade();
		
		System.out.println("Iniciando as threads...");
		
		threadBaixa.start();
		threadAlta.start();
		
		Thread.currentThread();
		Thread.yield(); // Permite o escalonador trocar para a execução de outra thread
		// Ou seja, o comando "yield" não realiza a troca diretamente
		
		System.out.println("Main finalizado.");
	}
}