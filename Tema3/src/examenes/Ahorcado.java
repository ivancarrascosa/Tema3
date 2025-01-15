package examenes;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
	// Creo un objeto Scanner
	static Scanner reader = new Scanner(System.in);

	static String[] palabras = { "humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo", "pierna", "cabeza",
			"brazo", "familia" };

	static final int NUMINTENTOS = 7;
	
	static int intentosRestantes = 7;

	static String palabraSecreta;

	static String palabraPista = "";

	static String noAcertadas = "";

	public static void main(String[] args) {
		// Genero la palabra random y la pista
		generaPalabra();
		
		// Creo una variable para almacenar la opcion que selecciona el usuario en el menu
		int opcMenu;
		
		// Creo una variable para almacenar la letra que introduzca el usuario
		char letra;
		
		// Creo una variable para almacenar la palabra que introduzca el usuario en la opcion 2 
		String palabra;
		
		// Imprimo la palabra pista
		System.out.println(palabraPista);

		// Se saldra de este while si la palabra pista es distinta a la secreta o si el
		// numero de intentos es 0
		while (!palabraPista.equalsIgnoreCase(palabraSecreta) && intentosRestantes > 0) {
			opcMenu = menu();
			switch (opcMenu) {
			case 1:
				System.out.println("Introduzca una letra:");
				// Paso la letra a minuscula y a caracter
				letra = reader.nextLine().toLowerCase().charAt(0);
				// Si no está en no acertadas, compruebo (para que no se resten intentos en este caso
				if (noAcertadas.indexOf(letra) < 0) {
					compruebaLetra(letra);
				}
				break;
			case 2:
				// Si elige la opción 2, solo se llama a comprueba palabra
				System.out.println("Introduzca la palabra:");
				palabra = reader.nextLine();
				compruebaPalabra(palabra);
				break;
			default:
				System.out.println("Introduzca una opción valida");
			}
			System.out.println(palabraPista);
			System.out.println("Le quedan: " + intentosRestantes + " intentos.");
		}
		if (intentosRestantes == 0) {
			System.out.println("GAME OVER");
		} else {
			System.out.println("¡¡ENHORABUENA!! HAS ACERTADO");
		}
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

		// Creo una variable para almacenar el numero de respuesta
		int res;

		System.out.println("Seleccione una de las siguientes opciones:");
		System.out.println("1. Introducir letra.");
		System.out.println("2. Introducir palabra.");

		// Le asigno a la variable res el valor introducido por el usuario
		res = reader.nextInt();
		reader.nextLine();

		return res;
	}

	public static void compruebaLetra(char letra) {
		// Creo una variable para almacenar un array de char que será la palabra pista
		char[] palabraPistaArray;
		
		// Creo una variable para almacenar si se ha encontrado la letra
		boolean encontrada = false;
		// Recorro la palabra secreta
		for (int i = 0; i < palabraSecreta.length(); i++) {
			// Si una letra de la palabra secreta es igual a la letra, cambio la posición
			// por la que estoy de la pista a la letra que se ha acertado
			if (palabraSecreta.charAt(i) == letra) {
				palabraPistaArray = palabraPista.toCharArray();
				palabraPistaArray[i] = letra;
				palabraPista = String.valueOf(palabraPistaArray);
				encontrada = true;
			}	
		}
		if (!encontrada) {
			noAcertadas += letra;
			intentosRestantes--;
		}
	}

	public static void compruebaPalabra(String palabra) {
		if (palabra.equalsIgnoreCase(palabraSecreta)) {
			palabraPista = palabra;
		} else {
			intentosRestantes--;
		}
	}

	public static void pintaPista() {
		System.out.println(noAcertadas);
		System.out.println(palabraPista);
	}
}
