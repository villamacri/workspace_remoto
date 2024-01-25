package Ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion = 0;
		
		CuentaCorriente 	cc=new CuentaCorriente(2000, 0, 15.00);
		CuentaJoven 		cj=new CuentaJoven(1500);
		CuentaEmpresa 		ce=new CuentaEmpresa(3000, 1);
		
		System.out.println("Bienvenido");
		
		
		do {
			
			System.out.println("""				
								Diga que quiere hacer
								0. Para salir
								1. Para seleccionar tipo de cuenta
								2. Para mostrar beneficios y pérdidas del banco
								""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
			case 0:
				System.out.println("Saliendo...");
				break;
				
			case 1:
				do {
				System.out.println("""
									Diga tipo cuenta
									0. para salir
									1. para cuenta corriente
									2. para cuenta joven
									3. para cuenta empresa
									""");
				aux=sc.nextLine();
				opcion=Integer.parseInt(aux);
				
				switch(opcion) {
				
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					
				
					}
					
				}while(opcion!=0);
			
			
			}
			
		}while(opcion!=0);

	}

}
