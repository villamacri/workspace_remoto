package Ejercicio_4;

public abstract class Producto {

	private double precioUnitario;
	private String codigo, nombre;
	
	public Producto(double precioUnitario, String codigo, String nombre) {
		super();
		this.precioUnitario = precioUnitario;
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Producto [precioUnitario=" + precioUnitario + ", codigo=" + codigo + "]";
	}
	
	
	
}
