package Ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//int a=8;
		//Producto p=new Producto(null, a, a, false); //No es buena idea crear un objeto vacío
		//Al instanciar un objeto le decimos al programa que guarde un cachito de memoria donde estara
		//la direccion de donde estan guardados los datos del objeto
		
		//Producto p3;
		//p3=new Producto (null, a, a, false);//Cada vez que hay un new hay una instancia nueva,
		//deberian llamarse distintos p1, p2, p3, etc...
		//Secciones 3 distintas
		//
		
		double precioFabrica = 0;
		int opcion=0, seccion = 0, opcionEnVenta = 0, tam = 0, tam2 = 10;
		boolean enVenta = false;
		String aux, nombre = null;
		Producto p;
		Producto p1=new Producto("Pantalla",250 , 3, true);
		Producto p2=new Producto("Pantalón", 30, 2, true);
		Producto [] lista= new Producto[tam2];
		Tienda t=new Tienda(lista, tam, 3);
		
		t.agregar(p1);
		t.agregar(p2);
		
		
		
		//System.out.println(precioFabrica);
		//Arriba se trabaja con una variable de la clase main  y abajo von el atributo del objeto
		//System.out.println(p.getPrecioFabrica());
		
		//p.setPrecioFabrica(precioFabrica);
		//System.out.println(p);
		
		do {
			System.out.println("""
								Diga que desea hacer
								
								0. Salir
								1. Agregar producto
								2. Mostrar lista
								3. Mostrar cualquier lista
								""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
			case 0:
				System.out.println("Saliendo...");
				break;
				
			case 1:
				System.out.println("Diga nombre del producto");
				nombre=sc.nextLine();
				
				System.out.println("Diga precio fabrica del producto");
				aux=sc.nextLine();
				precioFabrica=Double.parseDouble(aux);
				
				System.out.println("""
									Indique seccion
									1. Alimentación
									2. Ropa
									3. Electrónica
									""");
				aux=sc.nextLine();
				seccion=Integer.parseInt(aux);
				
				System.out.println("Diga si está en venta: 1 en venta, 2 no esta en venta");
				aux=sc.nextLine();
				opcionEnVenta=Integer.parseInt(aux);
				
				while(opcionEnVenta!=1&&opcionEnVenta!=2) {
				
				if(opcionEnVenta==1) {
					enVenta=true;
				}else {
					enVenta=false;
				}
			
				}
				
				p=new Producto(nombre, precioFabrica, seccion, enVenta);
				t.agregar(p);
				break;
				
			case 2:
				t.mostrarProductos();
				break;
				
			case 3:
				System.out.println("Diga sección a ver");
				aux=sc.nextLine();
				seccion=Integer.parseInt(aux);
				
				t.mostrarListaV2(t.buscarBySeccion(seccion));
			}	
			
		}while(opcion!=0);
	}

}
