package boletin4;

import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(rellenaPares(8,8)));

	}
	public static int[] rellenaPares(int longitud, int fin) {
		// Creo una variable para almacenar los numeros random que se vayan generando
		int numRand;
		
		// Creo un objeto random 
		Random rand = new Random();
		
		// Creo un contador inicializado a 1
		int i = 0;
		
		// Creo un array que voy a devolver
		int respuesta[] = new int[longitud];
		
		while (i<longitud) {
			numRand = rand.nextInt(2,fin+1);
			if (numRand%2 == 0) {
				respuesta[i] = numRand;
				i++;
			}
		}
		return respuesta;
	}
}
