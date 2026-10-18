package trabajoPractico;

import java.time.LocalDate;

public abstract class PlantaRenovable extends Planta{
	private String fuentePrimaria ;
	private double eficienciaPromedio; 
	public PlantaRenovable(Integer idPlanta, String nombre, String direccion, double capacidadMax, boolean estado, LocalDate fechaApertura,double cuotaMinima , String fuentePrimaria, double eficienciaPromedio) {
		super(idPlanta, nombre, direccion, capacidadMax, estado, fechaApertura, cuotaMinima  );
		this.fuentePrimaria = fuentePrimaria;
		this.eficienciaPromedio = eficienciaPromedio;		
	}
	
	@Override
	public boolean esRenovable() {
		return true;
	}
	public String getFuentePrimaria() {
		return this.fuentePrimaria;
	}
	public double getEficienciaPromedio() {
		return this.eficienciaPromedio;
	}
}
