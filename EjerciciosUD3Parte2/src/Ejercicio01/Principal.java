package Ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner  sc=new Scanner(System.in);
		
		int tam=100;
		Producto [] lista= new Producto[tam];
		int opcion = 0;
		int opcionFragil = 0;
		double precioFabric = 0;
		double pvp = 0;
		double precioTrans = 0;
		String codigo;
		String nombreProducto;
		String aux;
		
		Tienda t=new Tienda(lista, 0);
		
		System.out.println("************************************");
		System.out.println();
		System.out.println("Bienvenido a la tienda de la esquina");
		System.out.println();
		System.out.println("************************************");
		
		do {
			System.out.println();
			System.out.println("""
								¿Que desea hacer?
								
								1. Para mostrar lista
								2. Para añadir un producto
								3. Para calcular inversión
								4. Para calcular PVP
								5. Para calcular ganancias
								""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
			case 1:
				t.listarProductos();
				break;
				
			case 2:
				
				System.out.println("Diga precio fabrica");
				aux=sc.nextLine();
				precioFabric=Integer.parseInt(aux);
				
				System.out.println("Diga codigo del producto");
				codigo=sc.nextLine();
				
				System.out.println("Diga nombre del producto");
				nombreProducto=sc.nextLine();
				
				System.out.println("¿El producto es frágil?");
				do {
					System.out.println("""
										opcion 1: Si
										opcion 2: No
										""");
					aux=sc.nextLine();
					opcionFragil=Integer.parseInt(aux);
					
					
				}while(opcionFragil!=1 && opcionFragil!=2);
				
				t.agregar(new Producto(precioFabric, codigo, nombreProducto, t.comprobarFragil(opcionFragil)));
				break;
			
			case 3:
				System.out.println(t.calcularInversion());
				break;
				
			case 4:
				System.out.println(t.calcularTotalPVP(pvp, precioFabric));
				break;
				
			case 5:
				System.out.println(t.calcularGanancias(pvp, precioTrans));
				
			}
			
		
			
			
		}while(opcion!=0);
		
		
		
	}

}
