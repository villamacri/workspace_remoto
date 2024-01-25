package Ejercicio_4;

public class Electronica extends Producto {

	private double impuestoEspecial;

	public Electronica(double precioUnitario, String codigo, String nombre, double impuestoEspecial) {
		super(precioUnitario, codigo, nombre);
		this.impuestoEspecial = impuestoEspecial;
	}

	public double getImpuestoEspecial() {
		return impuestoEspecial;
	}

	public void setImpuestoEspecial(double impuestoEspecial) {
		this.impuestoEspecial = impuestoEspecial;
	}

	@Override
	public String toString() {
		return "Electronica [impuestoEspecial=" + impuestoEspecial + "]";
	}

	
	
}
