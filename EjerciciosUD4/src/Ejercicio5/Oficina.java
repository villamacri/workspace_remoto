package Ejercicio5;

import java.util.Arrays;
import java.util.Iterator;

public class Oficina {
	
	private Empleado [] listado;
	private int numEmpleado;
	
	public Oficina(Empleado[] listado, int numEmpleado) {
		super();
		this.listado = listado;
		this.numEmpleado = numEmpleado;
	}

	public Empleado[] getListado() {
		return listado;
	}

	public void setListado(Empleado[] listado) {
		this.listado = listado;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	@Override
	public String toString() {
		return "Oficina [listado=" + Arrays.toString(listado) + ", numEmpleado=" + numEmpleado + "]";
	}
	
	public double calcularSueldoEmpleado(Empleado e) {
		
		return e.calcularSueldo();
	}
	
	public double calcularTotalSueldos() {
		
		double suma=0;
		
		for (int i = 0; i < numEmpleado ; i++) {
			
			suma+=calcularSueldoEmpleado(listado[i]);
			
		}
		
		return suma;
	}
	
	public void mostrarEmpleados(double objetivoVentas) {
		
		for (int i = 0; i < numEmpleado ; i++) {
			
			System.out.println(listado[i]+"Sueldo: " + calcularSueldoEmpleado(listado[i]));
			
		}
		
	}

}
