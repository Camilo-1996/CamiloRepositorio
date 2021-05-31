package interfazes;


/**
 * Clase que guarda algunos men�s recurrentes utilizados a lo largo del programa.
 * @author Juan Camilo Ram�rez Zapata.
 * @version 1.0.
 */
public  class  Menu{
	
	
	/**
	 * Mensaje de presentaci�n de la aplicaci�n
	 */
	public static void mensajeInicio() {
		
		System.out.println("*************************************************************************************************************");
		System.out.println("**************************************    BIENVENIDO A VUELINKING!!  ***************************************");
		System.out.println("*************************************************************************************************************");
		System.out.println("***************************************    TU  APP  DE  VIAJES    *************************************************");
		System.out.println("*************************************************************************************************************\n\n");
	}
	
	
	/**
	 * Men� de interaci�n inicial con el usuario, tenemos 3 opciones: <br/>
	 * <br/>
	 * 1. Ida.<br/>
	 * 2. Ida y vuelta.<br/>
	 * 3. Salir de la aplicaci�n.<br/>
	 * 
	 */
	public static void menuUsuario() {
	
			System.out.println("�ELIJE TU FORMA DE VIAJAR CON NOSOTROS!\n");
			System.out.println("1-S�LO IDA \n2-IDA Y VUELTA \n3-SALIR DE LA APP");
			
	}
	
	
	/**
	 * Mensaje de fin de la aplicaci�n.
	 */
	public static void mensajeFin() {
		
		System.out.println("\nGRACIAS POR UTLIZAR NUESTRA APP\n "
				+ "ESPERAMOS VERTE PRONTO EN VUELIKING");
	}
	
	
}


	
