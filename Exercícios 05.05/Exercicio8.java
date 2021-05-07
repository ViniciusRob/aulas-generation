package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double custoFab, custoCons, porcDist = 28.0, percenImp = 45.0, distribuidor, valorImp;
		
		System.out.println("Informe o custo de fábrica de um carro novo: ");
		custoFab = ler.nextDouble();

		valorImp = (custoFab * percenImp) / 100;
		distribuidor = ((custoFab * percenImp) * porcDist) / 1000000;
		custoCons = (distribuidor + valorImp);

		System.out.println("O custo ao consumidor de um carro novo é: " + custoCons);
	}

}
