package br.com.exercicio;

public class Preguica extends Animal implements InterfaceAnimal{

	private String alimentos;

	public String getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(String alimentos) {
		this.alimentos = alimentos;
	}

	@Override
	public void emitirSom() {
		System.out.println("O som da preguiça é: ZzzzZZzzzZZ");
	}

	@Override
	public void correr() {
		System.out.println("A preguiça não corre!");
	}

	@Override
	public void subirArvore() {
		System.out.println("A preguiça sobe em árvores!");
	}
}
