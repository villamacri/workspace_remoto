package Ejercicio1;

public class Producto {
	
//Los getter and setters sirven para acceder a los datos
//de los atributos desde otra clase
//

	private String nombre;
	private double precioFabrica;
	private int seccion;
	private boolean enVenta;
	
	public Producto(String nombre, double precioFabrica, int seccion, boolean enVenta) {
		
		this.nombre = nombre;
		this.precioFabrica = precioFabrica;
		this.seccion = seccion;
		this.enVenta = enVenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	public int getSeccion() {
		return seccion;
	}

	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}

	public boolean isEnVenta() {
		return enVenta;
	}

	public void setEnVenta(boolean enVenta) {
		this.enVenta = enVenta;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioFabrica=" + precioFabrica + ", seccion=" + seccion + ", enVenta="
				+ enVenta + "]";
	}
	
	
	
	
	
}
