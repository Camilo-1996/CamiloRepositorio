package modelos;

public class hotel {
	private String direccion;
	private String Nombre;
	private int estrellas;

	public hotel(String direccion, String nombre, int estrellas) {
		super();
		this.direccion = direccion;
		Nombre = nombre;
		this.estrellas = estrellas;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}
}
