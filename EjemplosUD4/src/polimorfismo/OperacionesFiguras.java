package polimorfismo;

public class OperacionesFiguras {
	
	public double calcularAreaUnaFigura (Figura f) {
		return f.calcularArea();
	}
	
	public double sumarAreas (Figura[]listado) {
		double resultado=0;
		
		for (int i = 0; i < listado.length; i++) {
			resultado=resultado+calcularAreaUnaFigura(listado[i]);
		}
		return resultado;
	}
	
	public double sumarAreasConAviso(Figura[]listado) {
		double resultado=0;
		for (int i = 0; i < listado.length; i++) {
			resultado+=calcularAreaUnaFigura (listado[i]);
			if(listado[i]instanceof Circulo) {
				((Circulo)listado[i]).mostrarRadianes();
			}
		}
		return resultado;
	}

}
