package main;

import java.io.*;

public class ImprimirTicket {
	
	public static void main(String[] args) {
		
		/**
		 * Declaracion de Atributos(Plantilla)
		 */
		String aerolinea = "AEROLINEA_TEST";
		String pasajero = "Nombre_Test";
		int vuelo = 512;
		String origen = "Nombre Origen";
		String destino = "Nombre Destino";
		String fecha = "17/12/2021";
		String hora = "12:30pm";
		int puerta = 7;
		int asiento = 13;
		String usuario = System.getProperty("user.name");
		
		try{
			/**
			 * Declaracion del objeto FileWriter y apertura de los flujos de lectura y escritura
			 */
			FileWriter fw = new FileWriter("C:/Users/"+usuario+"/Desktop/Ticket-"+pasajero+".txt");
			BufferedWriter bw = new BufferedWriter(fw);
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/"+usuario+"/Desktop/Ticket-"+pasajero+".txt"));
			/**
			 * Metodo Que Siempre Imprime el Billete en el Escritorio sin Importar Quien sea el Usuario y Siempre en el Escritorio
			 */
			bw.write("::::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::::");
			bw.newLine();
			bw.write("::                                                                              ::");
			bw.newLine();
			bw.write("      "+aerolinea);
			bw.newLine();
			bw.write("::                                                                              ::");
			bw.newLine();
			bw.write("                    BOARDING PASS");
			bw.newLine();
			bw.write("::                                                                              ::");
			bw.newLine();
			bw.write("          Nombre Del Pasajero: "+pasajero);
			bw.newLine();
			bw.write("::                                                                              ::");
			bw.newLine();
			bw.write("          Vuelo Nº: "+vuelo+"  Origen: "+origen+"  Destino: "+destino);
			bw.newLine();
			bw.write("::                                                                              ::");
			bw.newLine();
			bw.write("          Fecha: "+fecha+"  Hora: "+hora);
			bw.newLine();
			bw.write("::                                                                              ::");
			bw.newLine();
			bw.write("          Puerta Nº: "+puerta);
			bw.newLine();
			bw.write("::                                                                              ::");
			bw.newLine();
			bw.write("          Asiento Nº: "+asiento); 
			bw.newLine();
			bw.write("::                                                                              ::");
			bw.newLine();
			bw.write("::::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::::");
			bw.flush();
			
			System.out.println("Billete Creado Correctamente En El Escritorio!!");
			
			/**
			 * Metodo Que Siempre Lee El Fichero Que Se Creo En El Metodo Anterior
			 */
			String leer = br.readLine();
			while(leer != null) {
				System.out.println(leer);
				leer = br.readLine();
			}
			/**
			 * Cierre de los flujos
			 */
			bw.close();
			br.close();
		}
		/**
		 * Captura De Posibles Excepciones
		 */
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}
	
}