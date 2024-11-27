package boletin7;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creo una variable para almacenar el tablero de juego 
		String tablero[][] = new String[3][3];
		
		// Lleno de guiones el tablero
		for (int i = 0 ; i < tablero.length ; i++) {
			Arrays.fill(tablero[i], "-");
		}
		// Cada iteración de este for será una ronda del juego 
		for (int rondas = 1 ; rondas <= 9 ; rondas++) {
			
			System.out.println(Arrays.deepToString(tablero));
		}
		

	}
	public static String ganador (String t[][]) {
		// Creo un string de respuesta vacio
		String res = "";
		// Recorro la tabla en horizontal, vertical y diagonales 
		for(int i = 0 ; i < t.length ; i++) {
			if (!t[i][0].equals("-") && t[i][0].equals(t[i][1]) && t[i][1].equals(t[i][2])) {
				
			}
		}
		return res;
	}
}
