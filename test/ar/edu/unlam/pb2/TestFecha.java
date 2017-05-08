package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestFecha {
	
	
	@Test
	public void testQueCompara2Fechas()
	{
		//todas las clases que creo heredan de Object
	Fecha miFecha1 = new Fecha ("1", "abril", "1980");
	Fecha miFecha2 = new Fecha ("1", "abril", "1980");
	
	
//	assertTrue(miFecha1==miFecha2); -> Nunca sera igual porque cada objeto(fecha) apunta a una posicion de memoria diferente
	assertTrue(miFecha1.equals(miFecha2));  // Para comparar que los datos de dos objetos diferentes sean los mismos
	
	
	/* cuando igual dos objetos los estoy apuntando los dos al mismo espacio de memoria
	 * Persona persona1 = new Persona ("Juan")
	 * Persona persona2 = new Persona ("Pepe")
	 * 
	 * 	persona1 = persona2 --> persona2 pasara a apuntar al mismo lugar que persona1, ambos seran Pepe. Juan se perderà
	 * 	persona1.setNombre("Jose")  --> persona1 ahora es Jose pero como apuntan al mismo lugar, persona2 tambien será Jose.	 
	 */
	}

}
