package bd;

public class aerolinea {

	private String id;
	private String Nombre;

	public aerolinea(String id, String nombre) {
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
