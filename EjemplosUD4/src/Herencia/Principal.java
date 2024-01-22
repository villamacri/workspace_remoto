package Herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trabajador t=new Trabajador("Cristian", "Programador Junior", "1A");
		Empleado e=new Empleado("Pablo", "Jefe", "2B", 2000.0, 15.0);
		Empleado e2=new Empleado ("3C", 1500.0, 12.5);
		Consultor c=new Consultor ("Adrián", "Experto", "4D", 20, 18);
		
		System.out.println(t.calcularPaga());
		
		System.out.println(e.calcularPaga());
		
		System.out.println(e2.calcularPaga());
		
		System.out.println(c.calcularPaga());
		
	}

}
