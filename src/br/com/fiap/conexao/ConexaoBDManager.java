package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexaoBDManager {
	

	public static Connection obterConexao() {
		Connection conexao = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm85217", "080494");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return conexao;
		
	}
	
}
