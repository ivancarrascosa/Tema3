package boletin2.colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		// Creo la lista con los numeros del 1 al 10
		for (int i = 1 ; i <= 10 ; i++) {
			listaNumeros.add(i);
		}
		// Imprimo la lista
		System.out.println(listaNumeros);
		// La mezclo y la imprimo
		Collections.shuffle(listaNumeros);
		System.out.println(listaNumeros);

	}

}
