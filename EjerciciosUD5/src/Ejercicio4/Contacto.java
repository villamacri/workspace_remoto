package Ejercicio4;

import java.util.Objects;

public class Contacto {
	
	private String tfno, nombre;

	public Contacto(String tfno, String nombre) {
		super();
		this.tfno = tfno;
		this.nombre = nombre;
	}

	public String getTfno() {
		return tfno;
	}

	public void setTfno(String tfno) {
		this.tfno = tfno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Contacto [tfno=" + tfno + ", nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, tfno);
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
		return Objects.equals(nombre, other.nombre) && Objects.equals(tfno, other.tfno);
	}
	
	

}
