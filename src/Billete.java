
public class Billete {

	//esta clase genera un fichero txt
	
	private Persona datosPasajero;
	private static long numeroBillete;
	private Vuelo datosVuelo;
	
	public Billete (Persona persona, Vuelo vuelo) {
		
		this.datosPasajero=persona;
		this.datosVuelo=vuelo;
		
		numeroBillete++;
		
	}
	
	
	//m�todo para consultar los datos del billete
	public void datosBillete() {
		
		System.out.println("DATOS BILLETE N� "+ numeroBillete);
			
		//falta poner los otros datos persona y Vuelo
	}
	
	//m�todo para escribir el billete en un fichero
	
}