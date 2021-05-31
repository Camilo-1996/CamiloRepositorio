0package test;

import gestion.Gestion;
import interfazes.Menu;

/**
 * Clase que hace el test de la aplicación. La clase simplemente genera un objeto gestión
 * para realizar la consulta del usuario, apartir de ahi se distribuye por el resto de clases del programa.
 * @author Juan Camilo Ramírez Zapata.
 *
 */
public class Test {

	public static void main(String[] args) {
	
		Menu.mensajeInicio();
		
		Gestion gestion01= new Gestion();
		
		gestion01.inicioSesion();
		
		
	}

}
