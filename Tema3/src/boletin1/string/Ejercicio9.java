package boletin1.string;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Creo dos variables, para las muletillas del principio y del final del idioma
		final String PRINCIPIO = "Javalín, javalón";
		final String FIN = "javalén, len, len";

		// Creo dos variables para la longitud de inicio y del fin
		final int LONG_PRINCIPIO = PRINCIPIO.length();
		final int LONG_FIN = FIN.length();

		// Creo una variable booleana que me diga si está o no en el idioma
		boolean idioma = true;

		// Creo un escáner
		Scanner reader = new Scanner(System.in);

		// Creo una variable que sea la frase a traducir
		String frase;

		// Pido al usuario la frase que quiere traducir
		System.out.println("Introduzca la frase que quiera traducir");
		frase = reader.nextLine();

		if ((!frase.startsWith(PRINCIPIO)
				|| (frase.charAt(LONG_PRINCIPIO) != ' ' && frase.charAt(LONG_PRINCIPIO) != '\t'))
				&& (frase.indexOf(FIN) != frase.length() - LONG_FIN
						|| (frase.charAt(frase.length() - LONG_FIN - 1) != ' ')
						&& (frase.charAt(frase.length() - LONG_FIN - 1) != '\t'))) {
			idioma = false;
		}
		if (idioma) {
			frase = frase.replace(PRINCIPIO, "");
			frase = frase.replace(FIN, "");
		}
		frase = frase.trim();
		if (idioma) {
			System.out.println("La frase estaba en el idioma de Javalandia");
			System.out.println(frase);
		} else {
			System.out.println("La frase no estaba en el idioma de Javalandia");
		}
		reader.close();
	}

}
