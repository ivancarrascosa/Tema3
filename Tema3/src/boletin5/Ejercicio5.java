package boletin5;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {
		int tabla[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println(Arrays.deepToString(gira90_1(tabla)));

	}

	public static int[][] transposicion(int[][] matriz) {
		// Creo una tabla para devolver la matriz transpuesta
		int matrizTranspuesta[][] = new int[matriz[0].length][matriz.length];
		// Con dos bucles for recorro la matriz de entrada
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				// Pongo el elemento a la posición en la que va a ir en la traspuesta
				matrizTranspuesta[j][i] = matriz[i][j];
			}
		}
		return matrizTranspuesta;
	}

	public static int[][] gira90(int tablaInicio[][]) {
		// Creo una tabla que va a ser la respuesta
		int tablaRespuesta[][] = new int[tablaInicio[0].length][tablaInicio.length];

		// Creo una tabla que va a ser la matriz traspuesta
		int[][] matrizTranspuesta;

		// Uso la funcion trnasposición para hacer la transpuesta de la que se me ha
		// introducido
		matrizTranspuesta = transposicion(tablaInicio);
		// Creo un for que recorra la matriz transpuesta por columnas
		for (int j = 0; j < matrizTranspuesta[0].length; j++) {
			// Despues paso todos los elementos a la simétrica y es lo mismo que girar 90
			// grados
			for (int i = 0; i < matrizTranspuesta.length; i++) {
				tablaRespuesta[i][(tablaInicio.length) - 1 - j] = matrizTranspuesta[i][j];
			}
		}
		return tablaRespuesta;
	}

	public static int[][] gira90_1(int tablaInicio[][]) {
		int tablaRespuesta[][] = new int[tablaInicio[0].length][tablaInicio.length];
		for (int j = 0; j < tablaInicio[0].length; j++) {
			for (int i = 0; i < tablaInicio.length; i++) {
				tablaRespuesta[j][tablaInicio.length-1-i] = tablaInicio[i][j];
			}
		}
		return tablaRespuesta;
		}
	}

