package Ejercicio1;

import java.util.List;

public class crudNota {

	private List <Nota> lista;

	public crudNota(List<Nota> lista) {
		super();
		this.lista = lista;
	}

	public List<Nota> getLista() {
		return lista;
	}

	public void setLista(List<Nota> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "crudNota [lista=" + lista + "]";
	}
	
	public boolean agregar(Nota n) {
		return lista.add(n);
	}
	
	public Nota findById(int id) {
		int i=0;
		boolean encontrado=false;
		
		while(i<lista.size() && !encontrado) {
			Nota deLista=lista.get(i);
			if(deLista.getId()==id) 
				encontrado=true;
			else
				i++;
		}
		if(encontrado)
			return lista.get(i);
		else
			return null;
	}
	
	public void mostrarListado() {
		for(Nota n : lista) {
			System.out.println(n);
		}
	}
	
}
