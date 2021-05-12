package br.com.exercicio;

public class Cavalo extends Animal implements InterfaceAnimal{
	
	private double tamanho;

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public void emitirSom() {
		System.out.println("O barulho do cavalo é: Hinrinn");
	}

	@Override
	public void correr() {
		System.out.println("O cavalo corre! (e muito)");
	}

	@Override
	public void subirArvore() {
		System.out.println("O cavalo não sobe em árvores!");
	}
}
