package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteBD {

	public static void main(String[] args) {
		try {
			Connection conexion = DriverManager.getConnection(""
					+ "jdbc:mysql://localhost:3306/banco",
					"root", "");
			System.out.println("Esta conectado");
			
			Statement miStatement = conexion.createStatement();
			System.out.println("Creado Statement");
			
			
			String eliminaSQL= "DELETE FROM gestor "
					+ "WHERE id=1";
			
			miStatement.executeUpdate(eliminaSQL);
			System.out.println("Datos eliminados correctamente");
			
		}
		catch (Exception e) {
			System.out.println("No esta conectado u otro error");
			e.getStackTrace();
		}

	}

}