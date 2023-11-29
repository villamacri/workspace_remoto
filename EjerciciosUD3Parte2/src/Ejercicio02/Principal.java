package Ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int tam=100;
		Habitacion [] lista=new Habitacion[tam];
		int opcion = 0;
		double precioHab;
		String tipo;
		String aux;
		
		Hotel h=new Hotel(lista, 0);
		
		System.out.println("Bienvenido");
		
		do {
			System.out.println("¿Que desea hacer?");
			System.out.println("""
								0. Salir
								1. Agregar habitación
								2. Calcular precio final
								3. Mostrar factura
								""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
			case 0:
				System.out.println("Saliendo...");
				break;
				
			case 1:
				System.out.println("Diga tipo de habitación");
				tipo=sc.nextLine();
				
				System.out.println("Diga precio habitación");
				aux=sc.nextLine();
				precioHab=Double.parseDouble(aux);
				
				System.out.println("¿Tiene servicios contratados?");
				
			
			}
			
			
		}while(opcion!=0);

	}

}
