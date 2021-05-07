package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, resultadoMeses, resultadoDias;

		System.out.println("Digite sua idade em anos: ");
		anos = ler.nextInt();

		resultadoMeses = anos*12;
		resultadoDias = anos*365;

		System.out.println("Você tem " + resultadoMeses + " meses de vida");
		System.out.println("\nVocê tem " + resultadoDias + " dias de vida");
	}
}
