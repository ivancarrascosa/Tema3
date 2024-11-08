package boletin2;

import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creo un array de 30 de longitud y un objeto de la clase random
		int listaNumeros[] = new int[30];
		Random rand = new Random();
		
		// La lleno de números random con un for y después la ordeno
		for (int i = 0 ; i<30 ; i++) {
			listaNumeros[i] = rand.nextInt(0,10);
		}
		Arrays.sort(listaNumeros);
		System.out.println(Arrays.toString(listaNumeros));
	}

}
