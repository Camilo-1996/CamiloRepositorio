package billete;

public class Billete {

	//esta clase genera un fichero txt

	private Persona datosPasajero;
	private static long numeroBillete;
	private Vuelo datosVuelo;
	private long nBillete;
	
	public Billete (Persona persona, Vuelo vuelo) {
		
		this.datosPasajero=persona;
		this.datosVuelo=vuelo;
		
		nBillete=numeroBillete++;
		
	}
	
	
	//m�todo para consultar los datos del billete
	public void datosBillete() {
		
		System.out.println("DATOS BILLETE N� "+ nBillete);
			
		//falta poner los otros datos persona y Vuelo
	}
	
	

	
}