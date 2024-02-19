package Ejercicio3;

import java.util.Objects;

public class Alumno {
	
	private String nombre, apellidos, curso;
	private int edad, codAlumno;
	
	public Alumno(String nombre, String apellidos, String curso, int edad, int codAlumno) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
		this.edad = edad;
		this.codAlumno = codAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(int codAlumno) {
		this.codAlumno = codAlumno;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", curso=" + curso + ", edad=" + edad
				+ ", codAlumno=" + codAlumno + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, codAlumno, curso, edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && codAlumno == other.codAlumno
				&& Objects.equals(curso, other.curso) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
	
	

}
