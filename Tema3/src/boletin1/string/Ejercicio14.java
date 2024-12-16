package boletin1.string;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// Creo una variable para almacenar la letra que se va a imprimir
		char letra;
		
		// Creo un contador para las veces que sale una letra
		int cont = 0;
		// Creo un String para almacenar la frase que introduzca el usuario
		String frase;
		
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		
		// Creo una copia de la frase para que no tenga espacios
		String copiaFraseNoEspacios;
		// Creo un array donde almacenaré todas las letras de la frase
		char[] fraseArray;
		
 		// Pedimos al usuario que introduzca una frase
		System.out.println("Introduzca una frase:");
		frase = reader.nextLine();
		
		copiaFraseNoEspacios = frase.replace(" ", "").toLowerCase();
		fraseArray = copiaFraseNoEspacios.toCharArray();
		
		// ordeno el array y después lo recorro
		Arrays.sort(fraseArray);
		letra = fraseArray[0];
		
		// Empiezo desde el 1 porque ya he asignado la primera letra a la variable "letra"
		for (int i = 1 ; i < fraseArray.length ; i++) {
			if (letra != fraseArray[i]) {
				cont++;
				System.out.println(letra + ": " + cont + " veces");
				cont = 0;
				letra = fraseArray[i];
			} else {
				cont++;
			}
		}
		reader.close();
	}
	
}
