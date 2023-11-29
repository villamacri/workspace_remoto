package Ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int tam=100;
		Habitacion [] lista=new Habitacion[tam];
		int opcion = 0, opcionLimpia, opcionOcupado, numHabitacion = 0, numDias;
		double precioHab, precioMinibar, precioComida, servExtras = 0;
		String tipo, nombreCliente;
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
				
				System.out.println("Diga precio minibar");
				aux=sc.nextLine();
				precioMinibar=Double.parseDouble(aux);
				
				System.out.println("Diga precio del servicio de comida");
				aux=sc.nextLine();
				precioComida=Double.parseDouble(aux);
				
				System.out.println("Diga el nombre del cliente");
				nombreCliente=sc.nextLine();
				
				System.out.println("Diga el número de días");
				aux=sc.nextLine();
				numDias=Integer.parseInt(aux);
				
				System.out.println("""
									¿Está limpia la habitación?
									
									Opción 1: Sí
									Opcion 2: No
									""");
				aux=sc.nextLine();
				opcionLimpia=Integer.parseInt(aux);
				
				System.out.println("""
									¿Esta ocupada la habitación?
									
									opcion 1: Sí
									opcion 2: No
									""");
				aux=sc.nextLine();
				opcionOcupado=Integer.parseInt(aux);
				
				System.out.println("Diga el número de la habitación");
				aux=sc.nextLine();
				numHabitacion=Integer.parseInt(aux);
				
				h.agregar(new Habitacion(tipo, precioHab, nombreCliente, numDias, h.comprobarLimpia(opcionLimpia), h.comprobarOcupado(opcionOcupado), numHabitacion));;
				break;
				
			case 2:
				h.calcularPrecioFinalUnidad(servExtras, numHabitacion);//revisar servExtras
				break;
				
			case 3:
				h.mostrarFactura(numHabitacion);
				break;
			}
			
			
		}while(opcion!=0);
		
		System.out.println("Adiós");

	}

}
