package gestion;

import java.sql.Date;
import java.util.Scanner;

public class pruebas {

	public static void main(String[] args) {
		
		int dia =0;
		int mes =0;
			Scanner scn = new Scanner(System.in);
			Date fecha = new Date(122, mes, dia);
			System.out.println("Introduce la fecha de entrada");
			dia = scn.nextInt();
			mes = scn.nextInt();
		System.out.println(fecha);
		
	}

}
