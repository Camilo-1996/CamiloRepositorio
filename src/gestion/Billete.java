package gestion;

import java.time.LocalDate;

public class Billete {


	private String nombrePasajero;
	private String apellido1_pasajero;
	private String apellido2_pasajero;
	private String pasaporte;
	private int idPasajero;
	private static int idBillete;
	private int numeroBillete;
	private LocalDate fechaBillete;
	
	//start constructor
	public Billete(Usuario usuario) {
		
		this.nombrePasajero=usuario.getNombre();
		this.apellido1_pasajero=usuario.getApellido1();
		this.apellido2_pasajero=usuario.getApellido2();
		this.pasaporte= usuario.getPasaporte();
		this.idPasajero= usuario.getIdUsuario();
		this.numeroBillete= idBillete++;
		
	}
	
	
	
	
	//start getters 
	
	public String getNombrePasajero() {
		return nombrePasajero;
	}
	
	
	public String getApellido1_pasajero() {
		return apellido1_pasajero;
	}
	
	
	public String getApellido2_pasajero() {
		return apellido2_pasajero;
	}
	
	
	public String getPasaporte() {
		return pasaporte;
	}
	
	
	public int getIdPasajero() {
		return idPasajero;
	}
	
	
	public static int getIdBillete() {
		return idBillete;
	}
	
	
	
	public LocalDate getFechaBillete() {
		
		return fechaBillete;
	}

	
	/*fecha es la unica variable que tiene setter ya que es la unica variable que se puede cambiar de esta clase.
	 * Para cambiar los datos de usuario hay que ir a la clase correspondiente Usuario.
	 * CAMILO
	 */
	public void setFechaBillete(LocalDate fechaBillete) {
		
		this.fechaBillete=fechaBillete;
		
	}

	
}