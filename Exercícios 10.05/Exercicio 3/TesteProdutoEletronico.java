package br.com.exercicio3;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico p1 = new ProdutoEletronico();
		
		p1.setModelo("Samsung Galaxy S8");
		p1.setAno(2017);
		p1.setTamanho(148.9);
		
		ProdutoEletronico p2 = new ProdutoEletronico();
		
		p2.setModelo("Motorola Moto G5S Plus");
		p2.setAno(2018);
		p2.setTamanho(153.5);
		
		p1.ligar();
		p1.desligar();
		p1.reiniciar();
		
		p2.ligar();
		p2.desligar();
		p2.reiniciar();
		
		System.out.println("O modelo do aparelho é: " + p1.getModelo());
		System.out.println("O ano do aparelho é: " + p1.getAno());
		System.out.println("O tamanho do aparelho é de: " + p1.getTamanho() + "mm");
		System.out.println("===================================================");
		System.out.println("\nO modelo do aparelho é: " + p2.getModelo());
		System.out.println("O ano do aparelho é: " + p2.getAno());
		System.out.println("O tamanho do aparelho é de: " + p2.getTamanho() + "mm");
	}

}
