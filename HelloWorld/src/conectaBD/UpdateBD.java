package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateBD {

	public static void main(String[] args) {
		try {
			Connection conexion = DriverManager.getConnection(""
					+ "jdbc:mysql://localhost:3306/banco",
					"root", "");
			System.out.println("Esta conectado");
			Statement miStatement = conexion.createStatement();
			System.out.println("Creado Statement");
			
			String actualizarPrecio= "UPDATE gestor SET correo = 'gestor1@correo.com', id=4 WHERE id=1 & usuario='gestor1'";

			miStatement.executeUpdate(actualizarPrecio);
			System.out.println("Datos actualizados correctamente");
			
		}
		catch (Exception e) {
			System.out.println("No esta conectado");
			e.getStackTrace();
		}

	}

}