package br.com.exercicio7;

public class TestaPaciente {

	public static void main(String[] args) {
		
		Paciente pa1 = new Paciente();
		
		pa1.setNumProtocolo(123456);
		pa1.setNome("Maria Ant�nia");
		pa1.setIdade(64);
		pa1.setPreco(12000);
		pa1.setReceituario("1 dose de Diazepam por dia");
		
		Paciente pa2 = new Paciente();
		
		pa2.setNumProtocolo(654321);
		pa2.setNome("Jos� Alencar");
		pa2.setIdade(53);
		pa2.setPreco(5000);
		pa2.setReceituario("1 comprimido de Neuravena por noite");
		
		pa1.fazerTriagem();
		pa1.consultarProntuario();
		pa1.pagarConsulta();
		
		pa2.fazerTriagem();
		pa2.consultarProntuario();
		pa2.pagarConsulta();
		
		System.out.println("O n�mero de protocolo do paciente �: " + pa1.getNumProtocolo());
		System.out.println("O nome do paciente �: " + pa1.getNome());
		System.out.println("A idade do paciente �: " + pa1.getIdade());
		System.out.println("A receita do paciente indica " + pa1.getReceituario());
		System.out.println("O pre�o da consulta � R$: " + pa1.getPreco());
		System.out.println("====================================================================");
		System.out.println("\nO n�mero de protocolo do paciente �: " + pa2.getNumProtocolo());
		System.out.println("O nome do paciente �: " + pa2.getNome());
		System.out.println("A idade do paciente �: " + pa2.getIdade());
		System.out.println("A receita do paciente indica " + pa2.getReceituario());
		System.out.println("O pre�o da consulta � R$: " + pa2.getPreco());
	}

}
