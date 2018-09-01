package service;

import java.util.ArrayList;

import dao.LivroDAO;
import model.Livro;

public class LivroService {
	public static void inserir(Livro livro)
	{
		LivroDAO.inserir(livro);
	}
	public static boolean excluir(Livro livro)
	{
		return LivroDAO.excluir(livro);
	}
	public static boolean alterar(Livro livro)
	{
		return LivroDAO.alterar(livro);
	}
	public static Livro carregar(Livro livro)
	{
		return LivroDAO.carregar(livro); 
	}
	public static ArrayList<Livro> carregar()
	{
		return LivroDAO.carregar();
	}
}