package gestion;

import java.time.LocalDate;

import bd.aerolinea;

public class GestionIdayVuelta {
	
	Gestion gestion = new Gestion();
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
		System.out.println("Indica el dia/mes de tu viaje");
	
	}

	
	/*
	 * Este metodo comprueba si lo introducido es ciudad o pais, si es ciudad es
	 * correcto si es pais va al metodo eligoCiudad y lista las ciudades el que se
	 * debe elegir, ya que en un pais puede hacer 1 o mas aereopuertos, pero no
	 * todas las ciudades lo tienen
	 * @param 
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
			nombre = Gestion.scn.next();
			System.out.println("Primer Apellido:");
			apellido1 = Gestion.scn.next();
			System.out.println("Segundo Apellido:");
			apellido2 = Gestion.scn.next();
			System.out.println("Tu numero de pasaporte:");
			pasaporte = Gestion.scn.next();
			personas[i] = new Persona(nombre,apellido1,apellido2);
			pasajeros[i]= new Usuario(personas[i], pasaporte);
			gestion.billetes_conirmados.add(new Billete(pasajeros[i]));
		}
		
		//billete.setDatosPasajero(pasajeros[i]);
	}
	public void consultoOpcionIdayVuelta(LocalDate listado_fechaSalida[] , LocalDate listado_fechaVuelta[],LocalDate salida, LocalDate vuelta ,int dia, int mes, int numPasajeros, int opcionColumna,String respuesta, float precios[]){
		int opcion=0;
		float precioElegido =0;
	if(respuesta.equalsIgnoreCase("s")) {
		//Comprobar si es s o n
		System.out.println("Indica el numero de opcion, de la columna 'Opciones'");
		opcion = Gestion.scn.nextInt();
		for (int i = 0; i <= opcionColumna; i++) {
			if (i == opcion) {
				precioElegido = precios[opcion-1];
			}
		}
			muestroDetallesdelPrecioElegido(precioElegido, listado_fechaSalida,listado_fechaVuelta,salida,vuelta,numPasajeros,dia,mes,opcion);
		}else{
			System.out.println("Quieres:\n1.Cambiar Destino\n2.Cambiar fecha\n3.Volver al menu principal\n4.Salir");
			eligoOpcionIdayVuelta( salida, vuelta ,dia, mes, numPasajeros, opcion);
		}	
	}
	
	public void muestroDetallesdelPrecioElegido(float precioElegido, LocalDate listado_fechaSalida[],LocalDate listado_fechaVuelta[],LocalDate salida,LocalDate vuelta,int numPasajeros, int dia, int mes, int opcion){
		String respuesta = "";
		aerolinea A01 = new aerolinea("IB", "Iberia");
		System.out.println("\nLos datos del vuelo son:");
		System.out.println("Sale el dia:"+listado_fechaSalida[opcion-1].getDayOfMonth()+"/"+listado_fechaSalida[opcion-1].getMonthValue()+"/"+listado_fechaSalida[opcion-1].getYear());
		System.out.println("Sale el dia:"+listado_fechaVuelta[opcion-1].getDayOfMonth()+"/"+listado_fechaVuelta[opcion-1].getMonthValue()+"/"+listado_fechaVuelta[opcion-1].getYear());
		System.out.println("Operado por: "+A01.getNombre());
		System.out.println("Con precio Total: "+precioElegido+"€");	
		//System.out.println("Parte a las"+fecha.atTime(time));
		System.out.println("Con 1mt de mano de 10kg");
		System.out.println("2mt - 23kg");
		System.out.println("Deseas reservar con esta fecha y precio.? si/no");
		respuesta = Gestion.scn.next();
		if(respuesta.equalsIgnoreCase("si")) {
			confirmoVuelo(numPasajeros);
		}else {
			System.out.println("Los precios pueden variar si quieres:");
			System.out.println("Podemos:\n1.Cambiar Destino\n2.Cambiar fecha\n3.Volver al menu principal\n4.Salir");
			eligoOpcionIdayVuelta( salida, vuelta ,dia, mes, numPasajeros, opcion);
		}
	}



}
