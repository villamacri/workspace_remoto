package EjemploInterfazList;

import java.util.List;

public class CRUD_Persona {

	private List <Persona> lista;

	public CRUD_Persona(List<Persona> lista) {
		super();
		this.lista = lista;
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}
	
	public boolean agregar(Persona p) {//Nunca se pasan los atributos sueltos en los parámetros ni se imprime con syso
		
		return lista.add(p);
	}
	
	public Persona findByDni(String dni) {
		
		int i=0;
		boolean encontrado=false;
		
		while(i<lista.size() && !encontrado) {
			Persona deLista= lista.get(i);
			if(deLista.getDni().equalsIgnoreCase(dni))
				encontrado=true;
			else
				i++;
		}
		if(encontrado)
			return lista.get(i);//Devolvemos el producto buscado
		else
			return null;
	}
	
	public void mostrarListado() {
		for(Persona p : lista) {
			System.out.println(p);
		}
	}
	
	public void borrar(String dni) {
		lista.remove(findByDni(dni));
	}
	
	
}
