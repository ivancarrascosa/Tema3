package boletin5;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println(Arrays.deepToString(transposicion(mat)));

	}
	
	public static int[][] transposicion(int[][] matriz) {
		// Creo una tabla para devolver la matriz transpuesta
		int matrizTranspuesta[][] = new int[matriz[0].length][matriz.length];
		// Con dos bucles for recorro la matriz de entrada
		for (int i = 0 ; i < matriz.length ; i++) {
			for (int j = 0 ; j < matriz[0].length ; j++) {
				// Pongo el elemento a la posición en la que va a ir en la traspuesta
				matrizTranspuesta[j][i] = matriz[i][j];
			}
		}
		return matrizTranspuesta;
	}
}
