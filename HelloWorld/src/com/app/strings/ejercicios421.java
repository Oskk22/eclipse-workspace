package com.app.strings;

public class ejercicios421 {
	StringBuilder strb1 = new StringBuilder("buenas");
	StringBuilder strb2 = new StringBuilder("tardes");
	//Ejercicio 1 A append()
	//strb1.append(strb2);
	//System.out.println(strb1);
	
	//Ejercicio 1 B concatenacion +
	String strb3 = strb1.toString() + strb2.toString();
	System.out.println(strb3);
	
	
	//EJERCICIO 2
			//Ejercicio: escribe un programa que elimine 
			//el último carácter de un StringBuilder.
			int ultimoIndice=strb1.length()-1;
			strb1.deleteCharAt(ultimoIndice);
			System.out.println(strb1);
			//EJERCICIO 3
			//Ejercicio: escribe un programa que inserte 
			//el carácter 'b' cada tres posiciones en un
			//StringBuilder.
			StringBuilder strb4 = 
						new StringBuilder("buenas tardes");
			System.out.println(strb4);
			for (int i=0;i<strb4.length()-1;i+=3) {
				strb4.insert(i,"b");
				System.out.println(strb4);
			}
	
	
	
	//Ejercicio 3
	StringBuilder strb4 = 
				new StringBuilder('buenas tardes');
	System.out.println(strb4);
	for (int i=0;i<strb4.length()-1;i+=3) {
		strb4.insert(i,"b");
		System.out.println(strb4);
		
	
	//Ejercicio 4
	StringBuilder strb5 = new StringBuilder("Ayer cayó un rayo")
		String conv=strb5.toString();
		int pos= 0;
		String letra=" ";
		System.out.println(conv);
		for(int i=0;i<conv.length();i++) {
			letra=letra.vaLueOf(conv.charAt(i));
			letra=letra.toUpperCase();
			if (letra.equals(espacio)) {
				pos=i;
				letra=letra.valueOf(conv.charAt(pos+1));
				letra=letra.toUpperCase();
				strb5.replace(i+1, i+2,  letra);
			}	
			}
			System.out.println(strb5);
		
		}
	}
}
