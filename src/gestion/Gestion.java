package gestion;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

import interfazes.Menus;


public class Gestion {
	
	Scanner scn = new Scanner(System.in);
	private Billete billete = new Billete();

	public void inicioSesion() {

		boolean opcionCorrecta = false;
		int opcionElejida = 0;

		while (opcionCorrecta != true) {

			Menus.menuUsuario();

			try {

				opcionElejida = Integer.parseInt(scn.next());

				if (opcionElejida <= 4 && opcionElejida > 0) {

					opcionCorrecta = true;

				} else {

					System.out.println("NO DISPONEMOS DE ESA OPCIÓN. INTELANTALO DE NUEVO\n");

				}

			} catch (NumberFormatException exc) {

				System.out.println("FORMATO NO VALIDO\n");

			} catch (Exception exc) {

				System.out.println("ERROR\n");
				exc.printStackTrace();

			}
		}

		switch (opcionElejida) {

		case 1:
			this.ida();
			break;
		case 2:
			this.idaVuelta();
			break;
		case 4:
			this.finApp();
			break;
		}
	}

	/**
	 * Método de Ida ,Que tiene como variables 
	 */
	public void ida() {
		String origen = "";
		String destino = "";
		int diaSalida = 0;
		int mesSalida = 0;
		LocalDate salida = null;
		int numeroPasajeros=0; 
		solicitoOrigenyDestino(origen,destino);
		comprobarDiayMes(diaSalida, mesSalida, salida, numeroPasajeros);

	}
	/**
	 * Método de Ida y vuelta ,Que tiene como variables 
	 */
	public void idaVuelta() {
		String origen = "";
		String destino = "";
		int diaSalida = 0;
		int mesSalida = 0;
		int diaRetorno =0;
		int mesRetorno =0;
		int numeroPasajeros =0;
		
		solicitoOrigenyDestino(origen,destino);
		pidoNumeroDeViajeros(numeroPasajeros);
	}
	/**
	 * Método de fin de Aplicacion 
	 */
	public void finApp() {
		System.out.println("HASTA LUEGO!!");
		System.exit(0);
	}

	
	/**
	 * metodos que comprueban Si el destino y origen introducido son el correcto,  
	 * */
	public  void solicitoOrigenyDestino(String origen,String destino) {
		boolean resultadoFinal = false;
		System.out.println("Introduce tu ciudad o pais de origen");

		do {
			
			origen = scn.next();

			this.compueboCiudadoPais(origen);

			if (this.compueboCiudadoPais(origen) != true) {

				System.out.println("INTRODUCE UN ORIGEN VALIDO.");
			}
	
		} while (this.compueboCiudadoPais(origen) != true);

		System.out.println("Introduce la ciudad o pais de destino");

		do {

			destino = scn.next();

			this.compueboCiudadoPais(destino);

			if (this.compueboCiudadoPais(destino) != true) {

				System.out.println("INTRODUCE UN DESTINO VALIDO.");
			}

		} while (this.compueboCiudadoPais(destino) != true);
		System.out.println("Indica el dia/mes de tu viaje");
	
	}

	/*
	 * ERROR DE REPETICION DE ESTE METODO AUNQUE SI COMPRUEBA LA CIUDAD POR RAZON
	 * DESCONOCIDA REPITE LA OPERACION 3 VECES,(NOTA: NO ME FUNCIONA EL BICHO
	 * DEPURAR)
	 **/
	public boolean eligoCiudad(String ciudadOPais) {
		
		String laCiudad = "";
		boolean estaCiudad = false;
		System.out.println("A QUE CIUDAD DE " + ciudadOPais + " QUIERES VIAJAR");
		System.out.println("Madrid");// prueba En ESPERA DE LA CONSULTA DE LA BBDD
		System.out.println("Barcelona");// prueba En ESPERA DE LA CONSULTA DE LA BBDD
		System.out.println("Valencia");// prueba En ESPERA DE LA CONSULTA DE LA BBDD
		try {
			System.out.println("introduce el nombre de la Ciudad");
			laCiudad = scn.next();
			if (laCiudad.equalsIgnoreCase("Madrid")) {
				estaCiudad = true;
			} else {
				System.out.println(
					"La Ciudad que nos indicas no tiene el Aereopuerto activo ó el nombre no es correcto solo las mostradas");
				System.out.println("Introduce el nombre la Ciudad nuevamente \n");
				eligoCiudad(ciudadOPais);
				
			}
		} catch (Exception e) {
			System.out.println("INTRODUCE EL NOMBRE CORRECTO");
		}
		return estaCiudad;
	}

