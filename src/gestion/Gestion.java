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
	public void ida() {
		String origen = "";
		String destino ="";
		Vuelo pasajero;
		System.out.println("Introduce el origen");
		origen = MenuInicio.scn.next();
		System.out.println("Introduce el destino");
		destino = MenuInicio.scn.next();
		
		
		
	}
	
	
	public void idaVuelta() {
		
		
	}
	
	
	public void vueloHotel() {
		String origen = "";
		String destino = "";
					System.out.println("Introduce origen");
					origen =  MenuInicio.scn.next();
					System.out.println("Introduce destino");
					destino =  MenuInicio.scn.next();
					try {
					buscoHoteles(origen);
					}catch(NoSuchElementException e) {
						e.printStackTrace();
						System.out.println(e.getMessage());
					}catch(Exception e) {
						e.printStackTrace();
						System.out.println(e.getMessage());
					}

	}
	
	
	public void finApp() {
		
		
	}
	/*Gestion de datos Vuelos*/
	
	
		
	
	
	public void gestionarPartida() {
		
	}
	
	public void soloIda(String origen, String destino) {
		LocalDate entrada = null; 
		LocalDate salida = null;
		int dia =0;
		int  mes =0;
		String compañía= "";
		Vuelo pasajero = new Vuelo(destino, origen, compañía);
		String fecha = new String ("111");
		System.out.println("Introduce el origen");
		origen = MenuInicio.scn.next();
		System.out.println("Introduce el destino");
		destino = MenuInicio.scn.next();
		solicitoFechas(dia, mes,entrada);
		solicitoFechas(dia, mes,salida);
	}
	
	public void idayVuelta() {
		
	}
	/*Gestion datos*/

	/*Operaciones y metodos de la clase Hoteles*/
	

	public void buscoHoteles(String destino) {
		LocalDate entrada = null; 
		LocalDate salida = null;
		int dia =0;
		int  mes =0;
		Hotel h1= new Hotel(entrada, salida, destino, 0); 
		//El destino tiene como resultado 
		solicitoFechas(dia, mes, entrada);
		System.out.println("Tenemos estos precios para estos hoteles");
		precioHotel(dia,mes,entrada);
	}
	
	/*
	 * Este metodo solicita las fechas al usuario introducuieno 
	 * **/
	//El flujo Scnner me da error al momento de solicitar las fechas
	public void solicitoFechas(int dia, int  mes, LocalDate fecha) {
			System.out.println("Introduce la fecha");
				dia = MenuInicio.scn.nextInt();
				mes = MenuInicio.scn.nextInt();
				fecha = LocalDate.of(2021, mes, dia);
		System.out.println(fecha.toString());
	}
		
	
	/******************************************************************************************/
	/**************************METODOS DE PRECIOS HOTEL, VUELOS*******************************/ 
	/*
	 * 	double precio_MEDIO = Math.random()*200 +70;
		double precio_ALTO = Math.random()*600 +100;*/
	
	/*Consulta de precios*/
	/**
	 * Metodo que contiene un array en la cual se rellena de numeros aleatroios de 500 a 800 para precio de
	 * vuelos de solo ida
	 * */
	public void precioHotel(int dia, int  mes,LocalDate fecha) {
		float precio_Hotel = (float) (Math.random()*100 +150);
		int eligoPrecio = 0;
		float [] listado_precio = new float [3];
		LocalDate [] fechas = new LocalDate[3];
		for (int i = 0; i < listado_precio.length; i++) {
				dia++;
				mes = mes+1;
				listado_precio[i] = precio_Hotel;
				fechas[i] = fecha.of(2021, mes, dia);
				System.out.print(" "+listado_precio[i]);
				System.out.println(" "+fechas[i]);
		}
		
		
	}
	/**
	 * Metodo que contiene un array en la cual se rellena de numeros aleatroios de 500 a 800 para precio de
	 * vuelos de solo ida
	 * */
	public void precioVueloSoloIda() {
		double precio_VueloSoloIda = Math.random()*500 +800;
		double [] listado_precio = new double [10];
		String [] fechas_desde_hasta = new String [10];
		
		for (int i = 0; i < listado_precio.length; i++) {
				listado_precio[i] = precio_VueloSoloIda;
				System.out.print(" "+listado_precio[i]);
		

				
			}
		}
		
	
	
	
}


	