package boletin6;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		char tabla[][] = new char[8][8];
		tabla = ajedrez(3, 4, 'C');
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(Arrays.toString(tabla[i]));
		}
	}

	public static char[][] ajedrez(int posFila, int posCol, char pieza) {
		// creo una variable para almacenar el tablero y despues recorrerlo e imprimirlo
		// para que se vea bien
		char tablero[][] = new char[8][8];

		switch (pieza) {
		case 'A' -> tablero = alfil(posFila, posCol);
		case 'D' -> tablero = dama(posFila, posCol);
		case 'T' -> tablero = torre(posFila, posCol);
		case 'C' -> tablero = caballo(posFila, posCol);
		}
		return tablero;
		
	}

	public static char[][] alfil(int posFila, int posCol) {
		// Creo la variable alfil
		final char ALFIL = 'A';

		// Creo el tablero que voy a devolver
		char tablero[][] = new char[8][8];

		for (int i = posFila - 1, j = posCol - 1; i >= 0 && j >= 0; i--, j--) {
			tablero[i][j] = 'X';
		}
		for (int i = posFila + 1, j = posCol + 1; i < tablero.length && j < tablero[0].length; i++, j++) {
			tablero[i][j] = 'X';
		}
		for (int i = posFila - 1, j = posCol + 1; i >= 0 && j < tablero[0].length; i--, j++) {
			tablero[i][j] = 'X';
		}
		for (int i = posFila + 1, j = posCol - 1; i < tablero.length && j >= 0; i++, j--) {
			tablero[i][j] = 'X';
		}
		// Pongo al alfil en su posición
		tablero[posFila][posCol] = ALFIL;
		return tablero;
	}

	public static char[][] torre(int posFila, int posCol) {
		// Creo la variable alfil
		final char TORRE = 'T';
		// Creo el tablero que voy a devolver
		char tablero[][] = new char[8][8];

		for (int i = 0; i < tablero.length; i++) {
			tablero[i][posCol] = 'X';
		}
		for (int j = 0; j < tablero[0].length; j++) {
			tablero[posFila][j] = 'X';
		}
		// Pongo a la torre en su posición
		tablero[posFila][posCol] = TORRE;
		return tablero;
	}

	public static char[][] dama(int posFila, int posCol) {
		// Creo la variable alfil
		final char DAMA = 'D';
		// Creo el tablero que voy a devolver
		char tablero[][] = new char[8][8];

		for (int i = posFila - 1, j = posCol - 1; i >= 0 && j >= 0; i--, j--) {
			tablero[i][j] = 'X';
		}
		for (int i = posFila + 1, j = posCol + 1; i < tablero.length && j < tablero[0].length; i++, j++) {
			tablero[i][j] = 'X';
		}
		for (int i = posFila - 1, j = posCol + 1; i >= 0 && j < tablero[0].length; i--, j++) {
			tablero[i][j] = 'X';
		}
		for (int i = posFila + 1, j = posCol - 1; i < tablero.length && j >= 0; i++, j--) {
			tablero[i][j] = 'X';
		}
		for (int i = 0; i < tablero.length; i++) {
			tablero[i][posCol] = 'X';
		}
		for (int j = 0; j < tablero[0].length; j++) {
			tablero[posFila][j] = 'X';
		}
		// Pongo a la dama en su posición
		tablero[posFila][posCol] = DAMA;
		return tablero;
	}

	public static char[][] caballo(int posFila, int posCol) {
		// Creo la variable alfil
		final char CABALLO = 'C';
		// Creo el tablero que voy a devolver
		char tablero[][] = new char[8][8];
		if (posFila-2 >= 0) {
			if (posCol + 1 <=7) {
				tablero[posFila-2][posCol+1] = 'X';
			}
			if (posCol-1 >= 0) {
				tablero[posFila-2][posCol-1] = 'X';
			}
		}
		if (posFila + 2 <= 7) {
			if (posCol + 1 <=7) {
				tablero[posFila+2][posCol+1] = 'X';
			}
			if (posCol-1 >= 0) {
				tablero[posFila+2][posCol-1] = 'X';
			}
		}
		if (posCol - 2 >= 0) {
			if (posFila + 1 <=7) {
				tablero[posFila+1][posCol-2] = 'X';
			}
			if (posFila - 1 >= 0) {
				tablero[posFila-1][posCol-2] = 'X';
			}
		}
		if (posCol + 2 <= 7) {
			if (posFila + 1 <=7) {
				tablero[posFila+1][posCol+2] = 'X';
			}
			if (posFila - 1 >= 0) {
				tablero[posFila-1][posCol+2] = 'X';
			}
		}
		// Pongo al caballo en su posición
		tablero[posFila][posCol] = CABALLO;
		return tablero;
	}

}
