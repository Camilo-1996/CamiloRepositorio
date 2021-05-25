package billete;

public class Usuario extends Persona {

	private static int id;
	private int idUsuario;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String pasaporte;
	
	public Usuario(String nombre, String apellido1, String apellido2, String pasaporte ) {
		super(nombre, apellido1, apellido2, pasaporte);
		
		idUsuario=id++;
		this.nombre= nombre;
		this.apellido1= apellido1;
		this.apellido2= apellido2;
		this.pasaporte=pasaporte;
		
	}
	
	
}
