package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import factory.ConnectionFactory;
import model.Livro;

public class LivroDAO {
	//m�todos de persistencias
	//insert
	public void inserir(Livro livro) {
		String sql = "INSERT INTO Livros(codTema, codAutor, titulo, qtdPaginas) VALUES(?,?,?,?)";
		try(Connection conn = ConnectionFactory.abrirConexao();
				PreparedStatement stm = conn.prepareStatement(sql);) {
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//update
	public void update(Livro livro) {
		String sql = "";
		try(Connection conn = ConnectionFactory.abrirConexao();
				PreparedStatement stm = conn.prepareStatement(sql)) {
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//delete
	public boolean delete() {
		String sql = "";
		try(Connection conn = ConnectionFactory.abrirConexao();
				PreparedStatement stm = conn.prepareStatement(sql)) {
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	//carregar
	public Livro carregar(int codigoLivro) {
		String sql = "";
		Livro livro = null;
		try(Connection conn = ConnectionFactory.abrirConexao();
				PreparedStatement stm = conn.prepareStatement(sql)) {
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return livro;
	}
}