package Ejercicio2;

import java.util.Arrays;

public class Club {
	
	private String nombre;
	private int numPistas;
	private Socio [] lista;
	
	public Club(String nombre, int numPistas, Socio[] lista) {
		super();
		this.nombre = nombre;
		this.numPistas = numPistas;
		this.lista = lista;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumPistas() {
		return numPistas;
	}
	public void setNumPistas(int numPistas) {
		this.numPistas = numPistas;
	}
	public Socio[] getLista() {
		return lista;
	}
	public void setLista(Socio[] lista) {
		this.lista = lista;
	}
	@Override
	public String toString() {
		return "Club [nombre=" + nombre + ", numPistas=" + numPistas + ", lista=" + Arrays.toString(lista) + "]";
	}
	
	

}