	/*
	 * Este metodo comprueba si lo introducido es ciudad o pais, si es ciudad es
	 * correcto si es pais va al metodo eligoCiudad y lista las ciudades el que se
	 * debe elegir, ya que en un pais puede hacer 1 o mas aereopuertos, pero no
	 * todas las ciudades lo tienen
	 * 
	 **/
	public boolean compueboCiudadoPais(String ciudadOPais) {
		String elPais = "España";// prueba
		String laciudad = "Madrid";// prueba
		boolean estaPaisoCiudad = false;
		// IF(staticmetodoPaulBDcomprobarPais(String pais))Metodo booleaan
		if (ciudadOPais.equalsIgnoreCase(elPais)) {
			this.eligoCiudad(ciudadOPais);
			if(this.eligoCiudad(ciudadOPais) ==true) {
				estaPaisoCiudad = true;
			}		
		}else {if(ciudadOPais.equalsIgnoreCase(laciudad)) {
				estaPaisoCiudad = true;
				}
			
		}
		
		return estaPaisoCiudad;
		
	}
	
	public int pidoNumeroDeViajeros(int numeroViajeros) {
		boolean nValido = false;
		System.out.println("Introduce el numero de pasajeros \n-nº");
		try {
			numeroViajeros = scn.nextInt();
		}catch(Exception e) {
			System.out.println("INTRODUCE EL NUMERO CORRECTO");
			}
		return numeroViajeros;
	}
	/*
	 * esta funcion esta en la clase PaisBBDD
	 * 
	 * public boolean ExisteCiudad(String ciudad) { String elPais= "Madrid";//prueba
	 * 
	 * boolean estaPais=false;
	 * 
	 * //staticmetodoPaulBDcomprobarPais(String pais)Metodo booleaan
	 * if(elPais.equalsIgnoreCase(ciudad)){
	 * 
	 * estaPais=true; }
	 * 
	 * return estaPais; }
	 */


	/***************************************************************************/

	public void comprobarDiayMes(int diaComprobado, int mesComprobado, LocalDate fecha, int numeroPasajeros) {
		boolean diaCorrecto = false;
		while (diaCorrecto != true) {

			try {

				System.out.println("Indica el dia de tu viaje");

				diaComprobado = scn.nextInt();

				System.out.println("y el mes?");

				mesComprobado = scn.nextInt();

				if ((diaComprobado <= 31 && diaComprobado >= 1) && (mesComprobado > 0 && mesComprobado < 13)) {
					
					fecha = LocalDate.of(2021, mesComprobado, diaComprobado);
					diaCorrecto = true;

				} else {

					System.out.println("INTRODUCE UNA FECHA VALIDA");
					System.out.println("INTRODUCE DE NUEVO EL DIA");

				}

			} catch (Exception exc) {

				System.out.println("INTRODUCE UN FORMATO ADECCUADO");
				System.out.println("INTRODUCE DE NUEVO EL DIA");

			}
		}
		numeroPasajeros = pidoNumeroDeViajeros(numeroPasajeros);
		precioVueloSoloIda(fecha, diaComprobado, mesComprobado, numeroPasajeros);

	}
	public void eligoOpcion(LocalDate fecha, int dia, int mes, int numPasajeros, int opcion) {
		String origen = "";
		String destino = "";
		opcion = scn.nextInt();
		switch(opcion) {
		case 1:
			solicitoOrigenyDestino(origen,destino);
			comprobarDiayMes(dia, mes, fecha, numPasajeros);
			break;
		case 2: 
			comprobarDiayMes(dia, mes, fecha, numPasajeros);
			break;
		case 3:
			inicioSesion();
			break;
		default:
			System.out.println("No es una opcion correcta vuelve a introducir una que viene en la lista:");
				
		}
			
	}
	public void confirmoVuelo(int numPasajeros) {
		String nombre;
		String apellido1;
		String apellido2;
		String pasaporte ;
		Billete [] billetes = new Billete[numPasajeros];
		Usuario [] pasajeros = new Usuario[numPasajeros];
		for (int i = 0; i <= numPasajeros; i++) {
			System.out.println("Introduce los datos del pasajero -No"+i+1);
			System.out.println("Nombre;");
			nombre = scn.next();
			System.out.println("Primer Apellido");
			apellido1 = scn.next();
			System.out.println("Segundo Apellido");
			apellido2 = scn.next();
			System.out.println("Tu numero de pasaporte:");
			pasaporte = scn.next();
			pasajeros[i]= new Usuario(nombre,apellido1,apellido2, pasaporte);
			billetes[i].setDatosPasajero(pasajeros[i]);
			
		}
		
		
	}
	public void muestroDetallesdelPrecioElegido(float precioElegido, LocalDate fecha, int numPasajeros){
		String respuesta = "";
		Aerolinea A01 = new Aerolinea("IB", "Iberia");
		System.out.println("el vuelo del:"+fecha.getDayOfYear()+" de "+fecha.getMonth());
		System.out.println("Operado por: "+A01.getNombre());
		System.out.println("Con precio: "+precioElegido);	
		//System.out.println("Parte a las"+fecha.atTime(time));
		System.out.println("Con 1mt de mano de 10kg");
		System.out.println("Deseas confirmar s/n?");
		respuesta = scn.next();
		if(respuesta.equalsIgnoreCase("si")) {
			confirmoVuelo(numPasajeros);
		}else {
			System.out.println("Deseas:");
			
		}
		
	}
	public void consultoOpcion(LocalDate fecha,  int dia, int mes, int  numPasajeros, int opcionColumna, String respuesta, float i){
			int opcion=0;
			float precioElegido =0;
		if(respuesta.equalsIgnoreCase("si")) {
			System.out.println("Indica el numero de opcion");
			opcion = scn.nextInt();
			if(opcion == opcionColumna) {
				precioElegido = i;
				muestroDetallesdelPrecioElegido(precioElegido, fecha,  numPasajeros);
			}
			
			}else {
			System.out.println("Quieres:\n1.Cambiar fecha\n2.Cambiar Destino\n3.Volver al menu principal");
			eligoOpcion( fecha,  dia,  mes,  numPasajeros,  opcion);
			}
	}
		

