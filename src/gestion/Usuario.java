package gestion;

public class Usuario extends Persona {

	private static int id;
	private int idUsuario;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String pasaporte;
	

	public Usuario(Persona persona, String pasaporte) {
		super(persona.getNombre(), persona.getApellido1(), persona.getApellido2());
		
		this.nombre=persona.getNombre();
		this.apellido1=persona.getApellido1();
		this.apellido2=persona.getApellido2();
		this.pasaporte=pasaporte;
		
		this.idUsuario=id++;
		
	}


	//Start getters and setters
	public static int getId() {
		return id;
	}


	//id no tiene sett ya que el id es un número único para cada usuario generado por el programa
	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public String getPasaporte() {
		return pasaporte;
	}


	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}
	//finish gettes and setters
	
	
	
}
