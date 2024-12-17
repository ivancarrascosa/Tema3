package boletin1.string;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// Creamos el escáner
		Scanner reader = new Scanner(System.in);

		// Creo una variable para almacenar la palabra que voy a separar
		String palabra;

		// Creo una variable para la longitud
		int longitud;

		// Pido al usuario la palabra a separar y la longitud
		System.out.println("Introduzca la palabra a separar: ");
		palabra = reader.nextLine();
		System.out.println("Introduzca la longitud de los trozos de palabra:");
		longitud = reader.nextInt();

		System.out.println(Arrays.toString(convertirPalabraEnSecuencia(palabra, longitud)));

		// Cerramos el escáner
		reader.close();
	}

	public static String[] convertirPalabraEnSecuencia(String palabra, int secuencia) {
		// Creo el array que voy a usar
		String[] res;
		// Creo una variable para almacenar el numero de secuencias que voy a hacer
		int numSecuencias = (int) (Math.ceil((double) palabra.length() / secuencia));
		// Inicializo el array a la longitud del numero de secuencias.
		res = new String[numSecuencias];
		for (int i = 0, j = 0; i < numSecuencias; i++, j += secuencia) {
			res[i] = palabra.substring(j, j + secuencia < palabra.length() ? j + secuencia : palabra.length());
		}
		return res;
	}
}
