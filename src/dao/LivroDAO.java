package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import factory.ConnectionFactory;
import model.Livro;

public class LivroDAO {
	//métodos de persistencias
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
	public boolean delete(Livro livro) {
		String sql = "DELETE FROM Livro WHERE codigoLivro = ?";
		try(Connection conn = ConnectionFactory.abrirConexao();
				PreparedStatement stm = conn.prepareStatement(sql)) {
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}	
	//carregar registro único
	public Livro carregar(Livro livro) {
		String sql = "SELECT * FROM Livro WHERE codigoLivro = ?";
		try(Connection conn = ConnectionFactory.abrirConexao();
				PreparedStatement stm = conn.prepareStatement(sql)) {
			stm.setInt(1, livro.getCodigoLivro());
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return livro;
	}
	//carregar todos os registros
	public Livro carregar() {
		String sql = "SELECT * FROM Livro";
		Livro livro = null;
		try(Connection conn = ConnectionFactory.abrirConexao();
				PreparedStatement stm = conn.prepareStatement(sql)) {
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return livro;
	}
}