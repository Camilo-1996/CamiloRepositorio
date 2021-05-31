package gestion;

import java.sql.Date;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import bd.Aerolinea;
import interfazes.Menu;
/**
 * Clase que gestiona tanto interacción con el usuario como 
 * las consultas a las bases de datos y la creación de ficheros.
 * @author Juan Camilo Ramirez Zata
 * @version 1.0.
 */
public class Gestion {
	
public static Scanner scn = new Scanner(System.in);
	
	//PaisesBBDD consulta = new PaisesBBDD();
	//GestionIdaYVuelta consultas = new GestionIdaYVuelta();
	/**
	 * Creamos las variables globales, opcionElejida de tipo entero que sera la opcion que el usuario elegira segun el menu mostrado
	 * el ArrayList de la clase Blletes, que almacena los billetes confirmados
	 * 
	 * */
	int opcionElejida = 0;
	ArrayList<Billete> billetes_conirmados = new ArrayList<>();	
	
	
	/**
	 * Método que inicia la sesión de la opción a elegir para el usuario.
	 * El usuario tinene que elegir entre uno de los 3 números del menú.<br/>
	 * <br/>
	 * 1. Ida.<br/>
	 * 2. Ida y vuelta.<br/>
	 * 3. Salir de la aplicación..<br/>
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
		GestionIdayVuelta consultas = new GestionIdayVuelta();
		switch (opcionElejida) {

		case 1:
			this.ida();
			break;
		case 2:
			consultas.idaVuelta();
			break;
		case 3:
			this.finApp();
			break;
		}
	}
	

	
	

	/**
	 * Método de Ida al elegir la opción 1.<br/>
	 * Éste método solicita el origen y el destino y la fecha de dicho vuelo. 
	 * 
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
	 * Método de fin de Aplicacion 
	 */
	public void finApp() {
		
		Menu. mensajeFin();
		System.exit(0);
		
	}

	/**
	 * metodos que comprueban Si el destino y origen introducido son el. correcto,
	 * @param  origen
	 * @param  destino
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

		System.out.println("INTRODUCE UN DESTINO");

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
	 * @param ciudad - de tipo String
	 *  
	 **/
	public boolean comprueboCiudad(String ciudad) {
		String laciudad = "Madrid";// Creamos esta ciudad de apoyo 
		
		boolean estaCiudad = false;
		
		//consulta.ExisteCiudad(ciudad) - consulta de la base de datos si la ciudad se encuentra en la lista de destinos
		if (ciudad.equalsIgnoreCase(laciudad)) {
			
			estaCiudad = true;
					
		}else {
			
				estaCiudad = false;
				
		
		}
			
		
		return estaCiudad;
		
	}
	
	
	
