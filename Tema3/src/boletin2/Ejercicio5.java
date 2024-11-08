package boletin2;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creo un array de longitud 1000 para almacenar los números al azar
		int lista[] = new int[1000];
		
		// Creo un contador para las veces que aparezca un número en la tabla
		int cont = 0;
		
		// Creo un objeto random 
		Random rand = new Random();
		
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		
		// Creo una variable para almacenar el número que va a introducir el usuario
		int n;
		
		// Lleno el array de números al azar hasta el 99
		for (int i = 0 ; i<1000 ; i++) {
			lista[i] = rand.nextInt(1,100);
		}
		
		// Pido al usuario que número quiere buscar 
		System.out.println("Introduzca el número que desea buscar:");
		n = reader.nextInt();
		
		// Con un for busco ese número en la tabla y le añado 1 al contador cada vez que coincida
		for (int i = 0 ; i< lista.length ; i++) {
			if (lista[i] == n) {
				cont+=1;
			}
		}
		
		// Devuelvo las veces que sale el número 
		if (cont == 0) {
			System.out.println("El número no aparece en la tabla");
		} else {
			System.out.println("El número " + n + " aparece " + cont + " veces en la tabla.");
		}
		
		// Cierro el escáner
		reader.close();
	}

}
