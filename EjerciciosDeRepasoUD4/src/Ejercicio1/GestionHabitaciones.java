package Ejercicio1;

import java.util.Arrays;

public class GestionHabitaciones {
	
	private HabitacionEstandar [] lista;

	public GestionHabitaciones(HabitacionEstandar[] lista) {
		super();
		this.lista = lista;
	}

	public HabitacionEstandar[] getLista() {
		return lista;
	}

	public void setLista(HabitacionEstandar[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "GestionHabitaciones [lista=" + Arrays.toString(lista) + "]";
	}
	
	public HabitacionEstandar findById(String habitacionId) {
		boolean encontrado=false;
		int i=0;
		
		while(i<lista.length && !encontrado) {
			if(lista[i].getIdHabitacion().equalsIgnoreCase(habitacionId)) {
				encontrado=true;
			}else {
				i++;
			}	
		}if(encontrado)
			return lista[i];
		else
			return null;
	}
	
	public double calcularPrecioHabitacion(double precioServicio, double descuento, HabitacionEstandar he) {
		return he.calcularPrecio(precioServicio, descuento);
		
	}

}
