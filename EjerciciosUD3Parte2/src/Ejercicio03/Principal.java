package Ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int tam=30, opcionVendido = 0, opcionNuevo=0, opcion = 0;
		String marca, modelo, codigo, aux;
		double precioUnitario = 0, dinBolsillo=0, descuento= 0;
		
		Movil [] lista=new Movil[tam];
		Vendedor v=new Vendedor(lista, 0);
		
	
		System.out.println("Bienvenido");
		
		do {
	
			System.out.println("Diga que desea hacer");
			System.out.println("""
								1 Agregar nuevo movil
								2 Comprobar sin vender
								3 Cambiar móvil
								4 Ver dinero en bolsillo
								""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
		switch(opcion) {
		
		case 1:
			System.out.println("Diga marca del movil");
			marca=sc.nextLine();
			
			System.out.println("Diga modelo");
			modelo=sc.nextLine();
			
			System.out.println("Diga codigo del movil");
			codigo=sc.nextLine();
		
			do {
			System.out.println("""
								¿Esta ya vendido?
								opcion 1 = Si
								opcion 2 = No
								""");
			aux=sc.nextLine();
			opcionVendido=Integer.parseInt(aux);
			}while(opcionVendido!=1 && opcionVendido!=2);

			do {
			System.out.println("""
								¿Esta nuevo?
								
								opcion 1: Sí
								opcion 2: No
								""");
			aux=sc.nextLine();
			opcionNuevo=Integer.parseInt(aux);
			}while(opcionNuevo!=1 && opcionNuevo!=2);
			
			System.out.println("¿Cual es su precio?");
			aux=sc.nextLine();
			precioUnitario=Double.parseDouble(aux);
			
			v.agregar(new Movil(marca, modelo, codigo, v.comprobarVendido(opcionVendido), v.comprobarNuevo(opcionNuevo), precioUnitario));
			break;
			
		case 2:
			System.out.println(v.comprobarMovilesSinVender());
			break;
			
		case 3:
			System.out.println("Diga codigo del movil a cambiar");
			codigo=sc.nextLine();
			v.findById(codigo).setVendido(false);
			
			
			v.listarMovilesNV();
			
			System.out.println("Diga codigo del movil que desea");
			codigo=sc.nextLine();
			v.findById(codigo).setVendido(true);
			break;
			
		case 4:
			System.out.println("Diga porcentaje de descuento");
			aux=sc.nextLine();
			descuento=Double.parseDouble(aux);
			
			dinBolsillo=v.calcularSumaPrecioUNuevo()+v.calcularSumaPrecioUSegunda(descuento);
			System.out.println(dinBolsillo);
			
			}
		
		}while(opcion!=0);
		
	}
	
}
	
