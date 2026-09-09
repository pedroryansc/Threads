package bloqueio.sync;

public class Banheiro {
	
	public void fazNumero1() {
		String nome = Thread.currentThread().getName();
		
		synchronized(this) {
			System.out.println(nome + " entrou no banheiro");
			System.out.println(nome + " está iniciando atividade rápida");
			
			try {
				Thread.sleep(3000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(nome + " terminou atividade rápida.");
			System.out.println(nome + " deu descarga.");
			System.out.println(nome + " lavou as mãos.");
			System.out.println(nome + " saiu do banheiro.");
		}
	}
	
	public void fazNumero2() {
		String nome = Thread.currentThread().getName();
		
		synchronized(this) {
			System.out.println(nome + " entrou no banheiro");
			System.out.println(nome + " está iniciando atividade demorada");
			
			try {
				Thread.sleep(6000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(nome + " terminou atividade demorada.");
			System.out.println(nome + " deu descarga.");
			System.out.println(nome + " lavou as mãos.");
			System.out.println(nome + " saiu do banheiro.");
		}
	}
}