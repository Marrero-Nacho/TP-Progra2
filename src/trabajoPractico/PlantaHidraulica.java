package trabajoPractico;
import java.time.LocalDate;

public class PlantaHidraulica extends PlantaRenovable{
	private int cantidadTurbinas;
	private double capacidadEmbalse;
    
	//constructor
	public PlantaHidraulica(Integer idPlanta, String nombre, String direccion, double capacidadMax, 
            boolean estado, LocalDate fechaApertura, double cuotaMinima, 
            double eficienciaPromedio, int cantidadTurbinas, double capacidadEmbalse) {
		
		super(idPlanta, nombre, direccion, capacidadMax, estado, fechaApertura, cuotaMinima, "Hidraulica", eficienciaPromedio);
		
		this.cantidadTurbinas = cantidadTurbinas;
		this.capacidadEmbalse = capacidadEmbalse;
		
	}
	public int getCantidadTurbinas() {
		return this.cantidadTurbinas;
	}
	public double getCapacidadEmbalse() {
		return this.capacidadEmbalse;
	}
	
	//falta aplicar los metodos abstractos (cumplioCuota y get capacidadminimaCuota)
	
}
