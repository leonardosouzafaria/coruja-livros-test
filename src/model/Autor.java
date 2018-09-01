package model;

public class Autor {
	private int codigoAutor;
	private String nome;
	
	
	//Contrutor com id 
	public Autor (int codigoAutor) {
		setCodigoAutor(codigoAutor);
	}
	
	// Contrutor completo autor
	public Autor(int codigoAutor, String nome) {
		setNome(nome);
	}

	// Metodos de acesso Get/Set
	public int getCodigoAutor() {
		return this.codigoAutor;
	}

	public void setCodigoAutor(int codigoAutor) {
		this.codigoAutor = codigoAutor;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
