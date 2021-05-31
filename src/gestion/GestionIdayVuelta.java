package gestion;

import java.time.LocalDate;

import bd.Aerolinea;

/**
 * La clase GestionIdayVuelta contiene metodos que llaman solicitan compruba y devuelven opciones
 * que el usuario podra elegir o no 
 * 
 * */

public class GestionIdayVuelta {
	
	
	/**
	 * Creamos la variable global gestion de la clase Gestion que cnos ayudara de referencia para llamr atributos 
	 * y metodos de la clase gestion
	 * 	 * */
	Gestion gestion = new Gestion();
	
	/**
	 * Metodo IdayVuelta, vacio, no recibe ningun parmetro 
	 * contiene variables locales dentro del metodo que haran referencia a los datos que se solicitaran al
	 * usuario
	 * para luego implementar los metodos siguientes:
	 * 
	 * solicitoOrigenyDestino
	 * comprobarDiayMesIdayVuelta
	 * */
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
	 * metodos que comprueban Si el destino y origen introducido son el correcto, 
	 * que contiene a si ves dos bucles do-while que piden por entrada de teclado el numero
	 * y luego implemeta el metodo  compueboCiudad, que retorna un tipo booleano para luego relizar las compribaciones
	 * correcpondientes
	 * 
	 * @param  origen, de tipo String -referencia al origen introducido
	 * @param  destino, de tipo String - referencia al destino introducido
	 * 
	 * */
	public void solicitoOrigenyDestino(String origen,String destino) {
		boolean resultadoFinal = false;
		System.out.println("Introduce tu ciudad o pais de origen");

		do {
			
			origen = Gestion.scn.next();

			this.compueboCiudad(origen);

			if (this.compueboCiudad(origen) != true) {

				System.out.println("INTRODUCE UN ORIGEN VALIDO.");
			}
	
		} while (this.compueboCiudad(origen) != true);

		System.out.println("Introduce la ciudad o pais de destino");

		do {

			destino = Gestion.scn.next();

			this.compueboCiudad(destino);

			if (this.compueboCiudad(destino) != true) {

				System.out.println("INTRODUCE UN DESTINO VALIDO.");
			}

		} while (this.compueboCiudad(destino) != true);

	}

	
	/*
	 * Este metodo comprueba si lo introducido es ciudad o pais, si es ciudad es
	 * correcto si es pais va al metodo eligoCiudad y lista las ciudades el que se
	 * debe elegir, ya que en un pais puede hacer 1 o mas aereopuertos, pero no
	 * todas las ciudades lo tienen
	 * @param ciudadOPais tipo String 
	 * @return estaCiudad;
	 **/
	public boolean compueboCiudad(String ciudadOPais) {
		String laciudad = "Madrid";// prueba
		boolean estaCiudad = false;
		// IF(staticmetodoPaulBDcomprobarPais(String pais))Metodo booleaan
		if (ciudadOPais.equalsIgnoreCase(laciudad)) {
			estaCiudad = true;
		}else {
			estaCiudad = false;
			
		}
		
		return estaCiudad;
		
	}
	/**
	 * 
	 * 
	 * */
	
	public int pidoNumeroDeViajeros(int numeroViajeros) {
		boolean nValido = false;
		System.out.println("Introduce el numero de pasajeros \n-nº");
		try {
			numeroViajeros = Gestion.scn.nextInt();
		}catch(Exception e) {
			System.out.println("INTRODUCE EL NUMERO CORRECTO");
			}
		return numeroViajeros;
	}

