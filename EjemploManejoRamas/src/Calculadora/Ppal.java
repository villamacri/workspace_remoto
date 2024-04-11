package Calculadora;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int num1, num2, opcion = 0, result;
		String aux;
		
		System.out.println("Calculadora");
		
		do {
			System.out.println("""
								Diga que desea hacer
								
								0. Salir
								1. Sumar
								2. Restar
								3. Multiplicar
								4. Dividir
								""");
			switch(opcion) {
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					System.out.println("Diga primer valor");
					aux=sc.nextLine();
					num1=Integer.parseInt(aux);
					
					System.out.println("Diga segundo valor");
					aux=sc.nextLine();
					num2=Integer.parseInt(aux);
					
					result=num1+num2;
					
					System.out.println("El resultado es "+result);
			
			}
			
			
		}while(opcion!=0);

	}

}
