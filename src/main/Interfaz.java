package main;

import java.util.Scanner;

import gestion.Gestion;

public class Interfaz {
	
	private Scanner scn = new Scanner(System.in);
	private boolean opcionCorrecta;
	
	
	public void menuInicio() {
		
		System.out.println("*************************************************************************************************************");
		System.out.println("**************************************    BIENVENIDO A VUELINKING!!  ***************************************");
		System.out.println("*************************************************************************************************************");
		System.out.println("***************************************    TU  APP  DE  VIAJES    *************************************************\n\n");

		
	}
	
	
	
	public void menuUsuario() {
		
		System.out.println("�ELIJE TU FORMA DE VIAJAR CON NOSOTROS!");
		System.out.println("1-SOLO IDA \n2-IDA Y VUELTA  \n3-VUELO + HOTEL  \n4-SALIR DE LA APP");
	
		opcionCorrecta=false;
		int opcionElejida=0;
		
		while(opcionCorrecta!=true) {
			
			
			try {
				
				opcionElejida= scn.nextInt();
				
				opcionCorrecta=true;
				
			}catch(Exception exc){
				
				System.out.println("El valor introducido no es correcto");
				
			}
			
		} 
		
		switch(opcionElejida) {
	
		case 1:
			Gestion.ida();
			
		case 2:
			Gestion.idaVuelta();
				
		case 3:
			Gestion.vueloHotel();
			
		case 4:
			
			Gestion.finApp();
		}
		
	}
	
	
	public void menuFinAPP() {
		
		System.out.println("GRACIAS POR UTLIZAR NUESTRA APP\n "
				+ "ESPERAMOS VERTE PRONTO EN VUELIKING");
		
	}
	
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
			 * 			+ACONTINUACION UN M�TODO INVIERTE EL DATO DE ORIGEN EN DESTINO Y EL DE DESTINO EN ORIGEN Y
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
			 * 					-IDA + VUELTA + HOTAL (IGUAL QUE VUELO IDA+VUELTA PERO A�ADIENDO EL HOTEL)
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
	
