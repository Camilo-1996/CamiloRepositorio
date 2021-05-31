package bd;

import java.util.ArrayList;
import java.util.List;

public class Pais {

	private String ID;
	private String Nombre;
	private String Continente;
	private List<String> ciudades;

	public Pais(String iD, String nombre, String continente, List<String> ciudades) {
		super();
		ID = iD;
		Nombre = nombre;
		Continente = continente;
		this.ciudades = ciudades;
	}

	public Pais(String iD, String nombre, String continente) {
		super();
		ID = iD;
		Nombre = nombre;
		Continente = continente;
		ciudades = new ArrayList<>();
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getContinente() {
		return Continente;
	}

	public void setContinente(String continente) {
		Continente = continente;
	}

	public List<String> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<String> ciudades) {
		this.ciudades = ciudades;
	}
}