	/**
	 * El metodo comprobarDiayMesIda, pregunta al usuario el dia de salida y el mes de salida, no selicitamos el año
	 * ya que tomamos como referencia este año 2021, que ya vuene por defecto, 
	 * Antes realiza una comprobacion son operaciones condicionantes si el dia esta entre el 1 al 31 y el mes de 1 al 12 
	 * oara que tenga una sintaxis correcta
	 * 
	 * @param diaComprobado - de tipo entero que almacena el numero introducido por el usuario referente al dia de salida
	 * @param mesComprobado - de tipo entero que almacena el mes introducido por el usuario refenrente al mes de salida
	 * @param fecha - de tipo LocalDate, que almacena tanto el dia y el mes que se introducio y toma como año el actual 2021
	 * @param numeroPasajeros - Que almacena el numero de pasajeros que el usuario desea consultar el precio
	 * */
	
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
		
	}
	
	
	/**
	 * El metodo pidoNumeroBiajero, solicita al usuario el numero de pasajeros que viajaran, y se tomara 
	 * el numero para que pueda implementarse en el metodo de mostrarPrecioSoloIda, 
	 * Realiza una omprobacion si hay alguna excepcion por el dato introducido
	 * 
	 * @param numeroViajeros - de tipo entero,
	 * 
	 * */
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
			if(si_no_Opcion()) {//Realizamos la comprobacion implementando elmetodo creado si_no_Opcion, explicado mas abajo
				consultoOpciondePrecio(listado_fechas, fecha,dia, mes, numPasajeros, opcionColumna, listado_precio);
			}else {
			System.out.println("Quieres:\n1.Cambiar fecha\n2.Cambiar Destino\n3.Volver al menu principal\nSalir");
			eligoOpcion( fecha,  dia,  mes,  numPasajeros,  opcion);//menu opcional
			}
		
	}
	
	/**
	 * El metodo consultoOpciondePrecio, una ves en el metodo de precioVueloSoloIdam el usuario
	 * decide acceder elegir un precio este metodo empieza a funcionar, mandandoo u mensaje al usuairo indicandole
	 * que eliga una opcion de la culumna numerica deopciones, que seria un numero
	 * para posterior hacer una comprobacion con un bucle while si el numero introducido esta en el 
	 * rango de la columan opciones, si es asi y como el metodo recibe un array de precios que hace refernecia al 
	 * array que se relleno con numeros aleatorios en el metodo precioVueloSoloIda, lo recorre con un bucle for hasta encontrar 
	 * la opcion elegida por el usuario tomando de referencia la longitud de la columna opcionColumna, igual tomada del metoso precioVueloSoloIda
	 * para asi guardarlo en una vairable float, e implementarlo en el metodo muestroDetallesdelPrecioElegido, que mostrara los detalles de ese precio
	 * 
	 * @param listado_fechas[], array de tipo LocalDate, que es tomada de referencia del metodo precioVueloSoloIda que tienen las fechas
	 * @param fecha de tipo LocalDate , que hacec toma la fecha que introducio el usuari
	 * @param dia de tipo entero que hace referencia al dia introducido por el usuario
	 * @param mes de tipo entero que hace referencia al mes introducido por el usuario
	 * @param numPasajeros e tipo entero que hace referencia numero de pasajeros introducido por el usuario
	 * @param opcionColumna de tipo entero que hace referencia a la longtud de la columna de Opciones
	 * @param precios , de array de tipo float, que hace referencia al array que contiene a los precios almacenado en el metodo precioVueloSoloIda
	 * */

	public void consultoOpciondePrecio(LocalDate listado_fechas[] , LocalDate fecha,int dia, int mes, int  numPasajeros, int opcionColumna,float precios[]){
		boolean esOpcion = false;
		int opcion=0;
		float precioElegido =0;
		System.out.println("Indica el numero de opcion, de la columna 'Opciones'");
		while(!esOpcion) {
			System.out.print("- ");
			opcion = scn.nextInt();	

			if(opcion > opcionColumna){
				esOpcion = false;
				System.out.println("NO ES UNA OPCION VALIDA!!");
				System.out.println("introduce nuevamente un numero indicado en la columna 'Opciones', que te da el precio que quieres");
			}else {
				esOpcion = true;
				}
			}

			
		for (int i = 0; i <= opcionColumna; i++) {
			if (i == opcion) {
				precioElegido = precios[opcion-1];
			}
		}
			muestroDetallesdelPrecioElegido(precioElegido, listado_fechas,fecha,  numPasajeros,dia,mes,opcion);	
		
}
	
	
	/**
	 * Metodo muestroDetallesdelPrecioElegido, una ves en el anterior mmetodo realizada la comprobacion de la opciob elegida por el usuario, se 
	 * muestra el contenido de ese precio y lo que tiene
	 * Tona de referencia datos que anteriormete se le solicito al usuario como la fecha, etc
	 * 
	 * @param listado_fechas[], array de tipo LocalDate, que es tomada de referencia del metodo precioVueloSoloIda que tienen las fechas
	 * @param fecha de tipo LocalDate , que hacec toma la fecha que introducio el usuari
	 * @param dia de tipo entero que hace referencia al dia introducido por el usuario
	 * @param mes de tipo entero que hace referencia al mes introducido por el usuario
	 * @param numPasajeros e tipo entero que hace referencia numero de pasajeros introducido por el usuario
	 * @param opcionColumna de tipo entero que hace referencia a la longtud de la columna de Opciones
	 * @param precioselegido que hace alamaceno el precio escogido por el usuario
	*/
	
	public void muestroDetallesdelPrecioElegido(float precioElegido, LocalDate listado_fechas[],LocalDate salida,int numPasajeros, int dia, int mes, int opcion){
		String respuesta = "";
		Aerolinea A01 = new Aerolinea("IB", "Iberia");
		System.out.println("\nLOS DATOS DEL VUELO SON");
		System.out.println("Sale el dia:"+listado_fechas[opcion-1].getDayOfMonth()+"/"+listado_fechas[opcion-1].getMonthValue()+"/"+listado_fechas[opcion-1].getYear());
		System.out.println("Operado por: "+A01.getNombre());
		System.out.println("Con precio Total: "+precioElegido+"€");	
		//System.out.println("Parte a las"+fecha.atTime(time));
		System.out.println("Con 1mt de mano de 10kg");
		System.out.println("2mt - 23kg");
		System.out.println("Deseas reservar con esta fecha y precio.? s/n");
		if(si_no_Opcion()) {
			confirmoVuelo(numPasajeros, salida, precioElegido);
		}else {
			System.out.println("Los precios pueden variar si quieres:");
			System.out.println("Podemos:\n1.Cambiar Destino\n2.Cambiar fecha\n3.Volver al menu principal\n4.Salir");
			//eligoOpcion( salida,  dia,  mes,  numPasajeros, opcion);
		}
		
	}
	/**
	 * Metodo de prueba que en caso el usuario escogiera la opcion no en la pregunta si desea reservar o le interesa
	 * algun opcion devulviera este menu 
	 * 
	 *  
	 * @param fecha de tipo LocalDate , que hacec toma la fecha que introducio el usuari
	 * @param dia de tipo entero que hace referencia al dia introducido por el usuario
	 * @param mes de tipo entero que hace referencia al mes introducido por el usuario
	 * @param numPasajeros e tipo entero que hace referencia numero de pasajeros introducido por el usuario
	 * @param opcion de tipo entero que hace referencia a la longtud de la columna de Opciones
	 * 
	 * */
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
		
	
	/**
	 * El metodo confirmoVuelo se activaria cuando el usuario este conforme a los datos y el precio elegido
	 * entonces se solicitaria los datos para almacenarlos en el array de tipo Billete que contendrua los datos
	 * principales del usuario para posterior almacenarlos en el array Usuario que lleva de parametro la persona y el numero de pasaporte
	 * y eso guardarlo en el arrayList de billetes que se creo como variable global
	 * 
	 * @param numPasajeros de tipo entero que hace referencia al numero de pasaajeros que introducio el usurio
	 * @param salida de tipo LocalDate que hace referencia a la fecha de salida del vuelo elgido
	 * @param precio que hace referencia al precio del billete TOTAL
	 * 
	 * */

	public void confirmoVuelo(int numPasajeros, LocalDate salida, float precio) {

		String nombre;
		String apellido1;
		String apellido2;
		String pasaporte ;
		Usuario [] pasajeros = new Usuario[numPasajeros];
		Persona [] personas = new Persona[numPasajeros];
		numPasajeros--;
		for (int i = 0; i <=numPasajeros; i++) {
			System.out.println("Introduce los datos del pasajero -No"+(i+1));
			System.out.println("Nombre:");
			nombre = scn.next();
			System.out.println("Primer Apellido:");
			apellido1 = scn.next();
			System.out.println("Segundo Apellido:.");
			apellido2 = scn.next();
			System.out.println("Tu numero de pasaporte:");
			pasaporte = scn.next();
			personas[i] = new Persona(nombre,apellido1,apellido2);
			pasajeros[i]= new Usuario(personas[i], pasaporte);
			billetes_conirmados.add(new Billete(pasajeros[i], salida, precio));
		}
	}
	
	
	
	/*
	 * Método que comprueba si el usuario introduce un si o un no,  tanto en la variación de mayúsculas o minúscula y
	 * una simple "S", como un "Si" tamto en minúscumas como mayúsculas
	 * @return si quiere cambiar la opcion, o si no.
	 */
	public boolean si_no_Opcion() {
		String respuesta = "";

		boolean correctaIntoduccion=false;
		boolean siQuiere=false;
		
		while(correctaIntoduccion!=true) {
			respuesta = scn.next();

			if(respuesta.equalsIgnoreCase("SI") || respuesta.equalsIgnoreCase("S")||respuesta.equalsIgnoreCase("NO") || respuesta.equalsIgnoreCase("N")) {
				
				if(respuesta.equalsIgnoreCase("SI") || respuesta.equalsIgnoreCase("S")) {
					
					siQuiere=true;
					correctaIntoduccion=true;
				}else {
					
					System.out.println("OPERACIÓN CANCELADA");
					inicioSesion(); 
					
				}
				
			}else {
				
				System.out.println("INTODUCE UAN RESPUESTA CORRECTA");
			}
		}
		
		return siQuiere;

	}
	

}