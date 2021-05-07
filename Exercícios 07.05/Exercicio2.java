package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero[]  = new int [6];

		int contImp = 0, somaPar = 0;

		for (int i = 0; i < 6; i++) {

			System.out.print("Insira um numero inteiro: ");
			numero[i] = ler.nextInt();

			if (numero[i] % 2 == 0) {
				somaPar += numero[i];
			}

			if(numero[i] % 2 != 0) {
				contImp++;
			}      
		}
		System.out.println("\nSoma dos números pares: " + somaPar);

		System.out.println("Quantidade de ímpares digitados: " + contImp);  
	}

}
