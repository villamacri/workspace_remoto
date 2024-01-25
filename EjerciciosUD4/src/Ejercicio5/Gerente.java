package Ejercicio5;

public class Gerente extends Empleado {

	private double impuestos;

	public Gerente(String nombre, String apellidos, double sueldoBase, int numEmpleado, double impuestos) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		this.impuestos = impuestos;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return "Gerente [impuestos=" + impuestos + "]";
	}
	
	
	public double calcularSueldo() {
		return super.calcularSueldo() - ((super.calcularSueldo()*impuestos/100));
	}
}
