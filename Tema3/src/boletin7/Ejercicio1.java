package boletin7;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creo una variable para almacenar el tablero de juego 
		String tablero[][] = {{"x","-","-"},{"-","x","-"},{"-","-","x"}};
		
		// Lleno de guiones el tablero
		for (int i = 0 ; i < tablero.length ; i++) {
			Arrays.fill(tablero[i], "-");
		}
		// Cada iteración de este for será una ronda del juego 
		for (int rondas = 1 ; rondas <= 9 ; rondas++) {
			
			System.out.println(Arrays.deepToString(tablero));
		}
		
		System.out.println(ganador(tablero));
	}
	public static String ganador (String t[][]) {
		// Creo un string de respuesta vacio
		String res = "";
		// Recorro la tabla en horizontal, vertical y diagonales 
		for(int i = 0 ; i < t.length ; i++) {
			// Esto es para recorrer en horizontal y comprobar si una fila es toda igual
			if (!t[i][0].equals("-") && t[i][0].equals(t[i][1]) && t[i][1].equals(t[i][2])) {
				res = t[i][0];
			}
			if (!t[0][i].equals("-") && t[0][i].equals(t[1][i])  && t[1][i].equals(t[2][i])) {
				res = t[0][i];
			}
		}
		if (!t[0][0].equals("-") && t[0][0].equals(t[1][1])  && t[1][1].equals(t[2][2])) {
			res = t[0][0];
		}
		if (!t[0][2].equals("-") && t[0][2].equals(t[1][1])  && t[1][1].equals(t[2][0]) ) {
			res = t[0][2];
		}
		return res;
	}
}
