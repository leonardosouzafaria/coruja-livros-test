package model;

public class Livro {
	//atributos
	private int codigoLivro;
	private int codigoTema;
	private int codigoAutor;
	private String titulo;
	private int quantidadePaginas;
	
	//construtor padrão
	public Livro() { }
	
	//construtor apenas com id
	public Livro(int codigoLivro) {
		setCodigoLivro(codigoLivro);
	}
	
	//construtor completo
	public Livro(int codigoLivro, int codigoTema, int codigoAutor, String titulo, int quantidadePaginas) {
		setCodigoLivro(codigoLivro);
		setCodigoTema(codigoTema);
		setCodigoAutor(codigoAutor);
		setTitulo(titulo);
		setQuantidadePaginas(quantidadePaginas);
	}
	
	//métodos de acesso e métodos modificadores
	public int getCodigoLivro() {
		return codigoLivro;
	}
	public void setCodigoLivro(int codigoLivro) {
		this.codigoLivro = codigoLivro;
	}
	public int getCodigoTema() {
		return codigoTema;
	}
	public void setCodigoTema(int codigoTema) {
		this.codigoTema = codigoTema;
	}
	public int getCodigoAutor() {
		return codigoAutor;
	}
	public void setCodigoAutor(int codigoAutor) {
		this.codigoAutor = codigoAutor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}
	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}
}