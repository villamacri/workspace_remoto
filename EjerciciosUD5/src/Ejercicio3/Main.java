package Ejercicio3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		
		int codAlumno = 0, opcion=0;
		String aux;
		
		Set<Alumno> listado=new HashSet<Alumno>();
		
		Alumno a1=new Alumno("Sergio", "González", "1ºDAM", 19, 1);
		Alumno a2=new Alumno("Pedro", "Alcantarilla", "1ºDAM", 19, 1);
		Alumno a3=new Alumno("Pablo", "Urtiaga", "1ºDAM", 19, 1);
		
		crudAlumno ca=new crudAlumno(listado);
		
		
		ca.mostrarAlumno(ca.findByCodAlumno(codAlumno));
		
		do {
			System.out.println("""
								
								""");
			
			
		}while(opcion!=0);
		
		
	}

}
