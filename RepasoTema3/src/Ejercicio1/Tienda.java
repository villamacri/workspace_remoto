package Ejercicio1;

import java.util.Arrays;

/**
 * @author villalba.macri24_tri
 */

public class Tienda {
	
	private Producto [] listado;
	private int numProductos;
	private int numTrabajadores;
	
	public Tienda(Producto[] listado, int numProductos, int numTrabajadores) {
		
		this.listado = listado;
		this.numProductos = numProductos;
		this.numTrabajadores = numTrabajadores;
	}

	public Producto[] getListado() {
		return listado;
	}

	public void setListado(Producto[] listado) {
		this.listado = listado;
	}

	public int getNumProductos() {
		return numProductos;
	}

	public void setNumProductos(int numProductos) {
		this.numProductos = numProductos;
	}

	public int getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(int numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}
	
	@Override
	public String toString() {
		return "Tienda [listado=" + Arrays.toString(listado) + ", numProductos=" + numProductos + ", numTrabajadores="
				+ numTrabajadores + "]";
	}
	//VERBO INFINITIVO, SIN Ñ NI TILDES, QUE INDIQUE QUE HACE EL MÉTODO,
	//LA SEGUNDA PALABARA EMPIEZA EN MAYÚSCULA Y LA PRIMERA EN MINÚSCULA, SIEMPRE,
	//EN SERIO SIEMPRE, QUERIDO YO DEL FUTURO SIEMPRE
	

	public void agregar(Producto p) {
		listado[numProductos]=p;
		numProductos++;
		
	}
	
	public void mostrarProductos() {
		for (int i = 0; i < numProductos; i++) {
			System.out.println(listado[i]);
		}
	}
	
	public void mostrarListaV2(Producto [] lista) {
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]!=null)
			System.out.println(listado[i]);
		}
	}
	
	public Producto [] buscarBySeccion (int seccion) {
		
		int i = 0;
		Producto [] listaEncontrados=new Producto [numProductos];
		
		while (i<numProductos) {
			if(listado[i].getSeccion()==seccion) {
				listaEncontrados[i]=listado[i];
			}
			i++;	
		}
		return listaEncontrados;
		
		
			
			
		
	}
	
	
	

}
