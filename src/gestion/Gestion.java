package gestion;

import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;

import billete.Vuelo;
import gestion.BBDDtest;
import interfazes.Menus;
import modelos.Aerolinea;

import java.util.*;

public class Gestion {
	/**
	 * REQUIERO LAS CONSULTAS DE BBDD FUNCIONA LA OPCION1, PERO SOLO CON ESPAÑA Y
	 * MADRID DE PRUEBA HASTA OBTENER EL RESULTADO DE LAS CONSULTAS
	 */
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
	 * Método de Ida
	 */
	public void ida() {
		String origen = "";
		String destino = "";
		int dia = 0;
		int mes = 0;

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

		System.out.println("Indica la fecha de salida a " + destino);
		comprobarDiayMes(dia, mes);
		precioVueloSoloIda(billete.getFecha());

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
		// consultaPaul que devuelve las ciudades dek pais
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
						"La Ciudad que nos indicas no tiene el Aereopuerto 0 el nombre no es correcto activo solo las mostradas");
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
		boolean estaPais = false;
		// IF(staticmetodoPaulBDcomprobarPais(String pais))Metodo booleaan
		/*if (ciudadOPais.equalsIgnoreCase(elPais)) {
			estaPais = eligoCiudad(ciudadOPais);
		} else {
			if (ciudadOPais.equalsIgnoreCase(laciudad)) {
				estaPais = true;
			}

		}*/
		return estaPais;
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

	public void idaVuelta() {
		String origen = "";
		String destino = "";
		int dia = 0;
		int mes = 0;

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

		System.out.println("Indica la fecha de salida a " + destino);
		comprobarDiayMes(dia, mes);
		System.out.println("Indica la fecha de retorno a " + origen);
		comprobarDiayMes(dia, mes);

	}

	public void finApp() {
		System.out.println("HASTA LUEGO!!");
		System.exit(0);
	}

	/***************************************************************************/

	public void comprobarDiayMes(int diaComprobado, int mesComprobado) {
		LocalDate fecha = null;
		boolean diaCorrecto = false;
		while (diaCorrecto != true) {

			try {

				System.out.println("Indica el dia de tu viaje");

				diaComprobado = scn.nextInt();

				System.out.println("y el mes?");

				mesComprobado = scn.nextInt();

				if ((diaComprobado <= 31 && diaComprobado >= 1) && (mesComprobado > 0 && mesComprobado < 13)) {
					fecha = LocalDate.of(2021, mesComprobado, diaComprobado);
					this.billete.setFecha(fecha);// Camilo Satters Getters de la clase Billete
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

	}

	/*
	 * Este metodo solicita las fechas al usuario introducuieno
	 **/
	// El flujo Scnner me da error al momento de solicitar las fechas
	public void solicitoFechas(int dia, int mes, LocalDate entrada) {
		System.out.println("Introduce Una Fecha\n");
		System.out.println("¿Cual Dia?");
		try {
			dia = scn.nextInt();
		} catch (java.util.InputMismatchException e) {
			System.out.println("\nIntroduzca Una Opcion Valida!!\n");
		}
		System.out.println("¿Cual Mes?");
		mes = scn.nextInt();
		entrada = LocalDate.of(2021, mes, dia);
		System.out.println(entrada.toString());
	}

	/**
	 * Metodo que contiene un array en la cual se rellena de numeros aleatroios de
	 * 500 a 800 para precio de vuelos de solo ida
	 */
	public void precioVueloSoloIda(LocalDate fecha) {
		float[] listado_precio = new float[6];
		LocalDate[] listado_Fechas = new LocalDate[6];
		Aerolinea[] Aereolineas = new Aerolinea[6];// Falta rellenar nombres de aereolineas

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

	// sOLO SE DEBE DEVOLVER EN UNA MATRIZ JUNTO CON LAS FECHAS DE SALIDA Y LLEGADA
	// PERO LO DEMAS ES LO MISMO
	public void precioVueloIdayVuelta(LocalDate fecha) {
		float[] listado_precio = new float[6];
		LocalDate[] listado_Fechas = new LocalDate[6];
		Aerolinea[] Aereolineas = new Aerolinea[6];// Falta rellenar nombres de aereolineas
		// MATRIZ
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
