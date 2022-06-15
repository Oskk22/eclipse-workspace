package com.banco;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		/* Ejercicio proyecto (Main4): reutiliza el programa desarrollado para mostrar los mensajes
		(Gestores, Clientes, Transferencias, Mensajes, Préstamos) en métodos (un método por
		cada mensaje).
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
				//Invocación del método que imprime "1--> Gestores"
				Main4.mensajeGestores1();
			} else if (numero == 2) {
				//Invocación del método que imprime "2--> Clientes"
				Main4.mensajeClientes2();
			} else if (numero == 3) {
				//Invocación del método que imprime "3--> Transferencias"
				Main4.mensajeTransferencias3();
			} else if (numero == 4) {
				//Invocación del método que imprime "4--> Mensajes"
				Main4.mensajeMensajes4();
			} else if (numero == 5) {
				//Invocación del método que imprime "5--> Prestamos"
				Main4.mensajePrestamos5();
			} else {
				System.out.println("La opción no esta en el sistema");
			}
		}
		System.out.println("6--> Salir");
		keyboard.close();

	}
	public static void mensajeGestores1() {
		System.out.println("1--> Gestores");
	}
	private static void mensajeClientes2() {
		System.out.println("2--> Clientes");
	}
	private static void mensajeTransferencias3() {
		System.out.println("3--> Transferencias");
	}
	private static void mensajeMensajes4() {
		System.out.println("4--> Mensajes");
	}
	private static void mensajePrestamos5() {
		System.out.println("5--> Prestamos");
	}

}