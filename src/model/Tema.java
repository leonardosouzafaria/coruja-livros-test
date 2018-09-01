package model;

public class Tema {
	
	private int codigoTema;
	private String tema;
	
	public Tema(int codigoTema, String tema) {
		
		setCodigoTema(codigoTema);
		setTema(tema);
		
	}

	//Metodos de acesso Get/Set
	public int getCodigoTema() {
		return codigoTema;
	}

	public void setCodigoTema(int codigoTema) {
		this.codigoTema = codigoTema;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	
}
