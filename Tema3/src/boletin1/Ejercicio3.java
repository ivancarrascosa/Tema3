package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creo la variable para almacenar los números que va introduciendo el usuario
		double num;
		
		// Creo el array en el que los voy a guardar
		double numeros[] = new double[10];
		
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		
		// Creo un bucle que se haga 5 veces e introduzca los numeros en su posición del array.
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println("Introduzca un número para meterlo en la tabla:");
			num = reader.nextDouble();
			numeros[i] = num;
		}
		// En este for imprimo cada elemento del array
		for (int i = numeros.length ; i >= 0 ; i--) {
			System.out.print(numeros[i] + " ");
		}
		// Cerramos el escáner
		reader.close();
	}
}
