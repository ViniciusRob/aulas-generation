package br.com.generation.exercicios;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double x1, x2, y1, y2, d;

		System.out.println("Insira o valor de X1: ");
		x1 = ler.nextDouble();

		System.out.println("Insira o valor de X2: ");
		x2 = ler.nextDouble();

		System.out.println("Insira o valor de Y1: ");
		y1 = ler.nextDouble();

		System.out.println("Insira o valor de Y1: ");
		y2 = ler.nextDouble();

		d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));

		System.out.println("O valor é igual a: " + d);
	}

}
