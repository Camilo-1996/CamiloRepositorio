package gestion;

import java.sql.Date;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import bd.aerolinea;
import interfazes.Menu;

public class Gestion {
	
	
	
	
	private Scanner scn = new Scanner(System.in);
	int opcionElejida = 0;
	ArrayList<Billete> billetes_conirmados = new ArrayList<>();	
	
	
	/**
	 * Método que inicia la sesión de la opción a elegir para el usuario.
	 * El usuario tinene que elegir entre uno de los 3 números del menú.<br/>
	 * <br/>
	 * 1. Ida.<br/>
	 * 2. Ida y vuelta.<br/>
	 * 3. Salir de la aplicación.<br/>
	 * <br/>
	 * Se comprueba que la opción elegida sea correcta y se envia el método correcto de gestión.
	 */
	public void inicioSesion() {

		boolean opcionCorrecta = false;

		while (opcionCorrecta != true) {

			Menu.menuUsuario();

			try {

				opcionElejida = Integer.parseInt(scn.next());

				if (opcionElejida <= 3 && opcionElejida > 0) {

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
			this.finApp();
			break;
		}
	}
	

	
	

	/**
	 * Método de Ida al elegir la opción 1.<br/>
	 * Éste método solicita el origen y el destino y la fecha de dicho vuelo. 
	 */
	public void ida() {
		String origen = "";
		String destino = "";
		int diaSalida = 0;
		int mesSalida = 0;
		LocalDate salida = null;

		int numeroPasajeros=0; 
		solicitoOrigenyDestino(origen,destino);
		comprobarDiayMesIda(diaSalida, mesSalida, salida ,numeroPasajeros);

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
		LocalDate salida = null;
		LocalDate vuelta = null;
		solicitoOrigenyDestino(origen,destino);
		comprobarDiayMesIdayVuelta(diaSalida, mesSalida, salida,vuelta, numeroPasajeros);
	}
	
	
	
	
	
	
	
	/**
	 * Método de fin de Aplicacion 
	 */
	public void finApp() {
		
		Menu.mensajeFin();
		System.exit(0);
		
	}
		
		
	
	
	/**
	 * metodos que comprueban Si el destino y origen introducido son el correcto,  
	 * */
	public  void solicitoOrigenyDestino(String origen,String destino) {
		
	
		boolean resultadoFinal = false;
		System.out.println("INTRODUCE UNA CIUDAD DE ORIGEN");

		do {
			
			origen = scn.next();

			this.comprueboCiudad(origen);

			if (this.comprueboCiudad(origen) != true) {

				System.out.println("INTRODUCE UN ORIGEN VALIDO.");
			}
	
		} while (this.comprueboCiudad(origen) != true);

		System.out.println("INTRODUCE UN DESTINO VALIDO");

		do {

			destino = scn.next();

			this.comprueboCiudad(destino);

			if (this.comprueboCiudad(destino) != true) {

				System.out.println("INTRODUCE UN DESTINO VALIDO.");
			}

		} while (this.comprueboCiudad(destino) != true);
		System.out.println("INDICA EL DIA/MES DE TU VIAJE");
	
	}
	
	

	/*
	 * Este metodo comprueba si lo introducido es ciudad o pais, si es ciudad es
	 * correcto si es pais va al metodo eligoCiudad y lista las ciudades el que se
	 * debe elegir, ya que en un pais puede hacer 1 o mas aereopuertos, pero no
	 * todas las ciudades lo tienen
	 * 
	 **/
	public boolean comprueboCiudad(String ciudad) {
		
	
		String elPais = "España";// prueba
		String laciudad = "Madrid";// prueba
		
		boolean estaCiudad = false;
		
		// IF(staticmetodoPaulBDcomprobarPais(String pais))Metodo booleaan
		
		if (ciudad.equalsIgnoreCase(elPais)) {
			
			estaCiudad = true;
					
		}else if(ciudad.equalsIgnoreCase(laciudad)) {
			
				estaCiudad = true;
				
		
		}
			
		
		return estaCiudad;
		
	}
	
	
	
	
	
	
	
	public int pidoNumeroDeViajeros(int numeroViajeros) {
		boolean nValido = false;
		System.out.println("INTRODUCE EL NÚMERO DE PASAJEROS \n -Nº");
		
		try {
			
		
			numeroViajeros = scn.nextInt();
			
		}catch(Exception e) {
			
		
			System.out.println("INTRODUCE EL NUMERO CORRECTO");
			
		}
		
		return numeroViajeros;
		
	}

	
	
	
	
	
	public void comprobarDiayMesIda(int diaComprobado, int mesComprobado, LocalDate fecha,int numeroPasajeros) {
	
	
		boolean diaCorrecto = false;
		
		
		while (diaCorrecto != true) {
		
		
			try {

				System.out.println("INDICA EL DIA DE TU VIAJE.");

				diaComprobado = scn.nextInt();

				System.out.println("Y EL MES");

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
		if(this.opcionElejida ==1) {
			
		}
		else {
			if(this.opcionElejida ==2) {
				
				LocalDate vuelta = LocalDate.of(2021, mesComprobado, diaComprobado);
				precioVueloIdayVuelta(fecha,vuelta,diaComprobado, mesComprobado, numeroPasajeros);
			
			}
		}
	}
	
	
	
	
	
	
	
	public void comprobarDiayMesIdayVuelta(int diaComprobado, int mesComprobado, LocalDate salida,LocalDate vuelta,int numeroPasajeros) {
		
	
		boolean diaCorrecto = false;
		
		System.out.println("INDICA EL DIA DE LA SALIDA DE TU VIAJE");
		
		
		while (diaCorrecto != true) {
			
		
			try {

				diaComprobado = scn.nextInt();

				System.out.println("Y EL MES");

				mesComprobado = scn.nextInt();

				if ((diaComprobado <= 31 && diaComprobado >= 1) && (mesComprobado > 0 && mesComprobado < 13)) {
					
				
					if(salida==null) {
						
					
					  salida = LocalDate.of(2021, mesComprobado, diaComprobado);
					  
						System.out.println("INDICA EL DIA DE LA VUELTA DE TU VIAJE");
						
					}else if(vuelta ==null) {
						
						vuelta = LocalDate.of(2021, mesComprobado, diaComprobado);
						diaCorrecto=true;
							
				
					} else {

					System.out.println("INTRODUCE UNA FECHA VALIDA");
					System.out.println("INTRODUCE DE NUEVO EL DIA");

					}
				}

			} catch (Exception exc) {

				System.out.println("INTRODUCE UN FORMATO ADECCUADO");
				System.out.println("INTRODUCE DE NUEVO EL DIA");

			}
		}
		numeroPasajeros = pidoNumeroDeViajeros(numeroPasajeros);
		precioVueloIdayVuelta(salida,vuelta,diaComprobado, mesComprobado, numeroPasajeros);
			
			
		
	}
	
	
	
	
	public void eligoOpcion(LocalDate fecha, int dia, int mes, int numPasajeros, int opcion) {
		
	
		String origen = "";
		String destino = "";
		
		opcion = scn.nextInt();
		
		switch(opcion) {
		
		case 1:
			solicitoOrigenyDestino(origen,destino);
			comprobarDiayMesIda(dia, mes, fecha, numPasajeros);
			break;
			
		case 2: 
			comprobarDiayMesIda(dia, mes, fecha, numPasajeros);
			break;
			
		case 3:
			inicioSesion();
			break;
			
		case 4:
			finApp();
			
		default:
			System.out.println("NO ES UNA OPCIÓN CORRECTA. \nVUELVE A INTRODUCIR UNA QUE VIENE EN LA LISTA:");
				
		}
			
	}

	
	

	public void confirmoVuelo(int numPasajeros) {

		String nombre;
		String apellido1;
		String apellido2;
		String pasaporte ;
		Usuario [] pasajeros = new Usuario[numPasajeros];
		Persona [] personas = new Persona[numPasajeros];
		for (int i = 0; i < numPasajeros; i++) {
			System.out.println("Introduce los datos del pasajero -No"+(i+1));
			System.out.println("Nombre:");
			nombre = scn.next();
			System.out.println("Primer Apellido:");
			apellido1 = scn.next();
			System.out.println("Segundo Apellido:");
			apellido2 = scn.next();
			System.out.println("Tu numero de pasaporte:");
			pasaporte = scn.next();
			personas[i] = new Persona(nombre,apellido1,apellido2);
			pasajeros[i]= new Usuario(personas[i], pasaporte);
			billetes_conirmados.add(new Billete(pasajeros[i]));
		}
		System.out.println(billetes_conirmados.get(1));

	}
	
	
	
	
	
	public void muestroDetallesdelPrecioElegido(float precioElegido, LocalDate listado_fechas[],LocalDate fecha,int numPasajeros, int dia, int mes, int opcion){
		String respuesta = "";
		aerolinea A01 = new aerolinea("IB", "Iberia");
		System.out.println("\nLOS DATOS DEL VUELO SON");
		System.out.println("Sale el dia:"+listado_fechas[opcion-1].getDayOfMonth()+"/"+listado_fechas[opcion-1].getMonthValue()+"/"+listado_fechas[opcion-1].getYear());
		System.out.println("Operado por: "+A01.getNombre());
		System.out.println("Con precio Total: "+precioElegido+"€");	
		//System.out.println("Parte a las"+fecha.atTime(time));
		System.out.println("Con 1mt de mano de 10kg");
		System.out.println("2mt - 23kg");
		System.out.println("Deseas reservar con esta fecha y precio.? s/n");
		respuesta = scn.next();
		if(respuesta.equalsIgnoreCase("s")) {
			confirmoVuelo(numPasajeros);
		}else {
			System.out.println("Los precios pueden variar si quieres:");
			System.out.println("Podemos:\n1.Cambiar Destino\n2.Cambiar fecha\n3.Volver al menu principal\n4.Salir");
			eligoOpcion( fecha,  dia,  mes,  numPasajeros,  opcion);
		}
		
	}
	
	
	
	
	
	
	public void consultoOpcion(LocalDate listado_fechas[] , LocalDate fecha,int dia, int mes, int  numPasajeros, int opcionColumna,String respuesta, float precios[]){
			int opcion=0;
			float precioElegido =0;
		if(respuesta.equalsIgnoreCase("s")) {
			//Comprobar si es s o n
			System.out.println("Indica el numero de opcion, de la columna 'Opciones'");
			opcion = scn.nextInt();
			for (int i = 0; i <= opcionColumna; i++) {
				if (i == opcion) {
					precioElegido = precios[opcion-1];
				}
			}
				muestroDetallesdelPrecioElegido(precioElegido, listado_fechas,fecha,  numPasajeros,dia,mes,opcion);
	}else{
		System.out.println("Quieres:\n1.Cambiar Destino\n2.Cambiar fecha\n3.Volver al menu principal\n4.Salir");
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
		LocalDate[] listado_fechas = new LocalDate[4];
		System.out.println("Desde el dia " + fecha.getDayOfMonth() +"/" +fecha.getMonth() +". Tenemos las siguientes opciones, para "+numPasajeros+" pasajeros\n");
		System.out.println("Fecha       Opciones    Precio Solicitado");
		System.out.println("-----       --------     ---------------");
		for (int i = 0; i < listado_precio.length; i++) {
			float precio_VueloSoloIda_Medio = (float) (Math.random() * 300 + 700);
			listado_precio[i] = precio_VueloSoloIda_Medio*numPasajeros;
			listado_fechas[i] = fecha.of(2021, fecha.getMonthValue(), fecha.getDayOfMonth() + i);
			System.out.print(listado_fechas[i] + " ->");
			opcionColumna++;
			System.out.print( " - " +opcionColumna+ " - " + listado_precio[i] + "€\n");
	
			}
			System.out.println("Te interesa alguna opcion? s/n");
			respuesta = scn.next();
			if(respuesta.equalsIgnoreCase("s")) {
				consultoOpcion(listado_fechas, fecha,dia, mes, numPasajeros, opcionColumna,respuesta, listado_precio);
			//URGENTE COMPROBAR S Y N
			}else {
			System.out.println("Quieres:\n1.Cambiar fecha\n2.Cambiar Destino\n3.Volver al menu principal\nSalir");
			eligoOpcion( fecha,  dia,  mes,  numPasajeros,  opcion);
			}
		
	}

	
	

	public void precioVueloIdayVuelta(LocalDate salida, LocalDate vuelta ,int dia, int mes, int numPasajeros) {
		int opcion =0;
		int opcionColumna =0;
		String respuesta;
		float[] listado_precio = new float[4];
		LocalDate[] listado_fechas_salida = new LocalDate[4];
		LocalDate[] listado_fechas_vuelta = new LocalDate[4];
		System.out.println("Desde el dia " + salida.getDayOfMonth() +"/" +salida.getMonth() +" Hasta "+vuelta.getDayOfMonth()+vuelta.getMonth()+". Tenemos las siguientes opciones, para "+numPasajeros+" pasajero(s)\n");
		System.out.println("Fecha Salida  Fecha Llegada     Opciones    Precio Solicitado");
		System.out.println("------------  -------------     --------     ---------------");
		for (int i = 0; i < listado_precio.length; i++) {
			float precio_VueloSoloIda_Medio = (float) (Math.random() * 600 + 1200);
			listado_precio[i] = precio_VueloSoloIda_Medio*numPasajeros;
			listado_fechas_salida[i] = salida.of(2021, salida.getMonthValue(), salida.getDayOfMonth() + i);
			listado_fechas_vuelta[i] = vuelta.of(2021, vuelta.getMonthValue(), vuelta.getDayOfMonth() + i);
			System.out.print(listado_fechas_salida[i] + "  -  "+listado_fechas_vuelta[i]);
			opcionColumna++;
			System.out.print( "         - " +opcionColumna+ " -          " + listado_precio[i] + "€\n");
	
			}
			System.out.println("Te interesa alguna opcion? s/n");
			respuesta = scn.next();
			if(respuesta.equalsIgnoreCase("s")) {
				consultoOpcion(listado_fechas_salida, salida,dia, mes, numPasajeros, opcionColumna,respuesta, listado_precio);
			//Comprobar si es s o n
			}else {
			System.out.println("Quieres:\n1.Cambiar fecha\n2.Cambiar Destino\n3.Volver al menu principal\nSalir");
			eligoOpcion( salida,  dia,  mes,  numPasajeros,  opcion);
			}
		}
	
	/**
	 * Método que comprueba si el usuario introduce un si o un no,  tanto en la variación de mayúsculas o minúscula y
	 * una simple "S", como un "Si" tamto en minúscumas como mayúsculas
	 * @return si quiere cambiar la opcion, o si no.
	 */
	public boolean si_no_Opcion() {
		
		String opcion;
		boolean correctaIntoduccion=false;
		boolean siQuiere=false;
		
		while(correctaIntoduccion!=true) {
			
			opcion=scn.next();
			
			if(opcion.equalsIgnoreCase("SI") || opcion.equalsIgnoreCase("S")||opcion.equalsIgnoreCase("NO") || opcion.equalsIgnoreCase("N")) {
				
				if(opcion.equalsIgnoreCase("SI") || opcion.equalsIgnoreCase("S")) {
					
					siQuiere=true;
				}
				
			}else {
				
				System.out.println("INTODUCE UAN RESPUESTA CORRECTA");
			}
		}
		
		return siQuiere;

	}
	
	
	}