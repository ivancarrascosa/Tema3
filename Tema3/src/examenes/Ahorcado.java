package examenes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
	static String[] palabras = { "humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo", "pierna", "cabeza",
			"brazo", "familia" };

	static final int NUMINTENTOS = 7;

	static String palabraSecreta;

	static String palabraPista;

	static String noAcertadas;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void generaPalabra() {
		// Creo un objeto random para generar un numero al azar
		Random rand = new Random();

		// Creo una variable para almacenar el numero al azar
		int numRand = rand.nextInt(0, palabras.length);

		// Asigno a la palabra secreta la palabra de palabras del indice aleatorio
		palabraSecreta = palabras[numRand];

		// Genero la palabra pista
		for (int i = 0; i < palabraSecreta.length(); i++) {
			palabraPista += "_";
		}

	}

	public static int menu() {
		// Creo un objeto Scanner
		Scanner reader = new Scanner(System.in);

		// Creo una variable para almacenar el numero de respuesta
		int res;

		System.out.println("Seleccione una de las siguientes opciones:");
		System.out.println("\t 1. Introducir letra.");
		System.out.println("\t 2. Introducir palabra.");

		// Le asigno a la variable res el valor introducido por el usuario
		res = reader.nextInt();

		return res;
	}

	public static void compruebaLetra(char letra) {
		// Creo una variable para almacenar un array de char que será la palabra pista
		char[] palabraPistaArray;

		// Recorro la palabra secreta
		for (int i = 0; i < palabraSecreta.length(); i++) {
			// Si una letra de la palabra secreta es igual a la letra, cambio la posición
			// por la que estoy de la pista a la letra que se ha acertado
			if (palabraSecreta.length() == letra) {
				palabraPistaArray = palabraPista.toCharArray();
				palabraPistaArray[i] = letra;
				palabraPista = Arrays.toString(palabraPistaArray);
			} else {
				// Si no acierta, añado la letra a no acertadas
				noAcertadas += letra;
			}
		}
	}
	
	public static void compruebaPalabra(String palabra) {
		if (palabra.equalsIgnoreCase(palabraSecreta)) {
			palabraPista = palabra;
		}
	}
	
	public static void pintaPista() {
		System.out.println(noAcertadas);
		System.out.println(palabraPista);
	}
}
