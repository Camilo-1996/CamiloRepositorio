package billete;

import java.time.*;
public class Vuelo {
	//Necesito saber que hace la clase vuelo
	private String origen;
	private String destino;
	private String compa�ia;
	private LocalDateTime fechaHoraVuelo; // hay que trabajar en esta clase
	
	
	public Vuelo(String origen, String destino, String compa�ia) {
		this.origen = origen;
		this.destino = destino;
		this.compa�ia = compa�ia;
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


	public String getCompa�ia() {
		return compa�ia;
	}


	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}


	public LocalDateTime getFechaHoraVuelo() {
		return fechaHoraVuelo;
	}


	public void setFechaHoraVuelo(LocalDateTime fechaHoraVuelo) {
		this.fechaHoraVuelo = fechaHoraVuelo;
	}
	//FIN getters y setters
	
	
	
	
}
