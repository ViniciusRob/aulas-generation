package br.com.exercicio;

public class TestaAnimais {

	public static void main(String[] args) {
		
		//instanciando os objetos
		Cachorro cac = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguica pre = new Preguica();
		
		//preenchendo os objetos 
		cac.setNome("Rex");
		cac.setIdade(2);
		cac.setRaca("Pincher");
		
		cav.setNome("Pé de Pano");
		cav.setIdade(7);
		cav.setTamanho(1.4);
		
		pre.setNome("Cleber");
		pre.setIdade(3);
		pre.setAlimentos("Formigas");

		//preenchendo os métodos
		cac.emitirSom();
		cac.correr();
		
		cav.emitirSom();
		cav.correr();
		
		pre.emitirSom();
		pre.subirArvore();
		
		//exibindo os resultados
		System.out.println("======Dados Cachorro======");
		System.out.println("Nome: " + cac.getNome());
		System.out.println("Idade: " + cac.getIdade());
		System.out.println("Raça: " + cac.getRaca());
		System.out.println("\n======Dados Cavalo======");
		System.out.println("Nome: " + cav.getNome());
		System.out.println("Idade: " + cav.getIdade());
		System.out.println("Tamanho: " + cav.getTamanho());
		System.out.println("\n======Dados Preguiça======");
		System.out.println("Nome: " + pre.getNome());
		System.out.println("Idade: " + pre.getIdade());
		System.out.println("Alimentação: " + pre.getAlimentos());
	}

}
