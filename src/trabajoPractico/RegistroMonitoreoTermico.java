package trabajoPractico;

public class RegistroMonitoreoTermico extends RegistroMonitoreo{
	
	private double co2Generado;
	private double combustibleUtilizado;
	
	public RegistroMonitoreoTermico(LocalDate fechaHora, double energiaGenerada, int cantidadIncidencias, double co2Generado, double combustibleUtilizado) {
		
	super( fechaHora, energiaGenerada, cantidadIncidencias);	
		
	this.co2Generado = co2Generado;
	this.combustibleUtilizado = combustibleUtilizado;
	
	}
	
	public double getCo2Generado() {
		
		return this.co2Generado;
	}
	
	public double getCombustibleUtilizado() {
		
		return this.combustibleUtilizado;
	}
}
