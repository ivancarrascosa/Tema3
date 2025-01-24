package boletin2.colecciones;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creo el linked hash set
		LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
		
		// Creo un objeto random
		Random rand = new Random();
		
		// Creo una variable para el numero que voy a introducir
		int numRandom;
		// Creo un bucle while del que se saldra cuando el tamaño de el conjunto sea 10
		while (numeros.size() < 10) {
			numRandom = rand.nextInt(1,21);
			numeros.add(numRandom);
		}
		
		System.out.println(numeros);
	}

}
