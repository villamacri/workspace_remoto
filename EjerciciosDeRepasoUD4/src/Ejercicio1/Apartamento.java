package Ejercicio1;

public class Apartamento extends HabitacionEstandar{

	private boolean contratado;

	public Apartamento(double precioBase, boolean ocupada, String nombreCliente, String idHabitacion, int numDiasOcupado, int numOcupantes,
			boolean contratado) {
		super(precioBase, ocupada, nombreCliente, idHabitacion, numDiasOcupado, numOcupantes);
		this.contratado = contratado;
	}

	public boolean isContratado() {
		return contratado;
	}

	public void setContratado(boolean contratado) {
		this.contratado = contratado;
	}

	@Override
	public String toString() {
		return "Apartamento [contratado=" + contratado + "]";
	}
	
	@Override
	public double calcularPrecio(double precioServicio, double descuento) {
		
		double precioFinal=super.calcularPrecio(precioServicio, descuento);
		if(contratado==true) {
			precioFinal+=precioServicio;
			
		}
		
		return precioFinal;
		
	}
	
}
