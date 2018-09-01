import java.util.ArrayList;

import model.Autor;
import model.Livro;
import model.Tema;
import service.LivroService;

public class Teste {
	public static void main(String[] args) {
		Tema tema = new Tema(1);
		Autor autor = new Autor(1);
		Livro livro = new Livro(tema,autor,"A segunda guerra mundial",900);
		
		LivroService.inserir(livro);
		
		ArrayList<Livro> livros = LivroService.carregar();
		
		Livro livro2 = LivroService.carregar(livros.get(0));
		
		System.out.println(livro2.getTitulo());
		
		livro2.setTitulo("Souza Wise System");
		LivroService.alterar(livro2);
		
		System.out.println(livro2.getTitulo());
		
		if(LivroService.excluir(livro2))
		{
			System.out.println("deletou");
		}else
		{
			System.out.println("não deletou");
		}
	}
}