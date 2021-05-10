package br.com.exercicio6;

public class TesteContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria cb1 = new ContaBancaria();
		
		cb1.setNumConta("3832075-4");
		cb1.setSaldo(105.8);
		cb1.setProprietario("Vin�cius Roberto");
		cb1.setAnosAberta(2);
		
		ContaBancaria cb2 = new ContaBancaria();
		
		cb2.setNumConta("23702596-0");
		cb2.setSaldo(269.73);
		cb2.setProprietario("V�nia Souza");
		cb2.setAnosAberta(7);
		
		cb1.calcularImposto();
		cb1.fazerSaque();
		cb1.encerrarConta();
		
		cb2.calcularImposto();
		cb2.fazerSaque();
		cb2.encerrarConta();
	
		System.out.println("O nome do propriet�rio da conta �: " + cb1.getProprietario());
		System.out.println("O n�mero da conta �: " + cb1.getNumConta());
		System.out.println("A conta est� aberta a: " + cb1.getAnosAberta() + " anos");
		System.out.println("O saldo na conta � de R$: " + cb1.getSaldo());
		System.out.println("================================================================");
		System.out.println("\nO nome do propriet�rio da conta �: " + cb2.getProprietario());
		System.out.println("O n�mero da conta �: " + cb2.getNumConta());
		System.out.println("A conta est� aberta a: " + cb2.getAnosAberta() + " anos");
		System.out.println("O saldo na conta � de R$: " + cb2.getSaldo());
	}

}
