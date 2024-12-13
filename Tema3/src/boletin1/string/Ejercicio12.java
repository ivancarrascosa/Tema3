package boletin1.string;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		
		// Creo una variable para almacenar la frase que se introduzca
		String frase;
		// Creo una variable para almacenar la palabra más larga
		String palabraMasLarga = ""; 
		
		// Creo un array para almacenar la lista de palabras de la frase
		String fraseDividida[];
		// Pido al usuario la frase
		System.out.println("Introduzca la frase:");
		frase = reader.nextLine();
		
		fraseDividida = frase.split(" ");
		
		for (int i = 0 ; i < fraseDividida.length ; i++) {
			if (fraseDividida[i].length() > palabraMasLarga.length()) {
				palabraMasLarga = fraseDividida[i];
			}
		}
		System.out.println("La palabra más larga es " + palabraMasLarga + " y tiene " + palabraMasLarga.length() + " letras.");
		// Cierro el escáner
		reader.close();
	}

}
