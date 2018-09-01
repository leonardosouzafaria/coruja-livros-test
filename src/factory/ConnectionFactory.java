package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static final ThreadLocal<Connection> conn = new ThreadLocal<>();
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	public static Connection abrirConexao() throws SQLException {
		if (conn.get() == null) {
			conn.set(DriverManager.getConnection("jdbc:mysql://localhost/DBCorujaLivros?user=root&password=root"));
		}
		return conn.get();
	}
	public static void fecharConexao() throws SQLException {
		if(conn.get() != null) {
			conn.get().close();
			conn.set(null);
		}
	}
}