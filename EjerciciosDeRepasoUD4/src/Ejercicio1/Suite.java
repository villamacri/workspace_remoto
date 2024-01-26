package Ejercicio1;

public class Suite extends HabitacionEstandar {
	
	private double superficieMetros, servicioHabitaciones;

	public Suite(double precioBase, boolean ocupada, String nombreCliente, String idHabitacion, int numDiasOcupado,
			int numOcupantes, double superficieMetros, double servicioHabitaciones) {
		super(precioBase, ocupada, nombreCliente, idHabitacion, numDiasOcupado, numOcupantes);
		this.superficieMetros = superficieMetros;
		this.servicioHabitaciones = servicioHabitaciones;
	}

	public double getSuperficieMetros() {
		return superficieMetros;
	}

	public void setSuperficieMetros(double superficieMetros) {
		this.superficieMetros = superficieMetros;
	}


	public double getServicioHabitaciones() {
		return servicioHabitaciones;
	}

	public void setServicioHabitaciones(double servicioHabitaciones) {
		this.servicioHabitaciones = servicioHabitaciones;
	}
	
	@Override
	public String toString() {
		return "Suite [superficieMetros=" + superficieMetros + ", servicioHabitaciones="
				+ servicioHabitaciones + "]";
	}
	
	public double calcularPrecio (double precioServicio, double descuento) {
		
		return (super.calcularPrecio(precioServicio, descuento)+servicioHabitaciones)-(super.calcularPrecio(precioServicio, descuento)*descuento/100);
	}

}
