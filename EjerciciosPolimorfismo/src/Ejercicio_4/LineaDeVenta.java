package Ejercicio_4;

public class LineaDeVenta {
	
	private int cantidad;
	private Producto p;

	public LineaDeVenta(int cantidad) {
		super();
		this.cantidad = cantidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "LineaDeVenta [cantidad=" + cantidad + "]";
	}

	
}
