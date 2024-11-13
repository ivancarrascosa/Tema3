package boletin3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creo la tabla
		int tabla[][];
		
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		
		// Creo las variables para guardar las filas y las columnas de la tabla
		int filas;
		int columnas;
		
		// Pido al usuario la medida de la tabla
		System.out.println("Introduzca el número de filas de la tabla: "); 
		filas = reader.nextInt();
		System.out.println("Introduzca el número de columnas de la tabla: ");
		columnas = reader.nextInt();
		
		tabla =new int[filas][columnas];
		// Hago un for en el que voy rellenando la tabla con lo indicado
		for (int i = 0 ; i<tabla.length ; i++) {
			for (int j = 0 ; j<tabla[i].length ; j++) {
				tabla [i][j] = 10 * i + j;
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		// Cerramos el escáner
		reader.close();
	}

}
