package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaro la tabla
		double numeros[];
		// Creo una variable para almacenar el tamaño y el valor
		int tamaño;
		double valor;
		
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario el tamaño de la tabla y los valores
		System.out.println("Introduzca el tamaño del array:");
		tamaño = reader.nextInt();
		// Creo la tabla del tamaño que se me ha pedido
		numeros = new double [tamaño];
		// Pido el valor y lo guardo en la variable
		System.out.println("Introduzca el valor con el que quiere inicializar el array:");
		valor = reader.nextDouble();
		// LLeno la tabla de números con ese valor
		Arrays.fill(numeros, valor);
		System.out.println(Arrays.toString(numeros));
		// Cerramos el escáner
		reader.close();

	}

}
