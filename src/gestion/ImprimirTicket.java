package gestion;

import java.io.*;

public class ImprimirTicket {
	
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
	
	FileWriter fw;
	BufferedWriter bw;
	BufferedReader br;
	
	/**
	 * Metodo Que Imprime el Billete en el Escritorio en Base al Nombre de Usuario y Siempre en la Ruta del Escritorio
	 */
	public void imprimeTicket() {

		try{
			fw = new FileWriter("C:/Users/" + usuario + "/Desktop/Ticket-" + pasajero + ".txt", true);
			bw = new BufferedWriter(fw);
			br = new BufferedReader(new FileReader("C:/Users/" + usuario + "/Desktop/Ticket-" + pasajero + ".txt"));
			
			bw.write("::::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::::");
			bw.newLine();
			bw.write("::                                                                              ::");
			bw.newLine();
			bw.write("      " + aerolinea);
			bw.newLine();
			bw.write("::                                                                              ::");
			bw.newLine();
			bw.write("                    BOARDING PASS");
			bw.newLine();
			bw.write("::                                                                              ::");
			bw.newLine();
			bw.write("          Nombre Del Pasajero: " + pasajero);
			bw.newLine();
			bw.write("::                                                                              ::");
			bw.newLine();
			bw.write("          Vuelo Nº: " + vuelo + "  Origen: " + origen + "  Destino: " + destino);
			bw.newLine();
			bw.write("::                                                                              ::");
			bw.newLine();
			bw.write("          Fecha: " + fecha + "  Hora: " + hora);
			bw.newLine();
			bw.write("::                                                                              ::");
			bw.newLine();
			bw.write("          Puerta Nº: " + puerta);
			bw.newLine();
			bw.write("::                                                                              ::");
			bw.newLine();
			bw.write("          Asiento Nº: " + asiento);
			bw.newLine();
			bw.write("::                                                                              ::");
			bw.newLine();
			bw.write("::::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::::\n\n");
			bw.flush();
	
			System.out.println("Billete Creado Correctamente En El Escritorio!!");
		
		}catch(IOException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				bw.close();
				br.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	
	}
	
	/**
	 * Metodo Que Lee El Fichero Que Se Creo En El Metodo Anterior
	 */
	public void leerTicket() {
		try{
			String leer = br.readLine();
			
			while(leer != null) {
				System.out.println(leer);
				leer = br.readLine();
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}