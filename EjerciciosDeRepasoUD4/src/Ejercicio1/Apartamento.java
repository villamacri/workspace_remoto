package Ejercicio1;

public class Apartamento extends HabitacionEstandar{

	private boolean contratado;

	public Apartamento(double precioBase, boolean ocupada, String nombreCliente, int numDiasOcupado, int numOcupantes,
			boolean contratado) {
		super(precioBase, ocupada, nombreCliente, numDiasOcupado, numOcupantes);
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
	
	public double calcularPrecioApartamento(double precioServicio) {
		
		double precioFinal=super.calcularPrecio();
		if(contratado==true) {
			precioFinal+=precioServicio;
			
		}
		
		return precioFinal;
		
	}
	
}
