package Ejercicio01;

public class Revista extends Publicaciones {

	private  String isbn;
	
	
	
	public Revista(int anyoPublicacion, boolean prestado, String isbn) {
		super(anyoPublicacion, prestado);
		this.isbn = isbn;
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
	
	
	
	public void avisoRevistas(int numRevistas) {
		
		int edicion = 0; //esto como atributo aribaa
		if(edicion==numRevistas) {
			
			System.out.println("enhorabuena");
		}
			
		
	}
}
