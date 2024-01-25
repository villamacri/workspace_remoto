package Ejercicio_4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int opcion = 0, tam = 3;
		String aux;
		Producto a1=new Alimentacion(2.00, "L1", "Leche", 0, 2);
		Producto a2=new Alimentacion(3.00, "H1", "Huevos", 0.2, 1);
		Producto e1=new Electronica(250.00, "O1", "Portátil Oficina", 0.4);
		
		/*La clase Línea de venta, con un producto y una cantidad como
		atributos y la clase Venta con un array de líneas de venta
		*/
		//No entiendo esta parte del enunciado
		
		System.out.println("Bienvenido");
		System.out.println();
		
		do {
			System.out.println("""
								Seleccione una opción
								0 para salir.
								1 para imprimir ticket.
								2 para listar productos.
								""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
			case 0:
				System.out.println("saliendo");
				break;
				
			case 1:
				
				break;
				
			case 2:
				
			
			}
		}while(opcion!=0);
		
		
	}

}
