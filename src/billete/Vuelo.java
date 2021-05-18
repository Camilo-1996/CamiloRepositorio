package billete;

import java.time.*;
public class Vuelo {

	private String origen;
	private String destino;
	private String compañia;
	private LocalDateTime fechaHoraVuelo; // hay que trabajar en esta clase
	
	
	public Vuelo(String origen, String destino, String compañia) {
		this.origen = origen;
		this.destino = destino;
		this.compañia = compañia;
	}

	//pendiente
	void soloIda() {
		
	}
	
	void idayVuelta() {
		
	}
	
	
	//FIN getters y setters
	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getCompañia() {
		return compañia;
	}


	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}


	public LocalDateTime getFechaHoraVuelo() {
		return fechaHoraVuelo;
	}


	public void setFechaHoraVuelo(LocalDateTime fechaHoraVuelo) {
		this.fechaHoraVuelo = fechaHoraVuelo;
	}
	//FIN getters y setters
	
	
	
	
}
