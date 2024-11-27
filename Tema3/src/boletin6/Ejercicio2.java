package boletin6;

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		int tabla[] = {1,2,3,4,5,6,7,8,9};
		desordenarUnidimensional(tabla);
		System.out.println(Arrays.toString(tabla));

	}
	
	public static void desordenarUnidimensional(int t[]) {
		// Creo un objeto random
		Random rand = new Random();
		
		// Creo una variable para guardar el índice que voy a cambiar
		int numRand;
		
		// Creo dos variables para guardar los números que tengo que introducir
		int numCambio1;
		int numCambio2;
		
		for (int i = 0 ; i < t.length ; i++) {
			numRand = rand.nextInt(0,t.length);
			numCambio1 = t[i];
			numCambio2 = t[numRand];
			t[i] = numCambio2;
			t[numRand] = numCambio1;
		}
	}
}
