package Ejercicio;

public class Piso {

	private String direccion;
	private String codigo;
	private int superficie;
	private int estado;
	private double precioVenta;
	
	public Piso(String direccion, String codigo, int superficie, int estado, double precioVenta) {
		
		this.codigo = codigo;
		this.direccion = direccion;
		this.superficie = superficie;
		this.estado = estado;
		this.precioVenta = precioVenta;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	@Override
	public String toString() {
		return "Piso [direccion=" + direccion + ", codigo=" + codigo + ", superficie=" + superficie + ", estado="
				+ estado + ", precioVenta=" + precioVenta + "]";
	}
	
	

}
	
	
	

