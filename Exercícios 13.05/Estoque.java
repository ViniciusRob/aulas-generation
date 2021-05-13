
public class Estoque {
	
	private String nomeProd;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Estoque(String nomeProd, String descricao, int quantidade, double preco) {
		super();
		this.nomeProd = nomeProd;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Nome do Produto: " + nomeProd 
				+ "\nDescrição do Produto: " + descricao 
				+ "\nQuantidade do Produto: " + quantidade 
				+ "\nPreço Unitário do Produto em R$: " + preco + "\n\n";
	}
	
	
}
