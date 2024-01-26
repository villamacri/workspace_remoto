package Ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux, id;
		int tam=3;
		double descuento=10.00, precioServicio=50.00;
		HabitacionEstandar [] lista = new HabitacionEstandar [tam];
		
		HabitacionEstandar suite1= new Suite(200, true, "Pablo", "1S", 2, 2, 120.00, precioServicio);
		HabitacionEstandar suite2= new Suite(200, false, "Sergio", "2S", 0, 0, 120.00, precioServicio);
		HabitacionEstandar apartamento1= new Apartamento(100, true, "Luismi", "1A", 3, 4, true);
		
		lista[0]=suite1;
		lista[1]=suite2;
		lista[2]=apartamento1;
		
		GestionHabitaciones gh = new GestionHabitaciones(lista);
		
		System.out.println("Diga habitacion");
		id=sc.nextLine();
		
		System.out.println(gh.calcularPrecioHabitacion(precioServicio, descuento, gh.findById(id)));
		

	}

}
