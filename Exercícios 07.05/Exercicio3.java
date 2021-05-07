package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		int contMaior = 0;

		for(int l = 0; l < 3; l++){
			for(int c = 0; c < 3; c++){

				System.out.print("Insira o valor de " + l + " " + c + ": ");
				matriz [l][c] = ler.nextInt();

				if(matriz[l][c] > 10) {
					contMaior++;
				}
			}
			System.out.println();
		}
		System.out.println("Existem " + contMaior + " numeros maiores que 10 nessa matriz");

	}

}
