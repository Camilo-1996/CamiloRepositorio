package gestion;

public class Persona {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private int DNI;
	private String pasaporte;
	


	// constructor
	public Persona(String nombre, String apellido1, String apellido2, String pasaporte) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2=apellido2;
		this.pasaporte = pasaporte;
		
	}
	// fin constructor

	/*
	 *Getters and Setters
	 */
	
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

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}

	/*
	 * Fin Getters and Setters
	 *
	 */
	
	
	public String getNombreCompleto() {
		
		return nombre+" "+apellido1+ " "+ apellido2;
	}

}
