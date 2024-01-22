package polimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=4;
		OperacionesFiguras op=new OperacionesFiguras();
		Cuadrado c= new Cuadrado("Cuadrado 1", "Negro", 2);
		Figura f1=new Cuadrado ("Figura 1 como cuadrado", "Rojo", 4);
		Figura f2=new Circulo ("Figura 2 como circulo", "Blanco", 3);
		Circulo circ=new Circulo("circulo", "rojo", 3);
		
		//listado figuras
		Figura [] lista=new Figura [tam];
		
		//Hacemos esto solo de ejemplo
		
		lista[0]=c;
		lista[1]=circ;
		lista[2]=f1;
		lista[3]=f2;
		
		System.out.printf("\n El área es %.2f", op.calcularAreaUnaFigura(c));
		System.out.printf("\n EL área es %.2f", op.calcularAreaUnaFigura(f1));
		System.out.printf("\n El area es %.2f", op.calcularAreaUnaFigura(f2));	
		
		System.out.println(op.sumarAreas(lista));

	
		//metodos no reescritos
		
		//c.mostrarLados();
		//circ.mostrarRadianes();
		
		
		
	}

}
