package reserva;

import java.sql.Date;
import java.time.LocalDate;

import billete.Persona;
import java.util.*

;public class Hotel {
	
	private Date fecha_entrada;
	private Date fecha_salida;
	private int dias_estancia;
	private int cupo;
	private String destino;
	private Persona persona;
	
	public Hotel(Date fecha_entrada, Date fecha_salida, String destino, int dias_estancia) {
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.destino = destino;
		this.dias_estancia = dias_estancia;
	}
	//Nombre destino hace referencia al nombre de la columna que vendra en la tabla de la base de datos
	public void buscoDestinos(String Destino_ciudad) {
		String destino = null;
		//El destino tiene como resultado 
		if(Destino_ciudad.equalsIgnoreCase(destino)) {
			precios();
		}
			//Llamo al metodo que solicita los datos al usuario
		
		
	}
	/*
	 * consulto disponibilidad segun fechas, busca en la base de datos el nombre aleatoriogenerado segun la consulta, y devuelve numeros aleatroios de un array de numeros
	 * reales
	 */
	public void disponibilidadRecinto(String nombre_hoteles) {
		Double [] disponibilidad = new Double[3];
		
		
		
	}
	public void precios() {
		double precios = Math.random()*500 +70;
		double [] listado_precio = new double [3];
		
		for (int i = 0; i < listado_precio.length; i++) {
			listado_precio[i] = precios;
		}
		
	}
	
	
	
	/*
	 * Getters
	 * */
		
	public Date getFecha_entrada() {
		return fecha_entrada;
	}
	public Date getFecha_salida() {
		return fecha_salida;
	}
	public int getDias_estancia() {
		return dias_estancia;
	}
	public int getCupo() {
		return cupo;
	}
	public String getDestino() {
		return destino;
	}
	public Persona getPersona() {
		return persona;
	}

	/*
	 * Setters
	 * */
	
	public void setFecha_entrada(Date fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}
	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}
	public void setDias_estancia(int dias_estancia) {
		this.dias_estancia = dias_estancia;
	}
	public void setCupo(int cupo) {
		this.cupo = cupo;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	/*public solicitoDatosdeEntrada (Date fecha_entrada ) {
		
	}*/
	
	
	
	
	

}
