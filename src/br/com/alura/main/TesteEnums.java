package br.com.alura.main;

public class TesteEnums {

	public static void main(String[] args) {
		
		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;
		
		System.out.println(pMin.name());
		System.out.println(pMax.name());
		
		System.out.println(pMin.ordinal());
		System.out.println(pMax.ordinal());
		
		System.out.println(Thread.MAX_PRIORITY);
		
		Thread t = new Thread(() -> System.out.println("rodando . . ."));
		t.setPriority(Thread.MAX_PRIORITY);
		
		t.start();
		
		System.out.println(pMin.getValor());
		System.out.println(pMax.getValor());
		
		//Thread.State.BLOCKED;

	}

}
