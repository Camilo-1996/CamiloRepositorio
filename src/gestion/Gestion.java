package gestion;

import java.util.*;

import reserva.Hotel;
import reserva.Reservas;

public class Gestion {
	
	

	public static void ida() {
		
	}
	
	
	public static void idaVuelta() {
		
		
	}
	
	
	public static void vueloHotel() {
		
		
	}
	
	
	public static void finApp() {
		
		
	}
	/*Gestion de datos Vuelos*/
	
	public void buscoDestinosHoteles(){
		
		Scanner scn=new Scanner(System.in);
		String origen;
		System.out.println("Introduce origen");
		origen= scn.next();
		scn.close();
		
		 buscoDestinosHoteles(origen);

	}
		
		
	
	public void buscoDestinosHoteles(String destino) {
		
		Hotel h1= new Hotel(null, null, destino, 0); 
		//El destino tiene como resultado 
	if(destino.equalsIgnoreCase(destino)) {
		
		
	}
	}
	
	public void gestionarPartida() {
		
	}
	
	public void soloIda() {
		
	}
	
	public void idayVuelta() {
		
	}
	/*Gestion datos*/

}
