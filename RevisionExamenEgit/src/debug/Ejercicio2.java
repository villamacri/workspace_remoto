package debug;

/**
 * Ejercicio Practico 2 - Tipo C
 * Este programa es capaz, para dos arrays de números enteros,
 * obtener un nuevo array con aquellos que están presentes 
 * en ambos arrays. Si un elemento está repetido, solamente
 * aparecerá una vez
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        int[] unArray = new int[] {1,2,3,4,5,6,7,8,9,10};
        int[] otroArray = new int[] {1,1,2,3,5,8,13,21,34,55,89,144};

        int[] resultado = union(unArray, otroArray);

        for (int i = 0; i < resultado.length; i++) {
            System.out.printf("%d ", resultado[i]);
        }

    }
    
    
    public static int[] union(int[] array1, int[] array2) {
    	// El array resultante será, como mucho
    	// del tamaño de la suma del tamaño de ambos arrays
    	int tamMax = array1.length + array2.length;
    	
    	int[] resultado = new int[tamMax];
    	int pos = 0;
    	
    	for(int i = 0; i < array1.length; i++) {
    		if (!contains(array1[i], resultado)) {
    			resultado[pos] = array1[i];
    			pos++;
    		}
    	}
    	
    	for(int i = 0; i < array2.length; i++) {
    		if (!contains(array2[i], resultado)) {
    			resultado[pos] = array2[i];
    			pos++;
    		}
    	}
    	
    	return pack(resultado, pos);
    	
    }


    /**
     * Este método recibe dos arrays como argumento (que pueden ser
     * de tamaños diferentes) y devuelve como resultado un array
     * con los elementos que están presentes en ambos arrays.
     * Si un número aparece en un array, y en el otro aparece repetido
     * más de una vez, aparecerá repetido en el array resultante
     * @param array1
     * @param array2
     * @return
     */
    public static int[] comunes(int[] array1, int[] array2) {
        // El array resultante será, como muy grande
        // del tamaño del array más pequeño.
        int longitudMinima = array1.length;
        if (array2.length < longitudMinima) {
            longitudMinima = array2.length;
        }

        int[] elementosComunes = new int[longitudMinima];
        int pos = 0;

        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                	if (!contains(array1[i],elementosComunes)) { 
                		elementosComunes[pos] = array1[i];
                    	pos++;
                	}	
                }
            }
        }

        //Ajustamos el array al tamaño final
        return pack(elementosComunes, pos);


    }
    
    /**
	 * Reduce un array al número de elementos proporcionados
	 * @param arr Array reducir. Debe ser de tamaño mayor o igual a n
	 * @param n Tamaño del array resultante
	 * @return Array reducido
	 */
	public static int[] pack(int[] arr, int n) {
		int[] result = new int[n];
		for(int i = 0; i < n; i++) {
			result[i] = arr[i];
		}
		return result;
	}
	
	
	/**
	 * Este método comprueba sin un array contiene un número
	 * @param n El número a buscar
	 * @param arr El array donde buscar
	 * @return true si lo encuentra, false en otro caso
	 */
	public static boolean contains(int n, int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == n)
				return true;
		}
		return false;
	}


}