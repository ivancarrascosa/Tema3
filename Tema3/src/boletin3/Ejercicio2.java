package boletin3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creo una tabla de dos dimensiones para almacenar las notas
		double notas[][] = new double[4][5];

		// Creo las variables para almacenar la nota mínima, máxima y la media
		double minima = Integer.MAX_VALUE;
		double maxima = Integer.MIN_VALUE;
		double suma = 0;

		// Creo un escáner
		Scanner reader = new Scanner(System.in);

		// Pregunto por cada alumno
		for (int i = 0; i < 4; i++) {
			// 5 veces por sus notas
			for (int j = 0; j < 5; j++) {
				System.out.println("Introduzca la nota de la asignatura " + (j + 1) + " del Alumno " + (i + 1) + ".");
				notas[i][j] = reader.nextDouble();
			}
		}
		// Imprimo una parte de arriba en la que ponga notas, para que salga por cada nota
		System.out.print("\t");
		for (int i = 0 ; i<notas[0].length ; i++) {
			System.out.print("\tNota " + (i+1));
		}
		System.out.println();
		// Imprimo las notas, aqui es por cada fila (alumno)
		for (int i = 0; i < notas.length; i++) {
			// Imprimo el número del alumno
			System.out.print("Alumno " + (i + 1) + ":\t");
			// Por cada asignatura, imprimo la nota
			for (int j = 0; j < notas[1].length; j++) {
				System.out.print(notas[i][j] +  "\t");
			}
			System.out.println();
		}
		// Por cada fila
		for (int i = 0; i < 4; i++) {
			// Por cada dato en la fila (las distintas notas del mismo alumno
			for (int j = 0; j < 5; j++) {
				// Veo mínima
				if (notas[i][j] < minima) {
					minima = notas[i][j];
				}
				// Máxima
				if (notas[i][j] > maxima) {
					maxima = notas[i][j];
				}
				// Y la suma para despues hacer la media
				suma += notas[i][j];
			}
			// Imprimo todo
			System.out.println("La nota máxima del Alumno " + (i + 1) + " es " + maxima + ", la nota mínima es "
					+ minima + " y la media es " + (suma / (notas[i].length)));
			// Reinicio los valores
			minima = Integer.MAX_VALUE;
			maxima = Integer.MIN_VALUE;
			suma = 0;
			
			// Cierro el escáner
			reader.close();
		}
	}

}
