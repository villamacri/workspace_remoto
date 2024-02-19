package Ejercicio4;

import java.util.Map;

public class Agenda {
	
	private Map<String,Contacto> listaContactos;
	
	public Agenda(Map<String, Contacto> listaContactos) {
		super();
		this.listaContactos = listaContactos;
	}
	
	public Map<String, Contacto> getListaContactos() {
		return listaContactos;
	}


	public void setListaContactos(Map<String, Contacto> listaContactos) {
		this.listaContactos = listaContactos;
	}
	
	@Override
	public String toString() {
		return "Agenda [listaContactos=" + listaContactos + "]";
	}


	public void mostrarContactos(Contacto c) {
		System.out.println(listaContactos);
	}
	
	public Contacto findByTelefnono (String telefono) {
		
		boolean encontrado=false;
		int i=0;
		Contacto deLista = null;
		
		while(i<listaContactos.size() && !encontrado) {
			if(listaContactos.get(telefono).getTfno().equalsIgnoreCase(telefono)) {
				deLista = listaContactos.get(telefono);
				encontrado=true;
			}else {
				i++;
			}
		}
		
		if (encontrado) {
			return deLista;
		}else {
			return null;
		}
		
		
	}

}
