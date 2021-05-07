package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade, contador21 = 0, contador50 = 0;

		System.out.print("Digite a idade: ");
		idade = ler.nextInt();

		while(idade!=-99){
			if(idade<21) {
				contador21++;
			}
			if(idade>50) {
				contador50++;
			}
			System.out.print("Digite a idade (-99 encerra o programa): ");
			idade = ler.nextInt();
		}
		System.out.println("\nO numero de pessoas com menos de 21 anos é: " + contador21);
		System.out.println("O numero de pessoas com mais de 50 anos é: " + contador50);
	}
}

