package Calculadora;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int num1, num2, opcion = 0;
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
				
			
			}
			
			
		}while(opcion!=0);

	}

}
