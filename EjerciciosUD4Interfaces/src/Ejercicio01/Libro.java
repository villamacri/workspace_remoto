package Ejercicio01;


public class Libro extends Publicaciones {

	
	private String isbn;
	
	
	
	
	public Libro(int anyoPublicacion, boolean prestado, String isbn) {
		super(anyoPublicacion, prestado);
		this.isbn = isbn;
	}
	
	

	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	


	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + "]";
	}



	@Override
	public int cuentaPrestados(Publicaciones[] lista) {
		// TODO Auto-generated method stub
		int contadorPrestados=0;
		
		for (int i = 0; i < lista.length; i++) {
			
			if(lista[i]!= null) {
				
				if(lista[i].isPrestado()) {
					contadorPrestados++;
					
				}
			}
		}
		return contadorPrestados;
	}

	public int publicacionesAnterioresA (Publicaciones[] lista, int anyo) {
		// TODO Auto-generated method stub
		int contador=0;
		
		for (int i = 0; i < lista.length; i++) {
			
			if(lista[i].getAnyoPublicacion()<anyo) {
				contador++;
			}
		}
		return contador;
	}
	
}
