package boletin4;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		int tabla[] = { 10, 1, 5, 8, 9, 2 };
		System.out.println(Arrays.toString(suma(tabla, 3)));

	}

	public static int[] suma(int i[], int numElementos) {
		// Creo la tabla para almacenar los resultados
		int res[] = new int[(i.length) - (numElementos - 1)];

		// Creo una variable para almacenar la suma que voy a ir introduciendo en cada
		// iteración
		int suma = 0;
		// Comienzo con una variable que me recorra la tabla hasta el último número que
		// con la longitud de los elementos vaya a llegar la suma hasta el final de la
		// tabla
		for (int j = 0; j < (i.length - numElementos + 1); j++) {
			// Por cada una en la que inicio, voy recorriendo cada elemento hasta hacerlo
			// numElementos veces (k=j al inicio) y voy añadiendolo a la suma
			for (int k = j; k < j + numElementos; k++) {
				suma += i[k];
			}
			res[j] = suma;
			// Reinincio la suma despues de introducir el valor en la tabla de respuesta
			suma = 0;
		}
		return res;
	}
}
