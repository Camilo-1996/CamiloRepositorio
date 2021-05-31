package bd;
/**
 * Clase de aerolínea que contiene su constructor y sus getters y setters
 * @author paul
 *
 */
public class Aerolinea {

	private String id;
	private String Nombre;

	public Aerolinea(String id, String nombre) {
		super();
		this.id = id;
		Nombre = nombre;
	}

	public String getId() {
		
		return id;
		
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		
		Nombre = nombre;
		
	}
}
