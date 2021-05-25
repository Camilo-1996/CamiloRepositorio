package gestion;

import java.util.*;

import reserva.Hotel;
import reserva.Reservas;

public class Gestion {
	Reservas reservas = new Reservas();
	
	public void opcion(int opcion) {
		
		switch(opcion) {
		case 1: 
			soloIda();
		case 2:
			idayVuelta();
		case 3:
			buscoDestinosHoteles();
			
		}
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
