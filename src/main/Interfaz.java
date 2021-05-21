package main;

import java.util.Scanner;

public class Interfaz {
	
	Scanner sc = new Scanner(System.in);
	
	public void bienvenida() {
		
		/**
		 * Intefaz de la primera pantalla que vera el usuario Faltan varios try/catch por poner
		 */
		System.out.println("BIENVENIDO!!");
		System.out.println("¿Como Desea Viajar? - Elija un Plan de Vuelo");
		System.out.println("1-Vuelo Solo De Ida | 2-Vuelo De Ida y Vuelta | 3-Ida / Vuelta + Reserva De Hotel | 4-Finalizar Programa");
	
		int opcion = sc.nextInt();
		
		switch(opcion) {
			case 1:
				ida();
			case 2:
				idaVuelta();
			case 3:
				idaVueltaHotel();
			case 4:
				finPrograma();
		}
		
	}
	
	/**
	 * Interfaz simple, solo pide dates al usuario y regresa al menu principal al finalizar 
	 */
	public void ida() {
		String origen;
		String destino;
		String fecha;
		int numbillete;
		System.out.println("Por Favor Indique: Un Origen, Un Destino, Una Fecha y Cuantos Billetes Desea Comprar");
		
		System.out.println("Introduczca un Origen");
		origen = sc.nextLine();
		System.out.println("Introduczca un Destino");
		destino = sc.nextLine();
		System.out.println("Introduczca una Fecha");
		fecha = sc.nextLine();
		System.out.println("Indique Cuantos Billetes");
		numbillete = sc.nextInt();
		bienvenida();
		
	}
	
	/**
	 * Metodo por el momento identico al anterior, faltan añadir metodos
	 */
	public void idaVuelta() {
		String origen;
		String destino;
		String fecha;
		int numbillete;
		System.out.println("Por Favor Indique: Un Origen, Un Destino, Una Fecha y Cuantos Billetes Desea Comprar");
		
		System.out.println("Introduczca un Origen");
		origen = sc.nextLine();
		System.out.println("Introduczca un Destino");
		destino = sc.nextLine();
		System.out.println("Introduczca una Fecha");
		fecha = sc.nextLine();
		System.out.println("Indique Cuantos Billetes");
		numbillete = sc.nextInt();
		bienvenida();
	}

	public void idaVueltaHotel() {
		
		System.out.println("Ida + Hotel o Ida y Vuelta + Hotel - Elija un Plan de Vuelo");
		System.out.println("1-Ida + Hotel | 2-Ida y Vuelta + Hotel | 3-Finalizar Programa");
	
		int opcion = sc.nextInt();
		
		switch(opcion) {
			case 1:
				/**
				 * Metodo Pendiente que Muestre los datos de hoteles
				 */
				ida();
			case 2:
				/**
				 * Metodo Pendiente que Muestre los datos de hoteles
				 */
				idaVuelta();
			case 3:
				finPrograma();
			case 4:
				
		}
		
	}
	
	/**
	 * Metodo que siempre finaliza el programa
	 */
	public void finPrograma() {
		System.out.println("HASTA LUEGO!!");
		System.exit(0);
	}
	
	//INCLUIR INTERFAZ DE BIENVENIDA
	
			/*INTERFAZ OPCIONES QUE TENDRA LAS OPCIONES:
			 *
			 * 1-VUELO IDA (INTRODUCE:
			 * 
			 * 				-ORIGEN
			 * 				-DESTINO
			 * 				-FECHA
			 * 				-NUMERO DE BILLETES A COMPRAR.
			 * 
			 *  		++COMPROBAR DATOS Y LLAMAR A LOS METODOS CORRESPONDIENTES DE LA CLASE GESTION.
			 *  		DESPUES DE PASAR TODOS LOS FILTROS SE GENERA UN/VARIOS  OBJETO/S VUELOS Y PERSONAS QUE DESPUES SE PASARAN 
			 *  		OBJETO/S BILLETE QUE SE CREE  Y QUE GUARDARA LOS DATOS ESPECIFICADOS
			 *  
			 *  			)
			 *  
			 * 2-VUELO IDA Y VUELTA( INTRODUCE:
			 * 
			 * 						-ORIGEN
			 * 						-DESTINO
			 * 						-FECHA
			 * 						-NUMERO DE BILLETES A COMPRAR
			 * 
			 * 			+SE CONSULTA PRIMERO EL/LOS VILLETE/S DE IDA Y SE MUESTRAN EL/LOS VILLETE/S DE IDA DISPONIBLES EN LA BD.
			 * 			+ACONTINUACION UN MÉTODO INVIERTE EL DATO DE ORIGEN EN DESTINO Y EL DE DESTINO EN ORIGEN Y
			 * 				HACE LA OPERACION DE CONSULTA Y LE MUESTRA LOS OPCIONES DE REGRESO.
			 * 
			 * 
			 * 		++ LOS METODOS LLAMADOS EN LAS ACCIONES ANTERIORES COMPRUEBAN LOS DATOS EN LA BD Y VA GUARDANDO LA INFO EN UN OBJETO BILLETE TANTAS VECES COMO VILLETES 
			 * 			SE GENEREN (2 COMO MINIMO (IDA Y VUELTA) O LA CANTIDAD DE BILLETESIDA-VUELTA QUE EL USERIO COMPRE)	
			 *	
			 * 3-VUELO+HOTEL (SALTA OTRA INTERFAZ:
			 * 					-IDA + HOTEL. (IGUAL QUE VUELO IDA PERO AHORA SE GESTIONA EL HOTEL, APARECERAN LOS HOTELES SEGUN EL ORIGEN ESPECIFICADO, SE COMPRUEBA LAS
			 * 								 PLAZAS SEGUN EL NUMERO DE BILLETES COMPRADOS. SE GENERA UN OBJETO RESERVA QUE CONTIENE: BILLETE+HOTEL)
			 * 
			 * 
			 * 					-IDA + VUELTA + HOTAL (IGUAL QUE VUELO IDA+VUELTA PERO AÑADIENDO EL HOTEL)
			 * 
			 * 				)
			 * 
			 * 4-SALIR DE LA APP (INTERFAZ DE DESPEDIDA DE LA APP)
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 			++ CUANDO SE HAYA HECHO UNA OPERACION ( LA COMPRA DEL BILLETE) SE PREGUNTARA AL USUARIO SI QUIERE REALIZAR OTRA OPERACION
			 * 				O QUIERE SALIR DE LA APP. 
			 * 
			 * 
			 */
	
}