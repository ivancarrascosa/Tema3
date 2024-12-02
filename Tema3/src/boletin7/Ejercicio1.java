package boletin7;

import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio1 {

	// I create a Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Creo una variable para almacenar el tablero de juego
		String tablero[][] = new String[3][3];

		// I create a counter to do the 9 rounds of the game
		int counter = 0;

		// I create a variable to display the winner
		String winner = "";

		// Lleno de guiones el tablero
		for (int i = 0; i < tablero.length; i++) {
			Arrays.fill(tablero[i], "-");
		}
		// I create a while loop for each round of the game
		while (counter < 9 && winner.equals("")) {
			turno((counter % 2) + 1, tablero);
			print(tablero);
			winner = ganador(tablero);
			counter++;
		}
		if (winner.equals("")) {
			System.out.println("There has been a draw, try again.");
		} else {
			System.out.println("The winner is " + winner + " , congratulations!");
		}
		reader.close();
	}

	public static String ganador(String t[][]) {
		// Creo un string de respuesta vacio
		String res = "";
		// Recorro la tabla en horizontal, vertical y diagonales
		for (int i = 0; i < t.length; i++) {
			// Esto es para recorrer en horizontal y comprobar si una fila es toda igual
			if (!t[i][0].equals("-") && t[i][0].equals(t[i][1]) && t[i][1].equals(t[i][2])) {
				res = t[i][0];
			}
			if (!t[0][i].equals("-") && t[0][i].equals(t[1][i]) && t[1][i].equals(t[2][i])) {
				res = t[0][i];
			}
		}
		if (!t[0][0].equals("-") && t[0][0].equals(t[1][1]) && t[1][1].equals(t[2][2])) {
			res = t[0][0];
		}
		if (!t[0][2].equals("-") && t[0][2].equals(t[1][1]) && t[1][1].equals(t[2][0])) {
			res = t[0][2];
		}
		return res;
	}

	public static void turno(int player, String[][] board) {
		// I create a variable to go out of the while
		boolean filled = true;

		// I create a variable to store row and column to fill
		int row;
		int column;

		// I create the Scanner

		while (filled) {
			System.out
					.println("Player " + player + " introduce the row in which you want to put your figure (0 to 2):");
			row = reader.nextInt();
			System.out.println("Now introduce the column in which you want to put your figure(0 to 2):");
			column = reader.nextInt();
			if (board[row][column].equals("-")) {
				board[row][column] = player == 1 ? "x" : "o";
				filled = false;
			} else {
				System.out.println("There is alredy a figure in that position.");
			}
		}
	}

	public static void print(String[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
