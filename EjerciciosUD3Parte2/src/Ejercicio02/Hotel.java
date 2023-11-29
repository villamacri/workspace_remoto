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
	
	public boolean comprobarLimpia(int opcion) {
		if(opcion==1) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean comprobarOcupado(int opcion) {
		if(opcion==1) {
			return true;
		}else {
			return false;
		}
	}
	
	public Habitacion findById(int numHabitacion) {
		int i=0;
		boolean encontrado=false;
		while(i < listaHabitaciones.length && !encontrado) {
			Habitacion deLista=listaHabitaciones[1];
			if(deLista.getNumHabitacion() == numHabitacion) 
				encontrado=true;
				else
					i++;
			
		}if(encontrado)
			return listaHabitaciones[i];
		else
			return null;
	}
	
	public double calcularPrecioFinalUnidad(double precioServExtra, int numHabitacion) {
		return (findById(numHabitacion).getPrecio()+precioServExtra)*findById(numHabitacion).getNumDias();
		
	}
	
	public void mostrarFactura(int numHabitacion) {
		findById(numHabitacion).toString();
		
	}
	
}
