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
	
	
	MenuInicio llamado = new MenuInicio();
	public static void ida() {
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
	
	public void soloIda(String origen, String Destino) {
		Vuelo pasajero = new Vuelo(Destino, origen, Destino);
		
		
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
		solicitoFechas(dia, mes, salida);
		
		System.out.println("Tenemos estos precios para estos hoteles");
		precios();
	
	}
	//El flujo Scnner me da error al momento de solicitar las fechas
	public static void solicitoFechas(int dia, int mes, Date fecha) {
			Scanner nc = new Scanner(System.in);
			System.out.println("Introduce la fecha de entrada");
			for (int i = 0; i < 2; i++) {
				dia = nc.nextInt();
				System.out.println(" - ");
				mes = nc.nextInt();
			}
			fecha = new Date(122, mes, dia);
		System.out.println("ok");
	}
		
	/*
	 * 	double precio_MEDIO = Math.random()*200 +70;
		double precio_ALTO = Math.random()*600 +100;*/
	
	/*Consulta de precios*/
	public static void precios() {
		double precio_Hotel = Math.random()*100 +150;
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


	