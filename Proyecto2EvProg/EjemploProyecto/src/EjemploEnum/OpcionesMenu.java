package EjemploEnum;



public enum OpcionesMenu implements DarDescripcion{
	
	SALIR("Salir de la agenda"),
	AGREGAR_CONTACTO("Agregar contacto"),
	MOSTRAR_CONTACTO("Mostrar contactos"),
	BORRAR_CONTACTO("Borrar contactos"),
	MODIFICAR_CONTACTO("Modificar contactos");
	

	private String descripcion;
	
	private OpcionesMenu(String descripcion) {
		this.descripcion=descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}



public static OpcionesMenu getOpcion(int posicion) {
	return values()[posicion];
}

public static String getMenu() {
	StringBuilder sb=new StringBuilder();
	
	for (OpcionesMenu opcion : OpcionesMenu.values()) {
		sb.append(opcion.ordinal());
		sb.append(".- ");
		sb.append(opcion.getDescripcion());
		sb.append("\n");
	}
	return sb.toString();
	}
}
