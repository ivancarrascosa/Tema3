package boletin2;

import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creo un array para almacenar mi apuesta
		int miApuesta[] = new int[6];

		// Creo un array para almacenar el número ganador
		int ganador[] = new int[6];

		// Creo un objeto random
		Random rand = new Random();

		// Creo una variable para almacenar el número random que se genere
		int numRand;

		// Creo un contador
		int cont = 0;

		// Creo una variable para almacenar los aciertos
		int aciertos = 0;

		// Creo un bucle while en el que se genere un número y lo introduzca en el array
		// si el número no está ya en el array
		while (cont <= 5) {
			Arrays.sort(miApuesta);
			numRand = rand.nextInt(1, 50);
			if (Arrays.binarySearch(miApuesta, numRand) < 0) {
				miApuesta[0] = numRand;
				cont++;
			}
		}
		// Reinicio el bucle y hago lo mismo que en el bucle anterior creando el array
		// de la combinación ganadora
		cont = 0;
		while (cont <= 5) {
			Arrays.sort(ganador);
			numRand = rand.nextInt(1, 50);
			if (Arrays.binarySearch(ganador, numRand) < 0) {
				ganador[0] = numRand;
				cont++;
			}
		}
		// Ordeno el ganador para poder hacer un binary search y voy buscando por cada
		// uno de mi apuesta si coinciden
		Arrays.sort(ganador);
		for (int num : miApuesta) {
			if (Arrays.binarySearch(ganador, num) >= 0) {
				aciertos += 1;
			}
		}
		System.out.println(Arrays.toString(miApuesta));
		System.out.println(Arrays.toString(ganador));
		System.out.println("Has tenido " + aciertos + " aciertos.");
	}

}
