package es.studium.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Clase Main, ejecuta el programa.
 * @author Alvca
 * @since 2021
 * @version 1.0
 */
public class Main {
	public static void main(String[] args) {
		/*Abrimos el contenedor de IoC indicando la ruta exacta de donde se encuentra el fichero 
		 * beans.xml*/
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("es/studium/xml/beans.xml");
		Centros c1=(Centros) appContext.getBean("centro1");
		Centros c2=(Centros) appContext.getBean("centro2");
		System.out.println("Direcciones de todos los centros");
		System.out.println(c1.getNombreCentro()+", Direccion: "+ c1.getDireccionCentro());
		System.out.println(c2.getNombreCentro()+", Direccion: "+ c2.getDireccionCentro());

		System.out.println("");
		Alumnos a1=(Alumnos)  appContext.getBean("Carmen Cano");
		System.out.println("Direccion del centro donde está matriculada Carmen");
		System.out.println(a1.getDireccionCentro());
		
		System.out.println("");
		Alumnos a2=(Alumnos)  appContext.getBean("Benito Bueno");
		System.out.println("Nota que Benito ha sacado en el B2");
		System.out.println(a2.getNotaAsignatura());
	}
	
}
