package controlador;

import gestion.Gestion;
import gestion.PaisesBBDD;
import interfazes.Menus;

public class Test {

	public static void main(String[] args) {
	
		Menus.menuInicio();
		
		Gestion gestion01= new Gestion();
		
		gestion01.inicioSesion();
	
	}

}
