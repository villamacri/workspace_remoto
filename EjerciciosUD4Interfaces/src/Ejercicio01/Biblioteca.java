package Ejercicio01;


public class Biblioteca {

	
	public Biblioteca() {
		
	}
	
	
	public  void imprimirDatos(Publicaciones[]lista,int numRevistas) {
		
		for (int i = 0; i < lista.length; i++) {
			
			if(lista[i]!= null) {
				
				if(lista[i] instanceof Revista) {
					
					((Revista)lista[i]).avisoRevistas(numRevistas);
				}
			}
		}
	}
}
