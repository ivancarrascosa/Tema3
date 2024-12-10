package boletin1.string;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		
		// Creo las variables para almacenar las frases
		String frase1 = "";
		String frase2 = "";
		
		for (int i = 0 ; i < 2 ; i++) {
			System.out.println("Introduzca la frase por teclado:");
			if (i == 0) {
				frase1 = reader.nextLine();
			} else {
				frase2 = reader.nextLine();
			}
		}
		
		if (frase1.length() < frase2.length()) {
			System.out.println("La frase 1 es más corta");
		} else if (frase1.length() > frase2.length()) {
			System.out.println("La frase 2 es más corta");
		} else {
			System.out.println("Las frases son igual de largas");
		}
		// Cierro el escáner
		reader.close();
	}

}
