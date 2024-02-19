package Ejercicio3;

import java.util.Iterator;
import java.util.Set;

public class crudAlumno {

	private Set <Alumno> listado;

	public crudAlumno(Set<Alumno> listado) {
		super();
		this.listado = listado;
	}

	public Set<Alumno> getListado() {
		return listado;
	}

	public void setListado(Set<Alumno> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "crudAlumno [listado=" + listado + "]";
	}
	
	//Busqueda por iterator+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Alumno findByCodAlumno(int codAlumno) {
		Alumno a=null;
		Iterator<Alumno> it=listado.iterator();
		boolean encontrado=false;
		
		while(it.hasNext() && !encontrado) {
			a=it.next();
			if(a.getCodAlumno()==codAlumno) {
				encontrado=true;
			}
		}if(encontrado) {
			return a;
		}else {
			return null;
		}
		
		//Busqueda por for each
	}public Alumno findById(int id) {
		
		if(listado.size() != 0) {
			for(Alumno a : listado) {
				if(a.getCodAlumno()==id) {
					return a;
				}
			}
		}
		return null;
	}
	
	public boolean agregar (Alumno a) {
		return listado.add(a);
	}
	
	public void verAlumnos() {
		
		for(Alumno a: listado) {
			System.out.println(a);
		}
	}
	
	public void mostrarAlumno(Alumno a) {
		System.out.println(a);
	}
	
}
