package model;

public class Estoque {
	
	private int codigoEstoque;
	private Livro livro;
	private int quantidadeLivros;
	
	public Estoque() {
		
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public int getQuantidadeLivros() {
		return quantidadeLivros;
	}

	public void setQuantidadeLivros(int quantidadeLivros) {
		this.quantidadeLivros = quantidadeLivros;
	}
	
	public int getCodigoEstoque() {
		return codigoEstoque;
	}
	
	public void setCodigoEstoque(int codigoEstoque) {
		this.codigoEstoque = codigoEstoque;
	}
	
	
	
	
	
}
