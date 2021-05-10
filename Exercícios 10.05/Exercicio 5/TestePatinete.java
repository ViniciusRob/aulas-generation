package br.com.exercicio5;

public class TestePatinete {

	public static void main(String[] args) {
		
		Patinete p1 = new Patinete();
		
		p1.setModelo("Town 5 XL Oxelo");
		p1.setCor("Preto");
		p1.setPreco(699.99);
		p1.setIdade(12);
		
		Patinete p2 = new Patinete();
		
		p2.setModelo("Foston S08 Pro");
		p2.setCor("Azul");
		p2.setIdade(15);
		p2.setPreco(2198);
		
		p1.acelerar();
		p1.frear();
		
		p2.acelerar();
		p2.frear();
	
		System.out.println("O modelo do patinete �: " + p1.getModelo());
		System.out.println("A cor do patinete �: " + p1.getCor());
		System.out.println("A idade minima para usar o patinete � de: " + p1.getIdade() + " anos");
		System.out.println("O pre�o do patinete � de R$: " + p1.getPreco());
		System.out.println("====================================================");
		System.out.println("\nO modelo do patinete �: " + p2.getModelo());
		System.out.println("A cor do patinete �: " + p2.getCor());
		System.out.println("A idade minima para usar o patinete � de: " + p2.getIdade() + " anos");
		System.out.println("O pre�o do patinete � de R$: " + p2.getPreco());
	}

}
