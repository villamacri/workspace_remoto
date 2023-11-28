package Ejercicio01;

public class Tienda {

	private Producto [] listaProductos;
	private int numProduct;
	
	
	public Tienda(Producto[] listaProductos, int numProduct) {
		
		this.listaProductos = listaProductos;
		this.numProduct = numProduct;
	}
	
	public Producto[] getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(Producto[] listaProductos) {
		this.listaProductos = listaProductos;
	}

	public int getNumProduct() {
		return numProduct;
	}

	public void setNumProduct(int numProduct) {
		this.numProduct = numProduct;
	}

	
	
	public void agregar (Producto p) {
		
		listaProductos [numProduct] = p;
		numProduct ++;
	}
	
	public double calcularInversion (Producto p) {
		
		double totalInversion = 0;
		
		for (int i = 0; i < numProduct; i++) {
			totalInversion+=p.getPrecioFabric();
		}
		return totalInversion;
	}
	
	public double calcularPVP(Producto p, double porcentaje) {
		porcentaje=0;
		pvp=p.calcularPrecioCoste(porcentaje)+((p.calcularPrecioCoste()*porcentaje)/100);
	}
	
	
	
	
	
	
	
	
	
}
