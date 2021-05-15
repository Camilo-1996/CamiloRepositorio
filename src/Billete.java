
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
	
	
	//método para consultar los datos del billete
	public void datosBillete() {
		
		System.out.println("DATOS BILLETE Nº "+ numeroBillete);
			
		//falta poner los otros datos persona y Vuelo
	}
	
	//método para escribir el billete en un fichero
	
}