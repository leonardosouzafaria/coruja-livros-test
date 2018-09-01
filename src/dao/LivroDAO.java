package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import factory.ConnectionFactory;
import model.Autor;
import model.Livro;
import model.Tema;

public class LivroDAO {
	// métodos de persistencias
	// insert
	public static void inserir(Livro livro) {
		String sql = "INSERT INTO Livros(codTema, codAutor, titulo, qtdPaginas) VALUES(?,?,?,?)";
		try (Connection conn = ConnectionFactory.abrirConexao(); PreparedStatement stm = conn.prepareStatement(sql);) {
			stm.setInt(1, livro.getTema().getCodigoTema());
			stm.setInt(2, livro.getAutor().getCodigoAutor());
			stm.setString(3, livro.getTitulo());
			stm.setInt(4, livro.getQuantidadePaginas());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// update
	public static boolean alterar(Livro livro) {
		String sql = "UPDATE Livros SET codTema = ?, codAutor = ?, titulo = ?, qtdPaginas = ? WHERE codLivro = ?";
		try (Connection conn = ConnectionFactory.abrirConexao(); PreparedStatement stm = conn.prepareStatement(sql)) {
			stm.setInt(1, livro.getTema().getCodigoTema());
			stm.setInt(2, livro.getAutor().getCodigoAutor());
			stm.setString(3, livro.getTitulo());
			stm.setInt(4, livro.getQuantidadePaginas());
			stm.setInt(5, livro.getCodigoLivro());
			if (stm.execute()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	// delete
	public static boolean excluir(Livro livro) {
		String sql = "DELETE FROM Livros WHERE codLivro = ?";
		try (Connection conn = ConnectionFactory.abrirConexao(); PreparedStatement stm = conn.prepareStatement(sql)) {
			stm.setInt(1, livro.getCodigoLivro());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	// carregar registro único
	public static Livro carregar(Livro livro) {
		String sql = "SELECT * FROM Livros WHERE codLivro = ?";
		try (Connection conn = ConnectionFactory.abrirConexao(); PreparedStatement stm = conn.prepareStatement(sql)) {
			stm.setInt(1, livro.getCodigoLivro());
			try (ResultSet rs = stm.executeQuery()) {
				if (rs.next()) {
					livro.setTitulo(rs.getString("titulo"));
					livro.setAutor(new Autor(rs.getInt("codAutor")));
					livro.setQuantidadePaginas(rs.getInt("qtdPaginas"));
					livro.setTema(new Tema(rs.getInt("codTema")));
				} else {
					livro = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return livro;
	}

	// carregar todos os registros
	public static ArrayList<Livro> carregar() {
		String sql = "SELECT * FROM Livros";
		ArrayList<Livro> livros = new ArrayList<>();
		;
		try (Connection conn = ConnectionFactory.abrirConexao(); PreparedStatement stm = conn.prepareStatement(sql)) {
			try (ResultSet rs = stm.executeQuery()) {
				while (rs.next()) {
					Livro livro = new Livro(rs.getInt("codLivro"));
					livro.setAutor(new Autor(rs.getInt("codAutor")));
					livro.setTema(new Tema(rs.getInt("codTema")));
					livro.setQuantidadePaginas(rs.getInt("qtdPaginas"));
					livro.setTitulo(rs.getString("titulo"));
					livros.add(livro);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return livros;
	}
}