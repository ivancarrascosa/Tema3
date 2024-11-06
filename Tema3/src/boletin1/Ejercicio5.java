package boletin1;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creo una variable para almacenar los números que introduzca el usuario
		double num;
		
		// Creo una variable para guardar la suma de los números
		double suma = 0;
		
		// Creo dos variables, para almacenar el número mínimo y el máximo, inicializadas a valor maximo y mínimo
		double minimo = Integer.MAX_VALUE;
		double maximo = Integer.MIN_VALUE;
		
		// Creo el array
		double numeros[] = new double[10];
		
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		
		for (int i = 0 ; i<10 ; i++) {
			System.out.println("Introduzca un número para añadirlo al array:");
			num = reader.nextDouble();
			numeros[i] = num;
		}
		for (double value : numeros) {
			suma += value;
			if (value<minimo) {
				minimo = value;
			}
			if (value > maximo) {
				maximo = value;
			}
		}
		System.out.println("La suma de todos los valores es " + suma + " el mínimo es " + minimo + " y el máximo es " + maximo + ".");
		
		// Cerramos el escáner 
		reader.close();
	}

}
