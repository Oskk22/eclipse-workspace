	//EJERCICIO MAIN1 355
import java.util.Scanner;
public class scan {
	
	public static main(String[] args) {
		System.out.println("Introduce un numero por pantalla");
		Scanner keyboard= new Scanner(System.in);
		int numero =keyboard.nextInt();
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
		} else if (numero == 6) {
			System.out.println("6--> Salir");
		} else {
			System.out.println("No has introducido un numero adecuado");
		}
		keyboard.close();
		}
	}
	
	//EJERCICIO MAIN2 355
import java.util.*;
public class Main2 {
	

	public static main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		int numero =0;
		
		while (numero != 6) {
			System.out.println("Introduce un numero por pantalla:");
			numero =keyboard.nextInt();
	}
	System.out.println("El numero correctom el 6");
	keyboard.close();
	
	//EJERCICIO MAIN3 355
public class Main3 {
	
	public static void main(String[] arg) {
		Scanner keyboard= new Scanner(System.in);
		int numero =0;
		System.out.println("---/n");
			+ "1. Gestores\r\n"
			+ "2. Clientes\r\n"
			+ "3. Transferencias\r\n"
			+ "4. Mensajes\r\n"
			+ "5. Prestamos\r\n"
			+ "6. Salir\r\n"
			
		while (numero !=6) {
			System.out.println("Introduzca un numero:");
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

	//EJERCICIO 1 357
public class ejFor {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			System.out.printf("5 x %d = %d" , i, 5*i).println();
		}
	}
}

	//EJERCICIO 2 357
public class ejFor {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {	
			System.out.printf("%d x %d = %d" , i, j, i*j).println();
			}
		}
	}
}
	
	//EJERCICIO 3 357
public class sumaDecremental {
	public static void main(String[] args) {
		int num = 5;
			int resultado = 0;
			for(int i=num; i>0; i--) {
				resultado+=i;
			}
			System.out.printf("El resultado de la suma decremental es: %d" , resultado).println();
	}
}

	//EJERCICIO 4 357
public class numeroPrimos {
	public static void main(String[] args) {
		int numPrimo = 4;
		if (numPrimo>1 && numPrimo/numPrimo==1 && numPrimo/1==numPrimo) {
			System.out.printf("Es numero primo");
			else (
				System.out.printf("No es un numero primo");
			)
	}
}
	
	//EJERCICIO MAIN4 365
public class Main4 {

	public static void main(String[] arg) {
		Scanner keyboard= new Scanner(System.in);
		int numero =0;
		System.out.println("---/n");
			+ "1. Gestores\r\n"
			+ "2. Clientes\r\n"
			+ "3. Transferencias\r\n"
			+ "4. Mensajes\r\n"
			+ "5. Prestamos\r\n"
			+ "6. Salir\r\n"
			
		while (numero !=6) {
			System.out.println("Introduzca un numero:");
			numero =keyboard.nextInt();
			if (numero == 1) {
				Main4.mensajesGestores1();
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
	public static void mensajeGestores1() {
		System.out.println("1--> Gestores");
	}
}
