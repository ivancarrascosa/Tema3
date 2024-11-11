package boletin2;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creo el array que voy a imprimir al final
		int respuesta[] = new int[55];

		// Creo una variable para almacenar la posición por la que se empezará a
		// rellenar
		int posicionCompletar = 0;

		// Hago este for 10 veces, hasta el número 10 que es el último que tengo que
		// llenar
		for (int i = 1; i <= 10; i++) {
			// Termino de rellenar en posición completar + la iteración por la que vaya
			// porque i tengo que ponerlo i veces, al final del bucle le sumo el número de
			// la iteración para que en el siguiente bucle empiece el fill por esa posición
			Arrays.fill(respuesta, posicionCompletar, posicionCompletar + i, i);
			posicionCompletar += i;
		}
		System.out.println(Arrays.toString(respuesta));
	}

}
