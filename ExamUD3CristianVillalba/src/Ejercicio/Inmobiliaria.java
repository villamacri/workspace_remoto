package Ejercicio;

public class Inmobiliaria {
	
	Piso [] listaPisos;
	private int numPisos;
	private int numVendedores;
	
	public Inmobiliaria(Piso[] listaPisos, int numPisos, int numVendedores) {
		
		this.listaPisos = listaPisos;
		this.numPisos = numPisos;
		this.numVendedores = numVendedores;
	}

	public Piso[] getListaPisos() {
		return listaPisos;
	}

	public void setListaPisos(Piso[] listaPisos) {
		this.listaPisos = listaPisos;
	}

	public int getNumVendedores() {
		return numVendedores;
	}

	public void setNumVendedores(int numVendedores) {
		this.numVendedores = numVendedores;
	}
	
	
	
	public int getNumPisos() {
		return numPisos;
	}

	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}

	public void agregar(Piso p) {
		for (int i = 0; i < numPisos; i++) {
			listaPisos[i]=p;
			numPisos++;
		}
	}
		
	public double calcularPrecioFinalVenta(double porcentaje) {
		double suma=0;
		double cien=100;
		for (int i = 0; i < numPisos; i++) {
			suma+=listaPisos[i].getPrecioVenta();
		}
		return suma+((suma*porcentaje)/cien);
	}
	
	public int mostrarPisosNuevos() {
		int count=0;
		for (int i = 0; i < numPisos; i++) {
			if(listaPisos[i].getEstado()==1) {
				count++;
			}
		}
		return count;
	}
	
	public void findById(String codigo) {
		int i = 0;
		boolean encontrado=false;
		
		while(i < numPisos && !encontrado) {
			
			
		}
		
		
	}
	public double sumaPisoNuevo() {
		double suma=0;
		
		for (int i = 0; i < numPisos; i++) {
			if(listaPisos[i].getEstado()==1) {
				suma+=listaPisos[i].getPrecioVenta();
			}
		}
		return suma;
	}
	
	public double sumaPisoSeminuevo() {
		double suma=0;
		
		for (int i = 0; i < numPisos; i++) {
			if(listaPisos[i].getEstado()==2) {
				suma+=listaPisos[i].getPrecioVenta();
			}
		}
		return suma;
	}
	
	public double sumaPisosReforma() {
		double suma=0;
		
		for (int i = 0; i < numPisos; i++) {
			if(listaPisos[i].getEstado()==3) {
				suma+=listaPisos[i].getPrecioVenta();
			}
		}
		return suma;
	}
	
	
	
		
	
}
