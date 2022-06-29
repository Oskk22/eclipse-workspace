package com.animales.examen3;

public class Animales implements SeresVivos {
	public class Colibri {
		protected int volar;
		
		public void comer() {};
		
		public int getvolar() {
			return volar;
		}	
		public void setvolar(int volar ) {
			this.volar = volar;
		}
	}
	
	public class Delfin {
		protected int nadar;
		
		public void comer() {};
		
		public int getnadar() {
			return nadar;
		}	
		public void setnadar(int nadar ) {
			this.nadar = nadar;
		}
	}
	
	public class Leopardo {
		protected int correr;
		
		public void comer() {};
		
		public int getcorrer() {
			return correr;
		}	
		public void setcorrer(int correr ) {
			this.correr = correr;
		}
	}
}

