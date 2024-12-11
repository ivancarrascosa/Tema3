package boletin1.string;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creo una variable para almacenar la frase
		String frase;

		// Creo un array de Strings para almacenar la frase ordenada
		String[] fraseOrdenada;

		// Creo una variable para la frase respuesta
		String fraseRespuesta = "";

		// Creo un escáner
		Scanner reader = new Scanner(System.in);

		// Pido al usuario que introduzca la frase que quiere separar y la almaceno en
		// una variable
		System.out.println("Introduzca la frase que quiere separar:");
		frase = reader.nextLine().toLowerCase();

		// Separo por cada espacio la frase que me han dado
		fraseOrdenada = frase.split(" ");

		// Ahora ordeno la frase
		Arrays.sort(fraseOrdenada);

		for (String palabra : fraseOrdenada) {
			fraseRespuesta += palabra + " ";
		}

		System.out.println(fraseRespuesta);

		// Cierro el escáner
		reader.close();
	}

}
