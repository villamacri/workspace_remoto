package Ejercicio02;

public class Habitacion {
	
	//Atributos
	/*tipo
	 * precio
	 * servicios extras
	 * nombre cliente
	 * nºdias contratado
	 * limpia
	 * Nº habitación
	 */

	private String tipo;
	private double precio;
	private String nombreCliente;
	private int numDias;
	private boolean limpia;
	private boolean ocupada;
	private int numHabitacion;
	
	public Habitacion(String tipo, double precio, String nombreCliente, int numDias, boolean limpia,
			boolean ocupada, int numHabitacion) {
	
		this.tipo = tipo;
		this.precio = precio;
		this.nombreCliente = nombreCliente;
		this.numDias = numDias;
		this.limpia = limpia;
		this.ocupada = ocupada;
		this.numHabitacion = numHabitacion;
		
	
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}





	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumDias() {
		return numDias;
	}

	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	public boolean isLimpia() {
		return limpia;
	}

	public void setLimpia(boolean limpia) {
		this.limpia = limpia;
	}
	
	public boolean isOcupada() {
		return ocupada;
	}
	
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public int getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	@Override
	public String toString() {
		return "Habitación [tipo=" + tipo + ", precio=" + precio + ", nombreCliente="
				+ nombreCliente + ", numDias=" + numDias + ", limpia=" + limpia + ", ocupada=" + ocupada + ", numHabitacion=" + numHabitacion
				+ "]";
	}
	
	
	
}
