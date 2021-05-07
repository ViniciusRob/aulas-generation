package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int A[] = new int [6]; //criando vetor de 6 posições

		  for(int i=0; i<=5; i++){ //ler os vetores
		     System.out.print("Digite o valor do Vetor "+ (i+1) + ": ");
		     A[i] = ler.nextInt(); 
		 }
		  
		 A[4]=100; //atribuindo 100 a quarta posição do vetor

		 System.out.println("\nResultado: ");

		 for(int i=0; i<=5; i++){
		   System.out.println("Vetor: "+ i + " " + A[i]); //mostrar cada valor do vetor A
		 }

		 System.out.println("\nSoma dos Vetores A[0], A[1] e A[5]: " + (A[0]+A[1]+A[5])); //mostrar a soma dos vetores pedidos
	}

}
