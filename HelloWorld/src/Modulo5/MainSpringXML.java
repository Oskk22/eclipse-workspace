package Modulo5;

<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans"
			+ "http://www.springframework.org/schema/beans/spring-beans.xsd"
			+ "http://www.springframework.org/schema/context"
			+ "http://www.springframework.org/schema/context/spring-context.xsd">

<bean id="miprofesor" class="ProfesorInformatica">
<bean id="miprofesor" class="ProfesorMates">
<bean id="miprofesor" class="ProfesorOrientacion">


//MainSpring.java
public class MainSpringXML {
	public static void main(String[]args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Profesor profesor = context.getBean("miprofesor", Profesor.class);
		System.out.println(profesor.getClase());
		
		context.close();
	}
}
