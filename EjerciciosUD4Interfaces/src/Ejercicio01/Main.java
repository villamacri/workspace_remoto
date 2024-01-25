package Ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		
		
		String aux;
		int tam=10,numRevistas;
		
		Publicaciones l1= new Libro(2005,true,"36473");
		Publicaciones r1= new Revista(2012,false,"47853");
		
		Publicaciones [] lista= new Publicaciones[tam];
		
		lista[0]=l1;
		lista[1]=r1;
		
		
		Biblioteca b= new Biblioteca();
		
		
		System.out.println("Diga numero de revistas publicadas");
		aux=sc.nextLine();
		numRevistas=Integer.parseInt(aux);
		
		b.imprimirDatos(lista, numRevistas);
		
		
		
		
		
		System.out.println("hay " + r1.cuentaPrestados(lista));		
		
	}

}
