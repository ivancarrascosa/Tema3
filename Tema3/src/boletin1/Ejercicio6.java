package boletin1;

import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creo una variable para almacenar el número que introduzca el usuario
		int num;

		// Creo el array
		int numeros[] = new int[8];

		// Creo el escáner
		Scanner reader = new Scanner(System.in);

		// Con un for voy añadiendo cada número que se me introduzca al array
		for (int i = 0; i < 8; i++) {
			System.out.println("Introduzca un número para introducirlo en el array.");
			num = reader.nextInt();
			numeros[i] = num;
		}

		// Recorro el array con el for y voy printeando si es par o impar el número
		for (int valor : numeros) {
			if (valor % 2 == 0) {
				System.out.println(valor + " par");
			} else {
				System.out.println(valor + " impar");
			}
		}
		// Cerramos el escáner
		reader.close();

	}

}
