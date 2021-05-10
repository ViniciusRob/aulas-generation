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
		
		System.out.println("O nome do(a) funcionário(a) é: " + f1.getNome());
		System.out.println("A idade do(a) funcionário(a) é: " + f1.getIdade());
		System.out.println("O cargo do(a) funcionário(a) é de: " + f1.getCargo());
		System.out.println("O salário do(a) funcionário(a) é de R$: " + f1.getSalario());
		System.out.println("======================================================");
		System.out.println("\nO nome do(a) funcionário(a) é: " + f2.getNome());
		System.out.println("A idade do(a) funcionário(a) é: " + f2.getIdade());
		System.out.println("O cargo do(a) funcionário(a) é de: " + f2.getCargo());
		System.out.println("O salário do(a) funcionário(a) é de R$: " + f2.getSalario());
	}

}
