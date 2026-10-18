package trabajoPractico;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Planta {
	private Integer idPlanta;
	private String nombre;
	private String direccion;
	private double capacidadMax;
	private boolean estado;
	private LocalDate fechaApertura;
	private double cuotaMinima;
	private ArrayList<RegistroMonitoreo> registrosMonitoreo;
	
	public Planta(Integer idPlanta, String nombre, String direccion, double capacidadMax, boolean estado, LocalDate fechaApertura, double cuotaMinima) {
		this.idPlanta = idPlanta;
		this.nombre = nombre;
		this.direccion = direccion;
		this.capacidadMax = capacidadMax;
		this.estado = estado;
		this.fechaApertura = fechaApertura;
		this.cuotaMinima = cuotaMinima;
		this.registrosMonitoreo = new ArrayList<>();
	}
	
	public abstract boolean cumplioCuota() {
		
		
	}
	public abstract double getCapacidadMinimaCuota() {
		
		
	}
	public abstract boolean esRenovable() {
	
	}
	public Integer getIdPlanta() {
		return this.idPlanta;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public double getCapacidadMax(){
		return this.capacidadMax;
	}
	public boolean getEstado() {
		return this.estado;
	}
	public LocalDate getFechaApertura() {
		return this.fechaApertura;
	}
	public void cambiarEstado() {
		if (this.estado == false) {
			this.estado = true;
		}
		else {
			this.estado = false;
		}
	}
	public boolean estaActiva() {
		if (this.estado == true) {
			return true;
		}
		else {
			return false;
		}
	}
	public double getTotalGenerado() {
		
		
	}
	
	//calcularHistogramacumplimiento no tengo la firma del tipo de dato, preguntar
	
	
	
	
	
	
	
	
}

