package Modulo5;

<context:component-scan base-package="com.ejemplo"/>

//ProfesorInformatica
@Component("miprofesor")
public class ProfesorInformatica implements Profesor {
	public String getClase() {
		return "Teclear codigo";
	}
}

//ProfesorMates
@Component("miporfesor")
public class ProfesorMates implements Profesor {
	public String getClase() {
		return "Resolver derivadas";
	}
}

//ProfesorOrientacion
@Component("miporfesor")
public class ProfesorOrientacion implements Profesor {
	public String getClase() {
		return "Aconsejar sobre los ejercicios";
	}
}


//MainSpring.java
public class MainSpringAnotaciones {
	public static void main(String[]args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Profesor profesor = context.getBean("miprofesor", Profesor.class);
		System.out.println(profesor.getClase());
		
		context.close();
	}
}
