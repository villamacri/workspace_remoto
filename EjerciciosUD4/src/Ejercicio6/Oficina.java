package Ejercicio6;

import java.util.Arrays;

public class Oficina {
	
	private Cuenta [] listado;
	private int numCuenta;

	public Oficina(Cuenta[] listado, int numCuenta) {
		super();
		this.listado = listado;
		this.numCuenta = numCuenta;
	}

	public Cuenta[] getListado() {
		return listado;
	}

	public void setListado(Cuenta[] listado) {
		this.listado = listado;
	}
	
	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	@Override
	public String toString() {
		return "Oficina [listado=" + Arrays.toString(listado) + ", numCuenta=" + numCuenta + "]";
	}
	
	public double calcularSaldosCuentas(Cuenta c) {
		
		return c.calcularSaldos();
	}

	public double totalSaldos() {
		
		double suma=0;
		
		for (int i = 0; i < numCuenta; i++) {
			
			suma+=calcularSaldosCuentas(listado[i]);
		}
		
		return suma;
		
	}

}
