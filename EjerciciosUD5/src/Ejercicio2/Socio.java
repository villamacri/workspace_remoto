package Ejercicio2;

public class Socio {
	
	private String nombre, apellidos;
	private double cuota;
	private int numSocio;
	
	public Socio(String nombre, String apellidos, double cuota, int numSocio) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cuota = cuota;
		this.numSocio = numSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public int getNumSocio() {
		return numSocio;
	}

	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellidos=" + apellidos + ", cuota=" + cuota + ", numSocio=" + numSocio
				+ "]";
	}
	
	
	
}
