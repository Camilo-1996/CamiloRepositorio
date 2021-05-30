package gestion;

import java.time.LocalDate;

public class Billete {

	//esta clase genera un fichero txt

	private Persona datosPasajero;
	private static long numeroBillete;
	private long nBillete;
	private LocalDate fecha;
	
	
	
	//método para consultar los datos del billete
	public void datosBillete() {
		
		System.out.println("DATOS BILLETE Nº "+ nBillete);
			
		//falta poner los otros datos persona y Vuelo
	}
	
	public void setFecha(int dia, int mes, int año) {
		
		
	}
	//Creo Getters y Setters de apoyo
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	

	
}