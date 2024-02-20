package Ejercicio4;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Agenda {
	
	private Map<Contacto, String> listaContactos;
	
	public Agenda(Map<Contacto, String> listaContactos) {
		super();
		this.listaContactos = listaContactos;
	}
	
	public Map<Contacto, String> getListaContactos() {
		return listaContactos;
	}


	public void setListaContactos(Map<Contacto, String> listaContactos) {
		this.listaContactos = listaContactos;
	}
	
	@Override
	public String toString() {
		return "Agenda [listaContactos=" + listaContactos + "]";
	}


	public void mostrarContactos() {
		Set<Entry<Contacto, String>> mostrar=listaContactos.entrySet();
		for (Entry<Contacto, String> entry : mostrar) {
			System.out.println(entry);
		}
	}
	
	public Entry<Contacto, String> findByNombre(String nombre) {
		
		Set<Entry<Contacto, String>> buscar=listaContactos.entrySet();
		
		for (Entry<Contacto, String> entry : buscar) {
			if(entry.getKey().getNombre().equalsIgnoreCase(nombre)) {
				return entry;
			}
		}
		return null;
		
	}
	
	public void agregarContacto(Contacto c, String numTelefono) {
		listaContactos.put(c, numTelefono);
	}
	
	public void borrarContacto(Entry<Contacto, String> menosUno) {
		listaContactos.entrySet().remove(menosUno);
	}
	
	public void modificarNombre(Entry<Contacto, String> nombreCambiao, String nombre) {
		nombreCambiao.getKey().setNombre(nombre);
	}

}
