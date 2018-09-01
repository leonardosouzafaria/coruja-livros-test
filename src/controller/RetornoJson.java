package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

@WebServlet("/retorno-json")
public class RetornoJson extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSONArray array = new JSONArray();
		JSONObject teste = new JSONObject();
		teste.put("nome", "Renan");
		teste.put("altura", 1.75);
		
		JSONObject teste2 = new JSONObject();
		teste2.put("nome", "Renan");
		teste2.put("altura", 1.75);
		teste2.put("TESTE", teste);
		
		array.put(teste);
		array.put(teste2);
		
		
		
		response.getWriter().print(array);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}