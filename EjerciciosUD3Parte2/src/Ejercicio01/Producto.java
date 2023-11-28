package Ejercicio01;

public class Producto {
	
	private double precioFabric;
	private String codigo;
	private String nombreProducto;
	private boolean activo;
	private boolean fragil;
	
	public Producto(double precioFabric, String codigo, String nombreProducto, boolean activo, boolean fragil) {
		
		this.precioFabric = precioFabric;
		this.codigo = codigo;
		this.nombreProducto = nombreProducto;
		this.activo = activo;
		this.fragil = fragil;
	}

	public double getPrecioFabric() {
		return precioFabric;
	}

	public void setPrecioFabric(double precioFabric) {
		this.precioFabric = precioFabric;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	@Override
	public String toString() {
		return "Producto [precioFabric=" + precioFabric + ", codigo=" + codigo + ", nombreProducto=" + nombreProducto
				+ ", activo=" + activo + ", fragil=" + fragil + "]";
	}
	
	public double calcularPrecioCoste(double precioTrans) {
		double precioCoste;
		int cien=100;
		precioCoste=precioFabric+((precioTrans/cien)*precioFabric);
		return precioCoste;
	}
	
	

}
