package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, d, e, f, x, y;

		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = ler.nextInt();
		
		System.out.println("Digite o valor de D: ");
		d = ler.nextInt();
		
		System.out.println("Digite o valor de E: ");
		e = ler.nextInt();
		
		System.out.println("Digite o valor de F: ");
		f = ler.nextInt();

		x = (c*e)-(b*f) / (a*e) - (b*d);
		y = (a*f) - (c*d) / (a*e) - (b*d);

		System.out.println("Os valores de X e Y s�o, respectivamente, " + x + " e " + y);
	}
}
