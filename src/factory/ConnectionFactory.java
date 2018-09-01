package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	//setup driver
	static
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e)
		{
			throw new RuntimeException(e);
		}
	}
	//conexao com banco
	public static Connection abrirConexao() throws SQLException
	{
		return DriverManager.getConnection("jdbc:mysql://localhost/DBCorujaLivros?user=root&password=root");
	}
}