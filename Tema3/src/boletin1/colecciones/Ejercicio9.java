package boletin1.colecciones;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Creo dos treemap para los valores que han salido 
		TreeMap<Integer, Integer> numeros = new TreeMap<>();
		TreeMap<Integer, Integer> estrellas = new TreeMap<>();
		
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		
		// Creo una variable numero para almacenar los numeros premiados
		int numero;
		
		// Creo una variable estrella para almacenar las estrellas premiadas
		int estrella;
		
		// Hago un bucle de 5 iteraciones para pedir al usuario los numeros
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Introduzca uno de los números:");
			numero = reader.nextInt();
			if (numeros.get(numero) == null) {
				numeros.put(numero, 1);
			} else {
				numeros.put(numero, numeros.get(numero) + 1);
			}
		}
		
		// Hago lo mismo pero con las estrellas
		for(int i = 0 ; i < 2 ; i++) {
			System.out.println("Introduzca una de las estrellas:");
			estrella = reader.nextInt();
			if (estrellas.get(estrella) == null) {
				estrellas.put(estrella, 1);
			} else {
				estrellas.put(estrella, estrellas.get(estrella) + 1);
			}
		}
		System.out.println(numeros);
		System.out.println(estrellas);
		reader.close();
	}

}
