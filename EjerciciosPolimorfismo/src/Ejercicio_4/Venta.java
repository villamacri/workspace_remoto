package Ejercicio_4;

import java.util.Arrays;

public class Venta {

	private LineaDeVenta[] listado;

	public LineaDeVenta[] getListado() {
		return listado;
	}

	public void setListado(LineaDeVenta[] listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Venta [listado=" + Arrays.toString(listado) + "]";
	}
	
	
}
