import java.util.ArrayList;

public class TestaEstoque {

	public static void main(String[] args) {
		
		/* Armazenar dados da List
		 * Remover dados da list
		 * Atualizar dados da list
		 * Apresentar todos os dados da list*/
		
		//Instanciando os objetos
		Estoque e1 = new Estoque("Bolacha", "Bolacha recheada Trakinas", 3, 3.50);
		Estoque e2 = new Estoque("Fone", "Fone de Ouvido Multilaser", 7, 75.60);
		Estoque e3 = new Estoque("Cadeira", "cadeira de Plástico Branca", 20, 3.50);
		ArrayList<Estoque> lista = new ArrayList<>();
		
		//adicionando itens à lista
		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		
		//removendo item da posição 2 (cadeira) da lista
		lista.remove(2);
		
		//atualizando dados na posição 1 (de fone para fone de ouvido) da lista
		lista.get(1).setNomeProd("Fone de Ouvido");
		
		//apresentando os dados da lista
		System.out.println(lista.toString());
	}

}
