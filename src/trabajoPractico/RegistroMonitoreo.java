package trabajoPractico;

import java.time.LocalDate;

public class RegistroMonitoreo {
	
	private LocalDate fechaHora;
	private double energiaGenerada;
	private int cantidadIncidencias;
	
	public RegistroMonitoreo(LocalDate fechaHora, double energiaGenerada, int cantidadIncidencias) {
		
		this.fechaHora = fechaHora;
		this.energiaGenerada = energiaGenerada;
		this.cantidadIncidencias = cantidadIncidencias;
	}
	
	public LocalDate getFechaHora() {
		
		return this.fechaHora;
	}

	public double getEnergiaGenerada() {
		
		return this.energiaGenerada;
	}
	
	public int getCantidadIncidencias() {
		
		return this.cantidadIncidencias;
	}
	
}
