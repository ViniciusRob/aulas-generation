package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, i, contPar = 0, contImp = 0;
		
		for(i = 0; i <10; i++) {
			
			System.out.print("Insira o " + (i+1) + "º numero: ");
			num = ler.nextInt();
			
			if(i%2==0) {
				contPar++;
			}
			else{
				contImp++;
			}
		}
		System.out.println("A quantidade de numeros pares é: " + contPar);
		System.out.println("A quantidade de numeros impares é: " + contImp);
	}
}
