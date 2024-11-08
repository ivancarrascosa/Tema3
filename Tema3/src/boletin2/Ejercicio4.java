package boletin2;

import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creo un escáner
		Scanner reader = new Scanner(System.in);

		// Creo un array de enteros de longitud 8 y un array para devolver las
		// puntuaciones finales ordenadas de mayor a menor
		int puntuaciones[] = new int[8];
		int puntuacionesOrdenadas[] = new int[8];

		// Pido al usuario las puntuaciones 8 veces y la ordeno
		for (int i = 0; i < 8; i++) {
			System.out.println("Introduzca la puntuación del jugador:");
			puntuaciones[i] = reader.nextInt();
		}
		Arrays.sort(puntuaciones);
		// Recorro el array de puntuaciones y voy añadiendo desde atrás hacia delante en
		// las ordenadas para que vaya de mayor a menor
		for (int i = 0, j = 7; i<8 ; i++ , j--) {
			puntuacionesOrdenadas[j] = puntuaciones [i];
		}
		System.out.println(Arrays.toString(puntuacionesOrdenadas));
		// Cerramos el escáner
		reader.close();
	}

}
