package boletin1;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creo una variable para almacenar el numero que ire añadiendo al array
		int numInsertar;
		// Creo el array
		int numeros[] = new int[10];
		// Creo el generador random 
		Random rand = new Random();
		
		// Creo un for que del 0 al 9 vaya añadiendo el numero al azar en mi array
		for (int i = 0 ; i<=9 ; i++) {
			numInsertar = rand.nextInt(1,101);
			numeros[i] = numInsertar;
		}
		System.out.println(Arrays.toString(numeros));
		
		
	}

}
