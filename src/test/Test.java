package test;

import gestion.Gestion;
import interfazes.Menu;

public class Test {

	public static void main(String[] args) {
	
		Menu.mensajeInicio();
		
		Gestion gestion01= new Gestion();
		
		gestion01.inicioSesion();
		
		
	}

}
