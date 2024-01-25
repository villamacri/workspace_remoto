package Ejercicio5;

public class Vendedor extends Empleado{

	private double cantidadVentas;
	private double incentivo;
	
	public Vendedor(String nombre, String apellidos, double sueldoBase, int numEmpleado, double cantidadVentas,
			double incentivo) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		this.cantidadVentas = cantidadVentas;
		this.incentivo = incentivo;
	}

	public double getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(double cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return "Vendedor [cantidadVentas=" + cantidadVentas + ", incentivo=" + incentivo + "]";
	}
	
	public double calcularSueldo() {
		
		return super.calcularSueldo() + ((cantidadVentas * incentivo/100));
	}
	
	public void felicitarVenta(double objetivo) {
		
		if(cantidadVentas >= objetivo) {
		System.out.println("Felicidades, has cumplido con el objetivo ");
		}else {
			System.out.println("Aún te queda, sigue así");
		}
	}
	
}
