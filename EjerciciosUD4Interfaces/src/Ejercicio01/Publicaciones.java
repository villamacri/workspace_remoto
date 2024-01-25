package Ejercicio01;

public abstract class Publicaciones implements IPublicaciones {

	private int anyoPublicacion;
	private boolean prestado;
	
	public Publicaciones(int anyoPublicacion, boolean prestado) {
		super();
		this.anyoPublicacion = anyoPublicacion;
		this.prestado = prestado;
	}

	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}

	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "Publicaciones [anyoPublicacion=" + anyoPublicacion + ", prestado=" + prestado + "]";
	}

	@Override
	public abstract int cuentaPrestados(Publicaciones[] lista) ;//contarPrestados
		// TODO Auto-generated method stub
		
	

	@Override
	public abstract int publicacionesAnterioresA(Publicaciones[] lista, int anyo) ;
		// TODO Auto-generated method stub
	

	
	
}
