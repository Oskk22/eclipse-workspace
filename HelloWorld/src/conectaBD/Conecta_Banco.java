package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conecta_Banco {
	public static void main(String[] args) {
		
		try {
			Connection conexion = DriverManager.getConnection(""
					+ "jdbc:mysql://localhost:3306/banco",
					"banco", "banco");
			System.out.println("Esta conectado");
	
			System.out.println("Base de datos: " +
					conexion.getMetaData().getDatabaseProductName());
		}
		catch (Exception e) {
			System.out.println("No esta conectado");
			e.getStackTrace();
		}

	}
}
