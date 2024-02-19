package Ejercicio2;

import java.util.List;

public class CRUDSocio {
	
	private List <Socio> listado;

	public CRUDSocio(List<Socio> listado) {
		super();
		this.listado = listado;
	}

	public List<Socio> getListado() {
		return listado;
	}

	public void setListado(List<Socio> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CRUDSocio [listado=" + listado + "]";
	}
	
	public boolean agregar(Socio s) {
		
		return listado.add(s);
	}
	
	public Socio findByNumSocio(int numSocio) {
		int i=0;
		boolean encontrado=false;
		
		while(i < listado.size() && !encontrado) {
			Socio deLista=listado.get(i);
			if(deLista.getNumSocio()==numSocio) {
				encontrado=true;
			}else {
				i++;
			}
		}if(encontrado) {
			return listado.get(i);
		}else {
			return null;
		}
		
	}
	public void mostrarListado() {
		for(Socio s : listado) {
			System.out.println(s);
		}
	}
	public void borrar(int numSocio) {
		listado.remove(findByNumSocio(numSocio));
	}
	public void modificar(int numSocio, double cuota) {
		findByNumSocio(numSocio).setCuota(cuota);
	}

}
