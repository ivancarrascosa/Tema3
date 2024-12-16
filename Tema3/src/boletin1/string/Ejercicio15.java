package boletin1.string;

import java.util.*;

public class Ejercicio15 {
	static Random rand = new Random();

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// Creo una variable para almacenr la palabra introducida por el primer jugador
		String palabraADesordenar = "";
		
		// Creo una variable para almacenar la palabra desordenada
		String palabraDesordenada;
		
		// Creo una variable para almacenar la respuesta del usuario
		String respuesta = "";
		
		// Pido una palabra al usuario y la guardo en una variable
		while (palabraADesordenar.equals("")) {
			System.out.println("Introduzca una palabra para hacer un anagrama");
			palabraADesordenar = reader.nextLine();
		}
		palabraDesordenada = desordenarString(palabraADesordenar); 
		System.out.println(palabraDesordenada);
		while (!respuesta.equals(palabraADesordenar)) {
			System.out.println("Intente adivinar la palabra:");
			respuesta = reader.nextLine();
		}
		System.out.println("Acertaste!");
		reader.close();
	}

	public static String desordenarString(String palabra) {
		// Creo una variable para almacenar la posición por la que lo voy a cambiar
		int numRand;

		String res = "";
		// Creo una variable para almacenar la letra que voy a cambiar
		char letra = ' ';

		char[] fraseArray = palabra.toCharArray();
		for (int i = 0; i < fraseArray.length; i++) {
			numRand = rand.nextInt(0, fraseArray.length);
			letra = fraseArray[i];
			fraseArray[i] = fraseArray[numRand];
			fraseArray[numRand] = letra;
		}
		res = String.valueOf(fraseArray);

		return res;
	}
}