	/**
	 * Metodo que contiene un array en la cual se rellena de numeros aleatroios de
	 * 500 a 800 para precio de vuelos de solo ida
	 */
	public void precioVueloSoloIda(LocalDate fecha, int dia, int mes, int numPasajeros) {
		int opcion =0;
		int opcionColumna =0;
		String respuesta;
		float[] listado_precio = new float[4];
		LocalDate[] listado_Fechas = new LocalDate[4];
		System.out.println("Desde el dia " + fecha.getDayOfYear() +"/" +fecha.getMonth() +". Tenemos las siguientes opciones, para "+numPasajeros+" pasajeros\n");
		System.out.println("Fecha       Precio Solicitado");
		System.out.println("-----       ------------------");
		for (int i = 0; i < listado_precio.length; i++) {
			float precio_VueloSoloIda_Medio = (float) (Math.random() * 300 + 700);
			listado_precio[i] = precio_VueloSoloIda_Medio*numPasajeros;
			listado_Fechas[i] = fecha.of(fecha.getYear(), fecha.getMonthValue(), fecha.getDayOfMonth() + i);
			System.out.print(listado_Fechas[i] + " ->");
			System.out.print( " - " +(opcionColumna + 1) + " - " + listado_precio[i] + "€");
			}
			System.out.println("Te interesa alguna opcion? s/n");
			respuesta = scn.next();
			if(respuesta.equalsIgnoreCase("si")) {
			System.out.println("Indica el numero de opcion");
			opcion = scn.nextInt();
			consultoOpcion(fecha,  dia, mes, numPasajeros, opcionColumna, respuesta, i);
			
			}else {
			System.out.println("Quieres:\n1.Cambiar fecha\n2.Cambiar Destino\n3.Volver al menu principal");
			eligoOpcion( fecha,  dia,  mes,  numPasajeros,  opcion);
			}
			
	}

	// sOLO SE DEBE DEVOLVER EN UNA MATRIZ JUNTO CON LAS FECHAS DE SALIDA Y LLEGADA
	// PERO LO DEMAS ES LO MISMO
	public void precioVueloIdayVuelta(LocalDate fecha) {
		float[] listado_precio = new float[6];
		LocalDate[] listado_Fechas = new LocalDate[6];
		System.out.println("Desde el dia " + fecha.getDayOfMonth() + " de " + fecha.getMonth()
				+ ". Tenemos las siguientes opciones;\n");
		System.out.println("Fecha       Precio Recomendado       Precio Solicitado");
		System.out.println("-----       ------------------       -----------------");
		for (int i = 0; i < listado_precio.length; i++) {
			float precio_VueloSoloIda_Medio = (float) (Math.random() * 400 + 700);
			listado_precio[i] = precio_VueloSoloIda_Medio;
			listado_Fechas[i] = fecha.of(fecha.getYear(), fecha.getMonthValue(), fecha.getDayOfMonth() + i);
			System.out.print(listado_Fechas[i] + " ->");
			System.out.print(i + 1 + "a - " + listado_precio[i] + "€");
			float precio_VueloSoloIda_Alto1 = (float) (Math.random() * 600 + 900);
			listado_precio[i] = precio_VueloSoloIda_Alto1;
			System.out.print("     |    " + i + 1 + "b - " + listado_precio[i] + "€\n");

		}
	}

}
	