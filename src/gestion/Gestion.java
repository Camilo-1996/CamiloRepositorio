package gestion;

import java.sql.Date;
import java.time.LocalDate;

import billete.Persona;
import gestion.BBDDtest;
import main.Interfaz;
import reserva.Hotel;

import java.util.*;

public class Gestion {
	Scanner scn=new Scanner(System.in);
	
	Interfaz llamado = new Interfaz();
	public static void ida() {
		
	}
	
	
	public static void idaVuelta() {
		
		
	}
	
	
	public static void vueloHotel(opcionElegida) {
		switch(opcionElegida){//Llamar a a variable que de la subOpcion de Vuelo mas hotel
			
			case 1:
				//hotel+ vuelo
				
			case 2:

					System.out.println("Introduce origen");
					String origen= scn.next();				
					buscoDestinosHoteles(origen);

				
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
	

	public void buscoDestinosHoteles(String destino) {
		Date entrada; 
		Date salida; 
		Hotel h1= new Hotel(entrada, salida, destino, 0); 
		//El destino tiene como resultado 
	if(destino.equalsIgnoreCase(destino)) {
		System.out.println("Introduce la fecha de entrada");
		int dia = scn.nextInt();
		h1.setDia(dia);
		int mes = scn.nextInt();
		h1.setMes(mes);
		h1.setFecha_entrada(new Date(dia, mes, h1.getAño()));
		System.out.println("Introduce la fecha de salida 'dia/mes'");
		int dia1 = scn.nextInt();
		System.out.println("");
		int mes1 = scn.nextInt();
		h1.setFecha_salida(new Date(dia1, mes1, h1.getAño()));
	
	
	}
	}
		
	
}


	