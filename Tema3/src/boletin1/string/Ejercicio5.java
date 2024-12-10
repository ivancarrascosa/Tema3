package boletin1.string;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creo una variable para devolver la frase
		String res = "";

		// Creo un escáner
		Scanner reader = new Scanner(System.in);

		// Creo una variable para almacenar cada palabra que introduzca el usuario
		String palabra = "";
		// hago un bucle do while en el que permanezco hasta que lo introducido sea fin
		do {
			System.out.println("Introduzca la siguiente palabra de la frase: ");
			palabra = reader.nextLine();
			// Si no es fin, lo añado a la respuesta
			if (!palabra.equalsIgnoreCase("fin")) {
				res += palabra + " ";
			}
		} while (!palabra.equalsIgnoreCase("fin"));

		// Al salir del bucle, imprimo la frase
		System.out.println(res);

		// Cierro el escáner
		reader.close();
	}

}
