package EjemploInterfazList;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Persona> lista=new ArrayList <>();
		
		Persona p=new Persona("Angel",36,"123456789A");
		lista.add(p);
		lista.add(p);
		//lista.add(new Persona("Ángel", 36, "123456789A"));
		//lista.add(new Persona("Luismi", 40, "123456789B"));
		//System.out.println(lista);
		//System.out.println(lista.get(0));
		
		CRUD_Persona c=new CRUD_Persona(lista);
		
		c.mostrarListado();
		
		//System.out.println(c.findByDni("123456789A"));
		
		c.borrar("123456789B");
		
		System.out.println();
		
		c.mostrarListado();
		
	}

}
