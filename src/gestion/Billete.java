package gestion;

import java.time.LocalDate;

/**
 * Clase que Billete que se genera al comprar uno de los billetes ofrecidos por la aplicaci�n.
 * la informaci�n del billete esta relacionada tanto con los datos propios del usuario como los datos del vuelo.
 * El billete se guardara en un fichero.
 * @author Juan Camilo Ram�rez Zapata.
 * @version 1.0
 */
public class Billete {


	private String nombrePasajero;
	private String apellido1_pasajero;
	private String apellido2_pasajero;
	private String pasaporte;
	private int idPasajero;
	private static int idBillete;
	private int numeroBillete;
	private LocalDate fechaBillete;
	private String origen;
	private String destino;
	private float precioBillete;
	
	





	//start constructor
	
	/**
	 * Contructor de la clase Billete que genera el objeto billete con sus correspondientes datos.
	 * @param usuario que ha reservado el billete
	 * @param fecha del vuelo.
	 * @param precio del billete.
	 */
	public Billete(Usuario usuario, LocalDate fechaBillete, float precio_billete) {
		
		this.nombrePasajero=usuario.getNombre();
		this.apellido1_pasajero=usuario.getApellido1();
		this.apellido2_pasajero=usuario.getApellido2();
		this.pasaporte= usuario.getPasaporte();
		this.idPasajero= usuario.getIdUsuario();
		this.numeroBillete= idBillete++;
		this.fechaBillete = fechaBillete;
		this.precioBillete = precio_billete;
	}
	//finish constructor
	
	
	
	//start getters 
	/**
	 * m�todo que devuelve el nombre del pasajero.
	 * @return nombre del usuario
	 * 
	 */
	public String getNombrePasajero() {
		return nombrePasajero;
	}
	
	/**
	 * m�todo que devuelve el primer apellido del pasajero.
	 * @return el primer apellido del pasajero.
	 */
	public String getApellido1_pasajero() {
		return apellido1_pasajero;
	}
	
	/**
	 * m�todo que devuelve el segundo apellido del pasajero.
	 * @return el segundo apellido del pasajero.
	 */
	public String getApellido2_pasajero() {
		return apellido2_pasajero;
	}
	
	/**
	 * m�todo que devuelve el c�digo del pasaporte del pasajero.
	 * @return el c�digo del pasaporte.
	 */
	public String getPasaporte() {
		return pasaporte;
	}
	
	
	/**
	 * m�todo que devuelve el n�mero identificador de usuario.
	 * @return el n�mero identificador de usuario.
	 */
	public int getIdPasajero() {
		return idPasajero;
	}

	/**
	 * m�todo que devuelve la fecha de vuelo del billete.
	 * @return  fecha de vuelo.
	 */
	public LocalDate getFechaBillete() {
		
		return fechaBillete;
	}
	
	

	/**
	 * dvuelve el n�mero de billete que es �nico para cada billete.
	 * @return n�mero del billete.
	 */
	public int getNumeroBillete() {
		return numeroBillete;
	}



	/**
	 *  m�todo que devuelve el origen del billete
	 * @return origen del vuelo
	 */
	public String getOrigen() {
		return origen;
	}



	/**
	 * m�todo que devuelve el destino del billete
	 * @return destino del vuelo
	 */
	public String getDestino() {
		return destino;
	}
	
	/**
	 *  m�todo que devuelve el precio del billete.
	 * @return precio del vuelo.
	 */
	public float getPrecioBillete() {
		return precioBillete;
	}




	/**
	 * m�todo para cambia el precio del billete.
	 * @param nuevo precio del Billete.
	 */
	public void setPrecioBillete(float precioBillete) {
		this.precioBillete = precioBillete;
	}


	

	/**
	 * m�todo para cambiar el origen del billete
	 * @param nuevo origen
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}


	/**
	 *  m�todo para cambiar el destino
	 * @param el nuevo destino
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}



	
	/**
	 *  m�todo para cambiar la fecha del billete
	 * @param nueva fecha del Billete.
	 */
	public void setFechaBillete(LocalDate fechaBillete) {
		
		this.fechaBillete=fechaBillete;
		
	}

	
}