package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int segundos, minutos, horas, totalSegundos, sobraHoras, sobraMinutos;

		System.out.println("Digite a quantidade de tempo em segundos: ");
		totalSegundos = ler.nextInt();

		horas = totalSegundos / 3600;
		sobraHoras = totalSegundos - (horas * 3600);
		minutos = sobraHoras / 60;
		segundos = sobraHoras - (minutos * 60);
		
		System.out.println("A duração do evento foi de " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
	}
}
