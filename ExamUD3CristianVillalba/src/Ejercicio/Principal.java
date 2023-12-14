package Ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int tam=100, superficie, estado = 0, opcion=0, numPisos = 0, numVendedores=0;
		double precioVenta = 0, porcentaje=0, dinARepartir=0;
		String aux, direccion, codigo;
		Piso [] lista=new Piso[tam];

		Inmobiliaria i = new Inmobiliaria(lista, numVendedores, numPisos);
		
		
		System.out.println("Bienvenido");
		
		do {
			System.out.println("""
								¿Que desea hacer?
								
								0. Salir
								1. Agregar piso
								2.Calcular precio de venta final
								3.Mostrar pisos nuevos
								4.Modificar precio
								5.Calcular el precio del metro2 de un piso
								6.Calcular cuanto ganaría la inmobiliaria con los pisos seminuevos
								7.Calcular cuanto ganaría cada vendedor si se repartiera a partes iguales
								""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			case 0:
				System.out.println("Saliendo...");
				break;
				
			case 1:
				System.out.println("Diga dirección del piso");
				direccion=sc.nextLine();
				
				System.out.println("Diga el código");
				codigo=sc.nextLine();
				
				System.out.println("Diga superficie");
				aux=sc.nextLine();
				superficie=Integer.parseInt(aux);
				
				do {
				System.out.println("""
									Diga estado del piso
									
									opción 1: Nuevo
									opción 2: Seminuevo
									opción 3: Para reformar
									""");
				aux=sc.nextLine();
				estado=Integer.parseInt(aux);
				}while(estado!=1 && estado!=2 && estado!=3);
				System.out.println("Diga precio de venta");
				aux=sc.nextLine();
				precioVenta=Double.parseDouble(aux);
				
				i.agregar(new Piso(direccion, codigo, superficie, estado, precioVenta));
				break;
				
			case 2:
				System.out.println("Diga porcentaje de ganancia");
				aux=sc.nextLine();
				porcentaje=Double.parseDouble(aux);
				
				System.out.println(i.calcularPrecioFinalVenta(porcentaje)); 
				break;
				
			case 3:
				System.out.println(i.mostrarPisosNuevos());
				break;
				
			case 4:
				
				break;
				
			case 5:
					
				break;
				
			case 6:
				System.out.println(i.sumaPisoSeminuevo()); 
				break;
				
			case 7:
				System.out.println("Diga el número de vendedores que hay en la inmobiliaria");
				aux=sc.nextLine();
				numVendedores=Integer.parseInt(aux);
				
				dinARepartir=(i.sumaPisoNuevo()+i.sumaPisoSeminuevo()+i.sumaPisosReforma())/numVendedores;
				
				System.out.println("La parte que corresponde a cada vendedor es: "+dinARepartir);
				break;
				
				default:
					System.out.println("Opción no válida");
					break;
			}
		}while(opcion!=0);
	}

}
