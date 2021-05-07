package br.com.generation.exercicios;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, r, s;
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextDouble();

		System.out.println("Digite o valor de B: ");
		b = ler.nextDouble();

		System.out.println("Digite o valor de C: ");
		c = ler.nextDouble();

		r = Math.pow((a+b),2);
		s = Math.sqrt((b+c));
		d = (r + s) / 2;

		System.out.println("O valor de D é " + d);
	}
}
