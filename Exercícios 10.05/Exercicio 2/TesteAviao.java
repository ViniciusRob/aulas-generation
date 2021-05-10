package br.com.exercicio2;

public class TesteAviao {

	public static void main(String[] args) {

		Aviao a1 = new Aviao();

		a1.setFabricante("AirBus");
		a1.setCapacidade(144);
		a1.setComprimento(33.84);
		a1.setEnvergadura(34.1);
		a1.setAltura(11.76);
		a1.setPesomax(70);
		a1.setMotores("V2500-A5IAE");

		Aviao a2 = new Aviao();

		a2.setFabricante("AirBus");
		a2.setCapacidade(174);
		a2.setComprimento(37.57);
		a2.setEnvergadura(34.1);
		a2.setAltura(11.76);
		a2.setPesomax(77);
		a2.setMotores("V2500-A5");
		
		a1.verificarCombustivel();
		a1.decolar();
		a1.pousar();
		
		a2.verificarCombustivel();
		a2.decolar();
		a2.pousar();
		
		System.out.println("O fabricante do avião é: " + a1.getFabricante());
		System.out.println("A capacidade de passageiros do avião é de: " + a1.getCapacidade());
		System.out.println("O comprimento do avião é de: " + a1.getComprimento() + "m");
		System.out.println("O tamanho da envergadura do avião é de: " + a1.getEnvergadura() + "m");
		System.out.println("A altura do avião é de: " + a1.getAltura() + "m");
		System.out.println("O peso máximo que o avião suporta é de: " + a1.getPesomax() + "kg");
		System.out.println("Os motores do avião são do modelo: " + a1.getFabricante());
		System.out.println("=============================================================================");
		System.out.println("\nO fabricante do avião é: " + a2.getFabricante());
		System.out.println("A capacidade de passageiros do avião é de: " + a2.getCapacidade());
		System.out.println("O comprimento do avião é de: " + a2.getComprimento() + "m");
		System.out.println("O tamanho da envergadura do avião é de: " + a2.getEnvergadura() + "m");
		System.out.println("A altura do avião é de: " + a2.getAltura() + "m");
		System.out.println("O peso máximo que o avião suporta é de: " + a2.getPesomax() + "kg");
		System.out.println("Os motores do avião são do modelo: " + a2.getFabricante());
	}

}
