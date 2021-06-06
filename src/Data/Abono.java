package Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Currency;

public class Abono implements Serializable{

	private Localidad localidad;
	private LocalDate fechaCaducidad;
	private String deporte;
	
	private static float TARIFA_COMPLETO = (float)15.00;
	private static float TARIFA_LIGA = (float)45.00;
	
	
	public Abono(Localidad localidad, String deporte) {
		this.localidad = localidad;
		this.setFechaCaducidad();
		this.deporte = deporte;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad() {
		LocalDate fechaActual = LocalDate.now();
		LocalDate fechaCaducidad = fechaActual.plusYears(1);
		this.fechaCaducidad = fechaCaducidad;
	}
	
	public void renovarAbono() {
		LocalDate fechaActual = LocalDate.now();
		if(fechaCaducidad.isAfter(fechaActual)) {
			fechaCaducidad = fechaCaducidad.plusYears(1);			
		}else {
			setFechaCaducidad();
		}
	}
	
	public float getPrecio() {
		float precio = (float) 30.00;
		return precio;
	}
}

