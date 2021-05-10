package br.com.exercicio4;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Fernando Martins");
		f1.setIdade(29);
		f1.setCargo("Repositor de Estoque");
		f1.setSalario(1500);
		
		Funcionario f2 = new Funcionario();
		
		f2.setNome("Ana Julia");
		f2.setIdade(20);
		f2.setCargo("Gerente");
		f2.setSalario(2100);
		
		f1.cadastrarCliente();
		f1.reporEstoque();
		f2.calcularSalario();
		
		System.out.println("O nome do(a) funcion�rio(a) �: " + f1.getNome());
		System.out.println("A idade do(a) funcion�rio(a) �: " + f1.getIdade());
		System.out.println("O cargo do(a) funcion�rio(a) � de: " + f1.getCargo());
		System.out.println("O sal�rio do(a) funcion�rio(a) � de R$: " + f1.getSalario());
		System.out.println("======================================================");
		System.out.println("\nO nome do(a) funcion�rio(a) �: " + f2.getNome());
		System.out.println("A idade do(a) funcion�rio(a) �: " + f2.getIdade());
		System.out.println("O cargo do(a) funcion�rio(a) � de: " + f2.getCargo());
		System.out.println("O sal�rio do(a) funcion�rio(a) � de R$: " + f2.getSalario());
	}

}
