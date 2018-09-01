package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import model.Livro;
import service.LivroService;

@WebServlet("/retorno-json2")
public class RetornoJson2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSONArray array = new JSONArray();

		ArrayList<Livro> livros = LivroService.carregar();
		
		for(int i = 0; i < livros.size(); i++)
		{
			JSONObject obj = new JSONObject();
			obj.put("codigoLivro", livros.get(i).getCodigoLivro());
			obj.put("autor", livros.get(i).getAutor().getCodigoAutor());
			obj.put("tema", livros.get(i).getTema().getCodigoTema());
			obj.put("titulo", livros.get(i).getTitulo());
			obj.put("quantidade", livros.get(i).getQuantidadePaginas());
			array.put(obj);
		}
		
		//array.put(livros);
		
		response.getWriter().print(array);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}