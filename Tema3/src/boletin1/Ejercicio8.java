package boletin1;

import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creo una variable para almacenar el número que introduzca el usuario
		int num;
		
		// Creo una variable para almacenar el número random que introduciré en el array
		int numRand;
		
		// Creo un objeto de la clase random
		Random rand = new Random();
		
		// Creo el array de 100 enteros
		int numeros[] = new int[100]; 
		
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		
		// Introduzco un numero random del 1 al 10 en cada posicion de la tabla
		for (int i = 0 ; i<100 ; i++) {
			numRand = rand.nextInt(1,11);
			numeros[i] = numRand;
		}
		// Pido un número del 1 al 10 al usuario para buscarlo en la tabla
		System.out.println("Introduzca un número para saber en que posiciones aparece en el array:");
		num = reader.nextInt();
		
		System.out.print("El número " + num + " se encuentra en las posiciones: ");
		// Recorro la tabla y printeo donde se encuentra ese valor
		for (int i = 0 ; i<100 ; i++) {
			if (numeros[i] == num) {
				System.out.print(i + " ");
			}
		}
		// Cierro el escáner
		reader.close();
		
	}

}
