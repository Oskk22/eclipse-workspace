package com.banco;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		/* Ejercicio proyecto (Main3):
		reutiliza el programa desarrollado anteriormente para mostrar el siguiente menú antes de
		solicitar el número por pantalla al usuario:
		---
		1. Gestores
		2. Clientes
		3. Transferencias
		4. Mensajes
		5. Préstamos
		6. Salir
		Introduzca un número:
		*/
		Scanner keyboard= new Scanner(System.in);
		int numero =0;
		System.out.println("---\n"
				+ "1. Gestores\r\n"
				+ "2. Clientes\r\n"
				+ "3. Transferencias\r\n"
				+ "4. Mensajes\r\n"
				+ "5. Préstamos\r\n"
				+ "6. Salir\r\n");
		while (numero !=6) {
			System.out.println("Introduzca un número: ");
			numero =keyboard.nextInt();
			if (numero == 1) {
				System.out.println("1--> Gestores");
			} else if (numero == 2) {
				System.out.println("2--> Clientes");
			} else if (numero == 3) {
				System.out.println("3--> Transferencias");
			} else if (numero == 4) {
				System.out.println("4--> Mensajes");
			} else if (numero == 5) {
				System.out.println("5--> Prestamos");
			}
		}
		System.out.println("6--> Salir");
		keyboard.close();
	}

}