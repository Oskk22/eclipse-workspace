package Modulo5;

//Main.java
public class Main {
	public static void main(String[]args) {
		Profesor profesorInformatica = new ProfesorInformatica();
		Profesor profesorMates = new ProfesorMates();
		Profesor profesorOrientacion = new ProfesorOrientacion();
		System.out.println(profesorInformatica.getClase());
		System.out.println(profesorMates.getClase());
		System.out.println(profesorOrientacion.getClase());
	}
}
