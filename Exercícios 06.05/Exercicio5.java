package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero;
		int soma = 0;

		do {
			System.out.print("Digite um número: ");
			numero = ler.nextInt();

			soma += numero;
		}
		while(numero != 0);

		System.out.print("\nA soma dos valores é: " + soma);

	}
}

