package gestion;

import java.util.Random;
import java.io.*;
import java.time.LocalDate;

/**
 * Metodo Que Imprime el Billete en el Escritorio en Base al Nombre de Usuario y Siempre en la Ruta del Escritorio
 */
public class ImprimirTicket {
	
	Gestion gs = new Gestion();
	static Random num = new Random();
	
	private String aerolinea = "AEROLINEA_TEST";
	private String pasajeroN;
	private String pasajeroA1;
	private String pasajeroA2;
	private int vuelo = num.nextInt(998+1);
	private String origen;
	private String destino;
	private LocalDate fechaIda;
	private LocalDate fechaVuelta;
	private int puerta = num.nextInt(9+1);
	private int asiento = num.nextInt(179+1);
	private int idPasajero;
	
	static private String usuario = System.getProperty("user.name");
	
	static private FileWriter fw;
	static private BufferedWriter bw;
	static private BufferedReader br;
	
	/**
	 * Metodo Que Imprime el Billete en el Escritorio en Base al Nombre de Usuario y Siempre en la Ruta del Escritorio
	 */
	public void imprimeTicket() {
		
		File directorio = new File("C:/Users/" + usuario + "/Desktop/Tickets_Comprados");
        if (!directorio.exists()) {
            if(directorio.mkdirs()) {
                System.out.println("Directorio \"Tickets_Comprados\" Creado");
            }else {
                System.out.println("Error al crear directorio");
            }
        }
        
        for(int i = 0; i < gs.billetes_conirmados.size()-1; i++) {
			
			fechaIda = gs.billetes_conirmados.get(i).getFechaIda();
			fechaVuelta = gs.billetes_conirmados.get(i).getFechaVuelta();
			idPasajero = gs.billetes_conirmados.get(i).getIdPasajero();
			origen = gs.billetes_conirmados.get(i).getOrigen();
			destino = gs.billetes_conirmados.get(i).getDestino();
			pasajeroN = gs.billetes_conirmados.get(i).getNombrePasajero();
			pasajeroA1 = gs.billetes_conirmados.get(i).getApellido1_pasajero();
			pasajeroA2 = gs.billetes_conirmados.get(i).getApellido2_pasajero();

			try{
				fw = new FileWriter("C:/Users/" + usuario + "/Desktop/Tickets_Comprados/" + pasajeroA1 + "_" + pasajeroN + ".txt", true);
				bw = new BufferedWriter(fw);
				br = new BufferedReader(new FileReader("C:/Users/" + usuario + "/Desktop/Tickets_Comprados/" + pasajeroA1 + "_" + pasajeroN + ".txt"));
				
				bw.write("::::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::::");
				bw.newLine();
				bw.write("::                                                                                      ::");
				bw.newLine();
				bw.write("      " + aerolinea);
				bw.newLine();
				bw.write("::                                                                                      ::");
				bw.newLine();
				bw.write("                                  BOARDING PASS");
				bw.newLine();
				bw.write("::                                                                                      ::");
				bw.newLine();
				bw.write("        Pasajero: " + pasajeroA2 + " " + pasajeroA1 + ", " + pasajeroN + "ID: " + idPasajero);
				bw.newLine();
				bw.write("::                                                                                      ::");
				bw.newLine();
				bw.write("        Vuelo Nº: " + vuelo + "  Origen: " + origen + "  Destino: " + destino);
				bw.newLine();
				bw.write("::                                                                                      ::");
				bw.newLine();
				bw.write("        Fecha De Ida: " + fechaIda + "  Fecha De Vuelta: " + fechaVuelta);
				bw.newLine();
				bw.write("::                                                                                      ::");
				bw.newLine();
				bw.write("        Puerta Nº: " + puerta);
				bw.newLine();
				bw.write("::                                                                                      ::");
				bw.newLine();
				bw.write("        Asiento Nº: " + asiento);
				bw.newLine();
				bw.write("::                                                                                      ::");
				bw.newLine();
				bw.write("::::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::  ::::\n\n\n");
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