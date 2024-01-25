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
	
	

}
