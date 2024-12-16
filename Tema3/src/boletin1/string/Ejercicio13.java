package boletin1.string;

import java.util.Arrays;

public class Ejercicio13 {

	public static void main(String[] args) {
		
	}
	public static boolean anagrama (String palabra1, String palabra2) {
		// Creo un booleano para devolver si una palabra es anagrama de otra o no
		boolean anagrama = false;
		
		// Creo dos arrays para almacenar cada palabra en array
		char[] array1 = palabra1.toCharArray();
		char[] array2 = palabra2.toCharArray();
		
		// Ordeno ambos arrays
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		// Compruebo si los dos son iguales y le asigno el booleano a anagrama
		anagrama = array1.equals(array2);
		
		return anagrama;
	}
}
