package ModuloFinal;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBaseDatos {
	public static void main(String[]args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hibernate-demo";
		String usuario = "hibernate-demo";
		String password = "hibernate-demo";
		
		try {
			System.out.println("Conectando a la base de datos:" + jdbcUrl);
			Connection con = DriverManager.getConnection(jdbcUrl, usuario, password);
			System.out.println("Conexion exitosa");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
