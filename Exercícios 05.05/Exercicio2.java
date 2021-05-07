package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int dias, resultadoAnos, resultadoMeses;

		System.out.println("Digite sua idade em dias: ");
		dias = ler.nextInt();

		resultadoAnos = dias / 365;
		resultadoMeses = dias /30;

		System.out.println("Você tem " + resultadoAnos + " anos!");
		System.out.println("\nVocê tem " + resultadoMeses + " meses!");

	}

}
