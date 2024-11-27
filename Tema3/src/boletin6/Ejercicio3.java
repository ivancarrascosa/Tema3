package boletin6;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		int tabla[][] = {{1,2,3},{4,5,6},{7,8,9}};
		desordenarBidimensional(tabla);
		for (int i = 0 ; i<tabla.length ; i++) {
			System.out.println(Arrays.toString(tabla[i]));
		}

	}
	
	public static void desordenarBidimensional(int t[][]) {
		// Creo un objeto random
		Random rand = new Random();
		
		// Creo una variable para almacenar la fila y columna aleatoria que voy a cambiar para desordenar
		int filaRandom;
		int columnaRandom;
		
		// Creo variables para almacenar los números que tengo que cambiar
		int numCambio1;
		int numCambio2;
		
		// Recorro la tabla y voy cambiando los valores
		for (int i = 0 ; i <t.length ; i++) {
			for (int j = 0 ; j < t[i].length ; j++) {
				filaRandom = rand.nextInt(0,t.length);
				columnaRandom = rand.nextInt(0,t[0].length);
				numCambio1 = t[i][j];
				numCambio2 = t[filaRandom][columnaRandom];
				t[i][j] = numCambio2;
				t[filaRandom][columnaRandom] = numCambio1;
			}
		}
	}
}
