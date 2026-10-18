package trabajoPractico;

import java.time.LocalDate;

public class PlantaTermica extends Planta{
	
	private String tipoCombustible;
	private double objetivoEmisionesCo2Hora;
	private double capacidadAlmacenamientoCombustible;
	
	public PlantaTermica(Integer idPlanta, String nombre, String direccion, double capacidadMax, boolean estado, LocalDate fechaApertura,double cuotaMinima, String tipoCombusitble, double objetivoEmisionesCo2Hora, double capacidadAlmacenamientoCombustible) {
		super(idPlanta, nombre, direccion, capacidadMax, estado, fechaApertura, cuotaMinima, tipoCombustible, objetivoEmisionesCo2Hora, capacidadAlmacenamientoCombustible);
		
		this.tipoCombustible = tipoCombustible;
		this.objetivoEmisionesCo2Hora = objetivoEmisionesCo2Hora;
		this.capacidadAlmacenamientoCombustible = capacidadAlmacenamientoCombustible;
		
		
	}
	
	public boolean esRenovable() {
		
		return false;
	}
	
	public String getTipoCombustible() {

		return this.tipoCombustible;
	}

	public double getObjetivoEmisionesCo2Hora() {
		
		return this.objetivoEmisionesCo2Hora;
	}
	
	public double getCapacidadAlmacenamientoCombustible() {
		
		return this.capacidadAlmacenamientoCombustible;
		
	}
	
	/// falta cumpliocuota y getcapacidadminimacuota
}

