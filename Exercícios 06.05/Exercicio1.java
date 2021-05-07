package br.com.generation.exercicios;

public class Exercicio1 {

	public static void main(String[] args) throws InterruptedException {
		
		int i;
		
		for(i = 1000; i<=1999; i++) {
			if(i%11==5) {
				System.out.println(i);
				Thread.sleep(500);
			}
		}
	}

}
