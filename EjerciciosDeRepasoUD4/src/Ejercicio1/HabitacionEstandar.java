package Ejercicio1;

public class HabitacionEstandar {
	
	private double precioBase;
	private boolean ocupada;
	private String nombreCliente;
	private int numDiasOcupado, numOcupantes;
	
	public HabitacionEstandar(double precioBase, boolean ocupada, String nombreCliente, int numDiasOcupado,
			int numOcupantes) {
		super();
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.numDiasOcupado = numDiasOcupado;
		this.numOcupantes = numOcupantes;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumDiasOcupado() {
		return numDiasOcupado;
	}

	public void setNumDiasOcupado(int numDiasOcupado) {
		this.numDiasOcupado = numDiasOcupado;
	}

	public int getNumOcupantes() {
		return numOcupantes;
	}

	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}

	@Override
	public String toString() {
		return "HabitacionEstandar [precioBase=" + precioBase + ", ocupada=" + ocupada + ", nombreCliente="
				+ nombreCliente + ", numDiasOcupado=" + numDiasOcupado + ", numOcupantes=" + numOcupantes + "]";
	}
	
	public double calcularPrecio () {
		
		return precioBase*numDiasOcupado;
	}
	

}
