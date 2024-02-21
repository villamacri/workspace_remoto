package EjemploEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int opcion=0;
		String aux, nombre, nombreNuevo, tfno;
		
		Map<Contacto, String> listado = new HashMap<Contacto, String>();
		listado.put(new Contacto("Sergio el polilla"), "666666666");
		listado.put(new Contacto("Adri pichichi"), "622222222");
		
		Agenda a=new Agenda(listado);
		
		/*
		 opcionesMenu [] om = opcionesMenu.values();
			for (int i = 0; i < om.length; i++) {
				System.out.println(om[i]);
			}
		*/
		//Ejemplo con el atributo descripcion
		/*
		opcionesMenu om = opcionesMenu.AGREGAR_CONTACTO;
		System.out.println(om.getDescripcion());
		*/
		
		
		do {
			System.out.println(OpcionesMenu.getMenu());
			System.out.println("Elije una opción:");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			OpcionesMenu opcionMenu= OpcionesMenu.getOpcion(opcion);
			
			switch(opcionMenu) {
			case SALIR:
				System.out.println("saliendo");
				break;
			case AGREGAR_CONTACTO:
				System.out.println("Diga nombre");
				nombre=sc.nextLine();
				
				System.out.println("Diga número de teléfono");
				tfno=sc.nextLine();
				
				a.agregarContacto(new Contacto(nombre), tfno);
				break;
				
			case MOSTRAR_CONTACTO:
				a.mostrarContactos();
				break;
				
			case BORRAR_CONTACTO:
				System.out.println("Diga contacto a borrar");
				nombre=sc.nextLine();
				
				a.borrarContacto(a.findByNombre(nombre));
				break;
				
			case MODIFICAR_CONTACTO:
				System.out.println("Diga contacto");
				nombre=sc.nextLine();
				
				System.out.println("Diga nuevo nombre");
				nombreNuevo=sc.nextLine();
				
				a.modificarNombre(a.findByNombre(nombre), nombreNuevo);
				break;
			}
			
		}while(opcion!=0);
		
		System.out.println("Adiós");
	}

}
