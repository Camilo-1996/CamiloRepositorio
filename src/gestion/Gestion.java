package gestion;

import java.sql.Date;
import java.time.LocalDate;

import billete.Persona;
import gestion.BBDDtest;
import main.MenuInicio;
import reserva.Hotel;

import java.util.*;

public class Gestion {
	
	
	MenuInicio llamado = new MenuInicio();
	public static void ida() {
		
	}
	
	
	public static void idaVuelta() {
		
		
	}
	
	
	public static void vueloHotel() {
		Scanner scn=new Scanner(System.in);
		String origen = "España";
					System.out.println("Introduce origen");
					try {
					buscoHoteles(origen);
					}catch(NoSuchElementException e) {
						System.out.println(e.getMessage());
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}

	}
	
	
	public static void finApp() {
		
		
	}
	/*Gestion de datos Vuelos*/
	
	
		
	
	
	public void gestionarPartida() {
		
	}
	
	public void soloIda() {
		
	}
	
	public void idayVuelta() {
		
	}
	/*Gestion datos*/

	/*Operaciones y metodos de la clase Hoteles*/
	

	public static void buscoHoteles(String destino) {
		Date entrada = null; 
		Date salida = null;
		int dia =0;
		int  mes =0;
		Hotel h1= new Hotel(entrada, salida, destino, 0); 
		//El destino tiene como resultado 
		solicitoFechas(dia, mes, entrada);
	
	
	}
	//El flujo Scnner me da error al momento de solicitar las fechas
	public static void solicitoFechas(int dia, int mes, Date fecha) {
			Scanner scn = new Scanner(System.in);
			fecha = new Date(122, mes, dia);
			System.out.println("Introduce la fecha de entrada");
			dia = scn.nextInt();
			mes = scn.nextInt();
		System.out.println(fecha);
	}
		
	
}


	