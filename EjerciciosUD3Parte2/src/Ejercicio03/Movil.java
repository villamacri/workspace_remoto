package Ejercicio03;

/*Atributos
 * 
 * String marca
 * String Modelo
 * boolean vendido o no
 * boolean nuevo o segunda mano
 * double precioUnitario
 */
public class Movil {

	private String marca;
	private String modelo;
	private String codigo;
	private boolean vendido;
	private boolean nuevo;
	private double precioUnitario;
	
	public Movil(String marca, String modelo, String codigo, boolean vendido, boolean nuevo, double precioUnitario) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.codigo = codigo;
		this.vendido = false;
		this.nuevo = nuevo;
		this.precioUnitario = precioUnitario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public boolean isNuevo() {
		return nuevo;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", codigo=" + codigo + ", vendido=" + vendido + ", nuevo=" + nuevo
				+ ", precioUnitario=" + precioUnitario + "]";
	}
		
	
	
}
