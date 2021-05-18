package reserva;

import java.sql.Date;
import java.time.LocalDate;

import billete.Persona;

public class Hotel {
	
	private Date fecha_entrada;
	private Date fecha_salida;
	private int dias_estancia;
	private int cupo;
	private String destino;
	private Persona persona;
	
	public Hotel(Date fecha_entrada, Date fecha_salida, String destino) {
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.destino = destino;
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
