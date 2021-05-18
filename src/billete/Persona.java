package billete;

public class Persona {

	private String nombre;
	private String apellido;
	private int DNI;
	private String pasaporte;
	private int edad;

	// constructor
	public Persona(String nombre, String apellido, String pasaporte, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.pasaporte = pasaporte;
		this.edad=edad;
	}
	// fin constructor

	/**
	 * Getters and Setters
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	/**
	 * Fin Getters and Setters
	 * */
	
	public String getNombreCompleto() {
		
		return nombre+" "+apellido;
	}

}
