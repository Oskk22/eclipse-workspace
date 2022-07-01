package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateBD {
public static void main(String[] args) {
		
		try {
			Connection conexion = DriverManager.getConnection(""
					+ "jdbc:mysql://localhost:3306/banco",
					"root", "");
			System.out.println("Esta conectado");
		
			Statement miStatement = conexion.createStatement();
			System.out.println("Creado Statement");
			
			
			String instruccionSQL= "INSERT INTO gestor ('correo, id, password, usuario)"
					+ "VALUES ('gestor1@correo.com','1','hfgjy5257275ygjyuyu587685735','gestor1')";
			
			miStatement.executeUpdate(instruccionSQL);
			System.out.println("Datos insertados correctamente");
			
		}
		catch (Exception e) {
			System.out.println("No esta conectado");
			e.getStackTrace();
		}

	}
}
