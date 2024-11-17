package boletin5;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creo un objeto random
		Random rand = new Random();
		
		// Creo la tabla que voy a rellenar de números random
		int tablaRandom[][] = new int[6][10];
		
		for (int i = 0 ; i<tablaRandom.length ; i++) {
			for (int j = 0 ; j < tablaRandom[i].length ; j++) {
				tablaRandom[i][j] = rand.nextInt(1,1001);
			}
		}
		
		System.out.println(Arrays.toString(maximoMinimo(tablaRandom)));
	}
	public static int[] maximoMinimo(int t[][]) {
		// Creo las dos variables maximo y mínimo inicializadas en el valor mínimo y máximo respectivamente
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		// Creo una variable para el array de respuesta
		int res[] = new int[2];
		
		// Recorro la tabla t y si el número es menor que el mínimo o mayor que el máximo lo sustituyo
		for (int i = 0 ; i<t.length ; i++) {
			for (int j = 0 ; j < t[i].length ; j++) {
				if (t[i][j] < min) {
					min = t[i][j];
				} else if (t[i][j] > max) {
					max = t[i][j];
				}
			}
		}
		res[0] = min;
		res[1] = max;
		return res;
	}
}
