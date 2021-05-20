package reserva;

import java.sql.Date;
import java.time.LocalDate;

import billete.Persona;
import java.util.*

;public class Hotel {
	
	private LocalDate fecha_entrada;
	private LocalDate fecha_salida;
	private int dias_estancia;
	private int cupo;
	private String destino;
	private Persona persona;
	
	public Hotel(LocalDate fecha_entrada, LocalDate fecha_salida, String destino, int dias_estancia) {
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.destino = destino;
		this.dias_estancia = dias_estancia;
	}
	//Nombre destino hace referencia al nombre de la columna que vendra en la tabla de la base de datos
			//Llamo al metodo que solicita los datos al usuario
		
		
	
	
	/**
	 * System.out.println("Año: "+ (fecha2.getYear()+1900) );
 		System.out.println("Mes: "+fecha2.getMonth());
 		System.out.println("Dia: "+fecha2.getDate());
 		System.out.println("Dia de la semana "+fecha2.getDay());
 		System.out.println("Hora: "+fecha2.getHours());
 		System.out.println("Minutos: "+fecha2.getMinutes());
 		System.out.println("Segundos: "+fecha2.getSeconds());
	 * 
	 * */
	/*
	 * consulto disponibilidad segun fechas, busca en la base de datos el nombre aleatoriogenerado segun la consulta, y devuelve numeros aleatroios de un array de numeros
	 * reales
	 */
	public void disponibilidadRecinto(String nombre_hoteles) {
		

	}
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
	public void precios() {
		double precio_BAJO = Math.random()*100 +40;
		double precio_MEDIO = Math.random()*200 +70;
		double precio_ALTO = Math.random()*600 +100;
		double [][] listado_precio = new double [3][3];

		
		for (int i = 0; i < listado_precio.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < listado_precio.length; j++) {
				listado_precio[i][j] = precio_BAJO;
				listado_precio[j][i] = precio_MEDIO;
				System.out.print(" "+listado_precio[i][j]);
				System.out.println("-");

				
			}
		}
		
	}
	
	
	
	/*
	 * Getters
	 * */
		
	public LocalDate getFecha_entrada() {
		return fecha_entrada;
	}
	public LocalDate getFecha_salida() {
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
