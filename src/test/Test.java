0package test;

import gestion.Gestion;
import interfazes.Menu;

/**
 * Clase que hace el test de la aplicaci�n. La clase simplemente genera un objeto gesti�n
 * para realizar la consulta del usuario, a partir de ahi se distribuye por el resto de clases del programa.
 * 
 * @author Juan Camilo Ram�rez Zapata.
 *
 */
public class Test {

	public static void main(String[] args) {
	
		Menu.mensajeInicio();
		
		Gestion gestion01= new Gestion();
		
		gestion01.inicioSesion();
		
		
	}

}
