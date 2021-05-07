package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int pessoasCalmas= 0; 
		int mulheresNervosas = 0; 
		int homensAgressivos = 0; 
		int menorCalmo = 0; 
		int totalMaior = 0;
		int cont = 0; 
		int idade;
		char sexo, caracteristica;

		for (cont=0;cont<4;cont++) {
			//informando qual contagem de pessoa o laço está
			System.out.println("Obtendo dados da " + (cont+1) + "ª pessoa"); 

			System.out.print("Informe a idade: ");
			idade = ler.nextInt();

			System.out.print("Informe o sexo (M - masculino, F - feminino, O - outros): ");
			sexo = ler.next().charAt(0);

			System.out.print("Informe a caracteristica (C - calma, N - nervosa, A- agressiva): ");
			caracteristica = ler.next().charAt(0);

			//contador de pessoas calmas
			if (caracteristica =='C') {
				pessoasCalmas++;
			}

			//contador de mulheres nervosas
			if(sexo=='F' && caracteristica=='N') { 
				mulheresNervosas++;
			}

			//contador de maiores de 40 e nervosas
			if(idade>40 && caracteristica =='N'){
				totalMaior++;
			}

			//contador de homens agressivos
			if(sexo=='M' && caracteristica=='A'){ 
				homensAgressivos++;
			}
			//contador de pessoas menores de 18 e calmas
			if(caracteristica =='C' && idade<18){ 
				menorCalmo++;
			}
		}
		//Imprimir as contagens
		System.out.println("\nTotal de pessoas calmas: " + pessoasCalmas);
		System.out.println("Total de mulheres nervosas: " + mulheresNervosas);
		System.out.println("Total de homens agressivos: " + homensAgressivos); 
		System.out.println("Total de menores de 18 calmos: " + menorCalmo);
		System.out.println("Total de maiores de 40 nervosos: " + totalMaior);
	}

}
