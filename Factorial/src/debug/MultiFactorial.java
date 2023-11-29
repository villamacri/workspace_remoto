package debug;

import java.util.Random;

public class MultiFactorial {
	
	private double[] elementos;
	
	public MultiFactorial(double[] elem) {
		this.elementos = elem;
	}
	
	public MultiFactorial(int n) {
		this.elementos = new double[n];
		Random r = new Random();
		for(int i = 0; i < n; i++) {
			this.elementos[i] = r.nextInt(100)+1;
		}
	}
	
	public static double factorial(double n) {
		double resultado = 1;
		for(int i = (int) n; i >= 1; i--) {
			resultado = resultado * i;
		}
		return resultado;
	}
	
	public void imprimeFactorial() {
		for(int i = 0; i < this.elementos.length+1; i++) {
			System.out
			  .println("Factorial de %.0f: %.0f"
					  .formatted(this.elementos[i]-1,
							  factorial(this.elementos[i])));
		}
	}
	
	public double[] calculaFactorial() {
		double[] result = new double[this.elementos.length];
		for(int i = 0; i < this.elementos.length; i++) {
			result[i] = factorial(this.elementos[i]);
		}
		return result;
	}
	
	

}
