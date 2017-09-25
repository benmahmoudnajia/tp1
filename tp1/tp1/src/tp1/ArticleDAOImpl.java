package tp1;

import java.sql.*;
import java.util.List;
import java.util.Vector;
public class ArticleDAOImpl {

	cnx connection = null;
	// Méthode de connexion
	protected Connection getConnected() {
	String url = "";
	//jdbc:mysql://localhost:3306/
	String user = "root";
	String passwd = "";
	try {
	Class.forName("");
	connection = DriverManager.getConnection(url, user,
	passwd);
	} catch (Exception e) {
	System.out.println(" Attention Exception : " + e);
	}
	return connection;
	}
	// Libération Connection
	protected void releaseConnection() {
	try {
	connection.close();
	} catch (SQLException e) {
	System.out
	.println(" Attention Exception lors de la libération de la connection : " + e);
	}
	}
}
