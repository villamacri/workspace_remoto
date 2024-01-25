package Ejercicio_4;

public class Alimentacion extends Producto {

	private double descuentoCaducidad;
	private int estado;

	public Alimentacion(double precioUnitario, String codigo, String nombre, double descuentoCaducidad, int estado) {
		super(precioUnitario, codigo, nombre);
		this.descuentoCaducidad = descuentoCaducidad;
		this.estado = estado;
	}

	public double getDescuentoCaducidad() {
		return descuentoCaducidad;
	}

	public void setDescuentoCaducidad(double descuentoCaducidad) {
		this.descuentoCaducidad = descuentoCaducidad;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Alimentacion [descuentoCaducidad=" + descuentoCaducidad + ", estado=" + estado + "]";
	}

	//Métodos
	
	public boolean caducidadProducto(int estado) {
		
		boolean aPuntoCaducado = false;
		
		if(estado==1) {
			
			return aPuntoCaducado = true;
		}else {
			
			return aPuntoCaducado = false;
		}
	
	}
	
}
