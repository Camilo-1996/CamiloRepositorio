package reserva;

import java.sql.Date;
import java.time.LocalDate;

import billete.Persona;
import gestion.BBDDtest;

import java.util.*

;public class Hotel {
	
	
	private Date fecha_entrada;
	private Date fecha_salida;
	private int dias_estancia;
	private int cupo;
	private String destino;
	private Persona persona;
	private int año = 2021;
	private int mes;
	private int dia;
	
	public Hotel(Date fecha_entrada, Date fecha_salida, String destino, int dias_estancia) {
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.destino = destino;
		this.dias_estancia = dias_estancia;
	}
	//Nombre destino hace referencia al nombre de la columna que vendra en la tabla de la base de datos
			//Llamo al metodo que solicita los datos al usuario
		
		
	
	


	/*public void disponibilidadRecinto(String nombre_hoteles) {
		ArrayList<Integer> recintoHoteles = new Arrayist
		

	}*/
	/*Listado de los hoteles 
	 * 
	 * CREATE FUNCTION nombre_hotel
	 * BEGIN
	 * 	DECLARE RESULTADO TEXT; 
	 * 		SELECT nombre
	 *		FROM hotel
	 *		WHERE = (nombre = elnombre);
	 *		INTO RESULTADO;
	 * RETURN RESULTADO;
	 * END;

	 * */
	
	
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
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
	
	
	

}
