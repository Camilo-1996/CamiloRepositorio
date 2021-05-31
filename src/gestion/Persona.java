package gestion;
/**
 * Clase Persona para crear los correspondientes usuarios. 
 * La clase se compone de un nombre y sus dos apellidos.
 * @author Juan Camilo Ramírez Zapata
 * @version 1.0.
 */
public class Persona {

	private String nombre;
	private String apellido1;
	private String apellido2;
	


	/**
	 * Constructor de la clase Persona
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param pasaporte
	 */
	public Persona(String nombre, String apellido1, String apellido2) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2=apellido2;
		
		
	}
	// fin constructor

	
	/*
	 *Getters and Setters
	 */
	/**
	 * Devuelve el nombre de la persona.
	 * @return nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el nombre de la persona por el pasado por parametros.
	 * @param nuevo nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el primer apellido de la persona.
	 * @return el primer apellido de la persona.
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Cambia el primer apellido de la persona por el pasado por parametros.
	 * @param primer apellido
	 */
	public void setApellido1(String apellido) {
		this.apellido1 = apellido;
	}
	
	/**
	 * Devuelve el segundo apellido de la persona.
	 * @return el primer apellido de la persona.
	 * 
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 *  Cambia el segundo apellido de la persona por el pasado por parametros.
	 * @param segundo apellido
	 */
	public void setApellido2(String apellido) {
		this.apellido2 = apellido;
	}

	

	/*
	 * Fin Getters and Setters
	 *
	 */
	
	/**
	 * devuelve el nombre completo de la persona, es decir, nombre, primer apellido y segundo apellido.
	 * @return nombre completo de la persona.
	 */
	public String getNombreCompleto() {
		
		return nombre+" "+apellido1+ " "+ apellido2;
	}

}
