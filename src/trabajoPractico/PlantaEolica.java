package trabajoPractico;

import java.time.LocalDate;

public class PlantaEolica extends PlantaRenovable{
	
	private int cantidadAeroGeneradores;
	private double alturaTorres;
	private double velocidadMinimaViento; 
	
	public PlantaEolica(Integer idPlanta, String nombre, String direccion, double capacidadMax, 
            boolean estado, LocalDate fechaApertura, double cuotaMinima, 
            double eficienciaPromedio, int cantidadAerogeneradores, double alturaTorres, double velocidadMinimaViento) {
		
		super(idPlanta, nombre, direccion, capacidadMax, estado, fechaApertura, cuotaMinima, "Eolica", eficienciaPromedio);
	
		this.cantidadAeroGeneradores = cantidadAeroGeneradores;
		this.alturaTorres = alturaTorres;
		this.velocidadMinimaViento = velocidadMinimaViento;
	}
	
	public int getCantidadAeroGeneradores() {
		
		return this.cantidadAeroGeneradores;
	}
	
	public double getAlturaTorres() {
		
		return this.alturaTorres;
	}
	
	public double getVelocidadMinimaViento() {
		
		return this.velocidadMinimaViento;
	}
	
	// falta metodo cumpliocuota y getcapacidadminimacuota; }
	
	
	
	
}
