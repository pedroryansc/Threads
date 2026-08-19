package sincronizacao.sync;

public class CalcSync implements Runnable {
	private int[] vet;
	private String nome;
	private static CalcSync_Calc calc = new CalcSync_Calc();
	
	public CalcSync(String nome, int[] vet) {
		this.nome = nome;
		this.vet = vet;
		new Thread(this, nome).start();
	}
	
	public void run() {
		System.out.println("Início de " + nome);
		int soma = calc.somaVet(vet);
		System.out.println("Fim de " + nome + " - Soma = " + soma);
	}
}