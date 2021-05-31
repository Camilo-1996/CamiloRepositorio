package gestion;

import java.time.LocalDate;

/**
 * Clase que Billete que se genera al comprar uno de los billetes ofrecidos por la aplicación.
 * la información del billete esta relacionada tanto con los datos propios del usuario como los datos del vuelo.
 * El billete se guardara en un fichero.
 * @author Juan Camilo Ramírez Zapata.
 * @version 1.0.
 */
public class Billete {


	private String nombrePasajero;
	private String apellido1_pasajero;
	private String apellido2_pasajero;
	private String pasaporte;
	private int idPasajero;
	private static int idBillete;
	private int numeroBillete;
	private LocalDate fechaIda;
	private LocalDate fechaVuelta;
	private String origen;
	private String destino;
	private float precioBillete;
	
	





	//start constructors
	
	/**
	 * Contructor de la clase Billete que genera el objeto billete de ida con sus correspondientes datos.
	 * @param usuario que ha reservado el billete
	 * @param fecha de ida del vuelo.
	 * @param precio del billete.
	 */
	public Billete(Usuario usuario, LocalDate fechaIda, float precio_billete) {
		
		this.nombrePasajero=usuario.getNombre();
		this.apellido1_pasajero=usuario.getApellido1();
		this.apellido2_pasajero=usuario.getApellido2();
		this.pasaporte= usuario.getPasaporte();
		this.idPasajero= usuario.getIdUsuario();
		this.numeroBillete= idBillete++;
		this.fechaIda = fechaIda;
		this.precioBillete = precio_billete;
	}
	
	
	/**
	 * Contructor de la clase Billete que genera el objeto billete de ida y vuelta con sus correspondientes datos.
	 * @param usuario que ha reservado el billete
	 * @param fecha de ida del vuelo.
	 * @param fecha de vuelta del vuelo
	 * @param precio del billete.
	 */
	public Billete(Usuario usuario, LocalDate fechaIda, LocalDate fechaVuelta,  float precio_billete) {
		
		this.nombrePasajero=usuario.getNombre();
		this.apellido1_pasajero=usuario.getApellido1();
		this.apellido2_pasajero=usuario.getApellido2();
		this.pasaporte= usuario.getPasaporte();
		this.idPasajero= usuario.getIdUsuario();
		this.numeroBillete= idBillete++;
		this.fechaIda = fechaIda;
		this.fechaVuelta= fechaVuelta;
		this.precioBillete = precio_billete;
	}
	
	//finish constructors
	
	
	
	//start getters 
	/**
	 * método que devuelve el nombre del pasajero.
	 * @return nombre del usuario
	 * 
	 */
	public String getNombrePasajero() {
		return nombrePasajero;
	}
	
	/**
	 * método que devuelve el primer apellido del pasajero.
	 * @return el primer apellido del pasajero.
	 */
	public String getApellido1_pasajero() {
		return apellido1_pasajero;
	}
	
	/**
	 * método que devuelve el segundo apellido del pasajero.
	 * @return el segundo apellido del pasajero.
	 */
	public String getApellido2_pasajero() {
		return apellido2_pasajero;
	}
	
	//hasta aquí
	
	
	/**
	 * método que devuelve el código del pasaporte del pasajero.
	 * @return el código del pasaporte.
	 */
	public String getPasaporte() {
		return pasaporte;
	}
	
	
	/**
	 * método que devuelve el número identificador de usuario.
	 * @return el número identificador de usuario.
	 */
	public int getIdPasajero() {
		return idPasajero;
	}

	/**
	 * método que devuelve la fecha de ida del vuelo.
	 * @return  fecha de ida vuelo.
	 */
	public LocalDate getFechaIda() {
		
		return fechaIda;
	}
	
	
	/**
	 * método que devuelve la fecha de vuelta del vuelo.
	 * @return  fecha de vuelta del vuelo.
	 */
	public LocalDate getFechaVuelta() {
		
		return this.fechaVuelta;
	}
	
	

	/**
	 * dvuelve el número de billete que es único para cada billete.
	 * @return número del billete.
	 */
	public int getNumeroBillete() {
		return numeroBillete;
	}



	/**
	 *  método que devuelve el origen del billete
	 * @return origen del vuelo
	 */
	public String getOrigen() {
		return origen;
	}



	/**
	 * método que devuelve el destino del billete
	 * @return destino del vuelo
	 */
	public String getDestino() {
		return destino;
	}
	
	/**
	 *  método que devuelve el precio del billete.
	 * @return precio del vuelo.
	 */
	public float getPrecioBillete() {
		return precioBillete;
	}




	/**
	 * método para cambia el precio del billete.
	 * @param nuevo precio del Billete.
	 */
	public void setPrecioBillete(float precioBillete) {
		this.precioBillete = precioBillete;
	}


	

	/**
	 * método para cambiar el origen del billete
	 * @param nuevo origen
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}


	/**
	 *  método para cambiar el destino
	 * @param el nuevo destino
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}



	
	/**
	 *  método para cambiar la fecha de ida del billete
	 * @param nueva fecha de ida del Billete.
	 */
	public void setFechaIda(LocalDate fechaIda) {
		
		this.fechaIda=fechaIda;
		
	}
	
	/**
	 *  método para cambiar la fecha de vuelta del billete
	 * @param nueva fecha de vuelta del Billete.
	 */
	public void setFechaVuelta(LocalDate fechaVuelta) {
		
		this.fechaVuelta=fechaVuelta;
		
	}

	
}