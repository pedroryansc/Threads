package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banheiro {
	private Lock lock = new ReentrantLock();
	
	public void fazNumero1() {
		String nome = Thread.currentThread().getName();
		
		lock.lock();
		
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
		
		lock.unlock();
	}
	
	public void fazNumero2() {
		String nome = Thread.currentThread().getName();
		
		lock.lock();
		
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
		
		lock.unlock();
	}
}