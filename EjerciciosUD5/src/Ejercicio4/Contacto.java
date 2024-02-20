package Ejercicio4;

import java.util.Objects;

public class Contacto {
	
	private String nombre;

	public Contacto(String nombre) {
		super();
		this.nombre = nombre;
	}





	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	

}
