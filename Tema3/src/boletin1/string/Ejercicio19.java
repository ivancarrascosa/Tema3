package boletin1.string;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Creo una variable para almacenar la respuesta
		String res = "";
		
		// Creo una variable para almacenar la frase 
		String frase;
		
		System.out.println("Introduzca su frase: ");
		frase = reader.nextLine();
		
		// Recorro la frase introducida y cada caracter si el anterior fue un espacio lo añado con en mayúscula
		for (int i = 0 ; i < frase.length() ; i++) {
			if (frase.charAt(i) == ' ') {
				continue;
			} else if (i == 0 || frase.charAt(i - 1) == ' ') {
				res += Character.toUpperCase(frase.charAt(i));
			} else {
				res += Character.toLowerCase(frase.charAt(i));
			}
		}
		
		System.out.println(res);
		reader.close();
	}

}
