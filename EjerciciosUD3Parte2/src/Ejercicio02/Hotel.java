package Ejercicio02;

public class Hotel {

	/*
	 *Método agregar habitación
	 *Método booleano comprobar si esta ocupado o no
	 *Método double calcularPrecio teniendo en cuenta parametros de días, serviciosContratados, boolean limpia
	 *Método void mostrar factura
 
	 */
	
	Habitacion [] listaHabitaciones;
	private int numHabitaciones;
	
	
	public Hotel(Habitacion[] listaHabitaciones, int numHabitaciones) {

		this.listaHabitaciones = listaHabitaciones;
		this.numHabitaciones = numHabitaciones;
	}
	




	public Habitacion[] getListaHabitaciones() {
		return listaHabitaciones;
	}





	public void setListaHabitaciones(Habitacion[] listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}





	public int getNumHabitaciones() {
		return numHabitaciones;
	}





	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}





	public void agregar(Habitacion h) {
		
		listaHabitaciones[numHabitaciones]=h;
		numHabitaciones++;
		
	}
	
	public boolean comprobarOcupado(int opcion) {
		if(opcion==1) {
			return true;
		}else {
			return false;
		}
	}
	public boolean serviciosExtra(int opcion) {
		if(opcion==1) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public double calcularPrecioFinalUnidad(Habitacion h, double precioServExtra) {
		double precioTHabitacion = 0;
		
		return precioTHabitacion+=h.getPrecio()+precioServExtra*h.getNumDias();
		
	}
	
	public void mostrarFactura(Habitacion h) {
		h.toString();
		
	}
	
}
