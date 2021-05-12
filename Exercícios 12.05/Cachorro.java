package br.com.exercicio;

public class Cachorro extends Animal implements InterfaceAnimal {
	
	//atributos
	private String raca;

	//getters and setters
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	//sobrescrevendo metodos
	@Override
	public void emitirSom() {
		
		System.out.println("O som do cachorro �: Au Au");
	}
	@Override
	public void correr() {
		
		System.out.println("O cachorro corre!");
	}
	@Override
	public void subirArvore() {
		
		System.out.println("O cachorro n�o sobe em �rvores!");
	}
}
