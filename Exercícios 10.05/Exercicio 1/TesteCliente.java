package br.com.exercicio1;

public class TesteCliente {

	public static void main(String[] args) {

		//instanciando os objetos e setando os valores
		Cliente c1 = new Cliente();

		c1.setNome("Vinícius Roberto");
		c1.setIdade(18);
		c1.setTelefone("(11)94928-9952");
		c1.setEmail("vinicius.rob2002@gmail.com");
		c1.setRenda(0.0);

		Cliente c2 = new Cliente();

		c2.setNome("Maria Fernanda");
		c2.setIdade(22);
		c2.setTelefone("(11)98756-2178");
		c2.setEmail("m.frocha@gmail.com");
		c2.setRenda(1700);

		//chamando os métodos
		c1.comprarProduto();
		c1.editarCadastro();
		c1.buscarProduto();
		
		c2.comprarProduto();
		c2.editarCadastro();
		c2.buscarProduto();
		
		//imprimindo os valores na tela
		System.out.println("O nome do cliente é: " + c1.getNome());
		System.out.println("A idade do cliente é: " + c1.getIdade());
		System.out.println("O telefone do cliente é: " + c1.getTelefone());
		System.out.println("O email do cliente é: " + c1.getEmail());
		System.out.println("A renda do cliente é: " + c1.getRenda());
		System.out.println("========================================");
		System.out.println("\nO nome do cliente é: " + c2.getNome());
		System.out.println("A idade do cliente é: " + c2.getIdade());
		System.out.println("O telefone do cliente é: " + c2.getTelefone());
		System.out.println("O email do cliente é: " + c2.getEmail());
		System.out.println("A renda do cliente é: " + c2.getRenda());
	}

}
