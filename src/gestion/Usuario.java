package gestion;

/**
 * Clase Usuario que hereda de Persona y crea el usuario de la aplicación del que se 
 * guardara los datos tanto de persona como de usuario. Estos datos despues se almacenaran en billete.
 * @author Juan Camilo Ramírez Zapata.
 * @version 1.0.
 *
 */
public class Usuario extends Persona {

	private static int id;
	private int idUsuario;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String pasaporte;
	

	/**
	 * Constructor de la clase usuario que recibe una persona por parametro y un código de pasaporte
	 * que es la variable diferencial de la clase ya que todos los usuarios se tienen que registrar con 
	 * un pasaporte para la correcta reserva de vuelo.
	 * @param persona que va ser usuario.
	 * @param pasaporte para poder reservar el billete
	 */
	public Usuario(Persona persona, String pasaporte) {
		super(persona.getNombre(), persona.getApellido1(), persona.getApellido2());
		
		this.nombre=persona.getNombre();
		this.apellido1=persona.getApellido1();
		this.apellido2=persona.getApellido2();
		this.pasaporte=pasaporte;
		this.idUsuario=id++;
		
	}


	//Start getters and setters
	/**
	 * Devuelve el id del usuario, este id único se genera cada vez que se genera un usuario
	 * de forma automatica.
	 * @return
	 */
	public int getIdUsuario() {
		return idUsuario;
	}


	/**
	 * método heredado que devuelve el nombre del usuario.
	 * @return nombre del usuario
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * método que permite cambiar el nombre del usuario
	 * @param nuevo nombre del usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * método heredado que devuelve el primer apellido del usuario.
	 * @return el primer apellido del usuario
	 */
	public String getApellido1() {
		return apellido1;
	}


	/**
	 * método que permite cambiar el primer apellido del usuario
	 * @param nuevo primer apellido del usuario
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	/**
	 * método heredado que devuelve el segundo apellido del usuario.
	 * @return el segundo apellido del usuario
	 */
	public String getApellido2() {
		return apellido2;
	}

	

	/**
	 * método que permite cambiar el segundo apellido del usuario
	 * @param nuevo segundo apellido del usuario
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	/**
	 * método heredado que devuelve el código del pasaporte del usuario.
	 * @return el pasaporte del usuario
	 */
	public String getPasaporte() {
		return pasaporte;
	}


	/**
	 * método que permite cambiar el código del pasaporte del usuario
	 * @param nuevo pasaporte del usuario
	 */
	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}
	//finish gettes and setters



	
	
	
}
