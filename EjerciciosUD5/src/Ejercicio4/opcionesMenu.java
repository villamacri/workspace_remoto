package Ejercicio4;

public enum opcionesMenu {
	
	SALIR("Salir de la agenda"),
	AGREGAR_CONTACTO("Agregar contacto"),
	MOSTRAR_CONTACTO("Mostrar contactos"),
	BORRAR_CONTACTO("Borrar contactos"),
	MODIFICAR_CONTACTO("Modificar contactos");
	

	private String descripcion;
	
	private opcionesMenu(String descripcion) {
		this.descripcion=descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}



public static opcionesMenu getOpcion(int posicion) {
	return values()[posicion];
}

public static String getMenu() {
	StringBuilder sb=new StringBuilder();
	
	for (opcionesMenu opcion : opcionesMenu.values()) {
		sb.append(opcion.ordinal());
		sb.append(".- ");
		sb.append(opcion.getDescripcion());
		sb.append("\n");
	}
	return sb.toString();
	}
}
