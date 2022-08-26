package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	//User
	private static final String USERNAME = "root";
	
	//Senha
	private static final String PASSWORD = "";
	
	//Porta
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	//Conexão Banco de Dados
	public static Connection createConnectionToMySQL() throws Exception {
	//faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	
	public static void main(String[] args) throws Exception {
		
		//Recuperar conexão com o banco de dados
		
		Connection con = createConnectionToMySQL();
		
		if(con!=null) {
			System.out.println("Conexão obtida com sucesso!");
			con.close();
		}
	}
}
