package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectBD {

	public static void main(String[] args) {
		try {
			Connection conexion =
					DriverManager.getConnection(""
							+ "jdbc:mysql://localhost:3306/banco", 
							"banco", "banco");
			System.out.println("Esta conectado con Banco");
			
			PreparedStatement ps = conexion.conexionStatement(""
					+ "SELECT * FROM gestor);
		
			ResultSet resultados = ps.executeQuery();
			System.out.println("Listado de gestores: ");
			while (resultados.next()) {
				System.out.println(""
						+ "Gestor " + resultados.getInt("id"));
				System.out.println(""
						+ "Usuario: " 
						+ resultados.getString("usuario"));
				System.out.println("Password: " 
						+ resultados.getString("password"));
				System.out.println("Correo: " 
						+ resultados.getString("correo"));
				System.out.println("...");
			}
			System.out.println("Programa finalizado");
		}
		catch (SQLException e) {
			System.out.println("No esta conectado");
			e.getStackTrace();
		}

	}

}
