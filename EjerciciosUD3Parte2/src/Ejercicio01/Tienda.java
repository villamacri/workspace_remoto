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

	
	public void listarProductos() {
		for (int i = 0; i < numProduct ; i++) {
			System.out.println(listaProductos[i]);
		}
	}
	
	public void agregar (Producto p) {
		
		listaProductos [numProduct] = p;
		numProduct ++;
	}
	
	public boolean comprobarFragil(int opcion) {
		if(opcion==1) {
			return true;
		}else {
			
			return false;
		}
			
	}
	
	public Producto findById(String codigo) {
		int i=0;
		boolean encontrado=false;
		while(i < listaProductos.length && !encontrado) {
			Producto deLista=listaProductos[1];
			if(deLista.getCodigo().equalsIgnoreCase(codigo)) 
				encontrado=true;
			else
				i++;
		}
		if(encontrado) 
			return listaProductos[i];
		else
			return null;
		}
	
	public double calcularInversion () {
		
		double totalInversion = 0;
		
		for (int i = 0; i < numProduct ; i++) {
			totalInversion+=listaProductos[i].getPrecioFabric();
		}
		return totalInversion;
	}
	
	public double calcularTotalPVP(double pvp, double precioTrans) {
		double suma = 0;
		int cien=100;
		
		for (int i = 0; i < numProduct ; i++) {
			suma+=listaProductos[i].calcularPrecioCoste(precioTrans)+(listaProductos[i].calcularPrecioCoste(precioTrans)*pvp/cien);
		}
		return suma;
	}
	
	public double totalPrecioFabrica() {
		int suma = 0;
		for (int i = 0; i < numProduct; i++) {
			suma+=listaProductos[i].getPrecioFabric();
		}
		return suma;
	}
	
	public double calcularGanancias(double pvp, double precioTrans) {
		return calcularTotalPVP(pvp, precioTrans)-totalPrecioFabrica();
			
	}
	
}
	
	

