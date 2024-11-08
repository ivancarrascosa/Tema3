package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creo los dos arrays de longitud 10 que voy a utilizar
		int tabla1[] = new int[10];
		int tabla2[] = new int[10];

		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		// Creo una variable para almacenar los números que introduzca el usuario
		int n;
		// Pido al usuario que introduzca los números dentro de un for y los voy
		// metiendo en el array dependiendo de si está en las primeras 10 iteraciones o
		// no
		for (int i = 0; i <= 19; i++) {
			System.out.println("Introduzca el siguiente número: ");
			n = reader.nextInt();
			if (i <= 9) {
				tabla1[i] = n;
			} else {
				tabla2[i % 10] = n;
			}
		}
		// Comparo las dos listas y devuelvo si son iguales o no
		if (Arrays.equals(tabla1, tabla2)) {
			System.out.println("Las tablas son iguales.");
		} else {
			System.out.println("Las tablas son distintas.");
		}
		// Cierro el escáner
		reader.close();
	}

}