	/**
	 * El metodo vacio comprobarDiayMesIdayVuelta, recibe como parametro las variables
	 * de referencia que se le solicitaran al usuario
	 * que compueba si los dias estan en el rando de 1-31 y el mes de1-12, tambien posterior a eso 
	 * comprueba si el las variables de salida y vuelta de tipo LocaDATE, si salida es nulo los datos introducidos 
	 * en primer instancia se almacenan en esa variable, y mada el mesnaje par aque se introduzca la otra fecha
	 * que tambien al momento de volver a la comprobacion ya que slaida ya conendria algo , consulta si la variable vuelta es nulo
	 * y si es correcto almacena los datos de dia y mes en esa variable 
	 * Luego implementa los metodos:
	 * pidoNumeroDeViajeros
	 * precioVueloIdayVuelta
	 * 
	 * @param diaComprobado de tipo entero 
	 * @param diaComprobado de tipo entero 
	 * @param salida de tipo LocalDate
	 * @param veulta de tipo LocalDate
	 * @param umeroPasajeros de tipo entero
	 * */
	public void comprobarDiayMesIdayVuelta(int diaComprobado, int mesComprobado, LocalDate salida,LocalDate vuelta,int numeroPasajeros) {
		boolean diaCorrecto = false;
		System.out.println("Indica el dia de salida de tu viaje");
		while (diaCorrecto != true) {
			try {

				diaComprobado = Gestion.scn.nextInt();

				System.out.println("y el mes?");

				mesComprobado = Gestion.scn.nextInt();

				if ((diaComprobado <= 31 && diaComprobado >= 1) && (mesComprobado > 0 && mesComprobado < 13)) {
					if(salida==null) {
						salida = LocalDate.of(2021, mesComprobado, diaComprobado);
						System.out.println("Indica el dia de la vuelta de tu viaje");
					}else {if(vuelta ==null) {
						vuelta = LocalDate.of(2021, mesComprobado, diaComprobado);
						diaCorrecto=true;
							}
						}	
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
		precioVueloIdayVuelta(salida,vuelta,diaComprobado, mesComprobado, numeroPasajeros);
				
	}
	
	/**
	 * Este metodo devuelve los precios que se almacenan en u n array de numeros aleatorios, y ademas recibe 2
	 * array de tipo LocalDate que devuelven segun las fechas dadas en las va almacenando en el array
	 * 
	 * @param salida de tipo LocalDATE
	 * @param vuelta de tipo LocalDATE
	 * @param dia entero 
	 * @param mes entero 
	 * @param numPasajeros entero 
	 * */
	public void precioVueloIdayVuelta(LocalDate salida, LocalDate vuelta ,int dia, int mes, int numPasajeros) {
		int opcion =0;
		int opcionColumna =0;
		String respuesta;
		float[] listado_precio = new float[4];
		LocalDate[] listado_fechas_salida = new LocalDate[4];
		LocalDate[] listado_fechas_vuelta = new LocalDate[4];
		System.out.println("Desde el dia " + salida.getDayOfMonth() +"/" +salida.getMonth() +" Hasta "+vuelta.getDayOfMonth()+vuelta.getMonth()+". Tenemos las siguientes opciones, para "+numPasajeros+" pasajero(s)\n");
		System.out.println("Fecha Salida  Fecha Llegada     Opciones    Precio Solicitado");
		System.out.println("------------  -------------     --------     ---------------");
		for (int i = 0; i < listado_precio.length; i++) {
			float precio_VueloSoloIda_Medio = (float) (Math.random() * 600 + 1200);
			listado_precio[i] = precio_VueloSoloIda_Medio*numPasajeros;
			listado_fechas_salida[i] = salida.of(2021, salida.getMonthValue(), salida.getDayOfMonth() + i);
			listado_fechas_vuelta[i] = vuelta.of(2021, vuelta.getMonthValue(), vuelta.getDayOfMonth() + i);
			System.out.print(listado_fechas_salida[i] + "  -  "+listado_fechas_vuelta[i]);
			opcionColumna++;
			System.out.print( "         - " +opcionColumna+ " -          " + listado_precio[i] + "€\n");
	
			}
			System.out.println("Te interesa alguna opcion? s/n");
			respuesta = Gestion.scn.next();
			if(respuesta.equalsIgnoreCase("s")) {
				consultoOpcionIdayVuelta(listado_fechas_salida, listado_fechas_vuelta,salida,vuelta, dia, mes, numPasajeros, opcionColumna,respuesta, listado_precio);
			}else {
			System.out.println("Quieres:\n1.Cambiar fecha\n2.Cambiar Destino\n3.Volver al menu principal\nSalir");
			eligoOpcionIdayVuelta( salida, vuelta ,dia, mes, numPasajeros, opcion);
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
	public void eligoOpcionIdayVuelta(LocalDate salida, LocalDate vuelta ,int dia, int mes, int numPasajeros, int opcion) {
		String origen = "";
		String destino = "";
		opcion = Gestion.scn.nextInt();
		switch(opcion) {
		case 1:
			solicitoOrigenyDestino(origen,destino);
			comprobarDiayMesIdayVuelta( dia, mes, salida, vuelta, numPasajeros);
			break;
		case 2: 
			comprobarDiayMesIdayVuelta( dia,mes,salida, vuelta, numPasajeros);
			break;
		case 3:
			gestion.inicioSesion();
			break;
		case 4:
			gestion.finApp();
			break;
		default:
			System.out.println("No es una opcion correcta vuelve a introducir una que viene en la lista:");
				
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
	 * @param listado_fechaSalida[], array de tipo LocalDate, que es tomada de referencia del metodo precioVueloSoloIda que tienen las fechas
	 * @param listado_fechaVuelta[], array de tipo LocalDate, que es tomada de referencia del metodo precioVueloSoloIda que tienen las fechas
	 * @param salida de tipo LocalDate , que hacec toma la fecha que introducio el usuari
	 * @param vuelta de tipo LocalDate , que hacec toma la fecha que introducio el usuari
	 * @param dia de tipo entero que hace referencia al dia introducido por el usuario
	 * @param mes de tipo entero que hace referencia al mes introducido por el usuario
	 * @param numPasajeros e tipo entero que hace referencia numero de pasajeros introducido por el usuario
	 * @param opcionColumna de tipo entero que hace referencia a la longtud de la columna de Opciones
	 * @param precios , de array de tipo float, que hace referencia al array que contiene a los precios almacenado en el metodo precioVueloSoloIda
	 * */

	public void consultoOpcionIdayVuelta(LocalDate listado_fechaSalida[] , LocalDate listado_fechaVuelta[],LocalDate salida, LocalDate vuelta ,int dia, int mes, int numPasajeros, int opcionColumna,String respuesta, float precios[]){
		boolean esOpcion = false;
		int opcion=0;
		float precioElegido =0;
		System.out.println("Indica el numero de opcion, de la columna 'Opciones'");
		while(!esOpcion) {
			System.out.print("- ");
			
			opcion = gestion.scn.nextInt();	

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
		muestroDetallesdelPrecioElegidoIdayvuelta(precioElegido, listado_fechaSalida,listado_fechaVuelta,salida,vuelta,numPasajeros,dia,mes,opcion);
		
	}
	
	/**
	 * Metodo muestroDetallesdelPrecioElegido, una ves en el anterior mmetodo realizada la comprobacion de la opciob elegida por el usuario, se 
	 * muestra el contenido de ese precio y lo que tiene
	 * Tona de referencia datos que anteriormete se le solicito al usuario como la fecha, etc
	 * Devolviendo los datos de entrada y salida es su respctivo array LocalDATE
	 * 
	 * @param listado_fechaSalida[], array de tipo LocalDate, que es tomada de referencia del metodo precioVueloSoloIda que tienen las fechas
	 * @param listado_fechaVuelta[], array de tipo LocalDate, que es tomada de referencia del metodo precioVueloSoloIda que tienen las fechas
	 * @param salida de tipo LocalDate , que hacec toma la fecha que introducio el usuari
	 * @param vuelta de tipo LocalDate , que hacec toma la fecha que introducio el usuari
	 * @param dia de tipo entero que hace referencia al dia introducido por el usuario
	 * @param mes de tipo entero que hace referencia al mes introducido por el usuario
	 * @param numPasajeros e tipo entero que hace referencia numero de pasajeros introducido por el usuario
	 * @param opcionColumna de tipo entero que hace referencia a la longtud de la columna de Opciones
	 * @param precioselegido que hace alamaceno el precio escogido por el usuario
	*/
	public void muestroDetallesdelPrecioElegidoIdayvuelta(float precioElegido, LocalDate listado_fechaSalida[],LocalDate listado_fechaVuelta[],LocalDate salida,LocalDate vuelta,int numPasajeros, int dia, int mes, int opcion){
		String respuesta = "";
		Aerolinea A01 = new Aerolinea("IB", "Iberia");
		System.out.println("\nLos datos del vuelo son:");
		System.out.print("Sale el dia:"+listado_fechaSalida[opcion-1].getDayOfMonth()+"/"+listado_fechaSalida[opcion-1].getMonthValue()+"/"+listado_fechaSalida[opcion-1].getYear());
		System.out.println(" La vuelta el dia: "+listado_fechaVuelta[opcion-1].getDayOfMonth()+"/"+listado_fechaVuelta[opcion-1].getMonthValue()+"/"+listado_fechaVuelta[opcion-1].getYear());
		System.out.println("Operado por: "+A01.getNombre());
		System.out.println("Con precio Total: "+precioElegido+"€");	
		System.out.println("Con 1mt de mano de 10kg");
		System.out.println("2mt - 23kg");
		System.out.println("Deseas reservar con esta fecha y precio.? si/no");
		if(si_no_Opcion()) {
			confirmoVueloIdayVuelta(numPasajeros, salida, vuelta ,precioElegido);
		}else {
			System.out.println("Los precios pueden variar si quieres:");
			System.out.println("Podemos:\n1.Cambiar Destino\n2.Cambiar fecha\n3.Volver al menu principal\n4.Salir");
			eligoOpcionIdayVuelta( salida, vuelta ,dia, mes, numPasajeros, opcion);
		}
	}
	
	/**
	 * El metodo confirmoVuelo se activaria cuando el usuario este conforme a los datos y el precio elegido
	 * entonces se solicitaria los datos para almacenarlos en el array de tipo Billete que contendrua los datos
	 * principales del usuario para posterior almacenarlos en el array Usuario que lleva de parametro la persona y el numero de pasaporte
	 * y eso guardarlo en el arrayList de billetes que se creo como variable global, tomado sus segundo constructor
	 * 
	 * @param numPasajeros de tipo entero que hace referencia al numero de pasaajeros que introducio el usurio
	 * @param salida de tipo LocalDate que hace referencia a la fecha de salida del vuelo elgido
	 * @param llegada de tipo LocalDate que hace referencia a la fecha de salida del vuelo elgido
	 * @param precio que hace referencia al precio del billete TOTAL
	 * 
	 * */
	public void confirmoVueloIdayVuelta(int numPasajeros, LocalDate salida, LocalDate llegada ,float precio ) {
		String nombre;
		String apellido1;
		String apellido2;
		String pasaporte ;
		Usuario [] pasajeros = new Usuario[numPasajeros];
		Persona [] personas = new Persona[numPasajeros];
		for (int i = 0; i < numPasajeros; i++) {
			System.out.println("Introduce los datos del pasajero -No"+(i+1));
			System.out.println("Nombre:");
			nombre = Gestion.scn.next();
			System.out.println("Primer Apellido:");
			apellido1 = Gestion.scn.next();
			System.out.println("Segundo Apellido:");
			apellido2 = Gestion.scn.next();
			System.out.println("Tu numero de pasaporte:");
			pasaporte = Gestion.scn.next();
			personas[i] = new Persona(nombre,apellido1,apellido2);
			pasajeros[i]= new Usuario(personas[i], pasaporte);
			gestion.billetes_conirmados.add(new Billete(pasajeros[i], salida, llegada, precio));
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
			respuesta = gestion.scn.next();

			if(respuesta.equalsIgnoreCase("SI") || respuesta.equalsIgnoreCase("S")||respuesta.equalsIgnoreCase("NO") || respuesta.equalsIgnoreCase("N")) {
				
				if(respuesta.equalsIgnoreCase("SI") || respuesta.equalsIgnoreCase("S")) {
					
					siQuiere=true;
					correctaIntoduccion=true;
				}else {
					
					System.out.println("OPERACIÓN CANCELADA");
					gestion.inicioSesion(); 
					
				}
				
			}else {
				
				System.out.println("INTODUCE UAN RESPUESTA CORRECTA");
			}
		}
		
		return siQuiere;

	}


}