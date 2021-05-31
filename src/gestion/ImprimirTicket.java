package gestion;

import java.util.Random;
import java.io.*;

public class ImprimirTicket {
	
	static Random num = new Random();
	
	static String aerolinea = "AEROLINEA_TEST";
	static String pasajeroN = "Nombre_Test";
	static String pasajeroA = "Apellido_Test";
	static int vuelo = num.nextInt(998+1);
	static String origen = "Nombre Origen";
	static String destino = "Nombre Destino";
	static String fecha = "17/12/2021";
	static String hora = "12:30pm";
	static int puerta = num.nextInt(9+1);
	static int asiento = num.nextInt(179+1);
	
	static private String usuario = System.getProperty("user.name");
	
	static private FileWriter fw;
	static private BufferedWriter bw;
	static private BufferedReader br;
	
	/**
	 * Metodo Que Imprime el Billete en el Escritorio en Base al Nombre de Usuario y Siempre en la Ruta del Escritorio
	 */
	public static void imprimeTicket() {
		
		File directorio = new File("C:/Users/" + usuario + "/Desktop/Tickets_Comprados");
        if (!directorio.exists()) {
            if(directorio.mkdirs()) {
                System.out.println("Directorio \"Tickets_Comprados\" Creado");
            }else {
                System.out.println("Error al crear directorio");
            }
        }

		try{
			fw = new FileWriter("C:/Users/" + usuario + "/Desktop/Tickets_Comprados/" + pasajeroA + "_" + pasajeroN + ".txt", true);
			bw = new BufferedWriter(fw);
			br = new BufferedReader(new FileReader("C:/Users/" + usuario + "/Desktop/Tickets_Comprados/" + pasajeroA + "_" + pasajeroN + ".txt"));
			
			bw.write("::::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::::");
			bw.newLine();
			bw.write("::                                                                                  ::");
			bw.newLine();
			bw.write("      " + aerolinea);
			bw.newLine();
			bw.write("::                                                                                  ::");
			bw.newLine();
			bw.write("                                  BOARDING PASS");
			bw.newLine();
			bw.write("::                                                                                  ::");
			bw.newLine();
			bw.write("          Nombre Del Pasajero: " + pasajeroA + ", " + pasajeroN);
			bw.newLine();
			bw.write("::                                                                                  ::");
			bw.newLine();
			bw.write("          Vuelo Nº: " + vuelo + "  Origen: " + origen + "  Destino: " + destino);
			bw.newLine();
			bw.write("::                                                                                  ::");
			bw.newLine();
			bw.write("          Fecha: " + fecha + "  Hora: " + hora);
			bw.newLine();
			bw.write("::                                                                                  ::");
			bw.newLine();
			bw.write("          Puerta Nº: " + puerta);
			bw.newLine();
			bw.write("::                                                                                  ::");
			bw.newLine();
			bw.write("          Asiento Nº: " + asiento);
			bw.newLine();
			bw.write("::                                                                                  ::");
			bw.newLine();
			bw.write("::::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::::\n\n\n");
			bw.flush();
	
			System.out.println("Billete Creado En El Directorio \"Tickets_Comprados\" Del Escritorio");
		
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
	public static void leerTicket() {
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