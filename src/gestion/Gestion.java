package gestion;

import java.sql.Date;
import java.time.LocalDate;

import billete.Persona;
import billete.Vuelo;
import gestion.BBDDtest;
import main.MenuInicio;
import reserva.Hotel;

import java.util.*;

public class Gestion {
	Scanner scn=new Scanner(System.in);
	
	MenuInicio llamado = new MenuInicio();
	public void ida() {
		String origen = "";
		String destino ="";
		Vuelo pasajero = new Vuelo(destino, origen, compañia);
		System.out.println("Introduce el origen");
		origen = scn.next();
		System.out.println("Introduce el destino");
		destino = scn.next();
		
		
		
	}
	
	
	public void idaVuelta() {
		
		
	}
	
	
	public void vueloHotel() {
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
	
	
	public void finApp() {
		
		
	}
	/*Gestion de datos Vuelos*/
	
	
		
	
	
	public void gestionarPartida() {
		
	}
	
	public void soloIda(String origen, String destino) {
		Date entrada = null; 
		Date salida = null;
		int dia =0;
		int  mes =0;
		String compañía= "";
		Vuelo pasajero = new Vuelo(destino, origen, compañía);
		String fecha = new String ("111");
		System.out.println("Introduce el origen");
		origen = scn.next();
		System.out.println("Introduce el destino");
		destino = scn.next();
		solicitoFechas(dia, mes, entrada);
	}
	
	public void idayVuelta() {
		
	}
	/*Gestion datos*/

	/*Operaciones y metodos de la clase Hoteles*/
	

	public void buscoHoteles(String destino) {
		Date entrada = null; 
		Date salida = null;
		int dia =0;
		int  mes =0;
		Hotel h1= new Hotel(entrada, salida, destino, 0); 
		//El destino tiene como resultado 
		solicitoFechas();

		
		System.out.println("Tenemos estos precios para estos hoteles");
		precioHotel();
	
	}
	//El flujo Scnner me da error al momento de solicitar las fechas
	public void solicitoFechas() {
			String fecha = "111";
			System.out.println("Introduce la fecha");
			for (int i = 0; i < 2; i++) {
				fecha = scn.next().charAt(1);
				System.out.println(" - ");
				fecha = scn.next().charAt(2);
			}
		System.out.println("ok");
	}
		
	
	/******************************************************************************************/
	/**************************METODOS DE PRECIOS HOTEL, VUELOS*******************************/ 
	/*
	 * 	double precio_MEDIO = Math.random()*200 +70;
		double precio_ALTO = Math.random()*600 +100;*/
	
	/*Consulta de precios*/
	public void precioHotel() {
		double precio_Hotel = Math.random()*100 +150;
		double [] listado_precio = new double [10];
		String [] fechas_desde_hasta = new String [10];
		String fecha = "111";
		
		for (int i = 0; i < listado_precio.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < listado_precio.length; j++) {
				listado_precio[i] = precio_Hotel;
				System.out.print(" "+listado_precio[i]);
				System.out.println(" ");
		

				
			}
		}
		
	}
	public void precioVuelos() {
		double precio_Hotel = Math.random()*500 +800;
		double [] listado_precio = new double [10];
		String [] fechas_desde_hasta = new String [10];
		
		for (int i = 0; i < listado_precio.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < listado_precio.length; j++) {
				listado_precio[i] = precio_Hotel;
				System.out.print(" "+listado_precio[i]);
				System.out.println(" ");
		

				
			}
		}
		
	}
	
	
}


	