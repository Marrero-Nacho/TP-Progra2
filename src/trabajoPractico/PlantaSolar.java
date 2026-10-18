package trabajoPractico;

import java.time.LocalDate;

public class PlantaSolar extends PlantaRenovable{
	private double superficieCubierta;
	private int cantidadPaneles;
	private double horasRadiacionDiaria;
	
	//constructor
	public PlantaSolar(Integer idPlanta, String nombre, String direccion, double capacidadMax, 
            boolean estado, LocalDate fechaApertura, double cuotaMinima, 
            double eficienciaPromedio,double superficieCubierta ,int cantidadPaneles,double horasRadiacionDiaria) {
		// Paso los datos a la clase padre PlantaRenovable
		super(idPlanta, nombre, direccion, capacidadMax, estado, fechaApertura, cuotaMinima, "Solar", eficienciaPromedio);
		
		this.superficieCubierta = superficieCubierta;
		this.cantidadPaneles = cantidadPaneles;
		this.horasRadiacionDiaria = horasRadiacionDiaria;
		
	}
	// getters
	public double getSuperficieCubierta() {
		return this.superficieCubierta;
	}
	public int getCantidadPaneles() {
		return this.cantidadPaneles;
	}
	public double getHorasRadiacionDIaria() {
		return this.horasRadiacionDiaria;
	}
	//falta aplicar los metodos abstractos (cumplioCuota y get capacidadminimaCuota)
}
