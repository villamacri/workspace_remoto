package debug;

/**
 * Ejercicio Practico 1 - Tipo C ¡OJO! Este código TIENE ERRORES que deben ser
 * subsanados a través de la depuración del código. Este programa realiza una
 * búsqueda de los divisores de un número entero, identificando solamente
 * aquellos que son números primos
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		

		int[] divisores = divisoresPrimos(234141411);

		for (int i = 0; i < divisores.length; i++) {
			System.out.printf("%d ", divisores[i]);
		}

	}

	/**
	 * Este método calcula cuáles son los divisores primos de otro número entero
	 * 
	 * @param num
	 * @return Array con los divisores enteros
	 */
	public static int[] divisoresPrimos(int num) {
		// Crear el array
		int tamInicial = 100;
		int[] divisores = new int[tamInicial];

		// Llenar el array con los divisores
		//int indice = 3;
		int indice = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				if (esPrimo(i)) {
					divisores[indice] = i;
					indice++;
					// Si se nos queda pequeño el array
					if (divisores.length == indice) {
						// Lo redimensionamos añadiendo tamInicial posiciones más
						divisores = pack(divisores, divisores.length + tamInicial);
					}
				}
			}
		}

		return pack(divisores, indice);
	}

	/**
	 * Método que verifica si un número es primo o no
	 * 
	 * @param num
	 * @return Verdadero si es primo, falso en otro caso
	 */
	public static boolean esPrimo(int num) {
		// Los números menores o iguales a 1 no son primos
		if (num <= 1) {
			return false;
		}

		// Verificar si hay algún divisor en el rango de 2 a la raíz cuadrada del número
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false; // El número no es primo
			}
		}

		return true; // Si no se encontraron divisores, el número es primo
	}

	/**
	 * Este método comprueba sin un array contiene un número
	 * 
	 * @param n   El número a buscar
	 * @param arr El array donde buscar
	 * @return true si lo encuentra, false en otro caso
	 */
	public static boolean contains(int n, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n)
				return true;
		}
		return false;
	}

	/**
	 * Reduce un array al número de elementos proporcionados
	 * 
	 * @param arr Array reducir. Debe ser de tamaño mayor o igual a n
	 * @param n   Tamaño del array resultante
	 * @return Array reducido
	 */
	public static int[] pack(int[] arr, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = arr[i];
		}
		return result;
	}

}