package Ejercicio1;

public class Nota {

	private String cuerpo, titulo;
	private int id;
	
	public Nota(String cuerpo, String titulo, int id) {
		super();
		this.cuerpo = cuerpo;
		this.titulo = titulo;
		this.id = id;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Nota [cuerpo=" + cuerpo + ", titulo=" + titulo + ", id=" + id + "]";
	}
	
	
	
}
