package gestion;

public class Persona {

	private String nombre;
	private String apellido1;
	private String apellido2;

	//start constructor
	public Persona(String nombre, String apellido1, String apellido2) {
		
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		
	}
	//finish constructor
	
	
	
	
	// Getters and setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido) {
		this.apellido1 = apellido;
	}
	
	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido) {
		this.apellido2 = apellido;
	}
	//finish getters and setters 
	
	
	public String getNombreCompleto() {
		
		return nombre+" "+apellido1+ " "+ apellido2;
	}

}
