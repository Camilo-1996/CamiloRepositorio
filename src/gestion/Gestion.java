package gestion;

import java.sql.Date;
import java.time.LocalDate;

import billete.Billete;
import billete.Persona;
import billete.Vuelo;
import gestion.BBDDtest;
import interfazes.Menus;
import reserva.Hotel;

import java.util.*;

public class Gestion {

	private static Scanner scn = new Scanner(System.in);
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
		case 3:
			this.vueloHotel();
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

		System.out.println("Introduce el origen");

		do {

			origen = scn.next();

			this.comprueboPais(origen);

			if (this.comprueboPais(origen) != true) {

				System.out.println("INTRODUCE UN ORIGEN VALIDO.");
			}

		} while (this.comprueboPais(origen) != true);

		System.out.println("Introduce el destino");

		do {

			destino = scn.next();

			this.comprueboPais(destino);

			if (this.comprueboPais(destino) != true) {

				System.out.println("INTRODUCE UN DESTINO VALIDO.");
			}

		} while (this.comprueboPais(destino) != true);

		this.solicitoFechas(0, 0, null);

	}
/*AÑADIR EL METO QUE COMPRUEBA EL PAIS
	public boolean comprueboPais(String pais) {
		
		boolean estaPais=false;
	
		
		if(staticmetodoPaulBDcomprobarPais(String pais)!=false){
				
			estaPais=true;
		}
		
		return estaPais;
	}
*/
	public void idaVuelta() {

	}

	public void vueloHotel() {
		String origen = "España";
		System.out.println("Introduce origen");
		try {
			buscoHoteles(origen);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public void finApp() {
		System.out.println("HASTA LUEGO!!");
		System.exit(0);
	}
	/* Gestion de datos Vuelos */

	public void gestionarPartida() {

	}

	public void soloIda(String origen, String destino) {
		LocalDate entrada = null;
		LocalDate salida = null;
		int dia = 0;
		int mes = 0;
		String compañía = "";
		Vuelo pasajero = new Vuelo(destino, origen, compañía);
		String fecha = new String("111");
		System.out.println("Introduce el origen");
		origen = Menus.scn.next();
		System.out.println("Introduce el destino");
		destino = Menus.scn.next();
		solicitoFechas(dia, mes, entrada);
	}

	public void idayVuelta() {

	}
	/* Gestion datos */

	/* Operaciones y metodos de la clase Hoteles */

	public void buscoHoteles(String destino) {
		LocalDate entrada = null;
		LocalDate salida = null;
		int dia = 0;
		int mes = 0;
		Hotel h1 = new Hotel(entrada, salida, destino, 0);
		// El destino tiene como resultado

		solicitoFechas(dia, mes, entrada);

		System.out.println("Tenemos Estos Precios Para Estos Hoteles:\n");
		precioHotel();

	}

	public void comprobarDiayMes() {

		int diaComprobado = 0;
		int mesComprobado = 0;

		boolean diaCorrecto = false;

		while (diaCorrecto != true) {

			try {

				System.out.println("DIA");

				diaComprobado = scn.nextInt();

				System.out.println("MES");

				mesComprobado = scn.nextInt();

				if ((diaComprobado < 31 && diaComprobado > 0) && (mesComprobado > 0 && mesComprobado < 13)) {

					billete.setFecha(diaComprobado, mesComprobado, 2021);

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
			dia = Menus.scn.nextInt();
		} catch (java.util.InputMismatchException e) {
			System.out.println("\nIntroduzca Una Opcion Valida!!\n");
			vueloHotel();
		}
		System.out.println("¿Cual Mes?");
		mes = Menus.scn.nextInt();
		entrada = LocalDate.of(2021, mes, dia);
		System.out.println(entrada.toString());
	}

	/******************************************************************************************/
	/**************************
	 * METODOS DE PRECIOS HOTEL, VUELOS
	 *******************************/
	/*
	 * double precio_MEDIO = Math.random()*200 +70; double precio_ALTO =
	 * Math.random()*600 +100;
	 */

	/* Consulta de precios */
	/**
	 * Metodo que contiene un array en la cual se rellena de numeros aleatroios de
	 * 500 a 800 para precio de vuelos de solo ida
	 */
	public void precioHotel() {
		double precio_Hotel = Math.random() * 100 + 150;
		double[] listado_precio = new double[10];
		String[] fechas_desde_hasta = new String[10];
		String fecha = "111";

		for (int i = 0; i < listado_precio.length; i++) {
			listado_precio[i] = precio_Hotel;
			System.out.print(" " + listado_precio[i]);
		}
	}

	/**
	 * Metodo que contiene un array en la cual se rellena de numeros aleatroios de
	 * 500 a 800 para precio de vuelos de solo ida
	 */
	public void precioVueloSoloIda() {
		double precio_VueloSoloIda = Math.random() * 500 + 800;
		double[] listado_precio = new double[10];
		String[] fechas_desde_hasta = new String[10];

		for (int i = 0; i < listado_precio.length; i++) {
			listado_precio[i] = precio_VueloSoloIda;
			System.out.print(" " + listado_precio[i]);
		}
	}

}
