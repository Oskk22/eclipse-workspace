
public class Estudiante {
	//Atributos
	int id;
	byte edat;
	int telefono;
	int numeroDeNotas;
	int sumaDeNotas;
	float notaMedia;
	//Metodos
	void mostrarInfo();
	void agregarNuevaNota();
}

public class Estudiante {
	public Estudiante() {
		
	}
	int id;
	byte edat;
	int telefono;
	int numeroDeNotas;
	int sumaDeNotas;
	float notaMedia;
	
	void mostrarInfo();
	void agregarNuevaNota();
}

//METODO ESTATICO PUBLICO
public static float crearEstudiante = Estudiante {
}

//La superclase de Coche Avion y Bicicleta
public class Vehiculo {
	protected float velocidad;
	protected int asientos;
	protected int orientacionRuedas;
	
	public void parar() {}
	public void acelerar() {} 
	public void desacelerar() {} 
	public void girarIzquierda() {}
	public void girarDerecha() {} 
	
public class Avion extends Vehiculo {
	private boolean trenAterrizaje;
	
	public void volar() {}
	public void aterrizar() {}
	
//Constructor de superclase
public Coche(float velocidad, float caballos, int asientos, int orientacionRuedass) {
	this.velocidad = velocidad;
	this.asientos = asientos;
	this.orientacionRuedas = orientacionRuedas;
	
	this.caballos = caballos;
	
public class Coche extends Vehiculo {
	private float caballos;
	public Coche(float velocidad, float caballos, int asientos, int orientacionRuedas) {
		super(velocidad, asientos, orientacionRuedas);
		this.caballos = caballos
}

public class Bicicleta extends Vehiculo {
	private int cambios;
	public Bicicleta() {
		super(0.0f , 4 , 0);
		this.cambios = 3;
	}
	public Bicicleta(float velocidad, int cambio, int asientos, int orientacionRuedas) {
		super(velocidad, asientos, orientacionRuedas);
		this.cambios = cambios
	}
}
	
	