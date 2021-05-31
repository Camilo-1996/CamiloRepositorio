package interfazes;


/**
 * Clase menú que guarda algunos menús recurrentes utilizados a lo largo del programa.
 * @author Juan Camilo Ramírez Zapata.
 * @version 1.0.
 */
public  class  Menu{
	
	
	/**
	 * Mensaje de presentación de la aplicación
	 */
	public static void mensajeInicio() {
		
		System.out.println("*************************************************************************************************************");
		System.out.println("**************************************    BIENVENIDO A VUELINKING!!  ***************************************");
		System.out.println("*************************************************************************************************************");
		System.out.println("***************************************    TU  APP  DE  VIAJES    *************************************************");
		System.out.println("*************************************************************************************************************\n\n");
	}
	
	
	/**
	 * Menú de interación inicial con el usuario, tenemos 3 opciones: <br/>
	 * <br/>
	 * 1. Ida.<br/>
	 * 2. Ida y vuelta.<br/>
	 * 3. Salir de la aplicación.<br/>
	 * 
	 */
	public static void menuUsuario() {
	
			System.out.println("¡ELIJE TU FORMA DE VIAJAR CON NOSOTROS!\n");
			System.out.println("1-SÓLO IDA \n2-IDA Y VUELTA \n3-SALIR DE LA APP");
			
	}
	
	
	/**
	 * Mensaje de fin de la aplicación.
	 */
	public static void mensajeFin() {
		
		System.out.println("\nGRACIAS POR UTLIZAR NUESTRA APP\n "
				+ "ESPERAMOS VERTE PRONTO EN VUELIKING");
	}
	
	
}


	
