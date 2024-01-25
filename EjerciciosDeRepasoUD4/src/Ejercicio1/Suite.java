package Ejercicio1;

public class Suite extends HabitacionEstandar {
	
	private double superficieMetros, servicioHabitaciones;

	public Suite(double precioBase, boolean ocupada, String nombreCliente, int numDiasOcupado, int numOcupantes,
			double superficieMetros, double servicioHabitaciones) {
		super(precioBase, ocupada, nombreCliente, numDiasOcupado, numOcupantes);
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
	
	public double calcularPrecioSuite (double descuento) {
		
		return (super.calcularPrecio()+servicioHabitaciones)-(super.calcularPrecio()*descuento/100);
	}

}
