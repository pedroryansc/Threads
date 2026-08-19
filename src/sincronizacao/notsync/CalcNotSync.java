package sincronizacao.notsync;

public class CalcNotSync implements Runnable {
	private int[] vet;
	private String nome;
	private static CalcNotSync_Calc calc = new CalcNotSync_Calc();
	// O atributo estático pertence à classe, não ao objeto. Por isto, a soma feita por
	// threads diferentes ao mesmo tempo pode gerar um resultado errado.
	
	public CalcNotSync(String nome, int[] vet) {
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