package Ejercicio03;

import java.util.Iterator;

/*Atributos
 * Movil [] listaMoviles
 * double totalVentas
 * 
 * Métodos
 * 
 * int comprobarMovilesSinVender creando una lista 
 * void mostrar precio final, descuento al precio unitario
 * boolean si se puede cambiar
 * calcular 
 */

public class Vendedor {
	
	Movil [] listaMoviles;
	int cantidadMoviles;
	
	public Vendedor(Movil[] listaMoviles, int cantidadMoviles) {
		
		this.listaMoviles = listaMoviles;
		this.cantidadMoviles = cantidadMoviles;
	}
	
	public void agregar(Movil m) {
		listaMoviles[cantidadMoviles] = m;
		cantidadMoviles ++;
	}
	
	public boolean comprobarVendido(int opcion) {
		if(opcion==1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean comprobarNuevo(int opcion) {
		if(opcion==1) {
			return true;
		}else {
			return false;
		}
	}
	
	public int comprobarMovilesSinVender() {
		int count = 0;
		for (int i = 0; i < cantidadMoviles; i++) {
			if (!listaMoviles[i].isVendido()) {
				count++;
			}
		}
		return count;
		
	}
	
	public Movil findById(String codigo) {
		int i=0;
		boolean encontrado=false;
		while(i < cantidadMoviles && !encontrado) {
			Movil deLista=listaMoviles[i];
			if(deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado=true;
			else
				i++;
		}
		if(encontrado)
			return listaMoviles[i];
		else
			return null;
	}
	public void listarMovilesNV() {
		
		for (int i = 0; i < cantidadMoviles; i++) {
		if(!listaMoviles[i].isVendido()) {
			System.out.println(listaMoviles[i]);
		}
		}
	}
	
	public double calcularSumaPrecioUNuevo() {
		double suma=0;
		for (int i = 0; i < cantidadMoviles; i++) {
			if(listaMoviles[i].isVendido() && listaMoviles[i].isNuevo()) {
				suma+=listaMoviles[i].getPrecioUnitario();
			}
		}
		return suma;
	}
	
	public double calcularSumaPrecioUSegunda(double descuento) {
		double suma = 0;
		descuento = 0;
		double cien = 100;
		for (int i = 0; i < cantidadMoviles; i++) {
			if(listaMoviles[i].isVendido() && !listaMoviles[i].isNuevo()) {
				suma+=listaMoviles[i].getPrecioUnitario();
			}
		}
		return suma-((suma*descuento)/cien);
	
	}

}
